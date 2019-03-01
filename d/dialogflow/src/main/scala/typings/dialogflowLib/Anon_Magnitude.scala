package typings
package dialogflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Magnitude extends js.Object {
  var magnitude: scala.Double
  var score: scala.Double
}

object Anon_Magnitude {
  @scala.inline
  def apply(magnitude: scala.Double, score: scala.Double): Anon_Magnitude = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("magnitude")(magnitude)
    __obj.updateDynamic("score")(score)
    __obj.asInstanceOf[Anon_Magnitude]
  }
}

