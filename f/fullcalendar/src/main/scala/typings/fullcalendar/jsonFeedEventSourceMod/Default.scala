package typings.fullcalendar.jsonFeedEventSourceMod

import typings.fullcalendar.Anon_Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/JsonFeedEventSource", "Default")
@js.native
class Default ()
  extends typings.fullcalendar.eventSourceMod.default {
  var ajaxSettings: js.Any = js.native
  var endParam: js.Any = js.native
  var startParam: js.Any = js.native
  var timezoneParam: js.Any = js.native
  var url: js.Any = js.native
  def applyMiscProps(rawProps: js.Any): Unit = js.native
  def buildRequestParams(start: js.Any, end: js.Any, timezone: js.Any): js.Object = js.native
  def getPrimitive(): js.Any = js.native
}

@JSImport("fullcalendar/JsonFeedEventSource", JSImport.Default)
@js.native
class default () extends Default

/* static members */
@JSImport("fullcalendar/JsonFeedEventSource", "Default")
@js.native
object Default extends js.Object {
  var AJAX_DEFAULTS: Anon_Cache = js.native
  def parse(rawInput: js.Any, calendar: js.Any): js.Any = js.native
}

/* static members */
@JSImport("fullcalendar/JsonFeedEventSource", JSImport.Default)
@js.native
object default extends js.Object {
  var AJAX_DEFAULTS: Anon_Cache = js.native
  def parse(rawInput: js.Any, calendar: js.Any): js.Any = js.native
}

