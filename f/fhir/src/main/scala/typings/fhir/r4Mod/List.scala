package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.changes
import typings.fhir.fhirStrings.current
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.snapshot
import typings.fhir.fhirStrings.working
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * If there is no code, the purpose of the list is implied where it is used, such as in a document section using Document.section.code.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The actual important date is the date of currency of the resources that were summarized, but it is usually assumed that these are current when the preparation occurs.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The various reasons for an empty list make a significant interpretation to its interpretation. Note that this code is for use when the entire list has been suppressed, and not for when individual items are omitted - implementers may consider using a text note or a flag on an entry in these cases.
    */
  var emptyReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The encounter that is the context in which this list was created.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * If there are no entries in the list, an emptyReason SHOULD be provided.
    */
  var entry: js.UndefOr[js.Array[ListEntry]] = js.undefined
  
  /**
    * Identifier for the List assigned for business purposes outside the context of FHIR.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This element is labeled as a modifier because a change list must not be misunderstood as a complete list.
    */
  var mode: working | snapshot | changes
  
  /**
    * Comments that apply to the overall list.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Applications SHOULD render ordered lists in the order provided, but MAY allow users to re-order based on their own preferences as well. If there is no order specified, the order is unknown, though there may still be some order.
    */
  var orderedBy: js.UndefOr[CodeableConcept] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_List: typings.fhir.fhirStrings.List
  
  /**
    * The primary source is the entity that made the decisions what items are in the list. This may be software or user.
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: current | retired | `entered-in-error`
  
  /**
    * Some purely arbitrary lists do not have a common subject, so this is optional.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * A label for the list assigned by the author.
    */
  var title: js.UndefOr[String] = js.undefined
}
object List {
  
  inline def apply(mode: working | snapshot | changes, status: current | retired | `entered-in-error`): List = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], resourceType = "List", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  
  extension [Self <: List](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEmptyReason(value: CodeableConcept): Self = StObject.set(x, "emptyReason", value.asInstanceOf[js.Any])
    
    inline def setEmptyReasonUndefined: Self = StObject.set(x, "emptyReason", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEntry(value: js.Array[ListEntry]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setEntryVarargs(value: ListEntry*): Self = StObject.set(x, "entry", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMode(value: working | snapshot | changes): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOrderedBy(value: CodeableConcept): Self = StObject.set(x, "orderedBy", value.asInstanceOf[js.Any])
    
    inline def setOrderedByUndefined: Self = StObject.set(x, "orderedBy", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.List): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStatus(value: current | retired | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
