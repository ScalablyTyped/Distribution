package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReason extends js.Object {
  /**
    * The reason that the resource is recommended to the user.
    */
  var reason: String
  /**
    * The resourceId object contains information that identifies the recommended resource.
    */
  var resourceId: AnonChannelIdKind
  /**
    * The seedResourceId object contains information about the resource that caused the recommendation.
    */
  var seedResourceId: AnonChannelIdKindPlaylistId
}

object AnonReason {
  @scala.inline
  def apply(reason: String, resourceId: AnonChannelIdKind, seedResourceId: AnonChannelIdKindPlaylistId): AnonReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], seedResourceId = seedResourceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReason]
  }
}

