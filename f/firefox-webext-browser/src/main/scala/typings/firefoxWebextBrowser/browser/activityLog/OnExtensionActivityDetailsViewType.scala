package typings.firefoxWebextBrowser.browser.activityLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type of view where the activity occurred. Content scripts will not have a viewType. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.background
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel
*/
trait OnExtensionActivityDetailsViewType extends js.Object
object OnExtensionActivityDetailsViewType {
  
  @scala.inline
  def background: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.background = "background".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.background]
  
  @scala.inline
  def devtools_page: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page = "devtools_page".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page]
  
  @scala.inline
  def devtools_panel: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel = "devtools_panel".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel]
  
  @scala.inline
  def popup: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = "popup".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup]
  
  @scala.inline
  def sidebar: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar = "sidebar".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar]
  
  @scala.inline
  def tab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
}
