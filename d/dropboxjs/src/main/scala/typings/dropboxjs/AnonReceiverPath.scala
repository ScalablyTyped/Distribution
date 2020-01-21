package typings.dropboxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReceiverPath extends js.Object {
  var receiverPath: String
  var scope: String
}

object AnonReceiverPath {
  @scala.inline
  def apply(receiverPath: String, scope: String): AnonReceiverPath = {
    val __obj = js.Dynamic.literal(receiverPath = receiverPath.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReceiverPath]
  }
}

