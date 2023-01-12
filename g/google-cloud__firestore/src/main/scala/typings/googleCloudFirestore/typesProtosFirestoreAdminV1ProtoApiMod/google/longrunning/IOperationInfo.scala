package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.longrunning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an OperationInfo. */
trait IOperationInfo extends StObject {
  
  /** OperationInfo metadataType */
  var metadataType: js.UndefOr[String | Null] = js.undefined
  
  /** OperationInfo responseType */
  var responseType: js.UndefOr[String | Null] = js.undefined
}
object IOperationInfo {
  
  inline def apply(): IOperationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOperationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOperationInfo] (val x: Self) extends AnyVal {
    
    inline def setMetadataType(value: String): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
    
    inline def setMetadataTypeNull: Self = StObject.set(x, "metadataType", null)
    
    inline def setMetadataTypeUndefined: Self = StObject.set(x, "metadataType", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeNull: Self = StObject.set(x, "responseType", null)
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
