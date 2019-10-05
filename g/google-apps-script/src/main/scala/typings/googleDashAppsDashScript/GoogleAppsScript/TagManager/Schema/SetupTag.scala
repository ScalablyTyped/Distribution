package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupTag extends js.Object {
  var stopOnSetupFailure: js.UndefOr[Boolean] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
}

object SetupTag {
  @scala.inline
  def apply(stopOnSetupFailure: js.UndefOr[Boolean] = js.undefined, tagName: String = null): SetupTag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stopOnSetupFailure)) __obj.updateDynamic("stopOnSetupFailure")(stopOnSetupFailure)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[SetupTag]
  }
}

