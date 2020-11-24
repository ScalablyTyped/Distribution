package typings.evernote.mod.Errors

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDAMInvalidContactReason extends js.Object
@JSImport("evernote", "Errors.EDAMInvalidContactReason")
@js.native
object EDAMInvalidContactReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDAMInvalidContactReason with Double] = js.native
  
  @js.native
  sealed trait BAD_ADDRESS extends EDAMInvalidContactReason
  /* 0 */ @js.native
  object BAD_ADDRESS extends TopLevel[BAD_ADDRESS with Double]
  
  @js.native
  sealed trait DUPLICATE_CONTACT extends EDAMInvalidContactReason
  /* 1 */ @js.native
  object DUPLICATE_CONTACT extends TopLevel[DUPLICATE_CONTACT with Double]
  
  @js.native
  sealed trait NO_CONNECTION extends EDAMInvalidContactReason
  /* 2 */ @js.native
  object NO_CONNECTION extends TopLevel[NO_CONNECTION with Double]
}
