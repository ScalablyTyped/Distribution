package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeleteDocumentByQueryParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.undefined
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  var allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined
  var analyzeWildcard: js.UndefOr[scala.Boolean] = js.undefined
  var analyzer: js.UndefOr[java.lang.String] = js.undefined
  var conflicts: js.UndefOr[Conflicts] = js.undefined
  var defaultOperator: js.UndefOr[DefaultOperator] = js.undefined
  var df: js.UndefOr[java.lang.String] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var from: js.UndefOr[scala.Double] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  var lenient: js.UndefOr[scala.Boolean] = js.undefined
  var lowercaseExpandedTerms: js.UndefOr[scala.Boolean] = js.undefined
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var q: js.UndefOr[java.lang.String] = js.undefined
  var refresh: js.UndefOr[Refresh] = js.undefined
  var requestCache: js.UndefOr[scala.Boolean] = js.undefined
  var requestsPerSecond: js.UndefOr[scala.Double] = js.undefined
  var routing: js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var scroll: js.UndefOr[java.lang.String] = js.undefined
  var scrollSize: js.UndefOr[scala.Double] = js.undefined
  var searchTimeout: js.UndefOr[TimeSpan] = js.undefined
  var searchType: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.query_then_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_then_fetch
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var slices: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[NameList] = js.undefined
  var stats: js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var terminateAfter: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
  var waitForActiveShards: js.UndefOr[java.lang.String] = js.undefined
  var waitForCompletion: js.UndefOr[scala.Boolean] = js.undefined
}

