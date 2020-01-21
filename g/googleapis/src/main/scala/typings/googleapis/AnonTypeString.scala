package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTypeString extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object AnonTypeString {
  @scala.inline
  def apply(`type`: String = null): AnonTypeString = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeString]
  }
}

