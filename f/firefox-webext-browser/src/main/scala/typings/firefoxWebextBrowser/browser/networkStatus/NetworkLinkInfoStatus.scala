package typings.firefoxWebextBrowser.browser.networkStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Status of the network link, if "unknown" then link is usually assumed to be "up" */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.up
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.down
*/
trait NetworkLinkInfoStatus extends js.Object
object NetworkLinkInfoStatus {
  
  @scala.inline
  def down: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.down = "down".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.down]
  
  @scala.inline
  def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
  
  @scala.inline
  def up: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.up = "up".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.up]
}
