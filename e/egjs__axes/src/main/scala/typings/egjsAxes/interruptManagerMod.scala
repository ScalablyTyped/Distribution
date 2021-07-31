package typings.egjsAxes

import typings.egjsAxes.axesMod.AxesOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interruptManagerMod {
  
  @JSImport("@egjs/axes/InterruptManager", "InterruptManager")
  @js.native
  class InterruptManager protected () extends StObject {
    def this(options: AxesOption) = this()
    
    var _prevented: js.Any = js.native
    
    def isInterrupted(): Boolean = js.native
    
    def isInterrupting(): Boolean = js.native
    
    var options: js.Any = js.native
    
    def setInterrupt(prevented: js.Any): Unit = js.native
  }
}
