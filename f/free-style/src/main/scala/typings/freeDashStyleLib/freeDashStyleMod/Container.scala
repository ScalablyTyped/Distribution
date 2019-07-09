package typings
package freeDashStyleLib.freeDashStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container[T] extends js.Object {
  var id: java.lang.String
  def getStyles(): java.lang.String
}

object Container {
  @scala.inline
  def apply[T](clone: () => T, getStyles: () => java.lang.String, id: java.lang.String): Container[T] = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), getStyles = js.Any.fromFunction0(getStyles), id = id)
  
    __obj.asInstanceOf[Container[T]]
  }
}

