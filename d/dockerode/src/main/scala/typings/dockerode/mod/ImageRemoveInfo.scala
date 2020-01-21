package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRemoveInfo extends js.Object {
  var Deleted: String
  var Untagged: String
}

object ImageRemoveInfo {
  @scala.inline
  def apply(Deleted: String, Untagged: String): ImageRemoveInfo = {
    val __obj = js.Dynamic.literal(Deleted = Deleted.asInstanceOf[js.Any], Untagged = Untagged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageRemoveInfo]
  }
}

