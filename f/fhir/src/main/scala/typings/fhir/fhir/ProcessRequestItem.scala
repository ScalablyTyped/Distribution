package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Items to re-adjudicate
  */
@js.native
trait ProcessRequestItem extends BackboneElement {
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.native
  /**
    * Service instance
    */
  var sequenceLinkId: integer = js.native
}

object ProcessRequestItem {
  @scala.inline
  def apply(sequenceLinkId: integer): ProcessRequestItem = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessRequestItem]
  }
  @scala.inline
  implicit class ProcessRequestItemOps[Self <: ProcessRequestItem] (val x: Self) extends AnyVal {
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
    def setSequenceLinkId(value: integer): Self = this.set("sequenceLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def set_sequenceLinkId(value: Element): Self = this.set("_sequenceLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sequenceLinkId: Self = this.set("_sequenceLinkId", js.undefined)
  }
  
}

