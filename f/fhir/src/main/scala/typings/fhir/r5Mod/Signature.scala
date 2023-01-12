package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signature
  extends StObject
     with Element {
  
  var _data: js.UndefOr[Element] = js.undefined
  
  var _sigFormat: js.UndefOr[Element] = js.undefined
  
  var _targetFormat: js.UndefOr[Element] = js.undefined
  
  var _when: js.UndefOr[Element] = js.undefined
  
  /**
    * Where the signature type is an XML DigSig, the signed content is a FHIR Resource(s), the signature is of the XML form of the Resource(s) using  XML-Signature (XMLDIG) "Detached Signature" form.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * The party that can't sign. For example a child.
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jose for JWS, and image/ * for a graphical image of a signature, etc.
    */
  var sigFormat: js.UndefOr[String] = js.undefined
  
  /**
    * "xml", "json" and "ttl" are allowed, which describe the simple encodings described in the specification (and imply appropriate bundle support). Otherwise, mime types are legal here.
    */
  var targetFormat: js.UndefOr[String] = js.undefined
  
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
  var who: Reference
}
object Signature {
  
  inline def apply(`type`: js.Array[Coding], when: String, who: Reference): Signature = {
    val __obj = js.Dynamic.literal(when = when.asInstanceOf[js.Any], who = who.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Signature] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
    
    inline def setSigFormat(value: String): Self = StObject.set(x, "sigFormat", value.asInstanceOf[js.Any])
    
    inline def setSigFormatUndefined: Self = StObject.set(x, "sigFormat", js.undefined)
    
    inline def setTargetFormat(value: String): Self = StObject.set(x, "targetFormat", value.asInstanceOf[js.Any])
    
    inline def setTargetFormatUndefined: Self = StObject.set(x, "targetFormat", js.undefined)
    
    inline def setType(value: js.Array[Coding]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: Coding*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setWhen(value: String): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWho(value: Reference): Self = StObject.set(x, "who", value.asInstanceOf[js.Any])
    
    inline def set_data(value: Element): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
    
    inline def set_dataUndefined: Self = StObject.set(x, "_data", js.undefined)
    
    inline def set_sigFormat(value: Element): Self = StObject.set(x, "_sigFormat", value.asInstanceOf[js.Any])
    
    inline def set_sigFormatUndefined: Self = StObject.set(x, "_sigFormat", js.undefined)
    
    inline def set_targetFormat(value: Element): Self = StObject.set(x, "_targetFormat", value.asInstanceOf[js.Any])
    
    inline def set_targetFormatUndefined: Self = StObject.set(x, "_targetFormat", js.undefined)
    
    inline def set_when(value: Element): Self = StObject.set(x, "_when", value.asInstanceOf[js.Any])
    
    inline def set_whenUndefined: Self = StObject.set(x, "_when", js.undefined)
  }
}
