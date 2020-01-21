package typings.freeStyle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container[T] extends js.Object {
  var id: String
  def getStyles(): String
}

object Container {
  @scala.inline
  def apply[T](getStyles: () => String, id: String): Container[T] = {
    val __obj = js.Dynamic.literal(getStyles = js.Any.fromFunction0(getStyles), id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Container[T]]
  }
}

