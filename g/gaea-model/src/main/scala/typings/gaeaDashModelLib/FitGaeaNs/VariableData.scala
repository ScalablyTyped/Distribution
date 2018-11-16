package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VariableData extends js.Object {
  // 值类型 string number boolean
  var valueType: java.lang.String
  // 变量的哪个字段
  var variableField: java.lang.String
  // 变量类型
  // 比如是外部传参，还是全局变量
  var variableType: java.lang.String
}

