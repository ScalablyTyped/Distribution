package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If this is a reply to prior message
  */
trait MessageHeaderResponse
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'identifier'.
    */
  var _identifier: js.UndefOr[Element] = js.undefined
  
  /**
    * ok | transient-error | fatal-error
    */
  var code: typings.fhir.fhir.code
  
  /**
    * Specific list of hints/warnings/errors
    */
  var details: js.UndefOr[Reference] = js.undefined
  
  /**
    * Id of original message
    */
  var identifier: id
}
object MessageHeaderResponse {
  
  @scala.inline
  def apply(code: code, identifier: id): MessageHeaderResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderResponse]
  }
  
  @scala.inline
  implicit class MessageHeaderResponseMutableBuilder[Self <: MessageHeaderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Reference): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setIdentifier(value: id): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_identifier(value: Element): Self = StObject.set(x, "_identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_identifierUndefined: Self = StObject.set(x, "_identifier", js.undefined)
  }
}
