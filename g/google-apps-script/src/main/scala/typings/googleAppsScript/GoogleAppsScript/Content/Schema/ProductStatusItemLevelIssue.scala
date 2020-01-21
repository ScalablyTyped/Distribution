package typings.googleAppsScript.GoogleAppsScript.Content.Schema

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
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (servability != null) __obj.updateDynamic("servability")(servability.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductStatusItemLevelIssue]
  }
}

