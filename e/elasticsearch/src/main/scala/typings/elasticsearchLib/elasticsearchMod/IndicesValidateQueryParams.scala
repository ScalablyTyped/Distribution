package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IndicesValidateQueryParams extends GenericParams {
  var allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined
  var analyzeWildcard: js.UndefOr[scala.Boolean] = js.undefined
  var analyzer: js.UndefOr[java.lang.String] = js.undefined
  var defaultOperator: js.UndefOr[DefaultOperator] = js.undefined
  var df: js.UndefOr[java.lang.String] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var explain: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: NameList
  var lenient: js.UndefOr[scala.Boolean] = js.undefined
  var lowercaseExpandedTerms: js.UndefOr[scala.Boolean] = js.undefined
  var operationThreading: js.UndefOr[js.Any] = js.undefined
     // even the docs don't know what this does
  var q: js.UndefOr[java.lang.String] = js.undefined
  var rewrite: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[NameList] = js.undefined
}

