package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachment
  extends stdLib.Object {
  /** MIME contentType of the attachment */
  var contentType: java.lang.String
  /** media link associated with the attachment content */
  var media: java.lang.String
}

object IAttachment {
  @scala.inline
  def apply(
    constructor: js.Function,
    contentType: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    media: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): IAttachment = {
    val __obj = js.Dynamic.literal(constructor = constructor, contentType = contentType, hasOwnProperty = hasOwnProperty, media = media, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[IAttachment]
  }
}

