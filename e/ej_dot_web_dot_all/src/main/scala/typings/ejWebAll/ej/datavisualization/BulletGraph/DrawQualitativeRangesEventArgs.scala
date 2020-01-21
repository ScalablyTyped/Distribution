package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawQualitativeRangesEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.undefined
  /** returns the end value of current range.
    */
  var rangeEndValue: js.UndefOr[Double] = js.undefined
  /** returns the index of current range.
    */
  var rangeIndex: js.UndefOr[Double] = js.undefined
  /** returns the settings for current range.
    */
  var rangeOptions: js.UndefOr[js.Any] = js.undefined
}

object DrawQualitativeRangesEventArgs {
  @scala.inline
  def apply(
    Object: js.Any = null,
    rangeEndValue: Int | Double = null,
    rangeIndex: Int | Double = null,
    rangeOptions: js.Any = null
  ): DrawQualitativeRangesEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Object != null) __obj.updateDynamic("Object")(Object.asInstanceOf[js.Any])
    if (rangeEndValue != null) __obj.updateDynamic("rangeEndValue")(rangeEndValue.asInstanceOf[js.Any])
    if (rangeIndex != null) __obj.updateDynamic("rangeIndex")(rangeIndex.asInstanceOf[js.Any])
    if (rangeOptions != null) __obj.updateDynamic("rangeOptions")(rangeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawQualitativeRangesEventArgs]
  }
}

