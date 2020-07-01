package typings.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapPageElementNodeArgs[DataType, PageContextType] extends NodePluginArgs {
  var element: js.Object = js.native
  var pathname: String = js.native
  var props: PageProps[
    DataType, 
    PageContextType, 
    /* import warning: importer.ImportType#apply Failed type conversion: @reach/router.@reach/router.WindowLocation<history.history.LocationState>['state'] */ js.Any
  ] = js.native
}

