package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetWindow extends js.Object {
  var customHtml: js.UndefOr[String] = js.undefined
  var targetWindowOption: js.UndefOr[String] = js.undefined
}

object TargetWindow {
  @scala.inline
  def apply(customHtml: String = null, targetWindowOption: String = null): TargetWindow = {
    val __obj = js.Dynamic.literal()
    if (customHtml != null) __obj.updateDynamic("customHtml")(customHtml.asInstanceOf[js.Any])
    if (targetWindowOption != null) __obj.updateDynamic("targetWindowOption")(targetWindowOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetWindow]
  }
}

