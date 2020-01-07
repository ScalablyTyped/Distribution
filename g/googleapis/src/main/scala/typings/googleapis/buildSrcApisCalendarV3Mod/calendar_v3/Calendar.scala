package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Calendar API
  *
  * Manipulates events and other calendar data.
  *
  * @example
  * const {google} = require('googleapis');
  * const calendar = google.calendar('v3');
  *
  * @namespace calendar
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Calendar
  */
@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Calendar")
@js.native
class Calendar protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var acl: Resource$Acl = js.native
  var calendarList: Resource$Calendarlist = js.native
  var calendars: Resource$Calendars = js.native
  var channels: Resource$Channels = js.native
  var colors: Resource$Colors = js.native
  var context: APIRequestContext = js.native
  var events: Resource$Events = js.native
  var freebusy: Resource$Freebusy = js.native
  var settings: Resource$Settings = js.native
}

