package typings.gatsby.gatsbyMod

import typings.std.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteUpdateDelayedArgs extends BrowserPluginArgs {
  var location: Location
}

object RouteUpdateDelayedArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    location: Location
  ): RouteUpdateDelayedArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteUpdateDelayedArgs]
  }
}

