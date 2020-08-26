package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference from one resource to another
  */
@js.native
trait Reference extends Element {
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'reference'.
    */
  var _reference: js.UndefOr[Element] = js.native
  /**
    * Text alternative for the resource
    */
  var display: js.UndefOr[String] = js.native
  /**
    * Logical reference, when literal reference is not known
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Literal reference, Relative, internal or absolute URL
    */
  var reference: js.UndefOr[String] = js.native
}

object Reference {
  @scala.inline
  def apply(): Reference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reference]
  }
  @scala.inline
  implicit class ReferenceOps[Self <: Reference] (val x: Self) extends AnyVal {
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
    def set_display(value: Element): Self = this.set("_display", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_display: Self = this.set("_display", js.undefined)
    @scala.inline
    def set_reference(value: Element): Self = this.set("_reference", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_reference: Self = this.set("_reference", js.undefined)
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setReference(value: String): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
  }
  
}

