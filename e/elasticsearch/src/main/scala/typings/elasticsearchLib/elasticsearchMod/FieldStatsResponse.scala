package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldStatsResponse extends js.Object {
  var _shards: ShardsResponse
  var conflicts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var indices: org.scalablytyped.runtime.StringDictionary[FieldStatsResponseIndex]
}

