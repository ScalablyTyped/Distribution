package typings.fhir.r4Mod

import typings.fhir.fhirStrings.changes
import typings.fhir.fhirStrings.snapshot
import typings.fhir.fhirStrings.working
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceReportSection
  extends StObject
     with BackboneElement {
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Identifies who is responsible for the information in this section, not necessarily who typed it in.
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The various reasons for an empty section make a significant interpretation to its interpretation. Note that this code is for use when the entire section content has been suppressed, and not for when individual items are omitted - implementers may consider using a text note or a flag on an entry in these cases.
    */
  var emptyReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Specifies any type of classification of the evidence report.
    */
  var entryClassifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Quantity as content.
    */
  var entryQuantity: js.UndefOr[js.Array[Quantity]] = js.undefined
  
  /**
    * If there are no entries in the list, an emptyReason SHOULD be provided.
    */
  var entryReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The code identifies the section for an automated processor of the document. This is particularly relevant when using profiles to control the structure of the document.
    * If the section has content (instead of sub-sections), the section.code does not change the meaning or interpretation of the resource that is the content of the section in the comments for the section.code.
    */
  var focus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A definitional Resource identifying the kind of content contained within the section. This should be consistent with the section title.
    */
  var focusReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element is labeled as a modifier because a change list must not be misunderstood as a complete list.
    */
  var mode: js.UndefOr[working | snapshot | changes] = js.undefined
  
  /**
    * Applications SHOULD render ordered lists in the order provided, but MAY allow users to re-order based on their own preferences as well. If there is no order specified, the order is unknown, though there may still be some order.
    */
  var orderedBy: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Nested sections are primarily used to help human readers navigate to particular portions of the document.
    */
  var section: js.UndefOr[js.Array[EvidenceReportSection]] = js.undefined
  
  /**
    * Document profiles may define what content should be represented in the narrative.
    */
  var text: js.UndefOr[Narrative] = js.undefined
  
  /**
    * The title identifies the section for a human reader. The title must be consistent with the narrative of the resource that is the target of the section.content reference. Generally, sections SHOULD have titles, but in some documents, it is unnecessary or inappropriate. Typically, this is where a section has subsections that have their own adequately distinguishing title,  or documents that only have a single section.
    */
  var title: js.UndefOr[String] = js.undefined
}
object EvidenceReportSection {
  
  inline def apply(): EvidenceReportSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvidenceReportSection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceReportSection] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: js.Array[Reference]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthorVarargs(value: Reference*): Self = StObject.set(x, "author", js.Array(value*))
    
    inline def setEmptyReason(value: CodeableConcept): Self = StObject.set(x, "emptyReason", value.asInstanceOf[js.Any])
    
    inline def setEmptyReasonUndefined: Self = StObject.set(x, "emptyReason", js.undefined)
    
    inline def setEntryClassifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "entryClassifier", value.asInstanceOf[js.Any])
    
    inline def setEntryClassifierUndefined: Self = StObject.set(x, "entryClassifier", js.undefined)
    
    inline def setEntryClassifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "entryClassifier", js.Array(value*))
    
    inline def setEntryQuantity(value: js.Array[Quantity]): Self = StObject.set(x, "entryQuantity", value.asInstanceOf[js.Any])
    
    inline def setEntryQuantityUndefined: Self = StObject.set(x, "entryQuantity", js.undefined)
    
    inline def setEntryQuantityVarargs(value: Quantity*): Self = StObject.set(x, "entryQuantity", js.Array(value*))
    
    inline def setEntryReference(value: js.Array[Reference]): Self = StObject.set(x, "entryReference", value.asInstanceOf[js.Any])
    
    inline def setEntryReferenceUndefined: Self = StObject.set(x, "entryReference", js.undefined)
    
    inline def setEntryReferenceVarargs(value: Reference*): Self = StObject.set(x, "entryReference", js.Array(value*))
    
    inline def setFocus(value: CodeableConcept): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusReference(value: Reference): Self = StObject.set(x, "focusReference", value.asInstanceOf[js.Any])
    
    inline def setFocusReferenceUndefined: Self = StObject.set(x, "focusReference", js.undefined)
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setMode(value: working | snapshot | changes): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOrderedBy(value: CodeableConcept): Self = StObject.set(x, "orderedBy", value.asInstanceOf[js.Any])
    
    inline def setOrderedByUndefined: Self = StObject.set(x, "orderedBy", js.undefined)
    
    inline def setSection(value: js.Array[EvidenceReportSection]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSectionVarargs(value: EvidenceReportSection*): Self = StObject.set(x, "section", js.Array(value*))
    
    inline def setText(value: Narrative): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
