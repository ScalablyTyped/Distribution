package typings.electronNotarize.spawnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnResult extends js.Object {
  var code: Double | Null
  var output: String
}

object SpawnResult {
  @scala.inline
  def apply(output: String, code: Double = null.asInstanceOf[Double]): SpawnResult = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnResult]
  }
}

