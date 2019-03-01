package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Reason extends js.Object {
  /**
    * The reason that the resource is recommended to the user.
    */
  var reason: java.lang.String
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
  def apply(
    reason: java.lang.String,
    resourceId: Anon_ChannelIdKind,
    seedResourceId: Anon_ChannelIdKindPlaylistId
  ): Anon_Reason = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("resourceId")(resourceId)
    __obj.updateDynamic("seedResourceId")(seedResourceId)
    __obj.asInstanceOf[Anon_Reason]
  }
}

