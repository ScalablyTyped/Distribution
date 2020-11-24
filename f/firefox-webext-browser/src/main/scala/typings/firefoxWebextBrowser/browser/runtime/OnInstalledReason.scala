package typings.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The reason that this event is being dispatched. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.install
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.update
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_update
*/
trait OnInstalledReason extends js.Object
object OnInstalledReason {
  
  @scala.inline
  def browser_update: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_update = "browser_update".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_update]
  
  @scala.inline
  def install: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.install = "install".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.install]
  
  @scala.inline
  def update: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.update = "update".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.update]
}
