package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relationships to other compositions/documents
  */
@js.native
trait CompositionRelatesTo extends BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * replaces | transforms | signs | appends
    */
  var code: typings.fhir.fhir.code = js.native
  
  /**
    * Target of the relationship
    */
  var targetIdentifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Target of the relationship
    */
  var targetReference: js.UndefOr[Reference] = js.native
}
object CompositionRelatesTo {
  
  @scala.inline
  def apply(code: code): CompositionRelatesTo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionRelatesTo]
  }
  
  @scala.inline
  implicit class CompositionRelatesToMutableBuilder[Self <: CompositionRelatesTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdentifier(value: Identifier): Self = StObject.set(x, "targetIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdentifierUndefined: Self = StObject.set(x, "targetIdentifier", js.undefined)
    
    @scala.inline
    def setTargetReference(value: Reference): Self = StObject.set(x, "targetReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReferenceUndefined: Self = StObject.set(x, "targetReference", js.undefined)
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
  }
}
