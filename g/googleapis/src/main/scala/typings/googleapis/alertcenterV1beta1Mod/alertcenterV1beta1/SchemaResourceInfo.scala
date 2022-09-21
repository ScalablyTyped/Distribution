package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceInfo extends StObject {
  
  /**
    * Drive file ID.
    */
  var documentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of the resource, for example email subject, or document title.
    */
  var resourceTitle: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceInfo {
  
  inline def apply(): SchemaResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceInfo]
  }
  
  extension [Self <: SchemaResourceInfo](x: Self) {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdNull: Self = StObject.set(x, "documentId", null)
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setResourceTitle(value: String): Self = StObject.set(x, "resourceTitle", value.asInstanceOf[js.Any])
    
    inline def setResourceTitleNull: Self = StObject.set(x, "resourceTitle", null)
    
    inline def setResourceTitleUndefined: Self = StObject.set(x, "resourceTitle", js.undefined)
  }
}
