package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Heading extends js.Object {
  var heading: scala.Double
  var speed: scala.Double
}

object Anon_Heading {
  @scala.inline
  def apply(heading: scala.Double, speed: scala.Double): Anon_Heading = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("heading")(heading)
    __obj.updateDynamic("speed")(speed)
    __obj.asInstanceOf[Anon_Heading]
  }
}

