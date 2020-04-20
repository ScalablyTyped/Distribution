package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewItemCount extends js.Object {
  /**
    *
    */
  var newItemCount: Double
  /**
    *
    */
  var totalItemCount: Double
}

object AnonNewItemCount {
  @scala.inline
  def apply(newItemCount: Double, totalItemCount: Double): AnonNewItemCount = {
    val __obj = js.Dynamic.literal(newItemCount = newItemCount.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewItemCount]
  }
}

