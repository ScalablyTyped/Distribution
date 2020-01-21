package typings.gaeaModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewIndex extends js.Object {
  var newIndex: Double
  var oldIndex: Double
}

object AnonNewIndex {
  @scala.inline
  def apply(newIndex: Double, oldIndex: Double): AnonNewIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNewIndex]
  }
}

