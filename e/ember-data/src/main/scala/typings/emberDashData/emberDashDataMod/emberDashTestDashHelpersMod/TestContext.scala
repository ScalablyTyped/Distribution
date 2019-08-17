package typings.emberDashData.emberDashDataMod.emberDashTestDashHelpersMod

import typings.emberDashData.emberDashDataMod.DSNs.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestContext extends js.Object {
  var store: Store
}

object TestContext {
  @scala.inline
  def apply(store: Store): TestContext = {
    val __obj = js.Dynamic.literal(store = store)
  
    __obj.asInstanceOf[TestContext]
  }
}

