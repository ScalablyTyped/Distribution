package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Thumbnail {
  @scala.inline
  def apply(height: Int | Double = null, url: String = null, width: Int | Double = null): Thumbnail = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumbnail]
  }
}

