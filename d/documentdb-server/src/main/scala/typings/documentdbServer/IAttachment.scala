package typings.documentdbServer

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAttachment extends Object {
  
  /** MIME contentType of the attachment */
  var contentType: String = js.native
  
  /** media link associated with the attachment content */
  var media: String = js.native
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
  
  @scala.inline
  implicit class IAttachmentMutableBuilder[Self <: IAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
