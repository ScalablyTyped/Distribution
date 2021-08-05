package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relationships to other compositions/documents
  */
trait CompositionRelatesTo
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * replaces | transforms | signs | appends
    */
  var code: typings.fhir.fhir.code
  
  /**
    * Target of the relationship
    */
  var targetIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Target of the relationship
    */
  var targetReference: js.UndefOr[Reference] = js.undefined
}
object CompositionRelatesTo {
  
  inline def apply(code: code): CompositionRelatesTo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionRelatesTo]
  }
  
  extension [Self <: CompositionRelatesTo](x: Self) {
    
    inline def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setTargetIdentifier(value: Identifier): Self = StObject.set(x, "targetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargetIdentifierUndefined: Self = StObject.set(x, "targetIdentifier", js.undefined)
    
    inline def setTargetReference(value: Reference): Self = StObject.set(x, "targetReference", value.asInstanceOf[js.Any])
    
    inline def setTargetReferenceUndefined: Self = StObject.set(x, "targetReference", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
  }
}
