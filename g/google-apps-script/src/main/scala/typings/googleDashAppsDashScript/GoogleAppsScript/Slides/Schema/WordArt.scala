package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordArt extends js.Object {
  var renderedText: js.UndefOr[String] = js.undefined
}

object WordArt {
  @scala.inline
  def apply(renderedText: String = null): WordArt = {
    val __obj = js.Dynamic.literal()
    if (renderedText != null) __obj.updateDynamic("renderedText")(renderedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordArt]
  }
}

