package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoText extends js.Object {
  /** The rendered content of this auto text, if available. */
  var content: js.UndefOr[String] = js.undefined
  /** The styling applied to this auto text. */
  var style: js.UndefOr[TextStyle] = js.undefined
  /** The type of this auto text. */
  var `type`: js.UndefOr[String] = js.undefined
}

object AutoText {
  @scala.inline
  def apply(content: String = null, style: TextStyle = null, `type`: String = null): AutoText = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoText]
  }
}

