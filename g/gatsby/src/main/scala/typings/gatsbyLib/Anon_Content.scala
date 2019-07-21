package typings
package gatsbyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var contentDigest: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  var mediaType: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Anon_Content {
  @scala.inline
  def apply(
    contentDigest: java.lang.String,
    `type`: java.lang.String,
    content: java.lang.String = null,
    description: java.lang.String = null,
    mediaType: java.lang.String = null
  ): Anon_Content = {
    val __obj = js.Dynamic.literal(contentDigest = contentDigest)
    __obj.updateDynamic("type")(`type`)
    if (content != null) __obj.updateDynamic("content")(content)
    if (description != null) __obj.updateDynamic("description")(description)
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType)
    __obj.asInstanceOf[Anon_Content]
  }
}

