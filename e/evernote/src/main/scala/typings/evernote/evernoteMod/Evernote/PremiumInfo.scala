package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_CanPurchaseUploadAllowance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    This structure is used to provide information about a user's Premium account.
  * <dl>
  *    <dt>currentTime</dt>
  *        <dd>
  *        The server-side date and time when this data was generated.
  *        </dd>
  *    <dt>premium</dt>
  *        <dd>
  *        True if the user's account is Premium.
  *        </dd>
  *    <dt>premiumRecurring</dt>
  *        <dd>
  *        True if the user's account is Premium and has a recurring payment method.
  *        </dd>
  *    <dt>premiumExpirationDate</dt>
  *        <dd>
  *        The date when the user's Premium account expires, or the date when the
  *        user's account is due for payment if it has a recurring payment method.
  *        </dd>
  *    <dt>premiumExtendable</dt>
  *        <dd>
  *        True if the user is eligible for purchasing Premium account extensions.
  *        </dd>
  *    <dt>premiumPending</dt>
  *        <dd>
  *        True if the user's Premium account is pending payment confirmation
  *        </dd>
  *    <dt>premiumCancellationPending</dt>
  *        <dd>
  *        True if the user has requested that no further charges to be made; the
  *        Premium account will remain active until it expires.
  *        </dd>
  *    <dt>canPurchaseUploadAllowance</dt>
  *        <dd>
  *        True if the user is eligible for purchasing additional upload allowance.
  *        </dd>
  *    <dt>sponsoredGroupName</dt>
  *        <dd>
  *        The name of the sponsored group that the user is part of.
  *        </dd>
  *    <dt>sponsoredGroupRole</dt>
  *        <dd>
  *        DEPRECATED - will be removed in a future update.
  *        </dd>
  *    <dt>premiumUpgradable</dt>
  *        <dd>
  *        True if the user is eligible for purchasing Premium account upgrade.
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.PremiumInfo")
@js.native
class PremiumInfo () extends js.Object {
  def this(args: Anon_CanPurchaseUploadAllowance) = this()
  var canPurchaseUploadAllowance: Boolean = js.native
  var currentTime: Double = js.native
  var premium: Boolean = js.native
  var premiumCancellationPending: Boolean = js.native
  var premiumExpirationDate: Double = js.native
  var premiumExtendable: Boolean = js.native
  var premiumPending: Boolean = js.native
  var premiumRecurring: Boolean = js.native
  var premiumUpgradable: Boolean = js.native
  var sponsoredGroupName: String = js.native
  var sponsoredGroupRole: SponsoredGroupRole = js.native
}

