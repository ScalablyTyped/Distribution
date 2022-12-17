package typings.dxf

import typings.dxf.commonMod.Point3D
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersEntitiesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.dxf.handlersEntityVertexMod.VertexEntityData
    - typings.dxf.handlersEntityTextMod.TextEntityData
    - typings.dxf.handlersEntitySplineMod.SplineEntityData
    - typings.dxf.handlersEntitySolidMod.SolidEntityData
    - typings.dxf.handlersEntityPolylineMod.PolylineEntityData
    - typings.dxf.handlersEntityPointMod.PointEntityData
    - typings.dxf.handlersEntityMtextMod.MTextEntityData
    - typings.dxf.handlersEntityLineMod.LineEntityData
    - typings.dxf.handlersEntityLwpolylineMod.LWPolylineEntityData
    - typings.dxf.handlersEntityInsertMod.InsertEntityData
    - typings.dxf.handlersEntityEllipseMod.EllipseEntityData
    - typings.dxf.handlersEntityDimensionMod.DimensionEntityData
    - typings.dxf.handlersEntityCircleMod.CircleEntityData
    - typings.dxf.handlersEntityArcMod.ArcEntityData
    - typings.dxf.handlersEntityThreedfaceMod.ThreeDFaceEntityData
  */
  trait Entity extends StObject
  object Entity {
    
    inline def ArcEntityData(endAngle: Double, startAngle: Double): typings.dxf.handlersEntityArcMod.ArcEntityData = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.handlersEntityArcMod.ArcEntityData]
    }
    
    inline def CircleEntityData(): typings.dxf.handlersEntityCircleMod.CircleEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.handlersEntityCircleMod.CircleEntityData]
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
    ): typings.dxf.handlersEntityDimensionMod.DimensionEntityData = {
      val __obj = js.Dynamic.literal(attachementPoint = attachementPoint.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], dimensionType = dimensionType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], measureEnd = measureEnd.asInstanceOf[js.Any], measureStart = measureStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], textMidpoint = textMidpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.handlersEntityDimensionMod.DimensionEntityData]
    }
    
    inline def EllipseEntityData(endAngle: Double, startAngle: Double): typings.dxf.handlersEntityEllipseMod.EllipseEntityData = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.handlersEntityEllipseMod.EllipseEntityData]
    }
    
    inline def InsertEntityData(
      block: Any,
      columnCount: Double,
      columnSpacing: Double,
      extrusionX: Any,
      extrusionY: Any,
      extrusionZ: Any,
      rotation: Double,
      rowCount: Double,
      rowSpacing: Double,
      scaleX: Double,
      scaleY: Double,
      scaleZ: Double,
      x: Double,
      y: Double,
      z: Double
    ): typings.dxf.handlersEntityInsertMod.InsertEntityData = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnSpacing = columnSpacing.asInstanceOf[js.Any], extrusionX = extrusionX.asInstanceOf[js.Any], extrusionY = extrusionY.asInstanceOf[js.Any], extrusionZ = extrusionZ.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowSpacing = rowSpacing.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], scaleZ = scaleZ.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.handlersEntityInsertMod.InsertEntityData]
    }
    
    inline def LWPolylineEntityData(): typings.dxf.handlersEntityLwpolylineMod.LWPolylineEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.handlersEntityLwpolylineMod.LWPolylineEntityData]
    }
    
    inline def LineEntityData(): typings.dxf.handlersEntityLineMod.LineEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.handlersEntityLineMod.LineEntityData]
    }
    
    inline def MTextEntityData(): typings.dxf.handlersEntityMtextMod.MTextEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.handlersEntityMtextMod.MTextEntityData]
    }
    
    inline def PointEntityData(): typings.dxf.handlersEntityPointMod.PointEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.handlersEntityPointMod.PointEntityData]
    }
    
    inline def PolylineEntityData(): typings.dxf.handlersEntityPolylineMod.PolylineEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.handlersEntityPolylineMod.PolylineEntityData]
    }
    
    inline def SolidEntityData(corners: js.Tuple4[Point3D, Point3D, Point3D, Point3D], thickness: Double): typings.dxf.handlersEntitySolidMod.SolidEntityData = {
      val __obj = js.Dynamic.literal(corners = corners.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.handlersEntitySolidMod.SolidEntityData]
    }
    
    inline def SplineEntityData(controlPoints: js.Array[Point3D], knots: Double): typings.dxf.handlersEntitySplineMod.SplineEntityData = {
      val __obj = js.Dynamic.literal(controlPoints = controlPoints.asInstanceOf[js.Any], knots = knots.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.handlersEntitySplineMod.SplineEntityData]
    }
    
    inline def TextEntityData(): typings.dxf.handlersEntityTextMod.TextEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.handlersEntityTextMod.TextEntityData]
    }
    
    inline def ThreeDFaceEntityData(vertices: js.Tuple4[Point3D, Point3D, Point3D, Point3D]): typings.dxf.handlersEntityThreedfaceMod.ThreeDFaceEntityData = {
      val __obj = js.Dynamic.literal(vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dxf.handlersEntityThreedfaceMod.ThreeDFaceEntityData]
    }
    
    inline def VertexEntityData(): typings.dxf.handlersEntityVertexMod.VertexEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.dxf.handlersEntityVertexMod.VertexEntityData]
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
