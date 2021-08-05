package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of resources composed into a single coherent clinical statement with clinical attestation
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Composition
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'confidentiality'.
    */
  var _confidentiality: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Attests to accuracy of composition
    */
  var attester: js.UndefOr[js.Array[CompositionAttester]] = js.undefined
  
  /**
    * Who and/or what authored the composition
    */
  var author: js.Array[Reference]
  
  /**
    * Categorization of Composition
    */
  var `class`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * As defined by affinity domain
    */
  var confidentiality: js.UndefOr[code] = js.undefined
  
  /**
    * Organization which maintains the composition
    */
  var custodian: js.UndefOr[Reference] = js.undefined
  
  /**
    * Composition editing time
    */
  var date: dateTime
  
  /**
    * Context of the Composition
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * The clinical service(s) being documented
    */
  var event: js.UndefOr[js.Array[CompositionEvent]] = js.undefined
  
  /**
    * Logical identifier of composition (version-independent)
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Relationships to other compositions/documents
    */
  var relatesTo: js.UndefOr[js.Array[CompositionRelatesTo]] = js.undefined
  
  /**
    * Composition is broken into sections
    */
  var section: js.UndefOr[js.Array[CompositionSection]] = js.undefined
  
  /**
    * preliminary | final | amended | entered-in-error
    */
  var status: code
  
  /**
    * Who and/or what the composition is about
    */
  var subject: Reference
  
  /**
    * Human Readable name/title
    */
  var title: String
  
  /**
    * Kind of composition (LOINC if possible)
    */
  var `type`: CodeableConcept
}
object Composition {
  
  inline def apply(
    author: js.Array[Reference],
    date: dateTime,
    status: code,
    subject: Reference,
    title: String,
    `type`: CodeableConcept
  ): Composition = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Composition]
  }
  
  extension [Self <: Composition](x: Self) {
    
    inline def setAttester(value: js.Array[CompositionAttester]): Self = StObject.set(x, "attester", value.asInstanceOf[js.Any])
    
    inline def setAttesterUndefined: Self = StObject.set(x, "attester", js.undefined)
    
    inline def setAttesterVarargs(value: CompositionAttester*): Self = StObject.set(x, "attester", js.Array(value :_*))
    
    inline def setAuthor(value: js.Array[Reference]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorVarargs(value: Reference*): Self = StObject.set(x, "author", js.Array(value :_*))
    
    inline def setClass(value: CodeableConcept): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setConfidentiality(value: code): Self = StObject.set(x, "confidentiality", value.asInstanceOf[js.Any])
    
    inline def setConfidentialityUndefined: Self = StObject.set(x, "confidentiality", js.undefined)
    
    inline def setCustodian(value: Reference): Self = StObject.set(x, "custodian", value.asInstanceOf[js.Any])
    
    inline def setCustodianUndefined: Self = StObject.set(x, "custodian", js.undefined)
    
    inline def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEvent(value: js.Array[CompositionEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEventVarargs(value: CompositionEvent*): Self = StObject.set(x, "event", js.Array(value :_*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setRelatesTo(value: js.Array[CompositionRelatesTo]): Self = StObject.set(x, "relatesTo", value.asInstanceOf[js.Any])
    
    inline def setRelatesToUndefined: Self = StObject.set(x, "relatesTo", js.undefined)
    
    inline def setRelatesToVarargs(value: CompositionRelatesTo*): Self = StObject.set(x, "relatesTo", js.Array(value :_*))
    
    inline def setSection(value: js.Array[CompositionSection]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSectionVarargs(value: CompositionSection*): Self = StObject.set(x, "section", js.Array(value :_*))
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_confidentiality(value: Element): Self = StObject.set(x, "_confidentiality", value.asInstanceOf[js.Any])
    
    inline def set_confidentialityUndefined: Self = StObject.set(x, "_confidentiality", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
