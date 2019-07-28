package typings.forgeDashApis.forgeDashApisMod

import typings.forgeDashApis.Anon_ApplicationProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobPayloadItem extends js.Object {
  var advanced: js.UndefOr[Anon_ApplicationProtocol] = js.undefined
  var exportColor: js.UndefOr[Boolean] = js.undefined
  var exportFileStructure: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var `type`: String
  var views: js.UndefOr[js.Array[String]] = js.undefined
}

object JobPayloadItem {
  @scala.inline
  def apply(
    `type`: String,
    advanced: Anon_ApplicationProtocol = null,
    exportColor: js.UndefOr[Boolean] = js.undefined,
    exportFileStructure: String = null,
    format: String = null,
    views: js.Array[String] = null
  ): JobPayloadItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (advanced != null) __obj.updateDynamic("advanced")(advanced)
    if (!js.isUndefined(exportColor)) __obj.updateDynamic("exportColor")(exportColor)
    if (exportFileStructure != null) __obj.updateDynamic("exportFileStructure")(exportFileStructure)
    if (format != null) __obj.updateDynamic("format")(format)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[JobPayloadItem]
  }
}

