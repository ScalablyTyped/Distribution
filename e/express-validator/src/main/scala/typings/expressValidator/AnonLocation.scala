package typings.expressValidator

import typings.expressValidator.baseMod.Location
import typings.expressValidator.baseMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation extends ValidationError {
  var location: Location
  var msg: js.Any
  var nestedErrors: js.UndefOr[js.Array[_]] = js.undefined
  var param: String
  var value: js.Any
}

object AnonLocation {
  @scala.inline
  def apply(location: Location, msg: js.Any, param: String, value: js.Any, nestedErrors: js.Array[_] = null): AnonLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (nestedErrors != null) __obj.updateDynamic("nestedErrors")(nestedErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation]
  }
}

