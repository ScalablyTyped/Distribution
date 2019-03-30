package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityAdWordsLink extends js.Object {
  var adWordsAccounts: js.UndefOr[js.Array[AdWordsAccount]] = js.undefined
  var entity: js.UndefOr[EntityAdWordsLinkEntity] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var profileIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object EntityAdWordsLink {
  @scala.inline
  def apply(
    adWordsAccounts: js.Array[AdWordsAccount] = null,
    entity: EntityAdWordsLinkEntity = null,
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

