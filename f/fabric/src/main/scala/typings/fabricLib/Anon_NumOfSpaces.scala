package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NumOfSpaces extends js.Object {
  var numOfSpaces: scala.Double
  var width: scala.Double
}

object Anon_NumOfSpaces {
  @scala.inline
  def apply(numOfSpaces: scala.Double, width: scala.Double): Anon_NumOfSpaces = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("numOfSpaces")(numOfSpaces)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_NumOfSpaces]
  }
}

