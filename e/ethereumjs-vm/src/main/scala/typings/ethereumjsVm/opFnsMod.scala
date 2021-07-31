package typings.ethereumjsVm

import typings.ethereumjsVm.interpreterMod.RunState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opFnsMod {
  
  type AsyncOpHandler = js.Function1[/* runState */ RunState, js.Promise[Unit]]
  
  type OpHandler = SyncOpHandler | AsyncOpHandler
  
  type SyncOpHandler = js.Function1[/* runState */ RunState, Unit]
}
