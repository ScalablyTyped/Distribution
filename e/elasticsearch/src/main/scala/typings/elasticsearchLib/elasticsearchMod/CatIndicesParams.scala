package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatIndicesParams extends CatCommonParams {
  var bytes: js.UndefOr[CatBytes] = js.undefined
  var health: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.green | elasticsearchLib.elasticsearchLibStrings.yellow | elasticsearchLib.elasticsearchLibStrings.red
  ] = js.undefined
  var index: js.UndefOr[NameList] = js.undefined
  var pri: js.UndefOr[scala.Boolean] = js.undefined
}

