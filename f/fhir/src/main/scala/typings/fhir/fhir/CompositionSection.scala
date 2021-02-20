package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Composition is broken into sections
  */
@js.native
trait CompositionSection extends BackboneElement {
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  
  /**
    * Classification of section (recommended)
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Why the section is empty
    */
  var emptyReason: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * A reference to data that supports this section
    */
  var entry: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * working | snapshot | changes
    */
  var mode: js.UndefOr[code] = js.native
  
  /**
    * Order of section entries
    */
  var orderedBy: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Nested Section
    */
  var section: js.UndefOr[js.Array[CompositionSection]] = js.native
  
  /**
    * Text summary of the section, for human interpretation
    */
  var text: js.UndefOr[Narrative] = js.native
  
  /**
    * Label for section (e.g. for ToC)
    */
  var title: js.UndefOr[String] = js.native
}
object CompositionSection {
  
  @scala.inline
  def apply(): CompositionSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositionSection]
  }
  
  @scala.inline
  implicit class CompositionSectionMutableBuilder[Self <: CompositionSection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setEmptyReason(value: CodeableConcept): Self = StObject.set(x, "emptyReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyReasonUndefined: Self = StObject.set(x, "emptyReason", js.undefined)
    
    @scala.inline
    def setEntry(value: js.Array[Reference]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    @scala.inline
    def setEntryVarargs(value: Reference*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    @scala.inline
    def setMode(value: code): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOrderedBy(value: CodeableConcept): Self = StObject.set(x, "orderedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedByUndefined: Self = StObject.set(x, "orderedBy", js.undefined)
    
    @scala.inline
    def setSection(value: js.Array[CompositionSection]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    @scala.inline
    def setSectionVarargs(value: CompositionSection*): Self = StObject.set(x, "section", js.Array(value :_*))
    
    @scala.inline
    def setText(value: Narrative): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
