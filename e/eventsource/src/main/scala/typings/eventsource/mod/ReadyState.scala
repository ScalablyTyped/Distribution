package typings.eventsource.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadyState extends js.Object
@JSImport("eventsource", "ReadyState")
@js.native
object ReadyState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
  
  @js.native
  sealed trait CLOSED extends ReadyState
  /* 2 */ @js.native
  object CLOSED extends TopLevel[CLOSED with Double]
  
  @js.native
  sealed trait CONNECTING extends ReadyState
  /* 0 */ @js.native
  object CONNECTING extends TopLevel[CONNECTING with Double]
  
  @js.native
  sealed trait OPEN extends ReadyState
  /* 1 */ @js.native
  object OPEN extends TopLevel[OPEN with Double]
}
