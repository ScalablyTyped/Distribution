package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.Location
import typings.expressDashValidator.srcBaseMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location extends ValidationError {
  var location: Location
  var msg: js.Any
  var nestedErrors: js.UndefOr[js.Array[_]] = js.undefined
  var param: String
  var value: js.Any
}

object Anon_Location {
  @scala.inline
  def apply(location: Location, msg: js.Any, param: String, value: js.Any, nestedErrors: js.Array[_] = null): Anon_Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (nestedErrors != null) __obj.updateDynamic("nestedErrors")(nestedErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Location]
  }
}

