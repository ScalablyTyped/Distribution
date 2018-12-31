package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object omniboxNs {
  /* omnibox types */
  /** The style type. */
  type DescriptionStyleType = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.url | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.`match` | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.dim
  /**
    * The window disposition for the omnibox query. This is the recommended context to display results. For example,
    * if the omnibox command is to navigate to a certain URL, a disposition of 'newForegroundTab' means the navigation
    * should take place in a new selected tab.
    */
  type OnInputEnteredDisposition = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.currentTab | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.newForegroundTab | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.newBackgroundTab
}
