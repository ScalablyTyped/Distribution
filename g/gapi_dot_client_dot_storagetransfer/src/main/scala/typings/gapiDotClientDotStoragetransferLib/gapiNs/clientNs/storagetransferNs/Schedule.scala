package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schedule extends js.Object {
  /**
    * The last day the recurring transfer will be run. If `scheduleEndDate`
    * is the same as `scheduleStartDate`, the transfer will be executed only
    * once.
    */
  var scheduleEndDate: js.UndefOr[Date] = js.undefined
  /**
    * The first day the recurring transfer is scheduled to run. If
    * `scheduleStartDate` is in the past, the transfer will run for the first
    * time on the following day.
    * Required.
    */
  var scheduleStartDate: js.UndefOr[Date] = js.undefined
  /**
    * The time in UTC at which the transfer will be scheduled to start in a day.
    * Transfers may start later than this time. If not specified, recurring and
    * one-time transfers that are scheduled to run today will run immediately;
    * recurring transfers that are scheduled to run on a future date will start
    * at approximately midnight UTC on that date. Note that when configuring a
    * transfer with the Cloud Platform Console, the transfer's start time in a
    * day is specified in your local timezone.
    */
  var startTimeOfDay: js.UndefOr[TimeOfDay] = js.undefined
}

