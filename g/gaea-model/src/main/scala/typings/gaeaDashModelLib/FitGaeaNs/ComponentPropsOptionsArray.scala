package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPropsOptionsArray extends ComponentPropsGaeaEdit {
  var key: java.lang.String
}

object ComponentPropsOptionsArray {
  @scala.inline
  def apply(
    editable: scala.Boolean,
    editor: java.lang.String,
    field: java.lang.String,
    hideTool: scala.Boolean,
    key: java.lang.String,
    label: java.lang.String,
    array: js.Array[ComponentPropsOptionsArrayValue] = null,
    emptyValue: js.Any = null,
    instance: js.Array[org.scalablytyped.runtime.StringDictionary[ComponentPropsOptionValue]] = null,
    number: gaeaDashModelLib.Anon_CurrentUnit = null,
    selector: js.Array[ComponentPropsOptionsSelector] = null,
    `type`: java.lang.String = null
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

