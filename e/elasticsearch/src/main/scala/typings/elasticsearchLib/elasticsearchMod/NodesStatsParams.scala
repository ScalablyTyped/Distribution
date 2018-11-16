package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodesStatsParams extends GenericParams {
  var completionFields: js.UndefOr[NameList] = js.undefined
  var fielddataFields: js.UndefOr[NameList] = js.undefined
  var fields: js.UndefOr[NameList] = js.undefined
  var groups: js.UndefOr[scala.Boolean] = js.undefined
  var human: js.UndefOr[scala.Boolean] = js.undefined
  var indexMetric: js.UndefOr[NameList] = js.undefined
  var level: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.indices | elasticsearchLib.elasticsearchLibStrings.node | elasticsearchLib.elasticsearchLibStrings.shards
  ] = js.undefined
  var metric: js.UndefOr[NameList] = js.undefined
  var nodeId: js.UndefOr[NameList] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var types: js.UndefOr[NameList] = js.undefined
}

