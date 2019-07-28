package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceComponentRendererArgs extends BrowserPluginArgs {
  var loader: js.Object
  var props: Anon_
}

object ReplaceComponentRendererArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    loader: js.Object,
    props: Anon_
  ): ReplaceComponentRendererArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname, getResourcesForPathname = getResourcesForPathname, getResourcesForPathnameSync = getResourcesForPathnameSync, loader = loader, props = props)
  
    __obj.asInstanceOf[ReplaceComponentRendererArgs]
  }
}

