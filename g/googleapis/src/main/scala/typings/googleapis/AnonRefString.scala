package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRefString extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
}

object AnonRefString {
  @scala.inline
  def apply($ref: String = null): AnonRefString = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRefString]
  }
}

