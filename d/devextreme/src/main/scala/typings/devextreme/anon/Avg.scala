package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avg extends js.Object {
  var avg: js.UndefOr[String] = js.undefined
  var avgOtherColumn: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[String] = js.undefined
  var maxOtherColumn: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[String] = js.undefined
  var minOtherColumn: js.UndefOr[String] = js.undefined
  var sum: js.UndefOr[String] = js.undefined
  var sumOtherColumn: js.UndefOr[String] = js.undefined
}

object Avg {
  @scala.inline
  def apply(
    avg: String = null,
    avgOtherColumn: String = null,
    count: String = null,
    max: String = null,
    maxOtherColumn: String = null,
    min: String = null,
    minOtherColumn: String = null,
    sum: String = null,
    sumOtherColumn: String = null
  ): Avg = {
    val __obj = js.Dynamic.literal()
    if (avg != null) __obj.updateDynamic("avg")(avg.asInstanceOf[js.Any])
    if (avgOtherColumn != null) __obj.updateDynamic("avgOtherColumn")(avgOtherColumn.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxOtherColumn != null) __obj.updateDynamic("maxOtherColumn")(maxOtherColumn.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minOtherColumn != null) __obj.updateDynamic("minOtherColumn")(minOtherColumn.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    if (sumOtherColumn != null) __obj.updateDynamic("sumOtherColumn")(sumOtherColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avg]
  }
}

