package typings.eventsource.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

@JSImport("eventsource", "ReadyState")
@js.native
object ReadyState extends js.Object {
  @js.native
  sealed trait CLOSED extends ReadyState
  
  @js.native
  sealed trait CONNECTING extends ReadyState
  
  @js.native
  sealed trait OPEN extends ReadyState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
  /* 2 */ @js.native
  object CLOSED extends TopLevel[CLOSED with Double]
  
  /* 0 */ @js.native
  object CONNECTING extends TopLevel[CONNECTING with Double]
  
  /* 1 */ @js.native
  object OPEN extends TopLevel[OPEN with Double]
  
}

