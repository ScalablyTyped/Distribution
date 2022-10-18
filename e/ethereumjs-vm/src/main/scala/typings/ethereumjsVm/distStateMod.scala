package typings.ethereumjsVm

import typings.ethereumjsVm.distStateStateManagerMod.StateManagerOpts
import typings.ethereumjsVm.distStateStateManagerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStateMod {
  
  @JSImport("ethereumjs-vm/dist/state", "StateManager")
  @js.native
  /**
    * Instantiate the StateManager interface.
    */
  open class StateManager () extends default {
    def this(opts: StateManagerOpts) = this()
  }
}
