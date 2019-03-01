package typings
package forgeDashApisLib.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobPayloadItem extends js.Object {
  var advanced: js.UndefOr[forgeDashApisLib.Anon_ApplicationProtocol] = js.undefined
  var exportColor: js.UndefOr[scala.Boolean] = js.undefined
  var exportFileStructure: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
  var views: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object JobPayloadItem {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    advanced: forgeDashApisLib.Anon_ApplicationProtocol = null,
    exportColor: js.UndefOr[scala.Boolean] = js.undefined,
    exportFileStructure: java.lang.String = null,
    format: java.lang.String = null,
    views: js.Array[java.lang.String] = null
  ): JobPayloadItem = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (advanced != null) __obj.updateDynamic("advanced")(advanced)
    if (!js.isUndefined(exportColor)) __obj.updateDynamic("exportColor")(exportColor)
    if (exportFileStructure != null) __obj.updateDynamic("exportFileStructure")(exportFileStructure)
    if (format != null) __obj.updateDynamic("format")(format)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[JobPayloadItem]
  }
}

