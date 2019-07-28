package typings.gatsby.gatsbyMod

import typings.std.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteUpdateArgs extends BrowserPluginArgs {
  var location: Location
}

object RouteUpdateArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    location: Location
  ): RouteUpdateArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname, getResourcesForPathname = getResourcesForPathname, getResourcesForPathnameSync = getResourcesForPathnameSync, location = location)
  
    __obj.asInstanceOf[RouteUpdateArgs]
  }
}

