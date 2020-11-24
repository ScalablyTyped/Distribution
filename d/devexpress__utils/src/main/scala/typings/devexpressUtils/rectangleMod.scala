package typings.devexpressUtils

import org.scalablytyped.runtime.TopLevel
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/geometry/rectangle", JSImport.Namespace)
@js.native
object rectangleMod extends js.Object {
  
  @js.native
  sealed trait HitTestDeviation extends js.Object
  @js.native
  object HitTestDeviation extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HitTestDeviation with Double] = js.native
    
    @js.native
    sealed trait Bottom extends HitTestDeviation
    /* 2 */ @js.native
    object Bottom extends TopLevel[Bottom with Double]
    
    @js.native
    sealed trait Left extends HitTestDeviation
    /* 4 */ @js.native
    object Left extends TopLevel[Left with Double]
    
    @js.native
    sealed trait None extends HitTestDeviation
    /* 0 */ @js.native
    object None extends TopLevel[None with Double]
    
    @js.native
    sealed trait Right extends HitTestDeviation
    /* 8 */ @js.native
    object Right extends TopLevel[Right with Double]
    
    @js.native
    sealed trait Top extends HitTestDeviation
    /* 1 */ @js.native
    object Top extends TopLevel[Top with Double]
  }
  
  @js.native
  class Rectangle protected ()
    extends IPoint
       with ISize
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
    
    def createHorizontalInterval(): FixedInterval = js.native
    
    def createPosition(): Point = js.native
    
    def createRectangle(): Rectangle = js.native
    
    def createSize(): Size = js.native
    
    def createVerticalInterval(): FixedInterval = js.native
    
    def equals(obj: IRectangle): Boolean = js.native
    
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
  }
  /* static members */
  @js.native
  object Rectangle extends js.Object {
    
    def areIntersected(rectA: IRectangle, rectB: IRectangle): Boolean = js.native
    
    def center(rect: IRectangle): Point = js.native
    
    def containsPoint(rect: IRectangle, point: IPoint): Boolean = js.native
    
    def equals(a: IRectangle, b: IRectangle): Boolean = js.native
    
    def fromCenter(center: Point, minRadius: Double): Rectangle = js.native
    
    def fromGeometry(point: IPoint, size: ISize): Rectangle = js.native
    
    def fromPoints(pointA: IPoint, pointB: IPoint): Rectangle = js.native
    
    def fromPositions(x1: Double, y1: Double, x2: Double, y2: Double): Rectangle = js.native
    
    def getHorNonCollapsedIntersection(objA: Rectangle, objB: Rectangle): FixedInterval | Null = js.native
    
    def getHorizIntersection(objA: IRectangle, objB: IRectangle): FixedInterval | Null = js.native
    
    def getIntersection(objA: IRectangle, objB: IRectangle): Rectangle | Null = js.native
    
    def getNonCollapsedIntersection(objA: Rectangle, objB: Rectangle): Rectangle | Null = js.native
    
    def getVertIntersection(objA: IRectangle, objB: IRectangle): FixedInterval | Null = js.native
    
    def getVertNonCollapsedIntersection(objA: Rectangle, objB: Rectangle): FixedInterval | Null = js.native
    
    def union(rectA: IRectangle, rectB: IRectangle): Rectangle = js.native
  }
  
  @js.native
  class RectangleDeviation protected () extends js.Object {
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
