package typings.forgeDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("forge-di/dist/framework/Context", JSImport.Default)
  @js.native
  class default () extends Context
  
  @js.native
  trait Context extends StObject {
    
    var bindings: js.Array[typings.forgeDi.bindingMod.default] = js.native
    
    def has(binding: typings.forgeDi.bindingMod.default): Boolean = js.native
    
    def pop(): typings.forgeDi.bindingMod.default = js.native
    
    def push(binding: typings.forgeDi.bindingMod.default): Double = js.native
    
    def toString(indent: Double): String = js.native
  }
}
