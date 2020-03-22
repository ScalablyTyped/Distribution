package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthor extends js.Object {
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
  var resourceId: AnonKindPlaylistId
  /**
    * The name of the social network.
    */
  var `type`: String
}

object AnonAuthor {
  @scala.inline
  def apply(
    author: String,
    imageUrl: String,
    referenceUrl: String,
    resourceId: AnonKindPlaylistId,
    `type`: String
  ): AnonAuthor = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], referenceUrl = referenceUrl.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthor]
  }
}

