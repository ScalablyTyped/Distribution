package typings.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The reason that the event is being dispatched. 'app_update' is used when the restart is needed because the
  * application is updated to a newer version. 'os_update' is used when the restart is needed because the browser/OS
  * is updated to a newer version. 'periodic' is used when the system runs for more than the permitted uptime set in
  * the enterprise policy.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.app_update
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.os_update
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.periodic
*/
trait OnRestartRequiredReason extends js.Object

object OnRestartRequiredReason {
  @scala.inline
  def app_update: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.app_update = "app_update".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.app_update]
  @scala.inline
  def os_update: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.os_update = "os_update".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.os_update]
  @scala.inline
  def periodic: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.periodic = "periodic".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.periodic]
}

