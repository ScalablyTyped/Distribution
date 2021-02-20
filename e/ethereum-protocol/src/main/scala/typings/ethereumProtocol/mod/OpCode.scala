package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OpCode extends StObject
@JSImport("ethereum-protocol", "OpCode")
@js.native
object OpCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OpCode with String] = js.native
  
  @js.native
  sealed trait Call extends OpCode
  /* "CALL" */ val Call: typings.ethereumProtocol.mod.OpCode.Call with String = js.native
  
  @js.native
  sealed trait CallCode extends OpCode
  /* "CALLCODE" */ val CallCode: typings.ethereumProtocol.mod.OpCode.CallCode with String = js.native
  
  @js.native
  sealed trait Create extends OpCode
  /* "CREATE" */ val Create: typings.ethereumProtocol.mod.OpCode.Create with String = js.native
  
  @js.native
  sealed trait DelegateCall extends OpCode
  /* "DELEGATECALL" */ val DelegateCall: typings.ethereumProtocol.mod.OpCode.DelegateCall with String = js.native
  
  @js.native
  sealed trait Invalid extends OpCode
  /* "INVALID" */ val Invalid: typings.ethereumProtocol.mod.OpCode.Invalid with String = js.native
  
  @js.native
  sealed trait Return extends OpCode
  /* "RETURN" */ val Return: typings.ethereumProtocol.mod.OpCode.Return with String = js.native
  
  @js.native
  sealed trait Revert extends OpCode
  /* "REVERT" */ val Revert: typings.ethereumProtocol.mod.OpCode.Revert with String = js.native
  
  @js.native
  sealed trait SelfDestruct extends OpCode
  /* "SELFDESTRUCT" */ val SelfDestruct: typings.ethereumProtocol.mod.OpCode.SelfDestruct with String = js.native
  
  @js.native
  sealed trait StaticCall extends OpCode
  /* "STATICCALL" */ val StaticCall: typings.ethereumProtocol.mod.OpCode.StaticCall with String = js.native
  
  @js.native
  sealed trait Stop extends OpCode
  /* "STOP" */ val Stop: typings.ethereumProtocol.mod.OpCode.Stop with String = js.native
}
