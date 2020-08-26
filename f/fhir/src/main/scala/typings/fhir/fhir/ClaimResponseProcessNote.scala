package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Processing notes
  */
@js.native
trait ClaimResponseProcessNote extends BackboneElement {
  /**
    * Contains extended information for property 'number'.
    */
  var _number: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  /**
    * Language if different from the resource
    */
  var language: js.UndefOr[CodeableConcept] = js.native
  /**
    * Sequence Number for this note
    */
  var number: js.UndefOr[positiveInt] = js.native
  /**
    * Note explanatory text
    */
  var text: js.UndefOr[String] = js.native
  /**
    * display | print | printoper
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object ClaimResponseProcessNote {
  @scala.inline
  def apply(): ClaimResponseProcessNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimResponseProcessNote]
  }
  @scala.inline
  implicit class ClaimResponseProcessNoteOps[Self <: ClaimResponseProcessNote] (val x: Self) extends AnyVal {
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
    def set_number(value: Element): Self = this.set("_number", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_number: Self = this.set("_number", js.undefined)
    @scala.inline
    def set_text(value: Element): Self = this.set("_text", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_text: Self = this.set("_text", js.undefined)
    @scala.inline
    def setLanguage(value: CodeableConcept): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setNumber(value: positiveInt): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

