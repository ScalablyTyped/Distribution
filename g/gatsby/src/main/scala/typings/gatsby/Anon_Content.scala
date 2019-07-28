package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var contentDigest: String
  var description: js.UndefOr[String] = js.undefined
  var mediaType: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Anon_Content {
  @scala.inline
  def apply(
    contentDigest: String,
    `type`: String,
    content: String = null,
    description: String = null,
    mediaType: String = null
  ): Anon_Content = {
    val __obj = js.Dynamic.literal(contentDigest = contentDigest)
    __obj.updateDynamic("type")(`type`)
    if (content != null) __obj.updateDynamic("content")(content)
    if (description != null) __obj.updateDynamic("description")(description)
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType)
    __obj.asInstanceOf[Anon_Content]
  }
}

