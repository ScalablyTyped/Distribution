package typings.firebaseFirestoreTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends js.Object {
  def delete(): js.Promise[Unit]
}

object Delete {
  @scala.inline
  def apply(delete: () => js.Promise[Unit]): Delete = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
    __obj.asInstanceOf[Delete]
  }
}

