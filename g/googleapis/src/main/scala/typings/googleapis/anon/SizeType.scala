package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeType extends js.Object {
  var size: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SizeType {
  @scala.inline
  def apply(size: String = null, `type`: String = null): SizeType = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeType]
  }
}

