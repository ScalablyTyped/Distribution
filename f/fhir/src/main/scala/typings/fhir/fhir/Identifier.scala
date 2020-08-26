package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An identifier intended for computation
  */
@js.native
trait Identifier extends Element {
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * Organization that issued id (may be just text)
    */
  var assigner: js.UndefOr[Reference] = js.native
  /**
    * Time period when id is/was valid for use
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * The namespace for the identifier value
    */
  var system: js.UndefOr[uri] = js.native
  /**
    * Description of identifier
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  /**
    * usual | official | temp | secondary (If known)
    */
  var use: js.UndefOr[code] = js.native
  /**
    * The value that is unique
    */
  var value: js.UndefOr[String] = js.native
}

object Identifier {
  @scala.inline
  def apply(): Identifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identifier]
  }
  @scala.inline
  implicit class IdentifierOps[Self <: Identifier] (val x: Self) extends AnyVal {
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
    def set_system(value: Element): Self = this.set("_system", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_system: Self = this.set("_system", js.undefined)
    @scala.inline
    def set_use(value: Element): Self = this.set("_use", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_use: Self = this.set("_use", js.undefined)
    @scala.inline
    def set_value(value: Element): Self = this.set("_value", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_value: Self = this.set("_value", js.undefined)
    @scala.inline
    def setAssigner(value: Reference): Self = this.set("assigner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssigner: Self = this.set("assigner", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setSystem(value: uri): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUse(value: code): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

