package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Certificates associated with security profiles
  */
trait CapabilityStatementRestSecurityCertificate
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'blob'.
    */
  var _blob: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Actual certificate
    */
  var blob: js.UndefOr[base64Binary] = js.undefined
  
  /**
    * Mime type for certificates
    */
  var `type`: js.UndefOr[code] = js.undefined
}
object CapabilityStatementRestSecurityCertificate {
  
  inline def apply(): CapabilityStatementRestSecurityCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapabilityStatementRestSecurityCertificate]
  }
  
  extension [Self <: CapabilityStatementRestSecurityCertificate](x: Self) {
    
    inline def setBlob(value: base64Binary): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_blob(value: Element): Self = StObject.set(x, "_blob", value.asInstanceOf[js.Any])
    
    inline def set_blobUndefined: Self = StObject.set(x, "_blob", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
