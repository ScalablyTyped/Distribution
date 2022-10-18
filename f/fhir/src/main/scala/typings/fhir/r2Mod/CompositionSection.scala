package typings.fhir.r2Mod

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
    * Provides computable standardized labels to topics within the document.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Allows capturing things like "none exist" or "not asked" which can be important for most lists.
    */
  var emptyReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A reference to the actual resource from which the narrative in the section is derived.
    */
  var entry: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Sections are used in various ways, and it must be known in what way it is safe to use the entries in them.
    */
  var mode: js.UndefOr[working | snapshot | changes] = js.undefined
  
  /**
    * Important for presentation and rendering.  Lists may be sorted to place more important information first or to group related entries.
    */
  var orderedBy: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A nested sub-section within this section.
    */
  var section: js.UndefOr[js.Array[CompositionSection]] = js.undefined
  
  /**
    * A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative.
    */
  var text: js.UndefOr[Narrative] = js.undefined
  
  /**
    * Section headings are often standardized for different types of documents.  They give guidance to humans on how the document is organized.
    */
  var title: js.UndefOr[String] = js.undefined
}
object CompositionSection {
  
  inline def apply(): CompositionSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositionSection]
  }
  
  extension [Self <: CompositionSection](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setEmptyReason(value: CodeableConcept): Self = StObject.set(x, "emptyReason", value.asInstanceOf[js.Any])
    
    inline def setEmptyReasonUndefined: Self = StObject.set(x, "emptyReason", js.undefined)
    
    inline def setEntry(value: js.Array[Reference]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setEntryVarargs(value: Reference*): Self = StObject.set(x, "entry", js.Array(value*))
    
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
