package typings.forgeViewer.global.Autodesk

import typings.forgeViewer.Autodesk.Viewing.GuiViewer3D
import typings.forgeViewer.Autodesk.Viewing.Viewer3D
import typings.forgeViewer.THREE.Box3
import typings.forgeViewer.THREE.Mesh
import typings.forgeViewer.THREE.Plane
import typings.forgeViewer.THREE.Vector2
import typings.forgeViewer.THREE.Vector3
import typings.forgeViewer.anon.DiffMode
import typings.forgeViewer.anon.MinOpacity
import typings.forgeViewer.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Extensions {
  
  object CompGeom {
    
    @JSGlobal("Autodesk.Extensions.CompGeom")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Autodesk.Extensions.CompGeom.ComplexPolygon")
    @js.native
    open class ComplexPolygon protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.CompGeom.ComplexPolygon {
      def this(uniquePoints: js.Array[Vector3]) = this()
      def this(uniquePoints: js.Array[Vector3], customInsideChecker: Any) = this()
      def this(uniquePoints: js.Array[Vector3], customInsideChecker: Any, bbox: Box3) = this()
      def this(uniquePoints: js.Array[Vector3], customInsideChecker: Unit, bbox: Box3) = this()
      
      /* CompleteClass */
      override def addContour(indices: js.Array[Double]): Unit = js.native
      
      /* CompleteClass */
      override def pointInContour(x: Double, y: Double, cntr: js.Array[Double]): Boolean = js.native
      
      /* CompleteClass */
      override def pointInPolygon(x: Double, y: Double): Boolean = js.native
      
      /* CompleteClass */
      override def triangulate(): Unit = js.native
    }
    
    @JSGlobal("Autodesk.Extensions.CompGeom.ContourSet")
    @js.native
    open class ContourSet ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.CompGeom.ContourSet
    
    object DefaultTessParams {
      
      @JSGlobal("Autodesk.Extensions.CompGeom.DefaultTessParams")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Autodesk.Extensions.CompGeom.DefaultTessParams.minSegLenFraction")
      @js.native
      def minSegLenFraction: Double = js.native
      inline def minSegLenFraction_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minSegLenFraction")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Autodesk.Extensions.CompGeom.DefaultTessParams.numIterations")
      @js.native
      def numIterations: Double = js.native
      inline def numIterations_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numIterations")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Autodesk.Extensions.CompGeom.EdgeSet")
    @js.native
    open class EdgeSet protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.CompGeom.EdgeSet {
      def this(edges: js.Array[Any], bbox: Box3, precisionTolerance: Double) = this()
      
      /* CompleteClass */
      override def sanitizeEdges(): Unit = js.native
      
      /* CompleteClass */
      override def snapEdges(): Unit = js.native
      
      /* CompleteClass */
      override def stitchContours(): Unit = js.native
      
      /* CompleteClass */
      override def triangulate(): Unit = js.native
    }
    
    @JSGlobal("Autodesk.Extensions.CompGeom.EllipseArc")
    @js.native
    open class EllipseArc protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.CompGeom.EllipseArc {
      def this(
        cx: Double,
        cy: Double,
        rx: Double,
        ry: Double,
        rotation: Double,
        startAngle: Double,
        endAngle: Double,
        ccw: Boolean
      ) = this()
    }
    
    @JSGlobal("Autodesk.Extensions.CompGeom.IntervalTree")
    @js.native
    open class IntervalTree ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.CompGeom.IntervalTree
    
    @JSGlobal("Autodesk.Extensions.CompGeom.LmvCanvasContext")
    @js.native
    open class LmvCanvasContext ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.CompGeom.LmvCanvasContext
    
    @JSGlobal("Autodesk.Extensions.CompGeom.ONE_INTERSECTION")
    @js.native
    val ONE_INTERSECTION: Double = js.native
    
    @JSGlobal("Autodesk.Extensions.CompGeom.OVERLAP")
    @js.native
    val OVERLAP: Double = js.native
    
    @JSGlobal("Autodesk.Extensions.CompGeom.Path2D")
    @js.native
    open class Path2D ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.CompGeom.Path2D
    
    @JSGlobal("Autodesk.Extensions.CompGeom.Point")
    @js.native
    open class Point ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.CompGeom.Point
    
    @JSGlobal("Autodesk.Extensions.CompGeom.PointError")
    @js.native
    open class PointError ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.CompGeom.PointError
    
    @JSGlobal("Autodesk.Extensions.CompGeom.QuadTree")
    @js.native
    open class QuadTree ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.CompGeom.QuadTree
    
    inline def SetTesselationParams(minSegLenFraction: Double, numIterations: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTesselationParams")(minSegLenFraction.asInstanceOf[js.Any], numIterations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("Autodesk.Extensions.CompGeom.TOL")
    @js.native
    val TOL: Double = js.native
    
    inline def TesselateCubic(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      px4: Double,
      py4: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateCubic")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], px4.asInstanceOf[js.Any], py4.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateCubic(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      px4: Double,
      py4: Double,
      maxdim: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateCubic")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], px4.asInstanceOf[js.Any], py4.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateCubic(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      px4: Double,
      py4: Double,
      maxdim: Double,
      tessParams: Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateCubic")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], px4.asInstanceOf[js.Any], py4.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any], tessParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateCubic(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      px4: Double,
      py4: Double,
      maxdim: Double,
      tessParams: Any,
      isFont: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateCubic")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], px4.asInstanceOf[js.Any], py4.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any], tessParams.asInstanceOf[js.Any], isFont.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateCubic(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      px4: Double,
      py4: Double,
      maxdim: Double,
      tessParams: Unit,
      isFont: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateCubic")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], px4.asInstanceOf[js.Any], py4.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any], tessParams.asInstanceOf[js.Any], isFont.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateCubic(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      px4: Double,
      py4: Double,
      maxdim: Unit,
      tessParams: Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateCubic")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], px4.asInstanceOf[js.Any], py4.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any], tessParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateCubic(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      px4: Double,
      py4: Double,
      maxdim: Unit,
      tessParams: Any,
      isFont: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateCubic")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], px4.asInstanceOf[js.Any], py4.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any], tessParams.asInstanceOf[js.Any], isFont.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateCubic(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      px4: Double,
      py4: Double,
      maxdim: Unit,
      tessParams: Unit,
      isFont: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateCubic")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], px4.asInstanceOf[js.Any], py4.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any], tessParams.asInstanceOf[js.Any], isFont.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def TesselateQuad(ctx: Any, px1: Double, py1: Double, px2: Double, py2: Double, px3: Double, py3: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateQuad")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateQuad(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      maxdim: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateQuad")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateQuad(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      maxdim: Double,
      tessParams: Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateQuad")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any], tessParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateQuad(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      maxdim: Double,
      tessParams: Any,
      isFont: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateQuad")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any], tessParams.asInstanceOf[js.Any], isFont.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateQuad(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      maxdim: Double,
      tessParams: Unit,
      isFont: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateQuad")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any], tessParams.asInstanceOf[js.Any], isFont.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateQuad(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      maxdim: Unit,
      tessParams: Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateQuad")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any], tessParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateQuad(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      maxdim: Unit,
      tessParams: Any,
      isFont: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateQuad")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any], tessParams.asInstanceOf[js.Any], isFont.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def TesselateQuad(
      ctx: Any,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      maxdim: Unit,
      tessParams: Unit,
      isFont: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TesselateQuad")(ctx.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], maxdim.asInstanceOf[js.Any], tessParams.asInstanceOf[js.Any], isFont.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("Autodesk.Extensions.CompGeom.Triangle")
    @js.native
    open class Triangle ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.CompGeom.Triangle
    
    @JSGlobal("Autodesk.Extensions.CompGeom.UniquePointList")
    @js.native
    open class UniquePointList ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.CompGeom.UniquePointList
    
    @JSGlobal("Autodesk.Extensions.CompGeom.VERSION")
    @js.native
    val VERSION: String = js.native
    
    inline def angleInsideArc(angle: Double, start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("angleInsideArc")(angle.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def angleInsideArc(angle: Double, start: Double, end: Double, ccw: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("angleInsideArc")(angle.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], ccw.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def angleInsideArcCCW(angle: Double, start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("angleInsideArcCCW")(angle.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def convertToPlaneCoords(planeBasis: Any, edges3d: js.Array[Any], bbox: Box3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPlaneCoords")(planeBasis.asInstanceOf[js.Any], edges3d.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getAngleDelta(startAngle: Double, endAngle: Double, ccw: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngleDelta")(startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], ccw.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getCubeBezierPoint(
      t: Double,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      px4: Double,
      py4: Double
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCubeBezierPoint")(t.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], px4.asInstanceOf[js.Any], py4.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getCubeBezierPoint(
      t: Double,
      px1: Double,
      py1: Double,
      px2: Double,
      py2: Double,
      px3: Double,
      py3: Double,
      px4: Double,
      py4: Double,
      optionalTarget: Vector2
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCubeBezierPoint")(t.asInstanceOf[js.Any], px1.asInstanceOf[js.Any], py1.asInstanceOf[js.Any], px2.asInstanceOf[js.Any], py2.asInstanceOf[js.Any], px3.asInstanceOf[js.Any], py3.asInstanceOf[js.Any], px4.asInstanceOf[js.Any], py4.asInstanceOf[js.Any], optionalTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getEllipseArcPoint(t: Double, cx: Double, cy: Double, rx: Double, ry: Double, startAngle: Double, endAngle: Double): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipseArcPoint")(t.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    inline def getEllipseArcPoint(
      t: Double,
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      startAngle: Double,
      endAngle: Double,
      rotation: Double
    ): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipseArcPoint")(t.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    inline def getEllipseArcPoint(
      t: Double,
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      startAngle: Double,
      endAngle: Double,
      rotation: Double,
      target: Vector2
    ): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipseArcPoint")(t.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    inline def getEllipseArcPoint(
      t: Double,
      cx: Double,
      cy: Double,
      rx: Double,
      ry: Double,
      startAngle: Double,
      endAngle: Double,
      rotation: Unit,
      target: Vector2
    ): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipseArcPoint")(t.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    inline def getEllipsePoint(angle: Double, cx: Double, cy: Double, rx: Double, ry: Double): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsePoint")(angle.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    inline def getEllipsePoint(angle: Double, cx: Double, cy: Double, rx: Double, ry: Double, rotation: Double): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsePoint")(angle.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    inline def getEllipsePoint(angle: Double, cx: Double, cy: Double, rx: Double, ry: Double, rotation: Double, target: Vector2): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsePoint")(angle.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    inline def getEllipsePoint(angle: Double, cx: Double, cy: Double, rx: Double, ry: Double, rotation: Unit, target: Vector2): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsePoint")(angle.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    inline def isEqual(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isZero(f: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZero")(f.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def makePlaneBasis(plane: Plane): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makePlaneBasis")(plane.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def normalizeAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def pointOnLine(x: Double, y: Double, e: Any, checkInsideSegment: Boolean, precisionDistance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOnLine")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], e.asInstanceOf[js.Any], checkInsideSegment.asInstanceOf[js.Any], precisionDistance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def pointOnLine(x: Double, y: Double, e: Any, checkInsideSegment: Boolean, precisionDistance: Double, outPt: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOnLine")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], e.asInstanceOf[js.Any], checkInsideSegment.asInstanceOf[js.Any], precisionDistance.asInstanceOf[js.Any], outPt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def polygonArea(pts: js.Array[X]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonArea")(pts.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def segmentsIntersect(e1: Any, e2: Any, precisionDistance: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("segmentsIntersect")(e1.asInstanceOf[js.Any], e2.asInstanceOf[js.Any], precisionDistance.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def xBoxBox(
      minx1: Double,
      miny1: Double,
      maxx1: Double,
      maxy1: Double,
      minx2: Double,
      miny2: Double,
      maxx2: Double,
      maxy2: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("xBoxBox")(minx1.asInstanceOf[js.Any], miny1.asInstanceOf[js.Any], maxx1.asInstanceOf[js.Any], maxy1.asInstanceOf[js.Any], minx2.asInstanceOf[js.Any], miny2.asInstanceOf[js.Any], maxx2.asInstanceOf[js.Any], maxy2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def xBoxPlane(plane: Plane, box: Box3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("xBoxPlane")(plane.asInstanceOf[js.Any], box.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def xLineBox(
      x0: Double,
      y0: Double,
      x1: Double,
      y1: Double,
      xmin: Double,
      ymin: Double,
      xmax: Double,
      ymax: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("xLineBox")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], xmin.asInstanceOf[js.Any], ymin.asInstanceOf[js.Any], xmax.asInstanceOf[js.Any], ymax.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def xMeshPlane(plane: Plane, mesh: Mesh, intersects: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xMeshPlane")(plane.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], intersects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def xPlaneSegment(plane: Plane, pt0: Vector3, pt1: Vector3, res1: Vector3, res2: Vector3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("xPlaneSegment")(plane.asInstanceOf[js.Any], pt0.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], res1.asInstanceOf[js.Any], res2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def xTrianglePlane(
      plane: Plane,
      pt0: Vector3,
      pt1: Vector3,
      pt2: Vector3,
      i0: Any,
      i1: Any,
      i2: Any,
      res: Vector3,
      meshId: Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xTrianglePlane")(plane.asInstanceOf[js.Any], pt0.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], res.asInstanceOf[js.Any], meshId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("Autodesk.Extensions.DataVisualization")
  @js.native
  open class DataVisualization protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Extensions.DataVisualization {
    def this(viewer: Viewer3D) = this()
    def this(viewer: Viewer3D, options: MinOpacity) = this()
  }
  
  object DocumentBrowser {
    
    @JSGlobal("Autodesk.Extensions.DocumentBrowser.DocumentBrowser")
    @js.native
    open class DocumentBrowser ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.DocumentBrowser.DocumentBrowser
  }
  
  @JSGlobal("Autodesk.Extensions.Edit2D")
  @js.native
  open class Edit2D ()
    extends StObject
       with typings.forgeViewer.Autodesk.Extensions.Edit2D
  
  object Measure {
    
    @JSGlobal("Autodesk.Extensions.Measure.MeasureExtension")
    @js.native
    open class MeasureExtension ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.Measure.MeasureExtension
  }
  
  object PixelCompare {
    
    @JSGlobal("Autodesk.Extensions.PixelCompare.PixelCompare")
    @js.native
    open class PixelCompare protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.Extensions.PixelCompare.PixelCompare {
      def this(viewer: GuiViewer3D) = this()
      def this(viewer: GuiViewer3D, options: DiffMode) = this()
    }
  }
  
  @JSGlobal("Autodesk.Extensions.StringExtractor")
  @js.native
  open class StringExtractor ()
    extends StObject
       with typings.forgeViewer.Autodesk.Extensions.StringExtractor
  
  @JSGlobal("Autodesk.Extensions.VisualClusters")
  @js.native
  open class VisualClusters ()
    extends StObject
       with typings.forgeViewer.Autodesk.Extensions.VisualClusters
}
