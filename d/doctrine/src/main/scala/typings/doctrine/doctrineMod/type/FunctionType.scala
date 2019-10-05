package typings.doctrine.doctrineMod.`type`

import typings.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionType extends Type {
  var `new`: Type
  var params: js.Array[Type]
  var result: js.Array[Type]
  var `this`: Type
  var `type`: typings.doctrine.doctrineStrings.FunctionType
}

object FunctionType {
  @scala.inline
  def apply(
    `new`: Type,
    params: js.Array[Type],
    result: js.Array[Type],
    `this`: Type,
    `type`: typings.doctrine.doctrineStrings.FunctionType
  ): FunctionType = {
    val __obj = js.Dynamic.literal(params = params, result = result)
    __obj.updateDynamic("new")(`new`)
    __obj.updateDynamic("this")(`this`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FunctionType]
  }
}

