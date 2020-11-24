package typings.devexpressUtils

import typings.devexpressUtils.typesMod.ICloneable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/class/flag", JSImport.Namespace)
@js.native
object flagMod extends js.Object {
  
  @js.native
  class Flag () extends ICloneable[Flag] {
    def this(initValue: Double) = this()
    
    def add(value: Double): Unit = js.native
    
    def anyOf(flags: Double*): Boolean = js.native
    
    def get(enumVal: Double): Boolean = js.native
    
    def getValue(): Double = js.native
    
    def set(enumVal: Double, newValue: Boolean): this.type = js.native
    
    var value: js.Any = js.native
  }
}
