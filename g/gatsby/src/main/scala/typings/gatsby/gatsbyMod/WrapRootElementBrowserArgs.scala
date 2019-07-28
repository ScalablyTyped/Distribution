package typings.gatsby.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapRootElementBrowserArgs extends BrowserPluginArgs {
  var element: js.Object
  var pathname: String
}

object WrapRootElementBrowserArgs {
  @scala.inline
  def apply(
    element: js.Object,
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    pathname: String
  ): WrapRootElementBrowserArgs = {
    val __obj = js.Dynamic.literal(element = element, getResourceURLsForPathname = getResourceURLsForPathname, getResourcesForPathname = getResourcesForPathname, getResourcesForPathnameSync = getResourcesForPathnameSync, pathname = pathname)
  
    __obj.asInstanceOf[WrapRootElementBrowserArgs]
  }
}

