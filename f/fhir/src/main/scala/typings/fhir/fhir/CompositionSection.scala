package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class CompositionSectionOps[Self <: CompositionSection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_mode(value: Element): Self = this.set("_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_mode: Self = this.set("_mode", js.undefined)
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setEmptyReason(value: CodeableConcept): Self = this.set("emptyReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyReason: Self = this.set("emptyReason", js.undefined)
    @scala.inline
    def setEntryVarargs(value: Reference*): Self = this.set("entry", js.Array(value :_*))
    @scala.inline
    def setEntry(value: js.Array[Reference]): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    @scala.inline
    def setMode(value: code): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOrderedBy(value: CodeableConcept): Self = this.set("orderedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderedBy: Self = this.set("orderedBy", js.undefined)
    @scala.inline
    def setSectionVarargs(value: CompositionSection*): Self = this.set("section", js.Array(value :_*))
    @scala.inline
    def setSection(value: js.Array[CompositionSection]): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
    @scala.inline
    def setText(value: Narrative): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

