package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttachmentDataRef extends StObject {
  
  /**
    * The resource name of the attachment data. This is used with the media API to download the attachment data.
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaAttachmentDataRef {
  
  inline def apply(): SchemaAttachmentDataRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachmentDataRef]
  }
  
  extension [Self <: SchemaAttachmentDataRef](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
