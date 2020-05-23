package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Author extends js.Object {
  /**
    * The author of the social network post.
    */
  var author: String
  /**
    * An image of the posts author.
    */
  var imageUrl: String
  /**
    * The URL of the social network post.
    */
  var referenceUrl: String
  /**
    * The resourceId object encapsulates information that identifies the resource associated with a social network post.
    */
  var resourceId: KindPlaylistId
  /**
    * The name of the social network.
    */
  var `type`: String
}

object Author {
  @scala.inline
  def apply(author: String, imageUrl: String, referenceUrl: String, resourceId: KindPlaylistId, `type`: String): Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], referenceUrl = referenceUrl.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
}

