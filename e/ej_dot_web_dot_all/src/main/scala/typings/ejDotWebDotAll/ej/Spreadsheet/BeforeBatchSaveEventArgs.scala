package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeBatchSaveEventArgs extends js.Object {
  /** Returns the changed record object.
    */
  var batchChanges: js.UndefOr[js.Any] = js.undefined
  /** Returns the query, primary key,batch changes for the data Source.
    */
  var dataSetting: js.UndefOr[js.Any] = js.undefined
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.undefined
}

object BeforeBatchSaveEventArgs {
  @scala.inline
  def apply(batchChanges: js.Any = null, dataSetting: js.Any = null, sheetIdx: Int | Double = null): BeforeBatchSaveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (batchChanges != null) __obj.updateDynamic("batchChanges")(batchChanges.asInstanceOf[js.Any])
    if (dataSetting != null) __obj.updateDynamic("dataSetting")(dataSetting.asInstanceOf[js.Any])
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeBatchSaveEventArgs]
  }
}

