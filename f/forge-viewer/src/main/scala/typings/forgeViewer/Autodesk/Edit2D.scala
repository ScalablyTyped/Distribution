package typings.forgeViewer.Autodesk

import typings.forgeViewer.Autodesk.Viewing.EventDispatcher
import typings.forgeViewer.THREE.Box2
import typings.forgeViewer.THREE.Matrix4
import typings.forgeViewer.THREE.Vector2
import typings.forgeViewer.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Edit2D {
  
  object BooleanOps {
    
    @js.native
    sealed trait Operator extends StObject
    @JSGlobal("Autodesk.Edit2D.BooleanOps.Operator")
    @js.native
    object Operator extends StObject {
      
      @js.native
      sealed trait Difference
        extends StObject
           with Operator
      
      @js.native
      sealed trait Intersect
        extends StObject
           with Operator
      
      @js.native
      sealed trait Union
        extends StObject
           with Operator
      
      @js.native
      sealed trait Xor
        extends StObject
           with Operator
    }
  }
  
  @js.native
  sealed trait EdgeType extends StObject
  @JSGlobal("Autodesk.Edit2D.EdgeType")
  @js.native
  object EdgeType extends StObject {
    
    @js.native
    sealed trait Bezier
      extends StObject
         with EdgeType
    
    @js.native
    sealed trait Ellipse
      extends StObject
         with EdgeType
    
    @js.native
    sealed trait Line
      extends StObject
         with EdgeType
  }
  
  @js.native
  sealed trait LoopType extends StObject
  @JSGlobal("Autodesk.Edit2D.LoopType")
  @js.native
  object LoopType extends StObject {
    
    @js.native
    sealed trait Empty
      extends StObject
         with LoopType
    
    @js.native
    sealed trait Inner
      extends StObject
         with LoopType
    
    @js.native
    sealed trait Outer
      extends StObject
         with LoopType
    
    @js.native
    sealed trait Overlapping
      extends StObject
         with LoopType
  }
  
  @js.native
  trait Edit2DContext extends StObject {
    
    def addShape(shape: Any): Unit = js.native
    
    def clearLayer(): Unit = js.native
    def clearLayer(enableUndo: Boolean): Unit = js.native
    
    def layer: EditLayer = js.native
    
    def removeShape(shape: Any): Unit = js.native
    
    def setMatrix(matrix: Matrix4): Unit = js.native
    
    def undoStack: UndoStack = js.native
  }
  
  @js.native
  trait EditLayer
    extends StObject
       with EventDispatcher {
    
    def addShape(shape: Shape): Double = js.native
    
    def addShapes(shapes: js.Array[Shape]): Unit = js.native
    
    def clear(): Unit = js.native
    
    def hasShape(shape: Shape): Boolean = js.native
    
    def removeShape(shape: Shape): Boolean = js.native
    
    def removeShapes(shapes: js.Array[Shape]): Unit = js.native
    
    var shapes: js.Array[Shape] = js.native
    
    def update(): Unit = js.native
    
    def updateCanvasGizmos(): Unit = js.native
  }
  
  trait MeasureTransform extends StObject {
    
    @JSName("apply")
    def apply(p: Vector2): Unit
  }
  object MeasureTransform {
    
    inline def apply(apply: Vector2 => Unit): MeasureTransform = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[MeasureTransform]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MeasureTransform] (val x: Self) extends AnyVal {
      
      inline def setApply(value: Vector2 => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Path
    extends StObject
       with PolyBase {
    
    def getEdgeType(segmentIndex: Double): EdgeType = js.native
    def getEdgeType(segmentIndex: Double, loopIndex: Double): EdgeType = js.native
    
    def isBezierArc(segmentIndex: Double): Boolean = js.native
    def isBezierArc(segmentIndex: Double, loopIndex: Double): Boolean = js.native
    
    def isEllipseArc(segmentIndex: Double): Boolean = js.native
    def isEllipseArc(segmentIndex: Double, loopIndex: Double): Boolean = js.native
  }
  
  @js.native
  trait PolyBase
    extends StObject
       with Shape {
    
    def addPoint(x: Double, y: Double): X = js.native
    def addPoint(x: Double, y: Double, loopIndex: Double): X = js.native
    
    def applyMatrix4(matrix: Matrix4): PolyBase = js.native
    
    def enumEdges(cb: js.Function4[/* a */ Vector2, /* b */ Vector2, /* ai */ Double, /* bi */ Double, Boolean]): Unit = js.native
    def enumEdges(
      cb: js.Function4[/* a */ Vector2, /* b */ Vector2, /* ai */ Double, /* bi */ Double, Boolean],
      loopIndex: Double
    ): Unit = js.native
    
    def getChildLoops(loopIndex: Double): js.Array[Double] = js.native
    
    def getEdgeCount(): Double = js.native
    def getEdgeCount(loopIndex: Double): Double = js.native
    
    def getEdgeLength(edgeIndex: Double): Double = js.native
    def getEdgeLength(edgeIndex: Double, loopIndex: Double): Double = js.native
    
    def getLoopType(loopIndex: Double): LoopType = js.native
    
    def getMainLoops(): js.Array[Double] = js.native
    
    def getPoint(index: Double): Vector2 = js.native
    def getPoint(index: Double, loopIndex: Double): Vector2 = js.native
    def getPoint(index: Double, loopIndex: Double, target: Vector2): Vector2 = js.native
    def getPoint(index: Double, loopIndex: Unit, target: Vector2): Vector2 = js.native
    
    def getVertexCount(): Double = js.native
    def getVertexCount(loopIndex: Double): Double = js.native
    
    def isCCW(): Boolean = js.native
    def isCCW(loopIndex: Double): Boolean = js.native
    
    var isClosed: Boolean = js.native
    
    def isLoopFinite(loopIndex: Double): Boolean = js.native
    
    def isPath(): Boolean = js.native
    
    def isPointFinite(vertex: Double): Boolean = js.native
    def isPointFinite(vertex: Double, loopIndex: Double): Boolean = js.native
    
    def isPolygon(): Boolean = js.native
    
    def isPolyline(): Boolean = js.native
    
    def isSelfIntersecting(): Boolean = js.native
    
    def length: Double = js.native
    
    def loopCount: Double = js.native
    
    def points: js.Array[X] = js.native
    
    def vertexCount: Double = js.native
  }
  
  @js.native
  trait Polygon
    extends StObject
       with PolyBase {
    
    def getArea(): Double = js.native
    def getArea(measureTransform: MeasureTransform): Double = js.native
    
    def hitTest(x: Double, y: Double): Boolean = js.native
  }
  
  type PolygonPath = Path
  
  type Polyline = PolyBase
  
  @js.native
  trait Shape
    extends StObject
       with EventDispatcher {
    
    var bbox: Box2 = js.native
    
    var bboxDirty: Boolean = js.native
    
    def computeBBox(): Unit = js.native
    
    def getBBox(): Box2 = js.native
    
    var id: Double = js.native
    
    var style: Style = js.native
    
    def updateBBox(): Unit = js.native
  }
  
  trait Style extends StObject {
    
    var color: String
    
    def copy(from: Style): Style
    
    var fillAlpha: Double
    
    var fillColor: String
    
    var lineAlpha: Double
    
    var lineColor: String
    
    var lineStyle: Double
    
    var lineWidth: Double
    
    def setFillColor(r: Double, g: Double, b: Double): Unit
    
    def setLineColor(r: Double, g: Double, b: Double): Unit
  }
  object Style {
    
    inline def apply(
      color: String,
      copy: Style => Style,
      fillAlpha: Double,
      fillColor: String,
      lineAlpha: Double,
      lineColor: String,
      lineStyle: Double,
      lineWidth: Double,
      setFillColor: (Double, Double, Double) => Unit,
      setLineColor: (Double, Double, Double) => Unit
    ): Style = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], lineAlpha = lineAlpha.asInstanceOf[js.Any], lineColor = lineColor.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], setFillColor = js.Any.fromFunction3(setFillColor), setLineColor = js.Any.fromFunction3(setLineColor))
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setCopy(value: Style => Style): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      inline def setFillAlpha(value: Double): Self = StObject.set(x, "fillAlpha", value.asInstanceOf[js.Any])
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setLineAlpha(value: Double): Self = StObject.set(x, "lineAlpha", value.asInstanceOf[js.Any])
      
      inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      inline def setLineStyle(value: Double): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setSetFillColor(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setFillColor", js.Any.fromFunction3(value))
      
      inline def setSetLineColor(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setLineColor", js.Any.fromFunction3(value))
    }
  }
  
  type UndoStack = EventDispatcher
}
