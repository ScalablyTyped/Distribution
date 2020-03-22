package typings.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueFunction extends js.Object {
  def valueFunction(`val`: String): js.Any
}

object AnonValueFunction {
  @scala.inline
  def apply(valueFunction: String => js.Any): AnonValueFunction = {
    val __obj = js.Dynamic.literal(valueFunction = js.Any.fromFunction1(valueFunction))
  
    __obj.asInstanceOf[AnonValueFunction]
  }
}

