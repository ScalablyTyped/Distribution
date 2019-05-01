package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserPluginArgs
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var getResourceURLsForPathname: js.Function
  var getResourcesForPathname: js.Function
  var getResourcesForPathnameSync: js.Function
}

object BrowserPluginArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): BrowserPluginArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname, getResourcesForPathname = getResourcesForPathname, getResourcesForPathnameSync = getResourcesForPathnameSync)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[BrowserPluginArgs]
  }
}

