package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MSearchParams extends GenericParams {
  var index: js.UndefOr[NameList] = js.undefined
  var maxConcurrentSearches: js.UndefOr[scala.Double] = js.undefined
  var search_type: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.query_then_fetch | elasticsearchLib.elasticsearchLibStrings.query_and_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_then_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_and_fetch
  ] = js.undefined
  var `type`: js.UndefOr[NameList] = js.undefined
}

