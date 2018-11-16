package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IndicesClearCacheParams extends GenericParams {
  var allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var fieldData: js.UndefOr[scala.Boolean] = js.undefined
  var fielddata: js.UndefOr[scala.Boolean] = js.undefined
      // yes the docs really have both
  var fields: js.UndefOr[NameList] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[NameList] = js.undefined
  var query: js.UndefOr[scala.Boolean] = js.undefined
  var recycler: js.UndefOr[scala.Boolean] = js.undefined
  var request: js.UndefOr[scala.Boolean] = js.undefined
}

