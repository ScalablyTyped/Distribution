package typings.gatsby.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefetchPathnameArgs extends BrowserPluginArgs {
  var pathname: String
}

object PrefetchPathnameArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    pathname: String
  ): PrefetchPathnameArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname, getResourcesForPathname = getResourcesForPathname, getResourcesForPathnameSync = getResourcesForPathnameSync, pathname = pathname)
  
    __obj.asInstanceOf[PrefetchPathnameArgs]
  }
}

