package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParameterName extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  var parameterName: js.UndefOr[String] = js.native
}

object AnonParameterName {
  @scala.inline
  def apply($ref: String = null, parameterName: String = null): AnonParameterName = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    if (parameterName != null) __obj.updateDynamic("parameterName")(parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParameterName]
  }
}

