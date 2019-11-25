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
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionType]
  }
}

