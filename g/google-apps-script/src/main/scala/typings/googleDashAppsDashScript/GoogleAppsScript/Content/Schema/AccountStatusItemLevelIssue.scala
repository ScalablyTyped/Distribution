package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusItemLevelIssue extends js.Object {
  var attributeName: js.UndefOr[String] = js.undefined
  var code: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var detail: js.UndefOr[String] = js.undefined
  var documentation: js.UndefOr[String] = js.undefined
  var numItems: js.UndefOr[String] = js.undefined
  var resolution: js.UndefOr[String] = js.undefined
  var servability: js.UndefOr[String] = js.undefined
}

object AccountStatusItemLevelIssue {
  @scala.inline
  def apply(
    attributeName: String = null,
    code: String = null,
    description: String = null,
    detail: String = null,
    documentation: String = null,
    numItems: String = null,
    resolution: String = null,
    servability: String = null
  ): AccountStatusItemLevelIssue = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (numItems != null) __obj.updateDynamic("numItems")(numItems.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (servability != null) __obj.updateDynamic("servability")(servability.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountStatusItemLevelIssue]
  }
}

