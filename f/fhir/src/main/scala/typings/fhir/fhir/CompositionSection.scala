package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Composition is broken into sections
  */
trait CompositionSection
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Classification of section (recommended)
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Why the section is empty
    */
  var emptyReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A reference to data that supports this section
    */
  var entry: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * working | snapshot | changes
    */
  var mode: js.UndefOr[code] = js.undefined
  
  /**
    * Order of section entries
    */
  var orderedBy: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Nested Section
    */
  var section: js.UndefOr[js.Array[CompositionSection]] = js.undefined
  
  /**
    * Text summary of the section, for human interpretation
    */
  var text: js.UndefOr[Narrative] = js.undefined
  
  /**
    * Label for section (e.g. for ToC)
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
    
    inline def setEntryVarargs(value: Reference*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    inline def setMode(value: code): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOrderedBy(value: CodeableConcept): Self = StObject.set(x, "orderedBy", value.asInstanceOf[js.Any])
    
    inline def setOrderedByUndefined: Self = StObject.set(x, "orderedBy", js.undefined)
    
    inline def setSection(value: js.Array[CompositionSection]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSectionVarargs(value: CompositionSection*): Self = StObject.set(x, "section", js.Array(value :_*))
    
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
