package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signature
  extends StObject
     with Element {
  
  var _blob: js.UndefOr[Element] = js.undefined
  
  var _contentType: js.UndefOr[Element] = js.undefined
  
  var _onBehalfOfUri: js.UndefOr[Element] = js.undefined
  
  var _when: js.UndefOr[Element] = js.undefined
  
  var _whoUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Where the signature type is an XML DigSig, the signed content is a FHIR Resource(s), the signature is of the XML form of the Resource(s) using  XML-Signature (XMLDIG) "Detached Signature" form.
    */
  var blob: js.UndefOr[String] = js.undefined
  
  /**
    * A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jwt for JWT, and image/ * for a graphical image of a signature, etc.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The party that can't sign. For example a child.
    */
  var onBehalfOfReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The party that can't sign. For example a child.
    */
  var onBehalfOfUri: js.UndefOr[String] = js.undefined
  
  /**
    * Examples include attesting to: authorship, correct transcription, and witness of specific event. Also known as a &quot;Commitment Type Indication&quot;.
    */
  var `type`: js.Array[Coding]
  
  /**
    * This should agree with the information in the signature.
    */
  var when: String
  
  /**
    * This should agree with the information in the signature.
    */
  var whoReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * This should agree with the information in the signature.
    */
  var whoUri: js.UndefOr[String] = js.undefined
}
object Signature {
  
  inline def apply(`type`: js.Array[Coding], when: String): Signature = {
    val __obj = js.Dynamic.literal(when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
  
  extension [Self <: Signature](x: Self) {
    
    inline def setBlob(value: String): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setOnBehalfOfReference(value: Reference): Self = StObject.set(x, "onBehalfOfReference", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfReferenceUndefined: Self = StObject.set(x, "onBehalfOfReference", js.undefined)
    
    inline def setOnBehalfOfUri(value: String): Self = StObject.set(x, "onBehalfOfUri", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUriUndefined: Self = StObject.set(x, "onBehalfOfUri", js.undefined)
    
    inline def setType(value: js.Array[Coding]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: Coding*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setWhen(value: String): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhoReference(value: Reference): Self = StObject.set(x, "whoReference", value.asInstanceOf[js.Any])
    
    inline def setWhoReferenceUndefined: Self = StObject.set(x, "whoReference", js.undefined)
    
    inline def setWhoUri(value: String): Self = StObject.set(x, "whoUri", value.asInstanceOf[js.Any])
    
    inline def setWhoUriUndefined: Self = StObject.set(x, "whoUri", js.undefined)
    
    inline def set_blob(value: Element): Self = StObject.set(x, "_blob", value.asInstanceOf[js.Any])
    
    inline def set_blobUndefined: Self = StObject.set(x, "_blob", js.undefined)
    
    inline def set_contentType(value: Element): Self = StObject.set(x, "_contentType", value.asInstanceOf[js.Any])
    
    inline def set_contentTypeUndefined: Self = StObject.set(x, "_contentType", js.undefined)
    
    inline def set_onBehalfOfUri(value: Element): Self = StObject.set(x, "_onBehalfOfUri", value.asInstanceOf[js.Any])
    
    inline def set_onBehalfOfUriUndefined: Self = StObject.set(x, "_onBehalfOfUri", js.undefined)
    
    inline def set_when(value: Element): Self = StObject.set(x, "_when", value.asInstanceOf[js.Any])
    
    inline def set_whenUndefined: Self = StObject.set(x, "_when", js.undefined)
    
    inline def set_whoUri(value: Element): Self = StObject.set(x, "_whoUri", value.asInstanceOf[js.Any])
    
    inline def set_whoUriUndefined: Self = StObject.set(x, "_whoUri", js.undefined)
  }
}
