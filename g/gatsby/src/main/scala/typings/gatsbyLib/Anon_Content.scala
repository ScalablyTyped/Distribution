package typings
package gatsbyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: java.lang.String
  var contentDigest: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  var mediaType: java.lang.String
  var owner: java.lang.String
  var `type`: java.lang.String
}

object Anon_Content {
  @scala.inline
  def apply(
    content: java.lang.String,
    contentDigest: java.lang.String,
    mediaType: java.lang.String,
    owner: java.lang.String,
    `type`: java.lang.String,
    description: java.lang.String = null
  ): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content, contentDigest = contentDigest, mediaType = mediaType, owner = owner)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Anon_Content]
  }
}

