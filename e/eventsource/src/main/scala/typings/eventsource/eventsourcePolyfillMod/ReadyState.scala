package typings.eventsource.eventsourcePolyfillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eventsource/lib/eventsource-polyfill", "ReadyState")
@js.native
object ReadyState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.eventsource.mod.ReadyState with Double] = js.native
  
  /* 2 */ val CLOSED: typings.eventsource.mod.ReadyState.CLOSED with Double = js.native
  
  /* 0 */ val CONNECTING: typings.eventsource.mod.ReadyState.CONNECTING with Double = js.native
  
  /* 1 */ val OPEN: typings.eventsource.mod.ReadyState.OPEN with Double = js.native
}
