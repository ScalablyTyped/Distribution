package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountEmailDomain extends js.Object {
  var accountEmailDomain: java.lang.String
  var enableFacebookSharing: js.UndefOr[scala.Boolean] = js.undefined
  var enableGiftSubscriptions: js.UndefOr[scala.Boolean] = js.undefined
  var enableLinkedInSharing: js.UndefOr[scala.Boolean] = js.undefined
  var enablePublicNotebooks: js.UndefOr[scala.Boolean] = js.undefined
  var enableSharedNotebooks: js.UndefOr[scala.Boolean] = js.undefined
  var enableSingleNoteSharing: js.UndefOr[scala.Boolean] = js.undefined
  var enableSponsoredAccounts: js.UndefOr[scala.Boolean] = js.undefined
  var enableSupportTickets: js.UndefOr[scala.Boolean] = js.undefined
  var enableTwitterSharing: js.UndefOr[scala.Boolean] = js.undefined
  var marketingUrl: java.lang.String
  var serviceHost: java.lang.String
  var supportUrl: java.lang.String
}

object Anon_AccountEmailDomain {
  @scala.inline
  def apply(
    accountEmailDomain: java.lang.String,
    marketingUrl: java.lang.String,
    serviceHost: java.lang.String,
    supportUrl: java.lang.String,
    enableFacebookSharing: js.UndefOr[scala.Boolean] = js.undefined,
    enableGiftSubscriptions: js.UndefOr[scala.Boolean] = js.undefined,
    enableLinkedInSharing: js.UndefOr[scala.Boolean] = js.undefined,
    enablePublicNotebooks: js.UndefOr[scala.Boolean] = js.undefined,
    enableSharedNotebooks: js.UndefOr[scala.Boolean] = js.undefined,
    enableSingleNoteSharing: js.UndefOr[scala.Boolean] = js.undefined,
    enableSponsoredAccounts: js.UndefOr[scala.Boolean] = js.undefined,
    enableSupportTickets: js.UndefOr[scala.Boolean] = js.undefined,
    enableTwitterSharing: js.UndefOr[scala.Boolean] = js.undefined
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

