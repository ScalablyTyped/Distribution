package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OpCode extends StObject
@JSImport("ethereum-protocol", "OpCode")
@js.native
object OpCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OpCode & String] = js.native
  
  @js.native
  sealed trait Call
    extends StObject
       with OpCode
  /* "CALL" */ val Call: typings.ethereumProtocol.mod.OpCode.Call & String = js.native
  
  @js.native
  sealed trait CallCode
    extends StObject
       with OpCode
  /* "CALLCODE" */ val CallCode: typings.ethereumProtocol.mod.OpCode.CallCode & String = js.native
  
  @js.native
  sealed trait Create
    extends StObject
       with OpCode
  /* "CREATE" */ val Create: typings.ethereumProtocol.mod.OpCode.Create & String = js.native
  
  @js.native
  sealed trait DelegateCall
    extends StObject
       with OpCode
  /* "DELEGATECALL" */ val DelegateCall: typings.ethereumProtocol.mod.OpCode.DelegateCall & String = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with OpCode
  /* "INVALID" */ val Invalid: typings.ethereumProtocol.mod.OpCode.Invalid & String = js.native
  
  @js.native
  sealed trait Return
    extends StObject
       with OpCode
  /* "RETURN" */ val Return: typings.ethereumProtocol.mod.OpCode.Return & String = js.native
  
  @js.native
  sealed trait Revert
    extends StObject
       with OpCode
  /* "REVERT" */ val Revert: typings.ethereumProtocol.mod.OpCode.Revert & String = js.native
  
  @js.native
  sealed trait SelfDestruct
    extends StObject
       with OpCode
  /* "SELFDESTRUCT" */ val SelfDestruct: typings.ethereumProtocol.mod.OpCode.SelfDestruct & String = js.native
  
  @js.native
  sealed trait StaticCall
    extends StObject
       with OpCode
  /* "STATICCALL" */ val StaticCall: typings.ethereumProtocol.mod.OpCode.StaticCall & String = js.native
  
  @js.native
  sealed trait Stop
    extends StObject
       with OpCode
  /* "STOP" */ val Stop: typings.ethereumProtocol.mod.OpCode.Stop & String = js.native
}
