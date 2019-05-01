package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefetchPathnameArgs extends BrowserPluginArgs {
  var pathname: java.lang.String
}

object PrefetchPathnameArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    pathname: java.lang.String
  ): PrefetchPathnameArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname, getResourcesForPathname = getResourcesForPathname, getResourcesForPathnameSync = getResourcesForPathnameSync, pathname = pathname)
  
    __obj.asInstanceOf[PrefetchPathnameArgs]
  }
}

