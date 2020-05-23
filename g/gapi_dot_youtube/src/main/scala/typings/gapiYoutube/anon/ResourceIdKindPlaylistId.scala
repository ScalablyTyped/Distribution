package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceIdKindPlaylistId extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource associated with a bulletin post.
    */
  var resourceId: KindPlaylistId
}

object ResourceIdKindPlaylistId {
  @scala.inline
  def apply(resourceId: KindPlaylistId): ResourceIdKindPlaylistId = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdKindPlaylistId]
  }
}

