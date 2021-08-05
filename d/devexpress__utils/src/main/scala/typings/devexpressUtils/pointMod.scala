package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IPoint
import typings.devexpressUtils.typesMod.ICloneable
import typings.devexpressUtils.typesMod.IEquatable
import typings.devexpressUtils.typesMod.ISupportConverting
import typings.devexpressUtils.typesMod.ISupportCopyFrom
import typings.devexpressUtils.typesMod.SimpleConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointMod {
  
  @JSImport("@devexpress/utils/lib/geometry/point", "Point")
  @js.native
  class Point protected ()
    extends StObject
       with IPoint
       with ICloneable[Point]
       with ISupportCopyFrom[Point]
       with IEquatable[Point]
       with ISupportConverting[Double] {
    def this(x: Double, y: Double) = this()
    
    /* CompleteClass */
    override def applyConverter(converter: SimpleConverter[Double]): this.type = js.native
    
    /* CompleteClass */
    override def copyFrom(obj: Point): Unit = js.native
    
    def equals(obj: IPoint): Boolean = js.native
    
    def isZero(): Boolean = js.native
    
    def multiply(multiplierX: Double, multiplierY: Double): this.type = js.native
    
    def negative(): this.type = js.native
    
    def offset(offsetX: Double, offsetY: Double): this.type = js.native
    
    def offsetByPoint(offset: IPoint): this.type = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  /* static members */
  object Point {
    
    @JSImport("@devexpress/utils/lib/geometry/point", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(a: IPoint, b: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromNumber(num: Double): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(num.asInstanceOf[js.Any]).asInstanceOf[Point]
    
    inline def minus(a: IPoint, b: IPoint): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("minus")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def plus(a: IPoint, b: IPoint): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("plus")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def xComparer(a: IPoint, b: IPoint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("xComparer")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def yComparer(a: IPoint, b: IPoint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("yComparer")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def zero(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[Point]
  }
  
  type Offset = Point
}
