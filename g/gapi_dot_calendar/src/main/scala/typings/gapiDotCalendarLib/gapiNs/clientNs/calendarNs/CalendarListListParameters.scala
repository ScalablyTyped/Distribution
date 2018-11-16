package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CalendarListListParameters extends js.Object {
  var maxResults: js.UndefOr[integer] = js.undefined
  // The minimum access role for the user in the returned entries. Optional. The default is no restriction. Acceptable values are:
  var minAccessRole: js.UndefOr[AccessRoleWithoutNone] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  var showDeleted: js.UndefOr[scala.Boolean] = js.undefined
  var showHidden: js.UndefOr[scala.Boolean] = js.undefined
  var syncToken: js.UndefOr[java.lang.String] = js.undefined
}

