package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCollaboration extends StObject {
  
  /**
    * The attachment being collaborated on.
    */
  var attachmentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display info of the user who initiated the collaboration session.
    */
  var initiator: js.UndefOr[SchemaUserDisplayInfo] = js.undefined
  
  /**
    * The uri of the artifact being collaborated on.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaCollaboration {
  
  inline def apply(): SchemaCollaboration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollaboration]
  }
  
  extension [Self <: SchemaCollaboration](x: Self) {
    
    inline def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdNull: Self = StObject.set(x, "attachmentId", null)
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    inline def setInitiator(value: SchemaUserDisplayInfo): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
