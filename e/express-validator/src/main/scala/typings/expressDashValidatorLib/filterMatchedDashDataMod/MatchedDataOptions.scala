package typings
package expressDashValidatorLib.filterMatchedDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedDataOptions extends js.Object {
  var includeOptionals: scala.Boolean
  var locations: js.Array[expressDashValidatorLib.checkLocationMod.Location]
  var onlyValidData: scala.Boolean
}

object MatchedDataOptions {
  @scala.inline
  def apply(
    includeOptionals: scala.Boolean,
    locations: js.Array[expressDashValidatorLib.checkLocationMod.Location],
    onlyValidData: scala.Boolean
  ): MatchedDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("includeOptionals")(includeOptionals)
    __obj.updateDynamic("locations")(locations)
    __obj.updateDynamic("onlyValidData")(onlyValidData)
    __obj.asInstanceOf[MatchedDataOptions]
  }
}

