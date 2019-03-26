package typings
package firefoxDashWebextDashBrowserLib.browserNs.omniboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The window disposition for the omnibox query. This is the recommended context to display results. For example,
  * if the omnibox command is to navigate to a certain URL, a disposition of 'newForegroundTab' means the navigation
  * should take place in a new selected tab.
  */
/* Rewritten from type alias, can be one of: 
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.currentTab
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.newForegroundTab
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.newBackgroundTab
*/
trait OnInputEnteredDisposition extends js.Object

