package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var rules: js.UndefOr[js.Array[PolicyRule]] = js.undefined
  var timeUpdated: js.UndefOr[String] = js.undefined
}

object Policy {
  @scala.inline
  def apply(
    description: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    rules: js.Array[PolicyRule] = null,
    timeUpdated: String = null
  ): Policy = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (timeUpdated != null) __obj.updateDynamic("timeUpdated")(timeUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
}

