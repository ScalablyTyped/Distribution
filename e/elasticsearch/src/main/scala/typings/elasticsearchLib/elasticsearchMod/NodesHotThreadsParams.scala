package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodesHotThreadsParams extends GenericParams {
  var ignoreIdleThreads: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[TimeSpan] = js.undefined
  var nodeId: NameList
  var snapshots: js.UndefOr[scala.Double] = js.undefined
  var threads: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var `type`: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.cpu | elasticsearchLib.elasticsearchLibStrings.wait | elasticsearchLib.elasticsearchLibStrings.blocked
  ] = js.undefined
}

