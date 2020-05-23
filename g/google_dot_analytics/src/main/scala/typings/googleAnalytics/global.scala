package typings.googleAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Tracker ()
    extends typings.googleAnalytics.Tracker
  
  var ga: typings.googleAnalytics.UniversalAnalytics.ga = js.native
  var gaClassic: GoogleAnalytics = js.native
  @JSName("_gaq")
  var gaq: GoogleAnalyticsCode = js.native
  @JSName("_gat")
  var gat: GoogleAnalyticsTracker = js.native
}

