package typings
package facebookDashInstantDashGamesLib.FBInstantNs

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
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum number of participants that a suggested context should ideally have.
    */
  var minSize: js.UndefOr[scala.Double] = js.undefined
}

object ContextOptions {
  @scala.inline
  def apply(
    filters: js.Array[ContextFilter] = null,
    maxSize: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null
  ): ContextOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextOptions]
  }
}

