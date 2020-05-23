package typings.downshift.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMultipleSelectionDispatchAction
  extends /* data */ StringDictionary[js.Any] {
  var `type`: UseMultipleSelectionStateChangeTypes
}

object UseMultipleSelectionDispatchAction {
  @scala.inline
  def apply(
    `type`: UseMultipleSelectionStateChangeTypes,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): UseMultipleSelectionDispatchAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[UseMultipleSelectionDispatchAction]
  }
}

