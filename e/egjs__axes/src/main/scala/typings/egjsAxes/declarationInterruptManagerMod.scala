package typings.egjsAxes

import typings.egjsAxes.declarationAxesMod.AxesOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationInterruptManagerMod {
  
  @JSImport("@egjs/axes/declaration/InterruptManager", "InterruptManager")
  @js.native
  open class InterruptManager protected () extends StObject {
    def this(_options: AxesOption) = this()
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _prevented: Any = js.native
    
    def isInterrupted(): Boolean = js.native
    
    def isInterrupting(): Boolean = js.native
    
    def setInterrupt(prevented: Any): Unit = js.native
  }
}
