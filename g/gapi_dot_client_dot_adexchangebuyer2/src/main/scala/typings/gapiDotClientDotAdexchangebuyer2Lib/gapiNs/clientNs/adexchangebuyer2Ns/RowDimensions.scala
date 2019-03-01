package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDimensions extends js.Object {
  /** The time interval that this row represents. */
  var timeInterval: js.UndefOr[TimeInterval] = js.undefined
}

object RowDimensions {
  @scala.inline
  def apply(timeInterval: TimeInterval = null): RowDimensions = {
    val __obj = js.Dynamic.literal()
    if (timeInterval != null) __obj.updateDynamic("timeInterval")(timeInterval)
    __obj.asInstanceOf[RowDimensions]
  }
}

