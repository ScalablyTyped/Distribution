package typings.doublearray.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait All extends js.Object {
  var all: Double
  var efficiency: Double
  var unused: Double
}

object All {
  @scala.inline
  def apply(all: Double, efficiency: Double, unused: Double): All = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], efficiency = efficiency.asInstanceOf[js.Any], unused = unused.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
}

