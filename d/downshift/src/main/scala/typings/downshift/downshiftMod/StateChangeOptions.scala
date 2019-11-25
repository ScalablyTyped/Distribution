package typings.downshift.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof downshift.downshift.DownshiftState<Item> ]:? downshift.downshift.DownshiftState<Item>[P]} */ trait StateChangeOptions[Item] extends js.Object {
  var `type`: StateChangeTypes
}

object StateChangeOptions {
  @scala.inline
  def apply[Item](`type`: StateChangeTypes): StateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChangeOptions[Item]]
  }
}

