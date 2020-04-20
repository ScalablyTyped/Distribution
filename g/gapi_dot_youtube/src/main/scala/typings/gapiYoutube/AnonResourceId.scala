package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResourceId extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource that was marked as a favorite.
    */
  var resourceId: AnonKind
}

object AnonResourceId {
  @scala.inline
  def apply(resourceId: AnonKind): AnonResourceId = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResourceId]
  }
}

