package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClusterHealthParams extends GenericParams {
  var index: js.UndefOr[NameList] = js.undefined
  var level: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.cluster | elasticsearchLib.elasticsearchLibStrings.indices | elasticsearchLib.elasticsearchLibStrings.shards
  ] = js.undefined
  var local: js.UndefOr[scala.Boolean] = js.undefined
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var waitForActiveShards: js.UndefOr[java.lang.String] = js.undefined
  var waitForEvents: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.immediate | elasticsearchLib.elasticsearchLibStrings.urgent | elasticsearchLib.elasticsearchLibStrings.high | elasticsearchLib.elasticsearchLibStrings.normal | elasticsearchLib.elasticsearchLibStrings.low | elasticsearchLib.elasticsearchLibStrings.languid
  ] = js.undefined
  var waitForNodes: js.UndefOr[java.lang.String] = js.undefined
  var waitForRelocatingShards: js.UndefOr[scala.Boolean] = js.undefined
  var waitForStatus: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.green | elasticsearchLib.elasticsearchLibStrings.yellow | elasticsearchLib.elasticsearchLibStrings.red
  ] = js.undefined
}

