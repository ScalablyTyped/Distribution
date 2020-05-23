package typings.easeljs.createjs.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineTo extends js.Object {
  // properties
  var x: Double
  var y: Double
}

object LineTo {
  @scala.inline
  def apply(x: Double, y: Double): LineTo = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineTo]
  }
}

