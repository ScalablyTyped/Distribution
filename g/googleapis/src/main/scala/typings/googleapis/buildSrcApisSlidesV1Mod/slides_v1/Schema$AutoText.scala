package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextElement kind that represents auto text.
  */
@js.native
trait Schema$AutoText extends js.Object {
  /**
    * The rendered content of this auto text, if available.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The styling applied to this auto text.
    */
  var style: js.UndefOr[Schema$TextStyle] = js.native
  /**
    * The type of this auto text.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$AutoText {
  @scala.inline
  def apply(content: String = null, style: Schema$TextStyle = null, `type`: String = null): Schema$AutoText = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AutoText]
  }
}

