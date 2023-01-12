package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signature
  extends StObject
     with Element {
  
  var _blob: js.UndefOr[Element] = js.undefined
  
  var _contentType: js.UndefOr[Element] = js.undefined
  
  var _when: js.UndefOr[Element] = js.undefined
  
  var _whoUri: js.UndefOr[Element] = js.undefined
  
  /**
    * The base64 encoding of the Signature content.
    */
  var blob: String
  
  /**
    * A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jwt for JWT, and image/ * for a graphical image of a signature.
    */
  var contentType: String
  
  /**
    * An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
    */
  var `type`: js.Array[Coding]
  
  /**
    * When the digital signature was signed.
    */
  var when: String
  
  /**
    * A reference to an application-usable description of the person that signed the certificate (e.g. the signature used their private key).
    */
  var whoReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A reference to an application-usable description of the person that signed the certificate (e.g. the signature used their private key).
    */
  var whoUri: js.UndefOr[String] = js.undefined
}
object Signature {
  
  inline def apply(blob: String, contentType: String, `type`: js.Array[Coding], when: String): Signature = {
    val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Signature] (val x: Self) extends AnyVal {
    
    inline def setBlob(value: String): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
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
    
    inline def set_when(value: Element): Self = StObject.set(x, "_when", value.asInstanceOf[js.Any])
    
    inline def set_whenUndefined: Self = StObject.set(x, "_when", js.undefined)
    
    inline def set_whoUri(value: Element): Self = StObject.set(x, "_whoUri", value.asInstanceOf[js.Any])
    
    inline def set_whoUriUndefined: Self = StObject.set(x, "_whoUri", js.undefined)
  }
}
