package typings.documentdb.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment
  extends StObject
     with /** Other properties */
/* name */ StringDictionary[js.Any] {
  
  /** The MIME contentType of the attachment. */
  var contentType: String
  
  /** Media link associated with the attachment content. */
  var media: String
}
object Attachment {
  
  inline def apply(contentType: String, media: String): Attachment = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  extension [Self <: Attachment](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
