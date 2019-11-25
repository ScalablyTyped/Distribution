package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordArt extends js.Object {
  /** The text rendered as word art. */
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

