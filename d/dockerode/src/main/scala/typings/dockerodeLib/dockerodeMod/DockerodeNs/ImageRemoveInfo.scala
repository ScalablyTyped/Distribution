package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRemoveInfo extends js.Object {
  var Deleted: java.lang.String
  var Untagged: java.lang.String
}

object ImageRemoveInfo {
  @scala.inline
  def apply(Deleted: java.lang.String, Untagged: java.lang.String): ImageRemoveInfo = {
    val __obj = js.Dynamic.literal(Deleted = Deleted, Untagged = Untagged)
  
    __obj.asInstanceOf[ImageRemoveInfo]
  }
}

