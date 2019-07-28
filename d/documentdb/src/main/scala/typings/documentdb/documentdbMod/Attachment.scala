package typings.documentdb.documentdbMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment
  extends /** Other properties */
/* name */ StringDictionary[js.Any] {
  /** The MIME contentType of the attachment. */
  var contentType: String
  /** Media link associated with the attachment content. */
  var media: String
}

object Attachment {
  @scala.inline
  def apply(
    contentType: String,
    media: String,
    StringDictionary: /** Other properties */
  /* name */ StringDictionary[js.Any] = null
  ): Attachment = {
    val __obj = js.Dynamic.literal(contentType = contentType, media = media)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Attachment]
  }
}

