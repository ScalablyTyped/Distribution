package typings.googleAppsScript.GoogleAppsScript.Adsense.Collection

import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Alerts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertsCollection extends js.Object {
  
  // List the alerts for this AdSense account.
  def list(): Alerts = js.native
  // List the alerts for this AdSense account.
  def list(optionalArgs: js.Object): Alerts = js.native
  
  // Dismiss (delete) the specified alert from the publisher's AdSense account.
  def remove(alertId: String): Unit = js.native
}
