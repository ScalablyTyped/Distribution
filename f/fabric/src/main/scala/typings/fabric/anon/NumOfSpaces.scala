package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumOfSpaces extends js.Object {
  var numOfSpaces: Double
  var width: Double
}

object NumOfSpaces {
  @scala.inline
  def apply(numOfSpaces: Double, width: Double): NumOfSpaces = {
    val __obj = js.Dynamic.literal(numOfSpaces = numOfSpaces.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumOfSpaces]
  }
}

