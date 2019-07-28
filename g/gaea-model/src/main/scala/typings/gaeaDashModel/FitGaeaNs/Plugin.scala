package typings.gaeaDashModel.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait Plugin extends js.Object {
  var Action: js.UndefOr[js.Any] = js.undefined
  var Store: js.UndefOr[js.Any] = js.undefined
  // 插件安放位置
  var position: String
}

object Plugin {
  @scala.inline
  def apply(position: String, Action: js.Any = null, Store: js.Any = null): Plugin = {
    val __obj = js.Dynamic.literal(position = position)
    if (Action != null) __obj.updateDynamic("Action")(Action)
    if (Store != null) __obj.updateDynamic("Store")(Store)
    __obj.asInstanceOf[Plugin]
  }
}

