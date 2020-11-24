package typings.egjsAxes

import typings.egjsAxes.axesMod.AxesOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@egjs/axes/InterruptManager", JSImport.Namespace)
@js.native
object interruptManagerMod extends js.Object {
  
  @js.native
  class InterruptManager protected () extends js.Object {
    def this(options: AxesOption) = this()
    
    var _prevented: js.Any = js.native
    
    def isInterrupted(): Boolean = js.native
    
    def isInterrupting(): Boolean = js.native
    
    var options: js.Any = js.native
    
    def setInterrupt(prevented: js.Any): Unit = js.native
  }
}
