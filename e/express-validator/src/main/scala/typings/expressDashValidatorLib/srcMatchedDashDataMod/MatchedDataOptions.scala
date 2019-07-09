package typings
package expressDashValidatorLib.srcMatchedDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedDataOptions extends js.Object {
  var includeOptionals: scala.Boolean
  var locations: js.Array[expressDashValidatorLib.srcBaseMod.Location]
  var onlyValidData: scala.Boolean
}

object MatchedDataOptions {
  @scala.inline
  def apply(
    includeOptionals: scala.Boolean,
    locations: js.Array[expressDashValidatorLib.srcBaseMod.Location],
    onlyValidData: scala.Boolean
  ): MatchedDataOptions = {
    val __obj = js.Dynamic.literal(includeOptionals = includeOptionals, locations = locations, onlyValidData = onlyValidData)
  
    __obj.asInstanceOf[MatchedDataOptions]
  }
}

