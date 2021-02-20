package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Certificates associated with security profiles
  */
@js.native
trait CapabilityStatementRestSecurityCertificate extends BackboneElement {
  
  /**
    * Contains extended information for property 'blob'.
    */
  var _blob: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Actual certificate
    */
  var blob: js.UndefOr[base64Binary] = js.native
  
  /**
    * Mime type for certificates
    */
  var `type`: js.UndefOr[code] = js.native
}
object CapabilityStatementRestSecurityCertificate {
  
  @scala.inline
  def apply(): CapabilityStatementRestSecurityCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapabilityStatementRestSecurityCertificate]
  }
  
  @scala.inline
  implicit class CapabilityStatementRestSecurityCertificateMutableBuilder[Self <: CapabilityStatementRestSecurityCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlob(value: base64Binary): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_blob(value: Element): Self = StObject.set(x, "_blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_blobUndefined: Self = StObject.set(x, "_blob", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
