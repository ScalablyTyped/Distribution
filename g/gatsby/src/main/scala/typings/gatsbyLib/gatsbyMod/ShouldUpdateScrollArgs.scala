package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShouldUpdateScrollArgs extends BrowserPluginArgs {
  var getSavedScrollPosition: js.Function
  var pathname: java.lang.String
  var prevRouterProps: js.UndefOr[gatsbyLib.Anon_Location] = js.undefined
  var routerProps: gatsbyLib.Anon_Location
}

object ShouldUpdateScrollArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    getSavedScrollPosition: js.Function,
    pathname: java.lang.String,
    routerProps: gatsbyLib.Anon_Location,
    prevRouterProps: gatsbyLib.Anon_Location = null
  ): ShouldUpdateScrollArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname, getResourcesForPathname = getResourcesForPathname, getResourcesForPathnameSync = getResourcesForPathnameSync, getSavedScrollPosition = getSavedScrollPosition, pathname = pathname, routerProps = routerProps)
    if (prevRouterProps != null) __obj.updateDynamic("prevRouterProps")(prevRouterProps)
    __obj.asInstanceOf[ShouldUpdateScrollArgs]
  }
}

