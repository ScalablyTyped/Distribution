package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBehalfOfContentOwnerRating extends js.Object {
  /**
    * The id parameter specifies the YouTube video ID.
    */
  var id: String = js.native
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  /**
    * Specifies the rating to record.
    */
  var rating: String = js.native
}

object OnBehalfOfContentOwnerRating {
  @scala.inline
  def apply(id: String, rating: String): OnBehalfOfContentOwnerRating = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBehalfOfContentOwnerRating]
  }
  @scala.inline
  implicit class OnBehalfOfContentOwnerRatingOps[Self <: OnBehalfOfContentOwnerRating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRating(value: String): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = this.set("onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBehalfOfContentOwner: Self = this.set("onBehalfOfContentOwner", js.undefined)
  }
  
}

