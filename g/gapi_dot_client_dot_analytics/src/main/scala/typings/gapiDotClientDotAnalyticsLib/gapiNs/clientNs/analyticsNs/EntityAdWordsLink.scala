package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityAdWordsLink extends js.Object {
  /** A list of AdWords client accounts. These cannot be MCC accounts. This field is required when creating an AdWords link. It cannot be empty. */
  var adWordsAccounts: js.UndefOr[js.Array[AdWordsAccount]] = js.undefined
  /** Web property being linked. */
  var entity: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_WebPropertyRef] = js.undefined
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

object EntityAdWordsLink {
  @scala.inline
  def apply(
    adWordsAccounts: js.Array[AdWordsAccount] = null,
    entity: gapiDotClientDotAnalyticsLib.Anon_WebPropertyRef = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    profileIds: js.Array[java.lang.String] = null,
    selfLink: java.lang.String = null
  ): EntityAdWordsLink = {
    val __obj = js.Dynamic.literal()
    if (adWordsAccounts != null) __obj.updateDynamic("adWordsAccounts")(adWordsAccounts)
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (profileIds != null) __obj.updateDynamic("profileIds")(profileIds)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[EntityAdWordsLink]
  }
}

