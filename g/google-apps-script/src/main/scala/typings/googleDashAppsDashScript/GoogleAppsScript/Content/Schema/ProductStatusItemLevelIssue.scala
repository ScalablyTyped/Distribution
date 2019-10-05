package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductStatusItemLevelIssue extends js.Object {
  var attributeName: js.UndefOr[String] = js.undefined
  var code: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var destination: js.UndefOr[String] = js.undefined
  var detail: js.UndefOr[String] = js.undefined
  var documentation: js.UndefOr[String] = js.undefined
  var resolution: js.UndefOr[String] = js.undefined
  var servability: js.UndefOr[String] = js.undefined
}

object ProductStatusItemLevelIssue {
  @scala.inline
  def apply(
    attributeName: String = null,
    code: String = null,
    description: String = null,
    destination: String = null,
    detail: String = null,
    documentation: String = null,
    resolution: String = null,
    servability: String = null
  ): ProductStatusItemLevelIssue = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName)
    if (code != null) __obj.updateDynamic("code")(code)
    if (description != null) __obj.updateDynamic("description")(description)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution)
    if (servability != null) __obj.updateDynamic("servability")(servability)
    __obj.asInstanceOf[ProductStatusItemLevelIssue]
  }
}

