package typings.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelete extends js.Object {
  def delete(): js.Promise[Unit]
}

object AnonDelete {
  @scala.inline
  def apply(delete: () => js.Promise[Unit]): AnonDelete = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
  
    __obj.asInstanceOf[AnonDelete]
  }
}

