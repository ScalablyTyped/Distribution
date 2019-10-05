package typings.evernote.evernoteMod.Evernote

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
  
  /* 2 */ val ACTIVE: typings.evernote.evernoteMod.Evernote.PremiumOrderStatus.ACTIVE with Double = js.native
  /* 5 */ val CANCELED: typings.evernote.evernoteMod.Evernote.PremiumOrderStatus.CANCELED with Double = js.native
  /* 4 */ val CANCELLATION_PENDING: typings.evernote.evernoteMod.Evernote.PremiumOrderStatus.CANCELLATION_PENDING with Double = js.native
  /* 3 */ val FAILED: typings.evernote.evernoteMod.Evernote.PremiumOrderStatus.FAILED with Double = js.native
  /* 0 */ val NONE: typings.evernote.evernoteMod.Evernote.PremiumOrderStatus.NONE with Double = js.native
  /* 1 */ val PENDING: typings.evernote.evernoteMod.Evernote.PremiumOrderStatus.PENDING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PremiumOrderStatus with Double] = js.native
}

