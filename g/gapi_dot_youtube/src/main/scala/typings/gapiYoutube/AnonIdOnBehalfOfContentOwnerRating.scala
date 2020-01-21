package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdOnBehalfOfContentOwnerRating extends js.Object {
  /**
    * The id parameter specifies the YouTube video ID.
    */
  var id: String
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  /**
    * Specifies the rating to record.
    */
  var rating: String
}

object AnonIdOnBehalfOfContentOwnerRating {
  @scala.inline
  def apply(id: String, rating: String, onBehalfOfContentOwner: String = null): AnonIdOnBehalfOfContentOwnerRating = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any])
    if (onBehalfOfContentOwner != null) __obj.updateDynamic("onBehalfOfContentOwner")(onBehalfOfContentOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdOnBehalfOfContentOwnerRating]
  }
}

