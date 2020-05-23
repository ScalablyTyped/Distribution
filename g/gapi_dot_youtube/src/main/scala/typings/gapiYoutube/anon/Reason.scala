package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reason extends js.Object {
  /**
    * The reason that the resource is recommended to the user.
    */
  var reason: String
  /**
    * The resourceId object contains information that identifies the recommended resource.
    */
  var resourceId: ChannelIdKind
  /**
    * The seedResourceId object contains information about the resource that caused the recommendation.
    */
  var seedResourceId: KindPlaylistId
}

object Reason {
  @scala.inline
  def apply(reason: String, resourceId: ChannelIdKind, seedResourceId: KindPlaylistId): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], seedResourceId = seedResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
}

