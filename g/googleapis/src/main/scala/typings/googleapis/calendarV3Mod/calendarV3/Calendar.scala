package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class Calendar protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var acl: ResourceAcl = js.native
  
  var calendarList: ResourceCalendarlist = js.native
  
  var calendars: ResourceCalendars = js.native
  
  var channels: ResourceChannels = js.native
  
  var colors: ResourceColors = js.native
  
  var context: APIRequestContext = js.native
  
  var events: ResourceEvents = js.native
  
  var freebusy: ResourceFreebusy = js.native
  
  var settings: ResourceSettings = js.native
}
