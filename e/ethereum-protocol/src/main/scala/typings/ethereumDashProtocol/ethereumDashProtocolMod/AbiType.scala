package typings.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AbiType extends js.Object

@JSImport("ethereum-protocol", "AbiType")
@js.native
object AbiType extends js.Object {
  @js.native
  sealed trait Constructor extends AbiType
  
  @js.native
  sealed trait Event extends AbiType
  
  @js.native
  sealed trait Fallback extends AbiType
  
  @js.native
  sealed trait Function extends AbiType
  
  /* "constructor" */ val Constructor: typings.ethereumDashProtocol.ethereumDashProtocolMod.AbiType.Constructor with String = js.native
  /* "event" */ val Event: typings.ethereumDashProtocol.ethereumDashProtocolMod.AbiType.Event with String = js.native
  /* "fallback" */ val Fallback: typings.ethereumDashProtocol.ethereumDashProtocolMod.AbiType.Fallback with String = js.native
  /* "function" */ val Function: typings.ethereumDashProtocol.ethereumDashProtocolMod.AbiType.Function with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AbiType with String] = js.native
}

