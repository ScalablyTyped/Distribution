package typings.expressDashValidator.srcMatchedDashDataMod

import typings.expressDashValidator.srcBaseMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedDataOptions extends js.Object {
  var includeOptionals: Boolean
  var locations: js.Array[Location]
  var onlyValidData: Boolean
}

object MatchedDataOptions {
  @scala.inline
  def apply(includeOptionals: Boolean, locations: js.Array[Location], onlyValidData: Boolean): MatchedDataOptions = {
    val __obj = js.Dynamic.literal(includeOptionals = includeOptionals.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], onlyValidData = onlyValidData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MatchedDataOptions]
  }
}

