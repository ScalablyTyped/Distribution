package typings
package expectLib.expectMod.expectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Call[T] extends js.Object {
  var arguments: js.Array[_]
  var context: T
}

object Call {
  @scala.inline
  def apply[T](arguments: js.Array[_], context: T): Call[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arguments")(arguments)
    __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Call[T]]
  }
}

