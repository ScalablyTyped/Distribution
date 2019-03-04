package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expr extends js.Object {
  var description: java.lang.String
  var expression: java.lang.String
  var location: java.lang.String
  var title: java.lang.String
}

object Expr {
  @scala.inline
  def apply(
    description: java.lang.String,
    expression: java.lang.String,
    location: java.lang.String,
    title: java.lang.String
  ): Expr = {
    val __obj = js.Dynamic.literal(description = description, expression = expression, location = location, title = title)
  
    __obj.asInstanceOf[Expr]
  }
}

