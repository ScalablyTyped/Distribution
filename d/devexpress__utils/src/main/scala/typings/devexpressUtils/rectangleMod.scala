package typings.devexpressUtils

import typings.devexpressUtils.fixedMod.FixedInterval
import typings.devexpressUtils.flagMod.Flag
import typings.devexpressUtils.interfacesMod.IOffsets
import typings.devexpressUtils.interfacesMod.IPoint
import typings.devexpressUtils.interfacesMod.IRectangle
import typings.devexpressUtils.interfacesMod.ISize
import typings.devexpressUtils.pointMod.Point
import typings.devexpressUtils.sizeMod.Size
import typings.devexpressUtils.typesMod.ICloneable
import typings.devexpressUtils.typesMod.IEquatable
import typings.devexpressUtils.typesMod.ISupportCopyFrom
import typings.devexpressUtils.typesMod.SimpleConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectangleMod {
  
  @js.native
  sealed trait HitTestDeviation extends StObject
  @JSImport("@devexpress/utils/lib/geometry/rectangle", "HitTestDeviation")
  @js.native
  object HitTestDeviation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HitTestDeviation & Double] = js.native
    
    @js.native
    sealed trait Bottom
      extends StObject
         with HitTestDeviation
    /* 2 */ val Bottom: typings.devexpressUtils.rectangleMod.HitTestDeviation.Bottom & Double = js.native
    
    @js.native
    sealed trait Left
      extends StObject
         with HitTestDeviation
    /* 4 */ val Left: typings.devexpressUtils.rectangleMod.HitTestDeviation.Left & Double = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with HitTestDeviation
    /* 0 */ val None: typings.devexpressUtils.rectangleMod.HitTestDeviation.None & Double = js.native
    
    @js.native
    sealed trait Right
      extends StObject
         with HitTestDeviation
    /* 8 */ val Right: typings.devexpressUtils.rectangleMod.HitTestDeviation.Right & Double = js.native
    
    @js.native
    sealed trait Top
      extends StObject
         with HitTestDeviation
    /* 1 */ val Top: typings.devexpressUtils.rectangleMod.HitTestDeviation.Top & Double = js.native
  }
  
  @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle")
  @js.native
  class Rectangle protected ()
    extends StObject
       with IRectangle
       with IEquatable[Rectangle]
       with ICloneable[Rectangle]
       with ISupportCopyFrom[Rectangle] {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    
    def applyConverter(converter: SimpleConverter[Double]): this.type = js.native
    
    def applyNormalizedOffsetsInside(offsets: IOffsets): this.type = js.native
    
    def applyOffsetsInside(offsets: IOffsets): this.type = js.native
    
    def applyOffsetsOutside(offsets: IOffsets): this.type = js.native
    
    val bottom: Double = js.native
    
    val center: Point = js.native
    
    def containsPoint(point: IPoint): Boolean = js.native
    
    def containsRectangle(rectangle: Rectangle): Boolean = js.native
    
    def copyFrom(obj: IRectangle): Unit = js.native
    /* CompleteClass */
    override def copyFrom(obj: Rectangle): Unit = js.native
    
    def createHorizontalInterval(): FixedInterval = js.native
    
    def createPosition(): Point = js.native
    
    def createRectangle(): Rectangle = js.native
    
    def createSize(): Size = js.native
    
    def createVerticalInterval(): FixedInterval = js.native
    
    def equals(obj: IRectangle): Boolean = js.native
    
    /* CompleteClass */
    var height: Double = js.native
    
    def inflate(deltaX: Double): this.type = js.native
    def inflate(deltaX: Double, deltaY: Double): this.type = js.native
    
    def isCollapsed(): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def moveRectangle(offsetX: Double, offsetY: Double): this.type = js.native
    
    def moveRectangleByPoint(offset: IPoint): this.type = js.native
    
    def multiply(multiplierX: Double, multiplierY: Double): this.type = js.native
    
    def nonNegativeSize(): this.type = js.native
    
    def resize(deltaX: Double, deltaY: Double): this.type = js.native
    
    val right: Double = js.native
    
    def setGeomerty(rect: IRectangle): this.type = js.native
    
    def setPosition(pos: IPoint): this.type = js.native
    
    def setSize(size: ISize): this.type = js.native
    
    /* CompleteClass */
    var width: Double = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  /* static members */
  object Rectangle {
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def areIntersected(rectA: IRectangle, rectB: IRectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areIntersected")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def center(rect: IRectangle): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("center")(rect.asInstanceOf[js.Any]).asInstanceOf[Point]
    
    @scala.inline
    def containsPoint(rect: IRectangle, point: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsPoint")(rect.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def equals(a: IRectangle, b: IRectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def fromCenter(center: Point, minRadius: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCenter")(center.asInstanceOf[js.Any], minRadius.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
    
    @scala.inline
    def fromGeometry(point: IPoint, size: ISize): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGeometry")(point.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
    
    @scala.inline
    def fromPoints(pointA: IPoint, pointB: IPoint): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
    
    @scala.inline
    def fromPositions(x1: Double, y1: Double, x2: Double, y2: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
    
    @scala.inline
    def getHorNonCollapsedIntersection(objA: Rectangle, objB: Rectangle): FixedInterval | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getHorNonCollapsedIntersection")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[FixedInterval | Null]
    
    @scala.inline
    def getHorizIntersection(objA: IRectangle, objB: IRectangle): FixedInterval | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getHorizIntersection")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[FixedInterval | Null]
    
    @scala.inline
    def getIntersection(objA: IRectangle, objB: IRectangle): Rectangle | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersection")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Rectangle | Null]
    
    @scala.inline
    def getNonCollapsedIntersection(objA: Rectangle, objB: Rectangle): Rectangle | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNonCollapsedIntersection")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Rectangle | Null]
    
    @scala.inline
    def getVertIntersection(objA: IRectangle, objB: IRectangle): FixedInterval | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getVertIntersection")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[FixedInterval | Null]
    
    @scala.inline
    def getVertNonCollapsedIntersection(objA: Rectangle, objB: Rectangle): FixedInterval | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getVertNonCollapsedIntersection")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[FixedInterval | Null]
    
    @scala.inline
    def union(rectA: IRectangle, rectB: IRectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  }
  
  @JSImport("@devexpress/utils/lib/geometry/rectangle", "RectangleDeviation")
  @js.native
  class RectangleDeviation protected () extends StObject {
    def this(initRectangle: Rectangle, initPoint: Point) = this()
    
    def calcAdditionalParams(): this.type = js.native
    
    def calcDeviation(): this.type = js.native
    
    var deviation: Flag = js.native
    
    var initPoint: Point = js.native
    
    var initRectangle: Rectangle = js.native
    
    var insidePoint: Point = js.native
    
    var offsetToInside: Point = js.native
  }
}
