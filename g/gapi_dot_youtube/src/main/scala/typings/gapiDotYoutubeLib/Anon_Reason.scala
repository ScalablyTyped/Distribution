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

