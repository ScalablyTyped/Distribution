package typings.gaeaDashModel.FitGaeaNs

import org.scalablytyped.runtime.StringDictionary
import typings.gaeaDashModel.Anon_CurrentUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPropsGaeaEdit extends js.Object {
  /**
    * 当 editor 为 array 时的数组配置
    * 数组中的 key,和填入的值,会作为 Array<key:value> 填入到 value 中
    */
  var array: js.UndefOr[js.Array[ComponentPropsOptionsArrayValue]] = js.undefined
  /**
    * 是否可被编辑
    */
  var editable: Boolean
  /**
    * 编辑器类型
    */
  var editor: String
  /**
    * 为空时的值，默认为 null
    */
  var emptyValue: js.UndefOr[js.Any] = js.undefined
  /**
    * 对应字段名
    */
  var field: String
  /**
    * 是否隐藏编辑工具
    */
  var hideTool: Boolean
  /**
    * 枚举实例
    */
  var instance: js.UndefOr[js.Array[StringDictionary[ComponentPropsOptionValue]]] = js.undefined
  /**
    * 选项名称
    */
  var label: String
  /**
    * 控制 number 单位
    */
  var number: js.UndefOr[Anon_CurrentUnit] = js.undefined
  /**
    * 当 editor 为 selector 时的数组配置
    */
  var selector: js.UndefOr[js.Array[ComponentPropsOptionsSelector]] = js.undefined
  /**
    * 值类型, 默认为字符串
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ComponentPropsGaeaEdit {
  @scala.inline
  def apply(
    editable: Boolean,
    editor: String,
    field: String,
    hideTool: Boolean,
    label: String,
    array: js.Array[ComponentPropsOptionsArrayValue] = null,
    emptyValue: js.Any = null,
    instance: js.Array[StringDictionary[ComponentPropsOptionValue]] = null,
    number: Anon_CurrentUnit = null,
    selector: js.Array[ComponentPropsOptionsSelector] = null,
    `type`: String = null
  ): ComponentPropsGaeaEdit = {
    val __obj = js.Dynamic.literal(editable = editable, editor = editor, field = field, hideTool = hideTool, label = label)
    if (array != null) __obj.updateDynamic("array")(array)
    if (emptyValue != null) __obj.updateDynamic("emptyValue")(emptyValue)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (number != null) __obj.updateDynamic("number")(number)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ComponentPropsGaeaEdit]
  }
}

