package typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seats extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var licensedNumberOfSeats: js.UndefOr[Double] = js.undefined
  var maximumNumberOfSeats: js.UndefOr[Double] = js.undefined
  var numberOfSeats: js.UndefOr[Double] = js.undefined
}

object Seats {
  @scala.inline
  def apply(
    kind: String = null,
    licensedNumberOfSeats: js.UndefOr[Double] = js.undefined,
    maximumNumberOfSeats: js.UndefOr[Double] = js.undefined,
    numberOfSeats: js.UndefOr[Double] = js.undefined
  ): Seats = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(licensedNumberOfSeats)) __obj.updateDynamic("licensedNumberOfSeats")(licensedNumberOfSeats.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumNumberOfSeats)) __obj.updateDynamic("maximumNumberOfSeats")(maximumNumberOfSeats.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfSeats)) __obj.updateDynamic("numberOfSeats")(numberOfSeats.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seats]
  }
}

