package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UserProfile extends js.Object {
  /** The user's mailing address, contains multiple fields. */
  var address: js.UndefOr[Location] = js.undefined
  /**
               * If the user has edit access to multiple accounts, the user can choose the
               * preferred account and it is used when a personal account is needed. Can
               * be empty.
               */
  var adwordsManagerAccount: js.UndefOr[java.lang.String] = js.undefined
  /** A list of ids representing which channels the user selected they were in. */
  var channels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The email address the user has selected on the Partners site as primary. */
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  /** The list of opt-ins for the user, related to communication preferences. */
  var emailOptIns: js.UndefOr[OptIns] = js.undefined
  /** The user's family name. */
  var familyName: js.UndefOr[java.lang.String] = js.undefined
  /** The user's given name. */
  var givenName: js.UndefOr[java.lang.String] = js.undefined
  /** A list of ids representing which industries the user selected. */
  var industries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A list of ids represnting which job categories the user selected. */
  var jobFunctions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of languages this user understands. */
  var languages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A list of ids representing which markets the user was interested in. */
  var markets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The user's phone number. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The user's primary country, an ISO 2-character code. */
  var primaryCountryCode: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the user's public profile is visible to anyone with the URL. */
  var profilePublic: js.UndefOr[scala.Boolean] = js.undefined
}

