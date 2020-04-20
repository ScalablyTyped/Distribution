package typings.gatsby.mod

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
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefetchPathnameArgs]
  }
}

