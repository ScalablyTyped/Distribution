package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeDateRange extends js.Object {
  /**
    * The number of days in the requested date range. E.g. for a range spanning
    * today, 1. For a range spanning the last 7 days, 7.
    */
  var durationDays: js.UndefOr[scala.Double] = js.undefined
  /**
    * The end date of the filter set, specified as the number of days before
    * today. E.g. for a range where the last date is today, 0.
    */
  var offsetDays: js.UndefOr[scala.Double] = js.undefined
}

