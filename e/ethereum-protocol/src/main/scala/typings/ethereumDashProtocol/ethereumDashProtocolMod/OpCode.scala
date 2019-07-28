package typings.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpCode extends js.Object

@JSImport("ethereum-protocol", "OpCode")
@js.native
object OpCode extends js.Object {
  @js.native
  sealed trait Call extends OpCode
  
  @js.native
  sealed trait CallCode extends OpCode
  
  @js.native
  sealed trait Create extends OpCode
  
  @js.native
  sealed trait DelegateCall extends OpCode
  
  @js.native
  sealed trait Invalid extends OpCode
  
  @js.native
  sealed trait Return extends OpCode
  
  @js.native
  sealed trait Revert extends OpCode
  
  @js.native
  sealed trait SelfDestruct extends OpCode
  
  @js.native
  sealed trait StaticCall extends OpCode
  
  @js.native
  sealed trait Stop extends OpCode
  
  /* "CALL" */ val Call: typings.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.Call with String = js.native
  /* "CALLCODE" */ val CallCode: typings.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.CallCode with String = js.native
  /* "CREATE" */ val Create: typings.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.Create with String = js.native
  /* "DELEGATECALL" */ val DelegateCall: typings.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.DelegateCall with String = js.native
  /* "INVALID" */ val Invalid: typings.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.Invalid with String = js.native
  /* "RETURN" */ val Return: typings.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.Return with String = js.native
  /* "REVERT" */ val Revert: typings.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.Revert with String = js.native
  /* "SELFDESTRUCT" */ val SelfDestruct: typings.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.SelfDestruct with String = js.native
  /* "STATICCALL" */ val StaticCall: typings.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.StaticCall with String = js.native
  /* "STOP" */ val Stop: typings.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.Stop with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OpCode with String] = js.native
}

