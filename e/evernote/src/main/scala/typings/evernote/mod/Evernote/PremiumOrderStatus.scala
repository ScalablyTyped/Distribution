package typings.evernote.mod.Evernote

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PremiumOrderStatus extends js.Object

/**
  * This enumeration defines the possible states of a premium account
  *
  * NONE:        the user has never attempted to become a premium subscriber
  *
  * PENDING: the user has requested a premium account but their charge has not
  *     been confirmed
  *
  * ACTIVE:    the user has been charged and their premium account is in good
  *    standing
  *
  * FAILED:    the system attempted to charge the was denied. Their premium
  *     privileges have been revoked. We will periodically attempt to re-validate
  *     their order.
  *
  * CANCELLATION_PENDING: the user has requested that no further charges be made
  *     but the current account is still active.
  *
  * CANCELED: the premium account was canceled either because of failure to pay
  *     or user cancelation. No more attempts will be made to activate the account.
  */
@JSImport("evernote", "Evernote.PremiumOrderStatus")
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

