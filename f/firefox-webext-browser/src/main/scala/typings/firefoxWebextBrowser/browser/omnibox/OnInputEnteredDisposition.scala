package typings.firefoxWebextBrowser.browser.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The window disposition for the omnibox query. This is the recommended context to display results. For example, if the omnibox command is to navigate to a certain URL, a disposition of 'newForegroundTab' means the navigation should take place in a new selected tab.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab
*/
trait OnInputEnteredDisposition extends js.Object
object OnInputEnteredDisposition {
  
  @scala.inline
  def currentTab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab = "currentTab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab]
  
  @scala.inline
  def newBackgroundTab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab = "newBackgroundTab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab]
  
  @scala.inline
  def newForegroundTab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab = "newForegroundTab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab]
}
