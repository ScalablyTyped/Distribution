package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Reason extends js.Object {
  /**
    * The reason that the resource is recommended to the user.
    */
  var reason: String
  /**
    * The resourceId object contains information that identifies the recommended resource.
    */
  var resourceId: Anon_ChannelIdKind
  /**
    * The seedResourceId object contains information about the resource that caused the recommendation.
    */
  var seedResourceId: Anon_ChannelIdKindPlaylistId
}

object Anon_Reason {
  @scala.inline
  def apply(reason: String, resourceId: Anon_ChannelIdKind, seedResourceId: Anon_ChannelIdKindPlaylistId): Anon_Reason = {
    val __obj = js.Dynamic.literal(reason = reason, resourceId = resourceId, seedResourceId = seedResourceId)
  
    __obj.asInstanceOf[Anon_Reason]
  }
}

