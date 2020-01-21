package typings.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVal extends js.Object {
  def valueFunction(`val`: String): js.Any
}

object AnonVal {
  @scala.inline
  def apply(valueFunction: String => js.Any): AnonVal = {
    val __obj = js.Dynamic.literal(valueFunction = js.Any.fromFunction1(valueFunction))
  
    __obj.asInstanceOf[AnonVal]
  }
}

