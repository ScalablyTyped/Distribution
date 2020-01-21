package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyRange extends js.Object {
  /**
    * If the end is closed, then the range includes all rows whose
    * first `len(end_closed)` key columns exactly match `end_closed`.
    */
  var endClosed: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * If the end is open, then the range excludes rows whose first
    * `len(end_open)` key columns exactly match `end_open`.
    */
  var endOpen: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * If the start is closed, then the range includes all rows whose
    * first `len(start_closed)` key columns exactly match `start_closed`.
    */
  var startClosed: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * If the start is open, then the range excludes rows whose first
    * `len(start_open)` key columns exactly match `start_open`.
    */
  var startOpen: js.UndefOr[js.Array[_]] = js.undefined
}

object KeyRange {
  @scala.inline
  def apply(
    endClosed: js.Array[_] = null,
    endOpen: js.Array[_] = null,
    startClosed: js.Array[_] = null,
    startOpen: js.Array[_] = null
  ): KeyRange = {
    val __obj = js.Dynamic.literal()
    if (endClosed != null) __obj.updateDynamic("endClosed")(endClosed.asInstanceOf[js.Any])
    if (endOpen != null) __obj.updateDynamic("endOpen")(endOpen.asInstanceOf[js.Any])
    if (startClosed != null) __obj.updateDynamic("startClosed")(startClosed.asInstanceOf[js.Any])
    if (startOpen != null) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyRange]
  }
}

