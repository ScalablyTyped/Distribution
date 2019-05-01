package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteUpdateDelayedArgs extends BrowserPluginArgs {
  var location: stdLib.Location
}

object RouteUpdateDelayedArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    location: stdLib.Location
  ): RouteUpdateDelayedArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname, getResourcesForPathname = getResourcesForPathname, getResourcesForPathnameSync = getResourcesForPathnameSync, location = location)
  
    __obj.asInstanceOf[RouteUpdateDelayedArgs]
  }
}

