package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccountEmailDomain extends js.Object {
  var accountEmailDomain: js.UndefOr[String] = js.undefined
  var enableFacebookSharing: js.UndefOr[Boolean] = js.undefined
  var enableGiftSubscriptions: js.UndefOr[Boolean] = js.undefined
  var enableGoogle: js.UndefOr[Boolean] = js.undefined
  var enableLinkedInSharing: js.UndefOr[Boolean] = js.undefined
  var enablePublicNotebooks: js.UndefOr[Boolean] = js.undefined
  var enableSharedNotebooks: js.UndefOr[Boolean] = js.undefined
  var enableSingleNoteSharing: js.UndefOr[Boolean] = js.undefined
  var enableSponsoredAccounts: js.UndefOr[Boolean] = js.undefined
  var enableSupportTickets: js.UndefOr[Boolean] = js.undefined
  var enableTwitterSharing: js.UndefOr[Boolean] = js.undefined
  var marketingUrl: js.UndefOr[String] = js.undefined
  var serviceHost: js.UndefOr[String] = js.undefined
  var supportUrl: js.UndefOr[String] = js.undefined
}

object AnonAccountEmailDomain {
  @scala.inline
  def apply(
    accountEmailDomain: String = null,
    enableFacebookSharing: js.UndefOr[Boolean] = js.undefined,
    enableGiftSubscriptions: js.UndefOr[Boolean] = js.undefined,
    enableGoogle: js.UndefOr[Boolean] = js.undefined,
    enableLinkedInSharing: js.UndefOr[Boolean] = js.undefined,
    enablePublicNotebooks: js.UndefOr[Boolean] = js.undefined,
    enableSharedNotebooks: js.UndefOr[Boolean] = js.undefined,
    enableSingleNoteSharing: js.UndefOr[Boolean] = js.undefined,
    enableSponsoredAccounts: js.UndefOr[Boolean] = js.undefined,
    enableSupportTickets: js.UndefOr[Boolean] = js.undefined,
    enableTwitterSharing: js.UndefOr[Boolean] = js.undefined,
    marketingUrl: String = null,
    serviceHost: String = null,
    supportUrl: String = null
  ): AnonAccountEmailDomain = {
    val __obj = js.Dynamic.literal()
    if (accountEmailDomain != null) __obj.updateDynamic("accountEmailDomain")(accountEmailDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFacebookSharing)) __obj.updateDynamic("enableFacebookSharing")(enableFacebookSharing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGiftSubscriptions)) __obj.updateDynamic("enableGiftSubscriptions")(enableGiftSubscriptions.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGoogle)) __obj.updateDynamic("enableGoogle")(enableGoogle.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLinkedInSharing)) __obj.updateDynamic("enableLinkedInSharing")(enableLinkedInSharing.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePublicNotebooks)) __obj.updateDynamic("enablePublicNotebooks")(enablePublicNotebooks.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSharedNotebooks)) __obj.updateDynamic("enableSharedNotebooks")(enableSharedNotebooks.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSingleNoteSharing)) __obj.updateDynamic("enableSingleNoteSharing")(enableSingleNoteSharing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSponsoredAccounts)) __obj.updateDynamic("enableSponsoredAccounts")(enableSponsoredAccounts.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSupportTickets)) __obj.updateDynamic("enableSupportTickets")(enableSupportTickets.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTwitterSharing)) __obj.updateDynamic("enableTwitterSharing")(enableTwitterSharing.asInstanceOf[js.Any])
    if (marketingUrl != null) __obj.updateDynamic("marketingUrl")(marketingUrl.asInstanceOf[js.Any])
    if (serviceHost != null) __obj.updateDynamic("serviceHost")(serviceHost.asInstanceOf[js.Any])
    if (supportUrl != null) __obj.updateDynamic("supportUrl")(supportUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccountEmailDomain]
  }
}

