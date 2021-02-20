package typings.googleAnalytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsTracker extends StObject {
  
  def _anonymizeIp(): Unit = js.native
  
  def _createTracker(opt_account: String): Tracker = js.native
  def _createTracker(opt_account: String, opt_name: String): Tracker = js.native
  
  def _getTracker(account: String): Tracker = js.native
  
  def _getTrackerByName(): Tracker = js.native
  def _getTrackerByName(opt_name: String): Tracker = js.native
}
