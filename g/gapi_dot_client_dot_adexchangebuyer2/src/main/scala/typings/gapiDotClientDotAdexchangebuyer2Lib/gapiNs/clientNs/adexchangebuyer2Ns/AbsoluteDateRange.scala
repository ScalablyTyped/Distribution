package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbsoluteDateRange extends js.Object {
  /**
    * The end date of the range (inclusive).
    * Must be within the 30 days leading up to current date, and must be equal to
    * or after start_date.
    */
  var endDate: js.UndefOr[Date] = js.undefined
  /**
    * The start date of the range (inclusive).
    * Must be within the 30 days leading up to current date, and must be equal to
    * or before end_date.
    */
  var startDate: js.UndefOr[Date] = js.undefined
}

