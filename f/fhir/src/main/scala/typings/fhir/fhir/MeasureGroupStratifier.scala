package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stratifier criteria for the measure
  */
@js.native
trait MeasureGroupStratifier extends BackboneElement {
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  /**
    * How the measure should be stratified
    */
  var criteria: js.UndefOr[String] = js.native
  /**
    * The identifier for the stratifier used to coordinate the reported data back to this stratifier
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Path to the stratifier
    */
  var path: js.UndefOr[String] = js.native
}

object MeasureGroupStratifier {
  @scala.inline
  def apply(): MeasureGroupStratifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureGroupStratifier]
  }
  @scala.inline
  implicit class MeasureGroupStratifierOps[Self <: MeasureGroupStratifier] (val x: Self) extends AnyVal {
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
    def set_criteria(value: Element): Self = this.set("_criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_criteria: Self = this.set("_criteria", js.undefined)
    @scala.inline
    def set_path(value: Element): Self = this.set("_path", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_path: Self = this.set("_path", js.undefined)
    @scala.inline
    def setCriteria(value: String): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

