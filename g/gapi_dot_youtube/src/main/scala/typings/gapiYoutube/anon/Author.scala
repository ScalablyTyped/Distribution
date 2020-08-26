package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Author extends js.Object {
  /**
    * The author of the social network post.
    */
  var author: String = js.native
  /**
    * An image of the posts author.
    */
  var imageUrl: String = js.native
  /**
    * The URL of the social network post.
    */
  var referenceUrl: String = js.native
  /**
    * The resourceId object encapsulates information that identifies the resource associated with a social network post.
    */
  var resourceId: KindPlaylistId = js.native
  /**
    * The name of the social network.
    */
  var `type`: String = js.native
}

object Author {
  @scala.inline
  def apply(author: String, imageUrl: String, referenceUrl: String, resourceId: KindPlaylistId, `type`: String): Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], referenceUrl = referenceUrl.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  @scala.inline
  implicit class AuthorOps[Self <: Author] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceUrl(value: String): Self = this.set("referenceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: KindPlaylistId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

