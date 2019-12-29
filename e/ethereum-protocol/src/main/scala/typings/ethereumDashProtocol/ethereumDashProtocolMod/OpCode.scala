package typings.ethereumDashProtocol.ethereumDashProtocolMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OpCode with String] = js.native
  /* "CALL" */ @js.native
  object Call extends TopLevel[Call with String]
  
  /* "CALLCODE" */ @js.native
  object CallCode extends TopLevel[CallCode with String]
  
  /* "CREATE" */ @js.native
  object Create extends TopLevel[Create with String]
  
  /* "DELEGATECALL" */ @js.native
  object DelegateCall extends TopLevel[DelegateCall with String]
  
  /* "INVALID" */ @js.native
  object Invalid extends TopLevel[Invalid with String]
  
  /* "RETURN" */ @js.native
  object Return extends TopLevel[Return with String]
  
  /* "REVERT" */ @js.native
  object Revert extends TopLevel[Revert with String]
  
  /* "SELFDESTRUCT" */ @js.native
  object SelfDestruct extends TopLevel[SelfDestruct with String]
  
  /* "STATICCALL" */ @js.native
  object StaticCall extends TopLevel[StaticCall with String]
  
  /* "STOP" */ @js.native
  object Stop extends TopLevel[Stop with String]
  
}

