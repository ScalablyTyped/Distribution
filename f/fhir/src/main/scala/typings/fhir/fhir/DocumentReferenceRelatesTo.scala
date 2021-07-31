package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relationships to other documents
  */
trait DocumentReferenceRelatesTo
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
  var target: Reference
}
object DocumentReferenceRelatesTo {
  
  @scala.inline
  def apply(code: code, target: Reference): DocumentReferenceRelatesTo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReferenceRelatesTo]
  }
  
  @scala.inline
  implicit class DocumentReferenceRelatesToMutableBuilder[Self <: DocumentReferenceRelatesTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
  }
}
