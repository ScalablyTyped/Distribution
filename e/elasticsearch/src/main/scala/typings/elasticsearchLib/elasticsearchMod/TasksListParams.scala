package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TasksListParams extends GenericParams {
  var actions: js.UndefOr[NameList] = js.undefined
  var detailed: js.UndefOr[scala.Boolean] = js.undefined
  var groupBy: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.nodes | elasticsearchLib.elasticsearchLibStrings.parents
  ] = js.undefined
  var nodeId: js.UndefOr[NameList] = js.undefined
  var parentNode: js.UndefOr[java.lang.String] = js.undefined
  var parentTask: js.UndefOr[java.lang.String] = js.undefined
  var waitForCompletion: js.UndefOr[scala.Boolean] = js.undefined
}

