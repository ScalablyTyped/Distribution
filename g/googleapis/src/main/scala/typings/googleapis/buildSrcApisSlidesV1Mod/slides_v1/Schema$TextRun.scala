package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextElement kind that represents a run of text that all has the same
  * styling.
  */
@js.native
trait Schema$TextRun extends js.Object {
  /**
    * The text of this run.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The styling applied to this run.
    */
  var style: js.UndefOr[Schema$TextStyle] = js.native
}

object Schema$TextRun {
  @scala.inline
  def apply(content: String = null, style: Schema$TextStyle = null): Schema$TextRun = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TextRun]
  }
}

