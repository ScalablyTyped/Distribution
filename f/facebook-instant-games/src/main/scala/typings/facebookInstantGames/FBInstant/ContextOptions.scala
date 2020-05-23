package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOptions extends js.Object {
  /**
    * The set of filters to apply to the context suggestions.
    */
  var filters: js.UndefOr[js.Array[ContextFilter]] = js.undefined
  /**
    * The maximum number of participants that a suggested context should ideally have.
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  /**
    * The minimum number of participants that a suggested context should ideally have.
    */
  var minSize: js.UndefOr[Double] = js.undefined
}

object ContextOptions {
  @scala.inline
  def apply(
    filters: js.Array[ContextFilter] = null,
    maxSize: js.UndefOr[Double] = js.undefined,
    minSize: js.UndefOr[Double] = js.undefined
  ): ContextOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextOptions]
  }
}

