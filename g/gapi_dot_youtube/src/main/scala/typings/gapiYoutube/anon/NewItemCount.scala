package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewItemCount extends js.Object {
  /**
    *
    */
  var newItemCount: Double
  /**
    *
    */
  var totalItemCount: Double
}

object NewItemCount {
  @scala.inline
  def apply(newItemCount: Double, totalItemCount: Double): NewItemCount = {
    val __obj = js.Dynamic.literal(newItemCount = newItemCount.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewItemCount]
  }
}

