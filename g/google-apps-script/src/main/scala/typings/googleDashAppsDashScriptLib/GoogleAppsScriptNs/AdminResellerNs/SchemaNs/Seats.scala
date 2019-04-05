package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seats extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var licensedNumberOfSeats: js.UndefOr[scala.Double] = js.undefined
  var maximumNumberOfSeats: js.UndefOr[scala.Double] = js.undefined
  var numberOfSeats: js.UndefOr[scala.Double] = js.undefined
}

object Seats {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    licensedNumberOfSeats: scala.Int | scala.Double = null,
    maximumNumberOfSeats: scala.Int | scala.Double = null,
    numberOfSeats: scala.Int | scala.Double = null
  ): Seats = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (licensedNumberOfSeats != null) __obj.updateDynamic("licensedNumberOfSeats")(licensedNumberOfSeats.asInstanceOf[js.Any])
    if (maximumNumberOfSeats != null) __obj.updateDynamic("maximumNumberOfSeats")(maximumNumberOfSeats.asInstanceOf[js.Any])
    if (numberOfSeats != null) __obj.updateDynamic("numberOfSeats")(numberOfSeats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seats]
  }
}

