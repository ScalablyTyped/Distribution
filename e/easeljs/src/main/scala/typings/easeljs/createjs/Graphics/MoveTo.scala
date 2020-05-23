package typings.easeljs.createjs.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveTo extends js.Object {
  var x: Double
  var y: Double
}

object MoveTo {
  @scala.inline
  def apply(x: Double, y: Double): MoveTo = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveTo]
  }
}

