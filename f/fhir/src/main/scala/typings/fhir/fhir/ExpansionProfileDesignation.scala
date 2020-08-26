package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When the expansion profile imposes designation contraints
  */
@js.native
trait ExpansionProfileDesignation extends BackboneElement {
  /**
    * Designations to be excluded
    */
  var exclude: js.UndefOr[ExpansionProfileDesignationExclude] = js.native
  /**
    * Designations to be included
    */
  var include: js.UndefOr[ExpansionProfileDesignationInclude] = js.native
}

object ExpansionProfileDesignation {
  @scala.inline
  def apply(): ExpansionProfileDesignation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignation]
  }
  @scala.inline
  implicit class ExpansionProfileDesignationOps[Self <: ExpansionProfileDesignation] (val x: Self) extends AnyVal {
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
    def setExclude(value: ExpansionProfileDesignationExclude): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setInclude(value: ExpansionProfileDesignationInclude): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
  }
  
}

