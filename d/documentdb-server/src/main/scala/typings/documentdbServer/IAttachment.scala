package typings.documentdbServer

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachment extends Object {
  /** MIME contentType of the attachment */
  var contentType: String
  /** media link associated with the attachment content */
  var media: String
}

object IAttachment {
  @scala.inline
  def apply(
    constructor: js.Function,
    contentType: String,
    hasOwnProperty: PropertyKey => Boolean,
    media: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): IAttachment = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), media = media.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[IAttachment]
  }
}

