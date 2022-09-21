package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEndpointVerificationSpecificAttributes extends StObject {
  
  /**
    * Details of certificates.
    */
  var certificateAttributes: js.UndefOr[js.Array[SchemaCertificateAttributes]] = js.undefined
}
object SchemaEndpointVerificationSpecificAttributes {
  
  inline def apply(): SchemaEndpointVerificationSpecificAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpointVerificationSpecificAttributes]
  }
  
  extension [Self <: SchemaEndpointVerificationSpecificAttributes](x: Self) {
    
    inline def setCertificateAttributes(value: js.Array[SchemaCertificateAttributes]): Self = StObject.set(x, "certificateAttributes", value.asInstanceOf[js.Any])
    
    inline def setCertificateAttributesUndefined: Self = StObject.set(x, "certificateAttributes", js.undefined)
    
    inline def setCertificateAttributesVarargs(value: SchemaCertificateAttributes*): Self = StObject.set(x, "certificateAttributes", js.Array(value*))
  }
}
