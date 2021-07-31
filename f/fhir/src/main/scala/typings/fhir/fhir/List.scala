package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information summarized from a list of other resources
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait List
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * What the purpose of this list is
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * When the list was prepared
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Why list is empty
    */
  var emptyReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Context in which list created
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Entries in the list
    */
  var entry: js.UndefOr[js.Array[ListEntry]] = js.undefined
  
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * working | snapshot | changes
    */
  var mode: code
  
  /**
    * Comments about the list
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * What order the list has
    */
  var orderedBy: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Who and/or what defined the list contents (aka Author)
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * current | retired | entered-in-error
    */
  var status: code
  
  /**
    * If all resources have the same subject
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Descriptive name for the list
    */
  var title: js.UndefOr[String] = js.undefined
}
object List {
  
  @scala.inline
  def apply(mode: code, status: code): List = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  
  @scala.inline
  implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setEmptyReason(value: CodeableConcept): Self = StObject.set(x, "emptyReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyReasonUndefined: Self = StObject.set(x, "emptyReason", js.undefined)
    
    @scala.inline
    def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    @scala.inline
    def setEntry(value: js.Array[ListEntry]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    @scala.inline
    def setEntryVarargs(value: ListEntry*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setMode(value: code): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setOrderedBy(value: CodeableConcept): Self = StObject.set(x, "orderedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedByUndefined: Self = StObject.set(x, "orderedBy", js.undefined)
    
    @scala.inline
    def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
