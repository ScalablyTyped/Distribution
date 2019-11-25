package typings.emberDashData.emberDashDataMod.atEmberDebugDataDashAdapterMod

import typings.emberDashData.emberDashDataMod.DS.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataAdapter extends js.Object {
  var store: Store
}

object DataAdapter {
  @scala.inline
  def apply(store: Store): DataAdapter = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataAdapter]
  }
}

