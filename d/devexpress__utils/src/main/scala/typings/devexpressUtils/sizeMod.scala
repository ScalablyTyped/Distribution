package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.ISize
import typings.devexpressUtils.typesMod.ICloneable
import typings.devexpressUtils.typesMod.IEquatable
import typings.devexpressUtils.typesMod.ISupportCopyFrom
import typings.devexpressUtils.typesMod.SimpleConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/geometry/size", JSImport.Namespace)
@js.native
object sizeMod extends js.Object {
  
  @js.native
  class Size protected ()
    extends ISize
       with ICloneable[Size]
       with ISupportCopyFrom[Size]
       with IEquatable[ISize] {
    def this(width: Double, height: Double) = this()
    
    def applyConverter(conv: SimpleConverter[Double]): this.type = js.native
    
    def isEmpty(): Boolean = js.native
    
    def multiply(multiplierW: Double, multiplierH: Double): this.type = js.native
    
    def nonNegativeSize(): this.type = js.native
    
    def offset(offsetWidth: Double, offsetHeight: Double): this.type = js.native
  }
  /* static members */
  @js.native
  object Size extends js.Object {
    
    def empty(): Size = js.native
    
    def equals(a: ISize, b: ISize): Boolean = js.native
    
    def fromNumber(num: Double): Size = js.native
    
    def initByCommonAction(
      action: js.Function2[
          /* directAdp */ js.Function1[/* s */ ISize, Double], 
          /* reverseAdp */ js.Function1[/* s */ ISize, Double], 
          Double
        ]
    ): Size = js.native
  }
}
