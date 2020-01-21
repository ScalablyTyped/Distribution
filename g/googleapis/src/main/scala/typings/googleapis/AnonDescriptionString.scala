package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDescriptionString extends js.Object {
  var description: js.UndefOr[String] = js.native
}

object AnonDescriptionString {
  @scala.inline
  def apply(description: String = null): AnonDescriptionString = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionString]
  }
}

