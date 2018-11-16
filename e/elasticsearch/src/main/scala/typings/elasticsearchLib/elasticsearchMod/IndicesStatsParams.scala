package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IndicesStatsParams extends GenericParams {
  var completionFields: js.UndefOr[NameList] = js.undefined
  var fielddataFields: js.UndefOr[NameList] = js.undefined
  var fields: js.UndefOr[NameList] = js.undefined
  var groups: js.UndefOr[NameList] = js.undefined
  var human: js.UndefOr[scala.Boolean] = js.undefined
  var index: NameList
  var level: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.cluster | elasticsearchLib.elasticsearchLibStrings.indices | elasticsearchLib.elasticsearchLibStrings.shards
  ] = js.undefined
  var metric: js.UndefOr[NameList] = js.undefined
  var types: js.UndefOr[NameList] = js.undefined
}

