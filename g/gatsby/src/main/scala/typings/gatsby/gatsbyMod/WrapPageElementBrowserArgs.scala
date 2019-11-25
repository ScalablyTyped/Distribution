package typings.gatsby.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapPageElementBrowserArgs extends BrowserPluginArgs {
  var element: js.Object
  var props: js.Object
}

object WrapPageElementBrowserArgs {
  @scala.inline
  def apply(
    element: js.Object,
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    props: js.Object
  ): WrapPageElementBrowserArgs = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WrapPageElementBrowserArgs]
  }
}

