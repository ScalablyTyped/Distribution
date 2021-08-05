package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A digital Signature - XML DigSig, JWT, Graphical image of signature, etc.
  */
trait Signature
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'blob'.
    */
  var _blob: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'onBehalfOfUri'.
    */
  var _onBehalfOfUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'when'.
    */
  var _when: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'whoUri'.
    */
  var _whoUri: js.UndefOr[Element] = js.undefined
  
  /**
    * The actual signature content (XML DigSig. JWT, picture, etc.)
    */
  var blob: js.UndefOr[base64Binary] = js.undefined
  
  /**
    * The technical format of the signature
    */
  var contentType: js.UndefOr[code] = js.undefined
  
  /**
    * The party represented
    */
  var onBehalfOfReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The party represented
    */
  var onBehalfOfUri: js.UndefOr[uri] = js.undefined
  
  /**
    * Indication of the reason the entity signed the object(s)
    */
  var `type`: js.Array[Coding]
  
  /**
    * When the signature was created
    */
  var when: instant
  
  /**
    * Who signed
    */
  var whoReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who signed
    */
  var whoUri: js.UndefOr[uri] = js.undefined
}
object Signature {
  
  inline def apply(`type`: js.Array[Coding], when: instant): Signature = {
    val __obj = js.Dynamic.literal(when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
  
  extension [Self <: Signature](x: Self) {
    
    inline def setBlob(value: base64Binary): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    inline def setContentType(value: code): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setOnBehalfOfReference(value: Reference): Self = StObject.set(x, "onBehalfOfReference", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfReferenceUndefined: Self = StObject.set(x, "onBehalfOfReference", js.undefined)
    
    inline def setOnBehalfOfUri(value: uri): Self = StObject.set(x, "onBehalfOfUri", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUriUndefined: Self = StObject.set(x, "onBehalfOfUri", js.undefined)
    
    inline def setType(value: js.Array[Coding]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: Coding*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    inline def setWhen(value: instant): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhoReference(value: Reference): Self = StObject.set(x, "whoReference", value.asInstanceOf[js.Any])
    
    inline def setWhoReferenceUndefined: Self = StObject.set(x, "whoReference", js.undefined)
    
    inline def setWhoUri(value: uri): Self = StObject.set(x, "whoUri", value.asInstanceOf[js.Any])
    
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
