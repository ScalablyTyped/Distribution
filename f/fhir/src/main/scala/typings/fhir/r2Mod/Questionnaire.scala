package typings.fhir.r2Mod

import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.published
import typings.fhir.fhirStrings.retired
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Questionnaire
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _subjectType: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * The date that this questionnaire was last changed.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Need to be able to logically group answers to grouped questions.
    */
  var group: QuestionnaireGroup
  
  /**
    * Need to allow connection to a wider workflow.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Conveys responsibility for the questions and their organization and also helps evaluate the questionnaire's "authority".
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Questionnaire: typings.fhir.fhirStrings.Questionnaire
  
  /**
    * The lifecycle status of the questionnaire as a whole.
    */
  var status: draft | published | retired
  
  /**
    * Identifies the types of subjects that can be the subject of the questionnaire.
    */
  var subjectType: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Contact details to assist a user in finding and communicating with the publisher.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * In some cases, separate resource instances might be created for each version (if an older version can be maintained once a new version exists).
    */
  var version: js.UndefOr[String] = js.undefined
}
object Questionnaire {
  
  inline def apply(group: QuestionnaireGroup, status: draft | published | retired): Questionnaire = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], resourceType = "Questionnaire", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Questionnaire]
  }
  
  extension [Self <: Questionnaire](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setGroup(value: QuestionnaireGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Questionnaire): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | published | retired): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubjectType(value: js.Array[String]): Self = StObject.set(x, "subjectType", value.asInstanceOf[js.Any])
    
    inline def setSubjectTypeUndefined: Self = StObject.set(x, "subjectType", js.undefined)
    
    inline def setSubjectTypeVarargs(value: String*): Self = StObject.set(x, "subjectType", js.Array(value*))
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_subjectType(value: js.Array[Element]): Self = StObject.set(x, "_subjectType", value.asInstanceOf[js.Any])
    
    inline def set_subjectTypeUndefined: Self = StObject.set(x, "_subjectType", js.undefined)
    
    inline def set_subjectTypeVarargs(value: Element*): Self = StObject.set(x, "_subjectType", js.Array(value*))
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
