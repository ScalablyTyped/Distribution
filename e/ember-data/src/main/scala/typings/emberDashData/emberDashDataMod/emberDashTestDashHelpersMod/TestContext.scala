package typings.emberDashData.emberDashDataMod.emberDashTestDashHelpersMod

import typings.emberDashData.emberDashDataMod.DS.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestContext extends js.Object {
  var store: Store
}

object TestContext {
  @scala.inline
  def apply(store: Store): TestContext = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestContext]
  }
}

