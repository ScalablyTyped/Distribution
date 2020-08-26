package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Other elements required for this mapping (from context)
  */
@js.native
trait ConceptMapGroupElementTargetDependsOn extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'property'.
    */
  var _property: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  /**
    * Value of the referenced element
    */
  var code: String = js.native
  /**
    * Display for the code
    */
  var display: js.UndefOr[String] = js.native
  /**
    * Reference to property mapping depends on
    */
  var property: uri = js.native
  /**
    * Code System (if necessary)
    */
  var system: js.UndefOr[uri] = js.native
}

object ConceptMapGroupElementTargetDependsOn {
  @scala.inline
  def apply(code: String, property: uri): ConceptMapGroupElementTargetDependsOn = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapGroupElementTargetDependsOn]
  }
  @scala.inline
  implicit class ConceptMapGroupElementTargetDependsOnOps[Self <: ConceptMapGroupElementTargetDependsOn] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: uri): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    @scala.inline
    def set_display(value: Element): Self = this.set("_display", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_display: Self = this.set("_display", js.undefined)
    @scala.inline
    def set_property(value: Element): Self = this.set("_property", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_property: Self = this.set("_property", js.undefined)
    @scala.inline
    def set_system(value: Element): Self = this.set("_system", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_system: Self = this.set("_system", js.undefined)
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setSystem(value: uri): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
  }
  
}

