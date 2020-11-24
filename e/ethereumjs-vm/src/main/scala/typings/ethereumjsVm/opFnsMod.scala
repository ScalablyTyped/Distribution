package typings.ethereumjsVm

import org.scalablytyped.runtime.StringDictionary
import typings.ethereumjsVm.interpreterMod.RunState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-vm/dist/evm/opFns", JSImport.Namespace)
@js.native
object opFnsMod extends js.Object {
  
  @js.native
  object handlers extends /* k */ StringDictionary[OpHandler]
  
  type AsyncOpHandler = js.Function1[/* runState */ RunState, js.Promise[Unit]]
  
  type OpHandler = SyncOpHandler | AsyncOpHandler
  
  type SyncOpHandler = js.Function1[/* runState */ RunState, Unit]
}
