package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PremiumOrderStatus extends js.Object

@JSImport("evernote", "Types.PremiumOrderStatus")
@js.native
object PremiumOrderStatus extends js.Object {
  @js.native
  sealed trait ACTIVE extends PremiumOrderStatus
  
  @js.native
  sealed trait CANCELED extends PremiumOrderStatus
  
  @js.native
  sealed trait CANCELLATION_PENDING extends PremiumOrderStatus
  
  @js.native
  sealed trait FAILED extends PremiumOrderStatus
  
  @js.native
  sealed trait NONE extends PremiumOrderStatus
  
  @js.native
  sealed trait PENDING extends PremiumOrderStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PremiumOrderStatus with Double] = js.native
  /* 2 */ @js.native
  object ACTIVE extends TopLevel[ACTIVE with Double]
  
  /* 5 */ @js.native
  object CANCELED extends TopLevel[CANCELED with Double]
  
  /* 4 */ @js.native
  object CANCELLATION_PENDING extends TopLevel[CANCELLATION_PENDING with Double]
  
  /* 3 */ @js.native
  object FAILED extends TopLevel[FAILED with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 1 */ @js.native
  object PENDING extends TopLevel[PENDING with Double]
  
}

