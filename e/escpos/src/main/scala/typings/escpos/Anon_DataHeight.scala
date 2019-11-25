package typings.escpos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataHeight extends js.Object {
  var data: js.Array[Double]
  var height: Double
  var width: Double
}

object Anon_DataHeight {
  @scala.inline
  def apply(data: js.Array[Double], height: Double, width: Double): Anon_DataHeight = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataHeight]
  }
}

