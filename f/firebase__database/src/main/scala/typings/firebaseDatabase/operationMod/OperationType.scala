package typings.firebaseDatabase.operationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OperationType extends js.Object
@JSImport("@firebase/database/dist/src/core/operation/Operation", "OperationType")
@js.native
object OperationType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperationType with Double] = js.native
  
  @js.native
  sealed trait ACK_USER_WRITE extends OperationType
  /* 2 */ @js.native
  object ACK_USER_WRITE extends TopLevel[ACK_USER_WRITE with Double]
  
  @js.native
  sealed trait LISTEN_COMPLETE extends OperationType
  /* 3 */ @js.native
  object LISTEN_COMPLETE extends TopLevel[LISTEN_COMPLETE with Double]
  
  @js.native
  sealed trait MERGE extends OperationType
  /* 1 */ @js.native
  object MERGE extends TopLevel[MERGE with Double]
  
  @js.native
  sealed trait OVERWRITE extends OperationType
  /* 0 */ @js.native
  object OVERWRITE extends TopLevel[OVERWRITE with Double]
}
