package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpCode extends js.Object

@JSImport("ethereum-protocol", "OpCode")
@js.native
object OpCode extends js.Object {
  @js.native
  sealed trait Call
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.OpCode
  
  @js.native
  sealed trait CallCode
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.OpCode
  
  @js.native
  sealed trait Create
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.OpCode
  
  @js.native
  sealed trait DelegateCall
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.OpCode
  
  @js.native
  sealed trait Invalid
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.OpCode
  
  @js.native
  sealed trait Return
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.OpCode
  
  @js.native
  sealed trait Revert
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.OpCode
  
  @js.native
  sealed trait SelfDestruct
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.OpCode
  
  @js.native
  sealed trait StaticCall
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.OpCode
  
  @js.native
  sealed trait Stop
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.OpCode
  
  /* "CALL" */ val Call: Call with java.lang.String = js.native
  /* "CALLCODE" */ val CallCode: CallCode with java.lang.String = js.native
  /* "CREATE" */ val Create: Create with java.lang.String = js.native
  /* "DELEGATECALL" */ val DelegateCall: DelegateCall with java.lang.String = js.native
  /* "INVALID" */ val Invalid: Invalid with java.lang.String = js.native
  /* "RETURN" */ val Return: Return with java.lang.String = js.native
  /* "REVERT" */ val Revert: Revert with java.lang.String = js.native
  /* "SELFDESTRUCT" */ val SelfDestruct: SelfDestruct with java.lang.String = js.native
  /* "STATICCALL" */ val StaticCall: StaticCall with java.lang.String = js.native
  /* "STOP" */ val Stop: Stop with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ethereumDashProtocolLib.ethereumDashProtocolMod.OpCode with java.lang.String] = js.native
}

