package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment
  extends /** Other properties */
/* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** The MIME contentType of the attachment. */
  var contentType: java.lang.String
  /** Media link associated with the attachment content. */
  var media: java.lang.String
}

object Attachment {
  @scala.inline
  def apply(
    contentType: java.lang.String,
    media: java.lang.String,
    StringDictionary: /** Other properties */
  /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Attachment = {
    val __obj = js.Dynamic.literal(contentType = contentType, media = media)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Attachment]
  }
}

