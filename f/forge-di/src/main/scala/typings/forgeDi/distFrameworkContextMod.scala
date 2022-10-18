package typings.forgeDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFrameworkContextMod {
  
  @JSImport("forge-di/dist/framework/Context", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Context
  
  @js.native
  trait Context extends StObject {
    
    var bindings: js.Array[typings.forgeDi.distFrameworkBindingMod.default] = js.native
    
    def has(binding: typings.forgeDi.distFrameworkBindingMod.default): Boolean = js.native
    
    def pop(): typings.forgeDi.distFrameworkBindingMod.default = js.native
    
    def push(binding: typings.forgeDi.distFrameworkBindingMod.default): Double = js.native
    
    def toString(indent: Double): String = js.native
  }
}
