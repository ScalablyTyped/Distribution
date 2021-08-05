package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Clinical issue with action
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait DetectedIssue
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'detail'.
    */
  var _detail: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'reference'.
    */
  var _reference: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The provider or device that identified the issue
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Issue Category, e.g. drug-drug, duplicate therapy, etc.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * When identified
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Description and context
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * Unique id for the detected issue
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Problem resource
    */
  var implicated: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Step taken to address
    */
  var mitigation: js.UndefOr[js.Array[DetectedIssueMitigation]] = js.undefined
  
  /**
    * Associated patient
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * Authority for issue
    */
  var reference: js.UndefOr[uri] = js.undefined
  
  /**
    * high | moderate | low
    */
  var severity: js.UndefOr[code] = js.undefined
  
  /**
    * registered | preliminary | final | amended +
    */
  var status: code
}
object DetectedIssue {
  
  inline def apply(status: code): DetectedIssue = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedIssue]
  }
  
  extension [Self <: DetectedIssue](x: Self) {
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setImplicated(value: js.Array[Reference]): Self = StObject.set(x, "implicated", value.asInstanceOf[js.Any])
    
    inline def setImplicatedUndefined: Self = StObject.set(x, "implicated", js.undefined)
    
    inline def setImplicatedVarargs(value: Reference*): Self = StObject.set(x, "implicated", js.Array(value :_*))
    
    inline def setMitigation(value: js.Array[DetectedIssueMitigation]): Self = StObject.set(x, "mitigation", value.asInstanceOf[js.Any])
    
    inline def setMitigationUndefined: Self = StObject.set(x, "mitigation", js.undefined)
    
    inline def setMitigationVarargs(value: DetectedIssueMitigation*): Self = StObject.set(x, "mitigation", js.Array(value :_*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setReference(value: uri): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setSeverity(value: code): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_detail(value: Element): Self = StObject.set(x, "_detail", value.asInstanceOf[js.Any])
    
    inline def set_detailUndefined: Self = StObject.set(x, "_detail", js.undefined)
    
    inline def set_reference(value: Element): Self = StObject.set(x, "_reference", value.asInstanceOf[js.Any])
    
    inline def set_referenceUndefined: Self = StObject.set(x, "_reference", js.undefined)
    
    inline def set_severity(value: Element): Self = StObject.set(x, "_severity", value.asInstanceOf[js.Any])
    
    inline def set_severityUndefined: Self = StObject.set(x, "_severity", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
