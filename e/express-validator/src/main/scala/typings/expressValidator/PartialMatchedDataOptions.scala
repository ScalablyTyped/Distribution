package typings.expressValidator

import typings.expressValidator.baseMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<express-validator.express-validator/src/matched-data.MatchedDataOptions> */
trait PartialMatchedDataOptions extends js.Object {
  var includeOptionals: js.UndefOr[Boolean] = js.undefined
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  var onlyValidData: js.UndefOr[Boolean] = js.undefined
}

object PartialMatchedDataOptions {
  @scala.inline
  def apply(
    includeOptionals: js.UndefOr[Boolean] = js.undefined,
    locations: js.Array[Location] = null,
    onlyValidData: js.UndefOr[Boolean] = js.undefined
  ): PartialMatchedDataOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeOptionals)) __obj.updateDynamic("includeOptionals")(includeOptionals.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyValidData)) __obj.updateDynamic("onlyValidData")(onlyValidData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMatchedDataOptions]
  }
}

