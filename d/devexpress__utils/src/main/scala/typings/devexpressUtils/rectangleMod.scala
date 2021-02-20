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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectangleMod {
  
  @js.native
  sealed trait HitTestDeviation extends StObject
  @JSImport("@devexpress/utils/lib/geometry/rectangle", "HitTestDeviation")
  @js.native
  object HitTestDeviation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HitTestDeviation with Double] = js.native
    
    @js.native
    sealed trait Bottom extends HitTestDeviation
    /* 2 */ val Bottom: typings.devexpressUtils.rectangleMod.HitTestDeviation.Bottom with Double = js.native
    
    @js.native
    sealed trait Left extends HitTestDeviation
    /* 4 */ val Left: typings.devexpressUtils.rectangleMod.HitTestDeviation.Left with Double = js.native
    
    @js.native
    sealed trait None extends HitTestDeviation
    /* 0 */ val None: typings.devexpressUtils.rectangleMod.HitTestDeviation.None with Double = js.native
    
    @js.native
    sealed trait Right extends HitTestDeviation
    /* 8 */ val Right: typings.devexpressUtils.rectangleMod.HitTestDeviation.Right with Double = js.native
    
    @js.native
    sealed trait Top extends HitTestDeviation
    /* 1 */ val Top: typings.devexpressUtils.rectangleMod.HitTestDeviation.Top with Double = js.native
  }
  
  @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle")
  @js.native
  class Rectangle protected ()
    extends IRectangle
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
  object Rectangle {
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.areIntersected")
    @js.native
    def areIntersected(rectA: IRectangle, rectB: IRectangle): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.center")
    @js.native
    def center(rect: IRectangle): Point = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.containsPoint")
    @js.native
    def containsPoint(rect: IRectangle, point: IPoint): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.equals")
    @js.native
    def equals(a: IRectangle, b: IRectangle): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.fromCenter")
    @js.native
    def fromCenter(center: Point, minRadius: Double): Rectangle = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.fromGeometry")
    @js.native
    def fromGeometry(point: IPoint, size: ISize): Rectangle = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.fromPoints")
    @js.native
    def fromPoints(pointA: IPoint, pointB: IPoint): Rectangle = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.fromPositions")
    @js.native
    def fromPositions(x1: Double, y1: Double, x2: Double, y2: Double): Rectangle = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.getHorNonCollapsedIntersection")
    @js.native
    def getHorNonCollapsedIntersection(objA: Rectangle, objB: Rectangle): FixedInterval | Null = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.getHorizIntersection")
    @js.native
    def getHorizIntersection(objA: IRectangle, objB: IRectangle): FixedInterval | Null = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.getIntersection")
    @js.native
    def getIntersection(objA: IRectangle, objB: IRectangle): Rectangle | Null = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.getNonCollapsedIntersection")
    @js.native
    def getNonCollapsedIntersection(objA: Rectangle, objB: Rectangle): Rectangle | Null = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.getVertIntersection")
    @js.native
    def getVertIntersection(objA: IRectangle, objB: IRectangle): FixedInterval | Null = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.getVertNonCollapsedIntersection")
    @js.native
    def getVertNonCollapsedIntersection(objA: Rectangle, objB: Rectangle): FixedInterval | Null = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/rectangle", "Rectangle.union")
    @js.native
    def union(rectA: IRectangle, rectB: IRectangle): Rectangle = js.native
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
