package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationEducation
  extends StObject
     with BackboneElement {
  
  var _documentType: js.UndefOr[Element] = js.undefined
  
  var _presentationDate: js.UndefOr[Element] = js.undefined
  
  var _publicationDate: js.UndefOr[Element] = js.undefined
  
  var _reference: js.UndefOr[Element] = js.undefined
  
  /**
    * Identifier of the material presented to the patient.
    */
  var documentType: js.UndefOr[String] = js.undefined
  
  /**
    * Date the educational material was given to the patient.
    */
  var presentationDate: js.UndefOr[String] = js.undefined
  
  /**
    * Date the educational material was published.
    */
  var publicationDate: js.UndefOr[String] = js.undefined
  
  /**
    * Reference pointer to the educational material given to the patient if the information was on line.
    */
  var reference: js.UndefOr[String] = js.undefined
}
object ImmunizationEducation {
  
  inline def apply(): ImmunizationEducation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmunizationEducation]
  }
  
  extension [Self <: ImmunizationEducation](x: Self) {
    
    inline def setDocumentType(value: String): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypeUndefined: Self = StObject.set(x, "documentType", js.undefined)
    
    inline def setPresentationDate(value: String): Self = StObject.set(x, "presentationDate", value.asInstanceOf[js.Any])
    
    inline def setPresentationDateUndefined: Self = StObject.set(x, "presentationDate", js.undefined)
    
    inline def setPublicationDate(value: String): Self = StObject.set(x, "publicationDate", value.asInstanceOf[js.Any])
    
    inline def setPublicationDateUndefined: Self = StObject.set(x, "publicationDate", js.undefined)
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def set_documentType(value: Element): Self = StObject.set(x, "_documentType", value.asInstanceOf[js.Any])
    
    inline def set_documentTypeUndefined: Self = StObject.set(x, "_documentType", js.undefined)
    
    inline def set_presentationDate(value: Element): Self = StObject.set(x, "_presentationDate", value.asInstanceOf[js.Any])
    
    inline def set_presentationDateUndefined: Self = StObject.set(x, "_presentationDate", js.undefined)
    
    inline def set_publicationDate(value: Element): Self = StObject.set(x, "_publicationDate", value.asInstanceOf[js.Any])
    
    inline def set_publicationDateUndefined: Self = StObject.set(x, "_publicationDate", js.undefined)
    
    inline def set_reference(value: Element): Self = StObject.set(x, "_reference", value.asInstanceOf[js.Any])
    
    inline def set_referenceUndefined: Self = StObject.set(x, "_reference", js.undefined)
  }
}
