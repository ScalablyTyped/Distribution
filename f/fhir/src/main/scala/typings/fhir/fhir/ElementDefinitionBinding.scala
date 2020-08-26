package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValueSet details if this is coded
  */
@js.native
trait ElementDefinitionBinding extends Element {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'strength'.
    */
  var _strength: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueSetUri'.
    */
  var _valueSetUri: js.UndefOr[Element] = js.native
  /**
    * Human explanation of the value set
    */
  var description: js.UndefOr[String] = js.native
  /**
    * required | extensible | preferred | example
    */
  var strength: code = js.native
  /**
    * Source of value set
    */
  var valueSetReference: js.UndefOr[Reference] = js.native
  /**
    * Source of value set
    */
  var valueSetUri: js.UndefOr[uri] = js.native
}

object ElementDefinitionBinding {
  @scala.inline
  def apply(strength: code): ElementDefinitionBinding = {
    val __obj = js.Dynamic.literal(strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionBinding]
  }
  @scala.inline
  implicit class ElementDefinitionBindingOps[Self <: ElementDefinitionBinding] (val x: Self) extends AnyVal {
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
    def setStrength(value: code): Self = this.set("strength", value.asInstanceOf[js.Any])
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_strength(value: Element): Self = this.set("_strength", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_strength: Self = this.set("_strength", js.undefined)
    @scala.inline
    def set_valueSetUri(value: Element): Self = this.set("_valueSetUri", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueSetUri: Self = this.set("_valueSetUri", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setValueSetReference(value: Reference): Self = this.set("valueSetReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSetReference: Self = this.set("valueSetReference", js.undefined)
    @scala.inline
    def setValueSetUri(value: uri): Self = this.set("valueSetUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSetUri: Self = this.set("valueSetUri", js.undefined)
  }
  
}

