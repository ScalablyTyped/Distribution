package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceId extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource that was marked as a favorite.
    */
  var resourceId: Kind
}

object ResourceId {
  @scala.inline
  def apply(resourceId: Kind): ResourceId = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceId]
  }
}

