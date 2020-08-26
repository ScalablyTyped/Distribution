package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowStatus extends js.Object {
  /** Whether the stored entity is changed as a result of upload. */
  var changed: js.UndefOr[Boolean] = js.native
  /** Entity Id. */
  var entityId: js.UndefOr[String] = js.native
  /** Entity name. */
  var entityName: js.UndefOr[String] = js.native
  /** Reasons why the entity can't be uploaded. */
  var errors: js.UndefOr[js.Array[String]] = js.native
  /** Whether the entity is persisted. */
  var persisted: js.UndefOr[Boolean] = js.native
  /** Row number. */
  var rowNumber: js.UndefOr[Double] = js.native
}

object RowStatus {
  @scala.inline
  def apply(): RowStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowStatus]
  }
  @scala.inline
  implicit class RowStatusOps[Self <: RowStatus] (val x: Self) extends AnyVal {
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
    def setChanged(value: Boolean): Self = this.set("changed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChanged: Self = this.set("changed", js.undefined)
    @scala.inline
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityId: Self = this.set("entityId", js.undefined)
    @scala.inline
    def setEntityName(value: String): Self = this.set("entityName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityName: Self = this.set("entityName", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setPersisted(value: Boolean): Self = this.set("persisted", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersisted: Self = this.set("persisted", js.undefined)
    @scala.inline
    def setRowNumber(value: Double): Self = this.set("rowNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowNumber: Self = this.set("rowNumber", js.undefined)
  }
  
}

