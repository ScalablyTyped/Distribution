package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Author extends js.Object {
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
  var resourceId: Anon_ChannelIdKindPlaylistId
  /**
    * The name of the social network.
    */
  var `type`: String
}

object Anon_Author {
  @scala.inline
  def apply(
    author: String,
    imageUrl: String,
    referenceUrl: String,
    resourceId: Anon_ChannelIdKindPlaylistId,
    `type`: String
  ): Anon_Author = {
    val __obj = js.Dynamic.literal(author = author, imageUrl = imageUrl, referenceUrl = referenceUrl, resourceId = resourceId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Author]
  }
}

