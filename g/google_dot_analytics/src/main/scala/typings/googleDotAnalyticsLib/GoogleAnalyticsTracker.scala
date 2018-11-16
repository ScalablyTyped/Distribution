package typings
package googleDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleAnalyticsTracker extends js.Object {
  def _anonymizeIp(): scala.Unit = js.native
  def _createTracker(opt_account: java.lang.String): Tracker = js.native
  def _createTracker(opt_account: java.lang.String, opt_name: java.lang.String): Tracker = js.native
  def _getTracker(account: java.lang.String): Tracker = js.native
  def _getTrackerByName(): Tracker = js.native
  def _getTrackerByName(opt_name: java.lang.String): Tracker = js.native
}

