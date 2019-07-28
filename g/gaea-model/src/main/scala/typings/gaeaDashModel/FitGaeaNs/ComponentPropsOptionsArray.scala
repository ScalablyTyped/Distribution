package typings.gaeaDashModel.FitGaeaNs

import org.scalablytyped.runtime.StringDictionary
import typings.gaeaDashModel.Anon_CurrentUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPropsOptionsArray extends ComponentPropsGaeaEdit {
  var key: String
}

object ComponentPropsOptionsArray {
  @scala.inline
  def apply(
    editable: Boolean,
    editor: String,
    field: String,
    hideTool: Boolean,
    key: String,
    label: String,
    array: js.Array[ComponentPropsOptionsArrayValue] = null,
    emptyValue: js.Any = null,
    instance: js.Array[StringDictionary[ComponentPropsOptionValue]] = null,
    number: Anon_CurrentUnit = null,
    selector: js.Array[ComponentPropsOptionsSelector] = null,
    `type`: String = null
  ): ComponentPropsOptionsArray = {
    val __obj = js.Dynamic.literal(editable = editable, editor = editor, field = field, hideTool = hideTool, key = key, label = label)
    if (array != null) __obj.updateDynamic("array")(array)
    if (emptyValue != null) __obj.updateDynamic("emptyValue")(emptyValue)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (number != null) __obj.updateDynamic("number")(number)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ComponentPropsOptionsArray]
  }
}

