package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.GaData
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.McfData
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.RealtimeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.Analytics.Collection.Data")
@js.native
object Data extends js.Object {
  @js.native
  trait GaCollection extends js.Object {
    // Returns Analytics data for a view (profile).
    def get(ids: String, start_date: String, end_date: String, metrics: String): GaData = js.native
    // Returns Analytics data for a view (profile).
    def get(ids: String, start_date: String, end_date: String, metrics: String, optionalArgs: js.Object): GaData = js.native
  }
  
  @js.native
  trait McfCollection extends js.Object {
    // Returns Analytics Multi-Channel Funnels data for a view (profile).
    def get(ids: String, start_date: String, end_date: String, metrics: String): McfData = js.native
    // Returns Analytics Multi-Channel Funnels data for a view (profile).
    def get(ids: String, start_date: String, end_date: String, metrics: String, optionalArgs: js.Object): McfData = js.native
  }
  
  @js.native
  trait RealtimeCollection extends js.Object {
    // Returns real time data for a view (profile).
    def get(ids: String, metrics: String): RealtimeData = js.native
    // Returns real time data for a view (profile).
    def get(ids: String, metrics: String, optionalArgs: js.Object): RealtimeData = js.native
  }
  
}

