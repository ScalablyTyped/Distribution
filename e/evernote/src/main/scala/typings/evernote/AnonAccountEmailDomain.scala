package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccountEmailDomain extends js.Object {
  var accountEmailDomain: String
  var enableFacebookSharing: js.UndefOr[Boolean] = js.undefined
  var enableGiftSubscriptions: js.UndefOr[Boolean] = js.undefined
  var enableLinkedInSharing: js.UndefOr[Boolean] = js.undefined
  var enablePublicNotebooks: js.UndefOr[Boolean] = js.undefined
  var enableSharedNotebooks: js.UndefOr[Boolean] = js.undefined
  var enableSingleNoteSharing: js.UndefOr[Boolean] = js.undefined
  var enableSponsoredAccounts: js.UndefOr[Boolean] = js.undefined
  var enableSupportTickets: js.UndefOr[Boolean] = js.undefined
  var enableTwitterSharing: js.UndefOr[Boolean] = js.undefined
  var marketingUrl: String
  var serviceHost: String
  var supportUrl: String
}

object AnonAccountEmailDomain {
  @scala.inline
  def apply(
    accountEmailDomain: String,
    marketingUrl: String,
    serviceHost: String,
    supportUrl: String,
    enableFacebookSharing: js.UndefOr[Boolean] = js.undefined,
    enableGiftSubscriptions: js.UndefOr[Boolean] = js.undefined,
    enableLinkedInSharing: js.UndefOr[Boolean] = js.undefined,
    enablePublicNotebooks: js.UndefOr[Boolean] = js.undefined,
    enableSharedNotebooks: js.UndefOr[Boolean] = js.undefined,
    enableSingleNoteSharing: js.UndefOr[Boolean] = js.undefined,
    enableSponsoredAccounts: js.UndefOr[Boolean] = js.undefined,
    enableSupportTickets: js.UndefOr[Boolean] = js.undefined,
    enableTwitterSharing: js.UndefOr[Boolean] = js.undefined
  ): AnonAccountEmailDomain = {
    val __obj = js.Dynamic.literal(accountEmailDomain = accountEmailDomain.asInstanceOf[js.Any], marketingUrl = marketingUrl.asInstanceOf[js.Any], serviceHost = serviceHost.asInstanceOf[js.Any], supportUrl = supportUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFacebookSharing)) __obj.updateDynamic("enableFacebookSharing")(enableFacebookSharing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGiftSubscriptions)) __obj.updateDynamic("enableGiftSubscriptions")(enableGiftSubscriptions.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLinkedInSharing)) __obj.updateDynamic("enableLinkedInSharing")(enableLinkedInSharing.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePublicNotebooks)) __obj.updateDynamic("enablePublicNotebooks")(enablePublicNotebooks.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSharedNotebooks)) __obj.updateDynamic("enableSharedNotebooks")(enableSharedNotebooks.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSingleNoteSharing)) __obj.updateDynamic("enableSingleNoteSharing")(enableSingleNoteSharing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSponsoredAccounts)) __obj.updateDynamic("enableSponsoredAccounts")(enableSponsoredAccounts.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSupportTickets)) __obj.updateDynamic("enableSupportTickets")(enableSupportTickets.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTwitterSharing)) __obj.updateDynamic("enableTwitterSharing")(enableTwitterSharing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccountEmailDomain]
  }
}

