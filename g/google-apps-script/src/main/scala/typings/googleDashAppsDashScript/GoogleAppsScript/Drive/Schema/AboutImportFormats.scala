package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutImportFormats extends js.Object {
  var source: js.UndefOr[String] = js.undefined
  var targets: js.UndefOr[js.Array[String]] = js.undefined
}

object AboutImportFormats {
  @scala.inline
  def apply(source: String = null, targets: js.Array[String] = null): AboutImportFormats = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    if (targets != null) __obj.updateDynamic("targets")(targets)
    __obj.asInstanceOf[AboutImportFormats]
  }
}

