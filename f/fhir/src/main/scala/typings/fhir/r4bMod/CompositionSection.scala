package typings.fhir.r4bMod

import typings.fhir.fhirStrings.changes
import typings.fhir.fhirStrings.snapshot
import typings.fhir.fhirStrings.working
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionSection
  extends StObject
     with BackboneElement {
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Identifies who is responsible for the information in this section, not necessarily who typed it in.
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The code identifies the section for an automated processor of the document. This is particularly relevant when using profiles to control the structure of the document.
    * If the section has content (instead of sub-sections), the section.code does not change the meaning or interpretation of the resource that is the content of the section in the comments for the section.code.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The various reasons for an empty section make a significant interpretation to its interpretation. Note that this code is for use when the entire section content has been suppressed, and not for when individual items are omitted - implementers may consider using a text note or a flag on an entry in these cases.
    */
  var emptyReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * If there are no entries in the list, an emptyReason SHOULD be provided.
    */
  var entry: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Typically, sections in a doument are about the subject of the document, whether that is a  patient, or group of patients, location, or device, or whatever. For some kind of documents, some sections actually contain data about related entities. Typical examples are  a section in a newborn discharge summary concerning the mother, or family history documents, with a section about each family member, though there are many other examples.
    */
  var focus: js.UndefOr[Reference] = js.undefined
  
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
  var section: js.UndefOr[js.Array[CompositionSection]] = js.undefined
  
  /**
    * Document profiles may define what content should be represented in the narrative to ensure clinical safety.
    */
  var text: js.UndefOr[Narrative] = js.undefined
  
  /**
    * The title identifies the section for a human reader. The title must be consistent with the narrative of the resource that is the target of the section.content reference. Generally, sections SHOULD have titles, but in some documents, it is unnecessary or inappropriate. Typically, this is where a section has subsections that have their own adequately distinguishing title,  or documents that only have a single section. Most Implementation Guides will make section title to be a required element.
    */
  var title: js.UndefOr[String] = js.undefined
}
object CompositionSection {
  
  inline def apply(): CompositionSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositionSection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompositionSection] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: js.Array[Reference]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthorVarargs(value: Reference*): Self = StObject.set(x, "author", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setEmptyReason(value: CodeableConcept): Self = StObject.set(x, "emptyReason", value.asInstanceOf[js.Any])
    
    inline def setEmptyReasonUndefined: Self = StObject.set(x, "emptyReason", js.undefined)
    
    inline def setEntry(value: js.Array[Reference]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setEntryVarargs(value: Reference*): Self = StObject.set(x, "entry", js.Array(value*))
    
    inline def setFocus(value: Reference): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setMode(value: working | snapshot | changes): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOrderedBy(value: CodeableConcept): Self = StObject.set(x, "orderedBy", value.asInstanceOf[js.Any])
    
    inline def setOrderedByUndefined: Self = StObject.set(x, "orderedBy", js.undefined)
    
    inline def setSection(value: js.Array[CompositionSection]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSectionVarargs(value: CompositionSection*): Self = StObject.set(x, "section", js.Array(value*))
    
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
