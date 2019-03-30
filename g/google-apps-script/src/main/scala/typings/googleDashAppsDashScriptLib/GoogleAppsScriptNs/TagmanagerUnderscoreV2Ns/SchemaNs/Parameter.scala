package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var list: js.UndefOr[js.Array[Parameter]] = js.undefined
  var map: js.UndefOr[js.Array[Parameter]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Parameter {
  @scala.inline
  def apply(
    key: java.lang.String = null,
    list: js.Array[Parameter] = null,
    map: js.Array[Parameter] = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): Parameter = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (list != null) __obj.updateDynamic("list")(list)
    if (map != null) __obj.updateDynamic("map")(map)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Parameter]
  }
}

