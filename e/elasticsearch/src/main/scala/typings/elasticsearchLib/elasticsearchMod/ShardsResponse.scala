package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShardsResponse extends js.Object {
  var failed: scala.Double
  var skipped: scala.Double
  var successful: scala.Double
  var total: scala.Double
}

object ShardsResponse {
  @scala.inline
  def apply(failed: scala.Double, skipped: scala.Double, successful: scala.Double, total: scala.Double): ShardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("skipped")(skipped)
    __obj.updateDynamic("successful")(successful)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[ShardsResponse]
  }
}

