package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SearchTemplateParams extends GenericParams {
  var allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: NameList
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var routing: js.UndefOr[NameList] = js.undefined
  var scroll: js.UndefOr[TimeSpan] = js.undefined
  var searchType: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.query_then_fetch | elasticsearchLib.elasticsearchLibStrings.query_and_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_then_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_and_fetch
  ] = js.undefined
  var `type`: NameList
}

