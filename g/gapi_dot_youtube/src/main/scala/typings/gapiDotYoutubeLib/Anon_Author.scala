package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Author extends js.Object {
  /**
    * The author of the social network post.
    */
  var author: java.lang.String
  /**
    * An image of the posts author.
    */
  var imageUrl: java.lang.String
  /**
    * The URL of the social network post.
    */
  var referenceUrl: java.lang.String
  /**
    * The resourceId object encapsulates information that identifies the resource associated with a social network post.
    */
  var resourceId: Anon_ChannelIdKindPlaylistId
  /**
    * The name of the social network.
    */
  var `type`: java.lang.String
}

object Anon_Author {
  @scala.inline
  def apply(
    author: java.lang.String,
    imageUrl: java.lang.String,
    referenceUrl: java.lang.String,
    resourceId: Anon_ChannelIdKindPlaylistId,
    `type`: java.lang.String
  ): Anon_Author = {
    val __obj = js.Dynamic.literal(author = author, imageUrl = imageUrl, referenceUrl = referenceUrl, resourceId = resourceId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Author]
  }
}

