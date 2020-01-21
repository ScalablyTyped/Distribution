package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutExportFormats extends js.Object {
  var source: js.UndefOr[String] = js.undefined
  var targets: js.UndefOr[js.Array[String]] = js.undefined
}

object AboutExportFormats {
  @scala.inline
  def apply(source: String = null, targets: js.Array[String] = null): AboutExportFormats = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboutExportFormats]
  }
}

