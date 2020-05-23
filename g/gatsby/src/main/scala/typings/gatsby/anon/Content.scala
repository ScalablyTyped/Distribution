package typings.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var contentDigest: String
  var description: js.UndefOr[String] = js.undefined
  var mediaType: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Content {
  @scala.inline
  def apply(
    contentDigest: String,
    `type`: String,
    content: String = null,
    description: String = null,
    mediaType: String = null
  ): Content = {
    val __obj = js.Dynamic.literal(contentDigest = contentDigest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

