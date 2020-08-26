package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import typings.gaeaModel.anon.CurrentUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentPropsGaeaEdit extends js.Object {
  /**
    * 当 editor 为 array 时的数组配置
    * 数组中的 key,和填入的值,会作为 Array<key:value> 填入到 value 中
    */
  var array: js.UndefOr[js.Array[ComponentPropsOptionsArrayValue]] = js.native
  /**
    * 是否可被编辑
    */
  var editable: Boolean = js.native
  /**
    * 编辑器类型
    */
  var editor: String = js.native
  /**
    * 为空时的值，默认为 null
    */
  var emptyValue: js.UndefOr[js.Any] = js.native
  /**
    * 对应字段名
    */
  var field: String = js.native
  /**
    * 是否隐藏编辑工具
    */
  var hideTool: Boolean = js.native
  /**
    * 枚举实例
    */
  var instance: js.UndefOr[js.Array[StringDictionary[ComponentPropsOptionValue]]] = js.native
  /**
    * 选项名称
    */
  var label: String = js.native
  /**
    * 控制 number 单位
    */
  var number: js.UndefOr[CurrentUnit] = js.native
  /**
    * 当 editor 为 selector 时的数组配置
    */
  var selector: js.UndefOr[js.Array[ComponentPropsOptionsSelector]] = js.native
  /**
    * 值类型, 默认为字符串
    */
  var `type`: js.UndefOr[String] = js.native
}

object ComponentPropsGaeaEdit {
  @scala.inline
  def apply(editable: Boolean, editor: String, field: String, hideTool: Boolean, label: String): ComponentPropsGaeaEdit = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hideTool = hideTool.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropsGaeaEdit]
  }
  @scala.inline
  implicit class ComponentPropsGaeaEditOps[Self <: ComponentPropsGaeaEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditor(value: String): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideTool(value: Boolean): Self = this.set("hideTool", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrayVarargs(value: ComponentPropsOptionsArrayValue*): Self = this.set("array", js.Array(value :_*))
    @scala.inline
    def setArray(value: js.Array[ComponentPropsOptionsArrayValue]): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    @scala.inline
    def setEmptyValue(value: js.Any): Self = this.set("emptyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyValue: Self = this.set("emptyValue", js.undefined)
    @scala.inline
    def setInstanceVarargs(value: StringDictionary[ComponentPropsOptionValue]*): Self = this.set("instance", js.Array(value :_*))
    @scala.inline
    def setInstance(value: js.Array[StringDictionary[ComponentPropsOptionValue]]): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setNumber(value: CurrentUnit): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setSelectorVarargs(value: ComponentPropsOptionsSelector*): Self = this.set("selector", js.Array(value :_*))
    @scala.inline
    def setSelector(value: js.Array[ComponentPropsOptionsSelector]): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

