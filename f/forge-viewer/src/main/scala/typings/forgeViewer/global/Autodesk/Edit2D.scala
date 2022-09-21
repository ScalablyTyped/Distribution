package typings.forgeViewer.global.Autodesk

import typings.forgeViewer.Autodesk.Edit2D.BooleanOps.Operator
import typings.forgeViewer.Autodesk.Viewing.EventDispatcher
import typings.forgeViewer.Autodesk.Viewing.Viewer3D
import typings.forgeViewer.THREE.Box2
import typings.forgeViewer.THREE.Matrix4
import typings.forgeViewer.THREE.Vector2
import typings.forgeViewer.anon.FlipY
import typings.forgeViewer.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Edit2D {
  
  object BooleanOps {
    
    @JSGlobal("Autodesk.Edit2D.BooleanOps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Autodesk.Edit2D.BooleanOps.Operator")
    @js.native
    object Operator extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.forgeViewer.Autodesk.Edit2D.BooleanOps.Operator & Double] = js.native
      
      /* 3 */ val Difference: typings.forgeViewer.Autodesk.Edit2D.BooleanOps.Operator.Difference & Double = js.native
      
      /* 1 */ val Intersect: typings.forgeViewer.Autodesk.Edit2D.BooleanOps.Operator.Intersect & Double = js.native
      
      /* 2 */ val Union: typings.forgeViewer.Autodesk.Edit2D.BooleanOps.Operator.Union & Double = js.native
      
      /* 4 */ val Xor: typings.forgeViewer.Autodesk.Edit2D.BooleanOps.Operator.Xor & Double = js.native
    }
    
    inline def apply(
      path1: typings.forgeViewer.Autodesk.Edit2D.PolyBase,
      path2: typings.forgeViewer.Autodesk.Edit2D.PolyBase,
      operator: Operator
    ): typings.forgeViewer.Autodesk.Edit2D.PolyBase = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[typings.forgeViewer.Autodesk.Edit2D.PolyBase]
    inline def apply(
      path1: typings.forgeViewer.Autodesk.Edit2D.PolyBase,
      path2: typings.forgeViewer.Autodesk.Edit2D.PolyBase,
      operator: Operator,
      extraOperands: js.Array[typings.forgeViewer.Autodesk.Edit2D.PolyBase]
    ): typings.forgeViewer.Autodesk.Edit2D.PolyBase = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], extraOperands.asInstanceOf[js.Any])).asInstanceOf[typings.forgeViewer.Autodesk.Edit2D.PolyBase]
  }
  
  @JSGlobal("Autodesk.Edit2D.EdgeType")
  @js.native
  object EdgeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.forgeViewer.Autodesk.Edit2D.EdgeType & Double] = js.native
    
    /* 1 */ val Bezier: typings.forgeViewer.Autodesk.Edit2D.EdgeType.Bezier & Double = js.native
    
    /* 2 */ val Ellipse: typings.forgeViewer.Autodesk.Edit2D.EdgeType.Ellipse & Double = js.native
    
    /* 0 */ val Line: typings.forgeViewer.Autodesk.Edit2D.EdgeType.Line & Double = js.native
  }
  
  @JSGlobal("Autodesk.Edit2D.Edit2DContext")
  @js.native
  open class Edit2DContext ()
    extends StObject
       with typings.forgeViewer.Autodesk.Edit2D.Edit2DContext
  
  @JSGlobal("Autodesk.Edit2D.EditLayer")
  @js.native
  open class EditLayer protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Edit2D.EditLayer {
    def this(viewer: Viewer3D) = this()
    def this(viewer: Viewer3D, options: Any) = this()
  }
  
  @JSGlobal("Autodesk.Edit2D.LoopType")
  @js.native
  object LoopType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.forgeViewer.Autodesk.Edit2D.LoopType & Double] = js.native
    
    /* 0 */ val Empty: typings.forgeViewer.Autodesk.Edit2D.LoopType.Empty & Double = js.native
    
    /* 1 */ val Inner: typings.forgeViewer.Autodesk.Edit2D.LoopType.Inner & Double = js.native
    
    /* 2 */ val Outer: typings.forgeViewer.Autodesk.Edit2D.LoopType.Outer & Double = js.native
    
    /* 3 */ val Overlapping: typings.forgeViewer.Autodesk.Edit2D.LoopType.Overlapping & Double = js.native
  }
  
  object Math2D {
    
    @JSGlobal("Autodesk.Edit2D.Math2D")
    @js.native
    val ^ : js.Any = js.native
    
    inline def angleBetweenDirections(dir1: Vector2, dir2: Vector2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleBetweenDirections")(dir1.asInstanceOf[js.Any], dir2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def changesOrientation(matrix: Matrix4): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("changesOrientation")(matrix.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def collinear(p1: Vector2, dir1: Vector2, p2: Vector2, dir2: Vector2, precision: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("collinear")(p1.asInstanceOf[js.Any], dir1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], dir2.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def distance2D(p1: X, p2: X): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance2D")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def edgeIsDegenerated(a: Vector2, b: Vector2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("edgeIsDegenerated")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def edgeIsDegenerated(a: Vector2, b: Vector2, eps: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("edgeIsDegenerated")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], eps.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fuzzyEqual(a: Double, b: Double, precision: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def getEdgeCenter(a: X, b: X): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEdgeCenter")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    inline def getEdgeCenter(a: X, b: X, target: Vector2): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEdgeCenter")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    inline def getEdgeDirection(a: X, b: X): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEdgeDirection")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    inline def getEdgeDirection(a: X, b: X, target: Vector2): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEdgeDirection")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    inline def getEdgeLength(a: X, b: X): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEdgeLength")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getFitToBoxTransform(fromBox: Box2, toBox: Box2): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("getFitToBoxTransform")(fromBox.asInstanceOf[js.Any], toBox.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def getFitToBoxTransform(fromBox: Box2, toBox: Box2, options: Unit, target: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("getFitToBoxTransform")(fromBox.asInstanceOf[js.Any], toBox.asInstanceOf[js.Any], options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def getFitToBoxTransform(fromBox: Box2, toBox: Box2, options: FlipY): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("getFitToBoxTransform")(fromBox.asInstanceOf[js.Any], toBox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def getFitToBoxTransform(fromBox: Box2, toBox: Box2, options: FlipY, target: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("getFitToBoxTransform")(fromBox.asInstanceOf[js.Any], toBox.asInstanceOf[js.Any], options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    inline def intersectLines(linePoint1: X, lineDir1: X, linePoint2: X, lineDir2: X): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectLines")(linePoint1.asInstanceOf[js.Any], lineDir1.asInstanceOf[js.Any], linePoint2.asInstanceOf[js.Any], lineDir2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersectLines(linePoint1: X, lineDir1: X, linePoint2: X, lineDir2: X, outPoint: X): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectLines")(linePoint1.asInstanceOf[js.Any], lineDir1.asInstanceOf[js.Any], linePoint2.asInstanceOf[js.Any], lineDir2.asInstanceOf[js.Any], outPoint.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isPointOnEdge(p: X, a: X, b: X, precision: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnEdge")(p.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isPointOnEdge(p: X, a: X, b: X, precision: Double, checkInsideSegment: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnEdge")(p.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], checkInsideSegment.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isPointOnLine(p: X, a: X, b: X, precision: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnLine")(p.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def mirrorPointOnPoint(p: X, c: X): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mirrorPointOnPoint")(p.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    inline def mirrorPointOnPoint(p: X, c: X, target: Vector2): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mirrorPointOnPoint")(p.asInstanceOf[js.Any], c.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    inline def pointDelta(a: X, b: X): X = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDelta")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[X]
    inline def pointDelta(a: X, b: X, digits: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDelta")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[X]
    
    inline def pointLineDistance(p: Vector2, linePoint: Vector2, lineDir: Vector2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointLineDistance")(p.asInstanceOf[js.Any], linePoint.asInstanceOf[js.Any], lineDir.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def projectToLine(p: Vector2, linePoint: Vector2, lineDir: Vector2): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("projectToLine")(p.asInstanceOf[js.Any], linePoint.asInstanceOf[js.Any], lineDir.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def rotateAround(p: Vector2, angle: Double): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateAround")(p.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    inline def rotateAround(p: Vector2, angle: Double, center: Vector2): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateAround")(p.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    inline def turnLeft(x: Double, y: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("turnLeft")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[X]
  }
  
  @JSGlobal("Autodesk.Edit2D.MeasureTransform")
  @js.native
  open class MeasureTransform ()
    extends StObject
       with typings.forgeViewer.Autodesk.Edit2D.MeasureTransform {
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(p: Vector2): Unit = js.native
  }
  
  @JSGlobal("Autodesk.Edit2D.Path")
  @js.native
  open class Path ()
    extends StObject
       with typings.forgeViewer.Autodesk.Edit2D.Path {
    def this(points: js.Array[X]) = this()
    def this(points: js.Array[X], isClosed: Boolean) = this()
    def this(points: Unit, isClosed: Boolean) = this()
    def this(points: js.Array[X], isClosed: Boolean, style: typings.forgeViewer.Autodesk.Edit2D.Style) = this()
    def this(points: js.Array[X], isClosed: Unit, style: typings.forgeViewer.Autodesk.Edit2D.Style) = this()
    def this(points: Unit, isClosed: Boolean, style: typings.forgeViewer.Autodesk.Edit2D.Style) = this()
    def this(points: Unit, isClosed: Unit, style: typings.forgeViewer.Autodesk.Edit2D.Style) = this()
  }
  
  @JSGlobal("Autodesk.Edit2D.PolyBase")
  @js.native
  open class PolyBase ()
    extends StObject
       with typings.forgeViewer.Autodesk.Edit2D.PolyBase {
    def this(points: js.Array[X]) = this()
    def this(points: js.Array[X], style: typings.forgeViewer.Autodesk.Edit2D.Style) = this()
    def this(points: Unit, style: typings.forgeViewer.Autodesk.Edit2D.Style) = this()
  }
  
  @JSGlobal("Autodesk.Edit2D.Polygon")
  @js.native
  open class Polygon ()
    extends StObject
       with typings.forgeViewer.Autodesk.Edit2D.Polygon {
    def this(points: js.Array[X]) = this()
    def this(points: js.Array[X], style: typings.forgeViewer.Autodesk.Edit2D.Style) = this()
    def this(points: Unit, style: typings.forgeViewer.Autodesk.Edit2D.Style) = this()
  }
  
  @JSGlobal("Autodesk.Edit2D.PolygonPath")
  @js.native
  open class PolygonPath protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Edit2D.Path {
    def this(points: js.Array[X]) = this()
    def this(points: js.Array[X], style: typings.forgeViewer.Autodesk.Edit2D.Style) = this()
  }
  
  @JSGlobal("Autodesk.Edit2D.Polyline")
  @js.native
  open class Polyline protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Edit2D.PolyBase {
    def this(points: js.Array[X]) = this()
    def this(points: js.Array[X], style: typings.forgeViewer.Autodesk.Edit2D.Style) = this()
  }
  
  object Selection {
    
    object Events {
      
      @JSGlobal("Autodesk.Edit2D.Selection.Events.SELECTION_CHANGED")
      @js.native
      val SELECTION_CHANGED: /* "selectionChanged" */ String = js.native
      
      @JSGlobal("Autodesk.Edit2D.Selection.Events.SELECTION_HOVER_CHANGED")
      @js.native
      val SELECTION_HOVER_CHANGED: /* "selectionHoverChanged" */ String = js.native
    }
  }
  
  @JSGlobal("Autodesk.Edit2D.Shape")
  @js.native
  open class Shape ()
    extends StObject
       with typings.forgeViewer.Autodesk.Edit2D.Shape {
    def this(style: typings.forgeViewer.Autodesk.Edit2D.Style) = this()
  }
  
  @JSGlobal("Autodesk.Edit2D.Style")
  @js.native
  open class Style ()
    extends StObject
       with typings.forgeViewer.Autodesk.Edit2D.Style {
    def this(params: Any) = this()
    
    /* CompleteClass */
    var color: String = js.native
    
    /* CompleteClass */
    override def copy(from: typings.forgeViewer.Autodesk.Edit2D.Style): typings.forgeViewer.Autodesk.Edit2D.Style = js.native
    
    /* CompleteClass */
    var fillAlpha: Double = js.native
    
    /* CompleteClass */
    var fillColor: String = js.native
    
    /* CompleteClass */
    var lineAlpha: Double = js.native
    
    /* CompleteClass */
    var lineColor: String = js.native
    
    /* CompleteClass */
    var lineStyle: Double = js.native
    
    /* CompleteClass */
    var lineWidth: Double = js.native
    
    /* CompleteClass */
    override def setFillColor(r: Double, g: Double, b: Double): Unit = js.native
    
    /* CompleteClass */
    override def setLineColor(r: Double, g: Double, b: Double): Unit = js.native
  }
  
  @JSGlobal("Autodesk.Edit2D.UndoStack")
  @js.native
  open class UndoStack ()
    extends StObject
       with EventDispatcher
  object UndoStack {
    
    @JSGlobal("Autodesk.Edit2D.UndoStack")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Autodesk.Edit2D.UndoStack.AFTER_ACTION")
    @js.native
    def AFTER_ACTION: String = js.native
    inline def AFTER_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AFTER_ACTION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Autodesk.Edit2D.UndoStack.BEFORE_ACTION")
    @js.native
    def BEFORE_ACTION: String = js.native
    inline def BEFORE_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEFORE_ACTION")(x.asInstanceOf[js.Any])
  }
}
