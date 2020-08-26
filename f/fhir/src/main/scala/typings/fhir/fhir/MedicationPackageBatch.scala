package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies a single production run
  */
@js.native
trait MedicationPackageBatch extends BackboneElement {
  /**
    * Contains extended information for property 'expirationDate'.
    */
  var _expirationDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'lotNumber'.
    */
  var _lotNumber: js.UndefOr[Element] = js.native
  /**
    * When batch will expire
    */
  var expirationDate: js.UndefOr[dateTime] = js.native
  /**
    * Identifier assigned to batch
    */
  var lotNumber: js.UndefOr[String] = js.native
}

object MedicationPackageBatch {
  @scala.inline
  def apply(): MedicationPackageBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationPackageBatch]
  }
  @scala.inline
  implicit class MedicationPackageBatchOps[Self <: MedicationPackageBatch] (val x: Self) extends AnyVal {
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
    def set_expirationDate(value: Element): Self = this.set("_expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_expirationDate: Self = this.set("_expirationDate", js.undefined)
    @scala.inline
    def set_lotNumber(value: Element): Self = this.set("_lotNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_lotNumber: Self = this.set("_lotNumber", js.undefined)
    @scala.inline
    def setExpirationDate(value: dateTime): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    @scala.inline
    def setLotNumber(value: String): Self = this.set("lotNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLotNumber: Self = this.set("lotNumber", js.undefined)
  }
  
}

