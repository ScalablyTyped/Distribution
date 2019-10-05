package typings.doctrine.doctrineMod.`type`

import typings.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameExpression extends Type {
  var name: String
  var `type`: typings.doctrine.doctrineStrings.NameExpression
}

object NameExpression {
  @scala.inline
  def apply(name: String, `type`: typings.doctrine.doctrineStrings.NameExpression): NameExpression = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NameExpression]
  }
}

