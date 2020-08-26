package typings.dropboxjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiverPath extends js.Object {
  var receiverPath: String = js.native
  var scope: String = js.native
}

object ReceiverPath {
  @scala.inline
  def apply(receiverPath: String, scope: String): ReceiverPath = {
    val __obj = js.Dynamic.literal(receiverPath = receiverPath.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiverPath]
  }
  @scala.inline
  implicit class ReceiverPathOps[Self <: ReceiverPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReceiverPath(value: String): Self = this.set("receiverPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

