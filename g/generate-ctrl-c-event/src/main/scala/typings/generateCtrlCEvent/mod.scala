package typings.generateCtrlCEvent

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("generate-ctrl-c-event", JSImport.Namespace)
  @js.native
  val ^ : GenerateCtrlCEvent = js.native
  
  @js.native
  trait GenerateCtrlCEvent extends StObject {
    
    def generateCtrlBreak(): Boolean = js.native
    def generateCtrlBreak(dwProcessGroupId: Double): Boolean = js.native
    
    def generateCtrlBreakAsync(): js.Promise[Boolean] = js.native
    def generateCtrlBreakAsync(dwProcessGroupId: Double): js.Promise[Boolean] = js.native
    
    def generateCtrlC(): Boolean = js.native
    
    def generateCtrlCAsync(): js.Promise[Boolean] = js.native
  }
  
  type _To = GenerateCtrlCEvent
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GenerateCtrlCEvent = ^
}
