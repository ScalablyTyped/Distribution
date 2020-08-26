package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeCardSelectEventArgs extends js.Object {
  /** Returns the Target item.
    */
  var Target: js.UndefOr[js.Any] = js.native
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the select card index value.
    */
  var cardIndex: js.UndefOr[Double] = js.native
  /** Returns the select cell index value.
    */
  var cellIndex: js.UndefOr[Double] = js.native
  /** Returns the select cell element
    */
  var currentCell: js.UndefOr[js.Any] = js.native
  /** Returns select card data.
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the previously select the card element
    */
  var previousCard: js.UndefOr[js.Any] = js.native
  /** Returns the previously select card indexes
    */
  var previousRowcellindex: js.UndefOr[js.Array[_]] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object BeforeCardSelectEventArgs {
  @scala.inline
  def apply(): BeforeCardSelectEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeCardSelectEventArgs]
  }
  @scala.inline
  implicit class BeforeCardSelectEventArgsOps[Self <: BeforeCardSelectEventArgs] (val x: Self) extends AnyVal {
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
    def setTarget(value: js.Any): Self = this.set("Target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("Target", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCardIndex(value: Double): Self = this.set("cardIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardIndex: Self = this.set("cardIndex", js.undefined)
    @scala.inline
    def setCellIndex(value: Double): Self = this.set("cellIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellIndex: Self = this.set("cellIndex", js.undefined)
    @scala.inline
    def setCurrentCell(value: js.Any): Self = this.set("currentCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentCell: Self = this.set("currentCell", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setPreviousCard(value: js.Any): Self = this.set("previousCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousCard: Self = this.set("previousCard", js.undefined)
    @scala.inline
    def setPreviousRowcellindexVarargs(value: js.Any*): Self = this.set("previousRowcellindex", js.Array(value :_*))
    @scala.inline
    def setPreviousRowcellindex(value: js.Array[_]): Self = this.set("previousRowcellindex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousRowcellindex: Self = this.set("previousRowcellindex", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

