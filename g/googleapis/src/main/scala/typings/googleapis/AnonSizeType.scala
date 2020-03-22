package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSizeType extends js.Object {
  var size: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonSizeType {
  @scala.inline
  def apply(size: String = null, `type`: String = null): AnonSizeType = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSizeType]
  }
}

