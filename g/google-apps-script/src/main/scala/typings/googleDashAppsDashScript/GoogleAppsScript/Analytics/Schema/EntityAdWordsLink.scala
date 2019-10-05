package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityAdWordsLink extends js.Object {
  var adWordsAccounts: js.UndefOr[js.Array[AdWordsAccount]] = js.undefined
  var entity: js.UndefOr[EntityAdWordsLinkEntity] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var profileIds: js.UndefOr[js.Array[String]] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object EntityAdWordsLink {
  @scala.inline
  def apply(
    adWordsAccounts: js.Array[AdWordsAccount] = null,
    entity: EntityAdWordsLinkEntity = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    profileIds: js.Array[String] = null,
    selfLink: String = null
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

