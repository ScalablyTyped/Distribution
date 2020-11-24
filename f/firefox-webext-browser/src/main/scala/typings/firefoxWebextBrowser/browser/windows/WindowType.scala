package typings.firefoxWebextBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* windows types */
/**
  * The type of browser window this is. Under some circumstances a Window may not be assigned type property, for example when querying closed windows from the `sessions` API.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.app
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools
*/
trait WindowType extends js.Object
object WindowType {
  
  @scala.inline
  def app: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.app = "app".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.app]
  
  @scala.inline
  def devtools: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools = "devtools".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools]
  
  @scala.inline
  def normal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
  
  @scala.inline
  def panel: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel = "panel".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel]
  
  @scala.inline
  def popup: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = "popup".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup]
}
