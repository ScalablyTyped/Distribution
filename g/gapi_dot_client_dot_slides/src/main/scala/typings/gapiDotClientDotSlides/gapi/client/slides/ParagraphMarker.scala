package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphMarker extends js.Object {
  /**
    * The bullet for this paragraph. If not present, the paragraph does not
    * belong to a list.
    */
  var bullet: js.UndefOr[Bullet] = js.undefined
  /** The paragraph's style */
  var style: js.UndefOr[ParagraphStyle] = js.undefined
}

object ParagraphMarker {
  @scala.inline
  def apply(bullet: Bullet = null, style: ParagraphStyle = null): ParagraphMarker = {
    val __obj = js.Dynamic.literal()
    if (bullet != null) __obj.updateDynamic("bullet")(bullet)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ParagraphMarker]
  }
}

