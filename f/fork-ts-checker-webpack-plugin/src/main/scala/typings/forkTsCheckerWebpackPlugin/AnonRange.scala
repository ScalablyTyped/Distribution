package typings.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRange extends js.Object {
  var range: js.Tuple2[Double, Double]
  var text: String
}

object AnonRange {
  @scala.inline
  def apply(range: js.Tuple2[Double, Double], text: String): AnonRange = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRange]
  }
}

