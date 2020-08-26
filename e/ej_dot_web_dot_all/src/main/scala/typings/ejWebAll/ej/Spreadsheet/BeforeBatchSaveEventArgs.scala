package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeBatchSaveEventArgs extends js.Object {
  /** Returns the changed record object.
    */
  var batchChanges: js.UndefOr[js.Any] = js.native
  /** Returns the query, primary key,batch changes for the data Source.
    */
  var dataSetting: js.UndefOr[js.Any] = js.native
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.native
}

object BeforeBatchSaveEventArgs {
  @scala.inline
  def apply(): BeforeBatchSaveEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeBatchSaveEventArgs]
  }
  @scala.inline
  implicit class BeforeBatchSaveEventArgsOps[Self <: BeforeBatchSaveEventArgs] (val x: Self) extends AnyVal {
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
    def setBatchChanges(value: js.Any): Self = this.set("batchChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchChanges: Self = this.set("batchChanges", js.undefined)
    @scala.inline
    def setDataSetting(value: js.Any): Self = this.set("dataSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSetting: Self = this.set("dataSetting", js.undefined)
    @scala.inline
    def setSheetIdx(value: Double): Self = this.set("sheetIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetIdx: Self = this.set("sheetIdx", js.undefined)
  }
  
}

