package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProperties extends js.Object {
  /**
    * The outline of the video. The default outline matches the defaults for new
    * videos created in the Slides editor.
    */
  var outline: js.UndefOr[Outline] = js.undefined
}

object VideoProperties {
  @scala.inline
  def apply(outline: Outline = null): VideoProperties = {
    val __obj = js.Dynamic.literal()
    if (outline != null) __obj.updateDynamic("outline")(outline)
    __obj.asInstanceOf[VideoProperties]
  }
}

