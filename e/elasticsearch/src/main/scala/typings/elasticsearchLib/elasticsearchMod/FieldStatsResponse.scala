package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FieldStatsResponse extends js.Object {
  var _shards: ShardsResponse
  var conflicts: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var indices: ScalablyTyped.runtime.StringDictionary[FieldStatsResponseIndex]
}

