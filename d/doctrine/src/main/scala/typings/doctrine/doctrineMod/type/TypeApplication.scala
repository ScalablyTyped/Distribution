package typings.doctrine.doctrineMod.`type`

import typings.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeApplication extends Type {
  var applications: js.Array[Type]
  var expression: Type
  var `type`: typings.doctrine.doctrineStrings.TypeApplication
}

object TypeApplication {
  @scala.inline
  def apply(
    applications: js.Array[Type],
    expression: Type,
    `type`: typings.doctrine.doctrineStrings.TypeApplication
  ): TypeApplication = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeApplication]
  }
}

