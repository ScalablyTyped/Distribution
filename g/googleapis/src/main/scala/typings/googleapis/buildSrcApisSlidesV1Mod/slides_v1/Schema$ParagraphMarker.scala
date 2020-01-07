package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextElement kind that represents the beginning of a new paragraph.
  */
@js.native
trait Schema$ParagraphMarker extends js.Object {
  /**
    * The bullet for this paragraph. If not present, the paragraph does not
    * belong to a list.
    */
  var bullet: js.UndefOr[Schema$Bullet] = js.native
  /**
    * The paragraph&#39;s style
    */
  var style: js.UndefOr[Schema$ParagraphStyle] = js.native
}

object Schema$ParagraphMarker {
  @scala.inline
  def apply(bullet: Schema$Bullet = null, style: Schema$ParagraphStyle = null): Schema$ParagraphMarker = {
    val __obj = js.Dynamic.literal()
    if (bullet != null) __obj.updateDynamic("bullet")(bullet.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ParagraphMarker]
  }
}

