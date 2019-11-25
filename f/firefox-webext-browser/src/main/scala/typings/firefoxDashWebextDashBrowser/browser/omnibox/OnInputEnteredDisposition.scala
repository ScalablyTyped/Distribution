package typings.firefoxDashWebextDashBrowser.browser.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The window disposition for the omnibox query. This is the recommended context to display results. For example,
  * if the omnibox command is to navigate to a certain URL, a disposition of 'newForegroundTab' means the navigation
  * should take place in a new selected tab.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.currentTab
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.newForegroundTab
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.newBackgroundTab
*/
trait OnInputEnteredDisposition extends js.Object

object OnInputEnteredDisposition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def currentTab: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.currentTab = this.cast("currentTab")
  @scala.inline
  def newBackgroundTab: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.newBackgroundTab = this.cast("newBackgroundTab")
  @scala.inline
  def newForegroundTab: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.newForegroundTab = this.cast("newForegroundTab")
}

