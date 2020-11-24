package typings.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Result of the update check. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.throttled
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_update
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.update_available
*/
trait RequestUpdateCheckStatus extends js.Object
object RequestUpdateCheckStatus {
  
  @scala.inline
  def no_update: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_update = "no_update".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_update]
  
  @scala.inline
  def throttled: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.throttled = "throttled".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.throttled]
  
  @scala.inline
  def update_available: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.update_available = "update_available".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.update_available]
}
