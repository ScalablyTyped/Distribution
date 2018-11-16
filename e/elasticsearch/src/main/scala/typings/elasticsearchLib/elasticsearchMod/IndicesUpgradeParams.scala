package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IndicesUpgradeParams extends GenericParams {
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: NameList
  var onlyAncientSegments: js.UndefOr[scala.Boolean] = js.undefined
  var waitForCompletion: js.UndefOr[scala.Boolean] = js.undefined
}

