package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityAdWordsLink extends js.Object {
  /** A list of AdWords client accounts. These cannot be MCC accounts. This field is required when creating an AdWords link. It cannot be empty. */
  var adWordsAccounts: js.UndefOr[js.Array[AdWordsAccount]] = js.undefined
  /** Web property being linked. */
  var entity: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_WebPropertyRefOptional] = js.undefined
  /** Entity AdWords link ID */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for entity AdWords link. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the link. This field is required when creating an AdWords link. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** IDs of linked Views (Profiles) represented as strings. */
  var profileIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** URL link for this Google Analytics - Google AdWords link. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

