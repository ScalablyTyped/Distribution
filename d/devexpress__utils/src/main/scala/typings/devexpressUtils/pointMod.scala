package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IPoint
import typings.devexpressUtils.typesMod.ICloneable
import typings.devexpressUtils.typesMod.IEquatable
import typings.devexpressUtils.typesMod.ISupportConverting
import typings.devexpressUtils.typesMod.ISupportCopyFrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/geometry/point", JSImport.Namespace)
@js.native
object pointMod extends js.Object {
  
  @js.native
  class Point protected ()
    extends IPoint
       with ICloneable[Point]
       with ISupportCopyFrom[Point]
       with IEquatable[Point]
       with ISupportConverting[Double] {
    def this(x: Double, y: Double) = this()
    
    def equals(obj: IPoint): Boolean = js.native
    
    def isZero(): Boolean = js.native
    
    def multiply(multiplierX: Double, multiplierY: Double): this.type = js.native
    
    def negative(): this.type = js.native
    
    def offset(offsetX: Double, offsetY: Double): this.type = js.native
    
    def offsetByPoint(offset: IPoint): this.type = js.native
  }
  /* static members */
  @js.native
  object Point extends js.Object {
    
    def equals(a: IPoint, b: IPoint): Boolean = js.native
    
    def fromNumber(num: Double): Point = js.native
    
    def minus(a: IPoint, b: IPoint): Point = js.native
    
    def plus(a: IPoint, b: IPoint): Point = js.native
    
    def xComparer(a: IPoint, b: IPoint): Double = js.native
    
    def yComparer(a: IPoint, b: IPoint): Double = js.native
    
    def zero(): Point = js.native
  }
  
  type Offset = Point
}
