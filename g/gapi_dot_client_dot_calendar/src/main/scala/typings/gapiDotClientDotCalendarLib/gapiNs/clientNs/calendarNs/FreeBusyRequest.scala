package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyRequest extends js.Object {
  /** Maximal number of calendars for which FreeBusy information is to be provided. Optional. */
  var calendarExpansionMax: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximal number of calendar identifiers to be provided for a single group. Optional. An error will be returned for a group with more members than this
    * value.
    */
  var groupExpansionMax: js.UndefOr[scala.Double] = js.undefined
  /** List of calendars and/or groups to query. */
  var items: js.UndefOr[js.Array[FreeBusyRequestItem]] = js.undefined
  /** The end of the interval for the query. */
  var timeMax: js.UndefOr[java.lang.String] = js.undefined
  /** The start of the interval for the query. */
  var timeMin: js.UndefOr[java.lang.String] = js.undefined
  /** Time zone used in the response. Optional. The default is UTC. */
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

