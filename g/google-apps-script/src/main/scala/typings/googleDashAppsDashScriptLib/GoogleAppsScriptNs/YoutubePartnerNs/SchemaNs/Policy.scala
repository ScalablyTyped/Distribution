package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var rules: js.UndefOr[js.Array[PolicyRule]] = js.undefined
  var timeUpdated: js.UndefOr[java.lang.String] = js.undefined
}

object Policy {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    rules: js.Array[PolicyRule] = null,
    timeUpdated: java.lang.String = null
  ): Policy = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (timeUpdated != null) __obj.updateDynamic("timeUpdated")(timeUpdated)
    __obj.asInstanceOf[Policy]
  }
}

