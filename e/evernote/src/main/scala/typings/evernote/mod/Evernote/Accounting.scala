package typings.evernote.mod.Evernote

import typings.evernote.AnonBusinessId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    This represents the bookkeeping information for the user's subscription.
  *
  * <dl>
  *    <dt>uploadLimit</dt>
  *        <dd>The number of bytes that can be uploaded to the account
  *        in the current month.    For new notes that are created, this is the length
  *        of the note content (in Unicode characters) plus the size of each resource
  *        (in bytes).    For edited notes, this is the the difference between the old
  *        length and the new length (if this is greater than 0) plus the size of
  *        each new resource.
  *        </dd>
  *    <dt>uploadLimitEnd</dt>
  *        <dd>The date and time when the current upload limit
  *        expires.    At this time, the monthly upload count reverts to 0 and a new
  *        limit is imposed.    This date and time is exclusive, so this is effectively
  *        the start of the new month.
  *        </dd>
  *    <dt>uploadLimitNextMonth</dt>
  *        <dd> When uploadLimitEnd is reached, the service
  *        will change uploadLimit to uploadLimitNextMonth. If a premium account is
  *        canceled, this mechanism will reset the quota appropriately.
  *        </dd>
  *    <dt>premiumServiceStatus</dt>
  *        <dd>Indicates the phases of a premium account
  *        during the billing process.
  *        </dd>
  *    <dt>premiumOrderNumber</dt>
  *        <dd>The order number used by the commerce system to
  *        process recurring payments
  *        </dd>
  *    <dt>premiumServiceStart</dt>
  *        <dd>The start date when this premium promotion
  *        began (this number will get overwritten if a premium service is canceled
  *        and then re-activated).
  *        </dd>
  *    <dt>premiumCommerceService</dt>
  *        <dd>The commerce system used (paypal, Google
  *        checkout, etc)
  *        </dd>
  *    <dt>premiumServiceSKU</dt>
  *        <dd>The code associated with the purchase eg. monthly
  *        or annual purchase. Clients should interpret this value and localize it.
  *        </dd>
  *    <dt>lastSuccessfulCharge</dt>
  *        <dd>Date the last time the user was charged.
  *        Null if never charged.
  *        </dd>
  *    <dt>lastFailedCharge</dt>
  *        <dd>Date the last time a charge was attempted and
  *        failed.
  *        </dd>
  *    <dt>lastFailedChargeReason</dt>
  *        <dd>Reason provided for the charge failure
  *        </dd>
  *    <dt>nextPaymentDue</dt>
  *        <dd>The end of the billing cycle. This could be in the
  *        past if there are failed charges.
  *        </dd>
  *    <dt>premiumLockUntil</dt>
  *        <dd>An internal variable to manage locking operations
  *        on the commerce variables.
  *        </dd>
  *    <dt>updated</dt>
  *        <dd>The date any modification where made to this record.
  *        </dd>
  *    <dt>premiumSubscriptionNumber</dt>
  *        <dd>The number number identifying the
  *        recurring subscription used to make the recurring charges.
  *        </dd>
  *    <dt>lastRequestedCharge</dt>
  *        <dd>Date charge last attempted</dd>
  *    <dt>currency</dt>
  *        <dd>ISO 4217 currency code</dd>
  *    <dt>unitPrice</dt>
  *        <dd>charge in the smallest unit of the currency (e.g. cents for USD)</dd>
  *    <dt>businessId</dt>
  *        <dd><i>DEPRECATED:</i>See BusinessUserInfo.</dd>
  *    <dt>businessName</dt>
  *        <dd><i>DEPRECATED:</i>See BusinessUserInfo.</dd>
  *    <dt>businessRole</dt>
  *        <dd><i>DEPRECATED:</i>See BusinessUserInfo.</dd>
  *    <dt>unitDiscount</dt>
  *        <dd>discount per seat in negative amount and smallest unit of the currency (e.g. cents for USD)</dd>
  *    <dt>nextChargeDate</dt>
  *        <dd>The next time the user will be charged, may or may not be the same as nextPaymentDue</dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.Accounting")
@js.native
class Accounting () extends js.Object {
  def this(args: AnonBusinessId) = this()
  var businessId: Double = js.native
  var businessName: String = js.native
  var businessRole: BusinessUserRole = js.native
  var currency: String = js.native
  var lastFailedCharge: Double = js.native
  var lastFailedChargeReason: String = js.native
  var lastRequestedCharge: Double = js.native
  var lastSuccessfulCharge: Double = js.native
  var nextChargeDate: Double = js.native
  var nextPaymentDue: Double = js.native
  var premiumCommerceService: String = js.native
  var premiumLockUntil: Double = js.native
  var premiumOrderNumber: String = js.native
  var premiumServiceSKU: String = js.native
  var premiumServiceStart: Double = js.native
  var premiumServiceStatus: PremiumOrderStatus = js.native
  var premiumSubscriptionNumber: String = js.native
  var unitDiscount: Double = js.native
  var unitPrice: Double = js.native
  var updated: Double = js.native
  var uploadLimit: Double = js.native
  var uploadLimitEnd: Double = js.native
  var uploadLimitNextMonth: Double = js.native
}

