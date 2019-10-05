package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileVideoMediaMetadata extends js.Object {
  var durationMillis: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object FileVideoMediaMetadata {
  @scala.inline
  def apply(durationMillis: String = null, height: Int | Double = null, width: Int | Double = null): FileVideoMediaMetadata = {
    val __obj = js.Dynamic.literal()
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileVideoMediaMetadata]
  }
}

