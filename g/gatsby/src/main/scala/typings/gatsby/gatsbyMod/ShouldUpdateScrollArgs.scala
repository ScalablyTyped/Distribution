package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShouldUpdateScrollArgs extends BrowserPluginArgs {
  var getSavedScrollPosition: js.Function
  var pathname: String
  var prevRouterProps: js.UndefOr[Anon_Location] = js.undefined
  var routerProps: Anon_Location
}

object ShouldUpdateScrollArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    getSavedScrollPosition: js.Function,
    pathname: String,
    routerProps: Anon_Location,
    prevRouterProps: Anon_Location = null
  ): ShouldUpdateScrollArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any], getSavedScrollPosition = getSavedScrollPosition.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], routerProps = routerProps.asInstanceOf[js.Any])
    if (prevRouterProps != null) __obj.updateDynamic("prevRouterProps")(prevRouterProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldUpdateScrollArgs]
  }
}

