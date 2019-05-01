package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceComponentRendererArgs extends BrowserPluginArgs {
  var loader: js.Object
  var props: gatsbyLib.Anon_
}

object ReplaceComponentRendererArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    loader: js.Object,
    props: gatsbyLib.Anon_
  ): ReplaceComponentRendererArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname, getResourcesForPathname = getResourcesForPathname, getResourcesForPathnameSync = getResourcesForPathnameSync, loader = loader, props = props)
  
    __obj.asInstanceOf[ReplaceComponentRendererArgs]
  }
}

