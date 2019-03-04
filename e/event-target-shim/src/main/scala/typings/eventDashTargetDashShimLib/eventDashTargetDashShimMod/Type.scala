package typings
package eventDashTargetDashShimLib.eventDashTargetDashShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type[T /* <: java.lang.String */] extends js.Object {
  var `type`: T
}

object Type {
  @scala.inline
  def apply[T /* <: java.lang.String */](`type`: T): Type[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T]]
  }
}

