package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about a social network post.
  */
@js.native
trait Schema$ActivityContentDetailsSocial extends js.Object {
  /**
    * The author of the social network post.
    */
  var author: js.UndefOr[String] = js.native
  /**
    * An image of the post&#39;s author.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * The URL of the social network post.
    */
  var referenceUrl: js.UndefOr[String] = js.native
  /**
    * The resourceId object encapsulates information that identifies the
    * resource associated with a social network post.
    */
  var resourceId: js.UndefOr[Schema$ResourceId] = js.native
  /**
    * The name of the social network.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$ActivityContentDetailsSocial {
  @scala.inline
  def apply(
    author: String = null,
    imageUrl: String = null,
    referenceUrl: String = null,
    resourceId: Schema$ResourceId = null,
    `type`: String = null
  ): Schema$ActivityContentDetailsSocial = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (referenceUrl != null) __obj.updateDynamic("referenceUrl")(referenceUrl.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ActivityContentDetailsSocial]
  }
}

