package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeApplication extends Type_ {
  var applications: js.Array[Type_]
  var expression: Type_
  var `type`: typings.doctrine.doctrineStrings.TypeApplication
}

object TypeApplication {
  @scala.inline
  def apply(
    applications: js.Array[Type_],
    expression: Type_,
    `type`: typings.doctrine.doctrineStrings.TypeApplication
  ): TypeApplication = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeApplication]
  }
}

