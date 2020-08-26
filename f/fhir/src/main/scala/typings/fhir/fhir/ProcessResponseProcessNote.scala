package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Processing comments or additional requirements
  */
@js.native
trait ProcessResponseProcessNote extends BackboneElement {
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  /**
    * Comment on the processing
    */
  var text: js.UndefOr[String] = js.native
  /**
    * display | print | printoper
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object ProcessResponseProcessNote {
  @scala.inline
  def apply(): ProcessResponseProcessNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessResponseProcessNote]
  }
  @scala.inline
  implicit class ProcessResponseProcessNoteOps[Self <: ProcessResponseProcessNote] (val x: Self) extends AnyVal {
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
    def set_text(value: Element): Self = this.set("_text", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_text: Self = this.set("_text", js.undefined)
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

