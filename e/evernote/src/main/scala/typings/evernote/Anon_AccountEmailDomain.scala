package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountEmailDomain extends js.Object {
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

object Anon_AccountEmailDomain {
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
  ): Anon_AccountEmailDomain = {
    val __obj = js.Dynamic.literal(accountEmailDomain = accountEmailDomain, marketingUrl = marketingUrl, serviceHost = serviceHost, supportUrl = supportUrl)
    if (!js.isUndefined(enableFacebookSharing)) __obj.updateDynamic("enableFacebookSharing")(enableFacebookSharing)
    if (!js.isUndefined(enableGiftSubscriptions)) __obj.updateDynamic("enableGiftSubscriptions")(enableGiftSubscriptions)
    if (!js.isUndefined(enableLinkedInSharing)) __obj.updateDynamic("enableLinkedInSharing")(enableLinkedInSharing)
    if (!js.isUndefined(enablePublicNotebooks)) __obj.updateDynamic("enablePublicNotebooks")(enablePublicNotebooks)
    if (!js.isUndefined(enableSharedNotebooks)) __obj.updateDynamic("enableSharedNotebooks")(enableSharedNotebooks)
    if (!js.isUndefined(enableSingleNoteSharing)) __obj.updateDynamic("enableSingleNoteSharing")(enableSingleNoteSharing)
    if (!js.isUndefined(enableSponsoredAccounts)) __obj.updateDynamic("enableSponsoredAccounts")(enableSponsoredAccounts)
    if (!js.isUndefined(enableSupportTickets)) __obj.updateDynamic("enableSupportTickets")(enableSupportTickets)
    if (!js.isUndefined(enableTwitterSharing)) __obj.updateDynamic("enableTwitterSharing")(enableTwitterSharing)
    __obj.asInstanceOf[Anon_AccountEmailDomain]
  }
}

