package typings.downshift.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMultipleSelectionStateChangeOptions[Item] extends UseMultipleSelectionDispatchAction {
  var changes: Partial[UseMultipleSelectionState[Item]]
}

object UseMultipleSelectionStateChangeOptions {
  @scala.inline
  def apply[Item](changes: Partial[UseMultipleSelectionState[Item]], `type`: UseMultipleSelectionStateChangeTypes): UseMultipleSelectionStateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionStateChangeOptions[Item]]
  }
}

