package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReindexResponse extends ReindexResponseBase {
  var failures: js.Array[_]
  var slices: js.UndefOr[js.Array[ReindexOrByQueryResponseSlice]] = js.undefined
  var timed_out: scala.Boolean
  var took: scala.Double
}

