package typings
package doublearrayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var all: scala.Double
  var efficiency: scala.Double
  var unused: scala.Double
}

object Anon_All {
  @scala.inline
  def apply(all: scala.Double, efficiency: scala.Double, unused: scala.Double): Anon_All = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("efficiency")(efficiency)
    __obj.updateDynamic("unused")(unused)
    __obj.asInstanceOf[Anon_All]
  }
}

