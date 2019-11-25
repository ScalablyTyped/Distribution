package typings.emberDashData.emberDashDataMod.atEmberServiceMod

import typings.emberDashData.emberDashDataMod.DS.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry extends js.Object {
  var store: Store
}

object Registry {
  @scala.inline
  def apply(store: Store): Registry = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Registry]
  }
}

