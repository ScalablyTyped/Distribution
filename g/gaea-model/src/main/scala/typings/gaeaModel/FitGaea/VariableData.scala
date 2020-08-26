package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableData extends js.Object {
  // 值类型 string number boolean
  var valueType: String = js.native
  // 变量的哪个字段
  var variableField: String = js.native
  // 变量类型
  // 比如是外部传参，还是全局变量
  var variableType: String = js.native
}

object VariableData {
  @scala.inline
  def apply(valueType: String, variableField: String, variableType: String): VariableData = {
    val __obj = js.Dynamic.literal(valueType = valueType.asInstanceOf[js.Any], variableField = variableField.asInstanceOf[js.Any], variableType = variableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableData]
  }
  @scala.inline
  implicit class VariableDataOps[Self <: VariableData] (val x: Self) extends AnyVal {
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
    def setValueType(value: String): Self = this.set("valueType", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariableField(value: String): Self = this.set("variableField", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariableType(value: String): Self = this.set("variableType", value.asInstanceOf[js.Any])
  }
  
}

