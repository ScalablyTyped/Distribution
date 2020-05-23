package typings.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceComponentRendererArgs extends BrowserPluginArgs {
  var loader: js.Object
  var props: PageProps[
    js.Object, 
    js.Object, 
    /* import warning: importer.ImportType#apply Failed type conversion: @reach/router.@reach/router.WindowLocation<history.history.LocationState>['state'] */ js.Any
  ]
}

object ReplaceComponentRendererArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    loader: js.Object,
    props: PageProps[
      js.Object, 
      js.Object, 
      /* import warning: importer.ImportType#apply Failed type conversion: @reach/router.@reach/router.WindowLocation<history.history.LocationState>['state'] */ js.Any
    ]
  ): ReplaceComponentRendererArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceComponentRendererArgs]
  }
}

