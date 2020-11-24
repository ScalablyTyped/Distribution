package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PremiumOrderStatus extends js.Object
@JSImport("evernote", "Types.PremiumOrderStatus")
@js.native
object PremiumOrderStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PremiumOrderStatus with Double] = js.native
  
  @js.native
  sealed trait ACTIVE extends PremiumOrderStatus
  /* 2 */ @js.native
  object ACTIVE extends TopLevel[ACTIVE with Double]
  
  @js.native
  sealed trait CANCELED extends PremiumOrderStatus
  /* 5 */ @js.native
  object CANCELED extends TopLevel[CANCELED with Double]
  
  @js.native
  sealed trait CANCELLATION_PENDING extends PremiumOrderStatus
  /* 4 */ @js.native
  object CANCELLATION_PENDING extends TopLevel[CANCELLATION_PENDING with Double]
  
  @js.native
  sealed trait FAILED extends PremiumOrderStatus
  /* 3 */ @js.native
  object FAILED extends TopLevel[FAILED with Double]
  
  @js.native
  sealed trait NONE extends PremiumOrderStatus
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  @js.native
  sealed trait PENDING extends PremiumOrderStatus
  /* 1 */ @js.native
  object PENDING extends TopLevel[PENDING with Double]
}
