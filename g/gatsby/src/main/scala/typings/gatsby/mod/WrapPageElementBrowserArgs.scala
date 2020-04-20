package typings.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapPageElementBrowserArgs[DataType, PageContextType] extends BrowserPluginArgs {
  var element: js.Object
  var props: PageProps[DataType, PageContextType]
}

object WrapPageElementBrowserArgs {
  @scala.inline
  def apply[DataType, PageContextType](
    element: js.Object,
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    props: PageProps[DataType, PageContextType]
  ): WrapPageElementBrowserArgs[DataType, PageContextType] = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapPageElementBrowserArgs[DataType, PageContextType]]
  }
}

