package typings.fhir.r4bMod

import typings.fhir.fhirStrings.amendedWith
import typings.fhir.fhirStrings.amends
import typings.fhir.fhirStrings.appendedWith
import typings.fhir.fhirStrings.appends
import typings.fhir.fhirStrings.replacedWith
import typings.fhir.fhirStrings.replaces
import typings.fhir.fhirStrings.transformedWith
import typings.fhir.fhirStrings.transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceReportRelatesTo
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * If this document appends another document, then the document cannot be fully understood without also accessing the referenced document.
    */
  var code: replaces | amends | appends | transforms | replacedWith | amendedWith | appendedWith | transformedWith
  
  /**
    * The target composition/document of this relationship.
    */
  var targetIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The target composition/document of this relationship.
    */
  var targetReference: js.UndefOr[Reference] = js.undefined
}
object EvidenceReportRelatesTo {
  
  inline def apply(
    code: replaces | amends | appends | transforms | replacedWith | amendedWith | appendedWith | transformedWith
  ): EvidenceReportRelatesTo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvidenceReportRelatesTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceReportRelatesTo] (val x: Self) extends AnyVal {
    
    inline def setCode(
      value: replaces | amends | appends | transforms | replacedWith | amendedWith | appendedWith | transformedWith
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setTargetIdentifier(value: Identifier): Self = StObject.set(x, "targetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargetIdentifierUndefined: Self = StObject.set(x, "targetIdentifier", js.undefined)
    
    inline def setTargetReference(value: Reference): Self = StObject.set(x, "targetReference", value.asInstanceOf[js.Any])
    
    inline def setTargetReferenceUndefined: Self = StObject.set(x, "targetReference", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
  }
}
