package typings.downshift.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof downshift.downshift.UseSelectState<Item> ]:? downshift.downshift.UseSelectState<Item>[P]} */ trait UseSelectStateChangeOptions[Item] extends js.Object {
  var `type`: UseSelectStateChangeTypes
}

object UseSelectStateChangeOptions {
  @scala.inline
  def apply[Item](`type`: UseSelectStateChangeTypes): UseSelectStateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectStateChangeOptions[Item]]
  }
}

