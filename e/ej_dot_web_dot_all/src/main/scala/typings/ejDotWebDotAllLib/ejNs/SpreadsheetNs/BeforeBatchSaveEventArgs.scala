package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

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
  var sheetIdx: js.UndefOr[scala.Double] = js.undefined
}

