package typings.dxf

import typings.dxf.dxfMod.Point3D
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitiesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.dxf.vertexMod.VertexEntityData
    - typings.dxf.textMod.TextEntityData
    - typings.dxf.splineMod.SplineEntityData
    - typings.dxf.solidMod.SolidEntityData
    - typings.dxf.polylineMod.PolylineEntityData
    - typings.dxf.pointMod.PointEntityData
    - typings.dxf.mtextMod.MTextEntityData
    - typings.dxf.lineMod.LineEntityData
    - typings.dxf.lwpolylineMod.LWPolylineEntityData
    - typings.dxf.insertMod.InsertEntityData
    - typings.dxf.ellipseMod.EllipseEntityData
    - typings.dxf.dimensionMod.DimensionEntityData
    - typings.dxf.circleMod.CircleEntityData
    - typings.dxf.arcMod.ArcEntityData
    - typings.dxf.threedfaceMod.ThreeDFaceEntityData
  */
  trait Entity extends StObject
  object Entity {
    
    inline def ArcEntityData(endAngle: Double, startAngle: Double): typings.dxf.arcMod.ArcEntityData = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.arcMod.ArcEntityData]
    }
    
    inline def CircleEntityData(): typings.dxf.circleMod.CircleEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.circleMod.CircleEntityData]
    }
    
    inline def DimensionEntityData(
      attachementPoint: Any,
      block: Any,
      dimensionType: Any,
      end: Point3D,
      measureEnd: Point3D,
      measureStart: Point3D,
      start: Point3D,
      textMidpoint: Point3D
    ): typings.dxf.dimensionMod.DimensionEntityData = {
      val __obj = js.Dynamic.literal(attachementPoint = attachementPoint.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], dimensionType = dimensionType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], measureEnd = measureEnd.asInstanceOf[js.Any], measureStart = measureStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], textMidpoint = textMidpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.dimensionMod.DimensionEntityData]
    }
    
    inline def EllipseEntityData(endAngle: Double, startAngle: Double): typings.dxf.ellipseMod.EllipseEntityData = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.ellipseMod.EllipseEntityData]
    }
    
    inline def InsertEntityData(
      block: Any,
      columnCount: Double,
      columnSpacing: Double,
      extrusionX: Any & js.UndefOr[Any],
      extrusionY: Any & js.UndefOr[Any],
      extrusionZ: Any & js.UndefOr[Any],
      rotation: Double,
      rowCount: Double,
      rowSpacing: Double,
      scaleX: Double,
      scaleY: Double,
      scaleZ: Double,
      x: Double,
      y: Double,
      z: Double
    ): typings.dxf.insertMod.InsertEntityData = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnSpacing = columnSpacing.asInstanceOf[js.Any], extrusionX = extrusionX.asInstanceOf[js.Any], extrusionY = extrusionY.asInstanceOf[js.Any], extrusionZ = extrusionZ.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowSpacing = rowSpacing.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], scaleZ = scaleZ.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.insertMod.InsertEntityData]
    }
    
    inline def LWPolylineEntityData(): typings.dxf.lwpolylineMod.LWPolylineEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.lwpolylineMod.LWPolylineEntityData]
    }
    
    inline def LineEntityData(): typings.dxf.lineMod.LineEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.lineMod.LineEntityData]
    }
    
    inline def MTextEntityData(): typings.dxf.mtextMod.MTextEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.mtextMod.MTextEntityData]
    }
    
    inline def PointEntityData(): typings.dxf.pointMod.PointEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.pointMod.PointEntityData]
    }
    
    inline def PolylineEntityData(): typings.dxf.polylineMod.PolylineEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.polylineMod.PolylineEntityData]
    }
    
    inline def SolidEntityData(corners: js.Tuple4[Point3D, Point3D, Point3D, Point3D], thickness: Double): typings.dxf.solidMod.SolidEntityData = {
      val __obj = js.Dynamic.literal(corners = corners.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.solidMod.SolidEntityData]
    }
    
    inline def SplineEntityData(controlPoints: js.Array[Point3D], knots: Double): typings.dxf.splineMod.SplineEntityData = {
      val __obj = js.Dynamic.literal(controlPoints = controlPoints.asInstanceOf[js.Any], knots = knots.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.splineMod.SplineEntityData]
    }
    
    inline def TextEntityData(): typings.dxf.textMod.TextEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.textMod.TextEntityData]
    }
    
    inline def ThreeDFaceEntityData(vertices: js.Tuple4[Point3D, Point3D, Point3D, Point3D]): typings.dxf.threedfaceMod.ThreeDFaceEntityData = {
      val __obj = js.Dynamic.literal(vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.threedfaceMod.ThreeDFaceEntityData]
    }
    
    inline def VertexEntityData(): typings.dxf.vertexMod.VertexEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.vertexMod.VertexEntityData]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dxf.dxfStrings.POINT
    - typings.dxf.dxfStrings.LINE
    - typings.dxf.dxfStrings.LWPOLYLINE
    - typings.dxf.dxfStrings.POLYLINE
    - typings.dxf.dxfStrings.VERTEX
    - typings.dxf.dxfStrings.ARC
    - typings.dxf.dxfStrings.CIRCLE
    - typings.dxf.dxfStrings.ELLIPSE
    - typings.dxf.dxfStrings.SPLINE
    - typings.dxf.dxfStrings.SOLID
    - typings.dxf.dxfStrings.TEXT
    - typings.dxf.dxfStrings.MTEXT
    - typings.dxf.dxfStrings.INSERT
    - typings.dxf.dxfStrings.`3DFACE`
    - typings.dxf.dxfStrings.DIMENSION
  */
  trait EntityType extends StObject
  object EntityType {
    
    inline def `3DFACE`: typings.dxf.dxfStrings.`3DFACE` = "3DFACE".asInstanceOf[typings.dxf.dxfStrings.`3DFACE`]
    
    inline def ARC: typings.dxf.dxfStrings.ARC = "ARC".asInstanceOf[typings.dxf.dxfStrings.ARC]
    
    inline def CIRCLE: typings.dxf.dxfStrings.CIRCLE = "CIRCLE".asInstanceOf[typings.dxf.dxfStrings.CIRCLE]
    
    inline def DIMENSION: typings.dxf.dxfStrings.DIMENSION = "DIMENSION".asInstanceOf[typings.dxf.dxfStrings.DIMENSION]
    
    inline def ELLIPSE: typings.dxf.dxfStrings.ELLIPSE = "ELLIPSE".asInstanceOf[typings.dxf.dxfStrings.ELLIPSE]
    
    inline def INSERT: typings.dxf.dxfStrings.INSERT = "INSERT".asInstanceOf[typings.dxf.dxfStrings.INSERT]
    
    inline def LINE: typings.dxf.dxfStrings.LINE = "LINE".asInstanceOf[typings.dxf.dxfStrings.LINE]
    
    inline def LWPOLYLINE: typings.dxf.dxfStrings.LWPOLYLINE = "LWPOLYLINE".asInstanceOf[typings.dxf.dxfStrings.LWPOLYLINE]
    
    inline def MTEXT: typings.dxf.dxfStrings.MTEXT = "MTEXT".asInstanceOf[typings.dxf.dxfStrings.MTEXT]
    
    inline def POINT: typings.dxf.dxfStrings.POINT = "POINT".asInstanceOf[typings.dxf.dxfStrings.POINT]
    
    inline def POLYLINE: typings.dxf.dxfStrings.POLYLINE = "POLYLINE".asInstanceOf[typings.dxf.dxfStrings.POLYLINE]
    
    inline def SOLID: typings.dxf.dxfStrings.SOLID = "SOLID".asInstanceOf[typings.dxf.dxfStrings.SOLID]
    
    inline def SPLINE: typings.dxf.dxfStrings.SPLINE = "SPLINE".asInstanceOf[typings.dxf.dxfStrings.SPLINE]
    
    inline def TEXT: typings.dxf.dxfStrings.TEXT = "TEXT".asInstanceOf[typings.dxf.dxfStrings.TEXT]
    
    inline def VERTEX: typings.dxf.dxfStrings.VERTEX = "VERTEX".asInstanceOf[typings.dxf.dxfStrings.VERTEX]
  }
  
  type LayerGroupedEntities = Record[String, Entity]
}
