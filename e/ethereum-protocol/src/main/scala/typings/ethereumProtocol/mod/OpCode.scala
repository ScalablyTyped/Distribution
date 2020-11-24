package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OpCode extends js.Object
@JSImport("ethereum-protocol", "OpCode")
@js.native
object OpCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OpCode with String] = js.native
  
  @js.native
  sealed trait Call extends OpCode
  /* "CALL" */ @js.native
  object Call extends TopLevel[Call with String]
  
  @js.native
  sealed trait CallCode extends OpCode
  /* "CALLCODE" */ @js.native
  object CallCode extends TopLevel[CallCode with String]
  
  @js.native
  sealed trait Create extends OpCode
  /* "CREATE" */ @js.native
  object Create extends TopLevel[Create with String]
  
  @js.native
  sealed trait DelegateCall extends OpCode
  /* "DELEGATECALL" */ @js.native
  object DelegateCall extends TopLevel[DelegateCall with String]
  
  @js.native
  sealed trait Invalid extends OpCode
  /* "INVALID" */ @js.native
  object Invalid extends TopLevel[Invalid with String]
  
  @js.native
  sealed trait Return extends OpCode
  /* "RETURN" */ @js.native
  object Return extends TopLevel[Return with String]
  
  @js.native
  sealed trait Revert extends OpCode
  /* "REVERT" */ @js.native
  object Revert extends TopLevel[Revert with String]
  
  @js.native
  sealed trait SelfDestruct extends OpCode
  /* "SELFDESTRUCT" */ @js.native
  object SelfDestruct extends TopLevel[SelfDestruct with String]
  
  @js.native
  sealed trait StaticCall extends OpCode
  /* "STATICCALL" */ @js.native
  object StaticCall extends TopLevel[StaticCall with String]
  
  @js.native
  sealed trait Stop extends OpCode
  /* "STOP" */ @js.native
  object Stop extends TopLevel[Stop with String]
}
