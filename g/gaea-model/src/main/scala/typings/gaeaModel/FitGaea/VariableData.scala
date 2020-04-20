package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableData extends js.Object {
  // 值类型 string number boolean
  var valueType: String
  // 变量的哪个字段
  var variableField: String
  // 变量类型
  // 比如是外部传参，还是全局变量
  var variableType: String
}

object VariableData {
  @scala.inline
  def apply(valueType: String, variableField: String, variableType: String): VariableData = {
    val __obj = js.Dynamic.literal(valueType = valueType.asInstanceOf[js.Any], variableField = variableField.asInstanceOf[js.Any], variableType = variableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableData]
  }
}

