package typings.ejWebAll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueFunction extends js.Object {
  def valueFunction(`val`: String): js.Any
}

object ValueFunction {
  @scala.inline
  def apply(valueFunction: String => js.Any): ValueFunction = {
    val __obj = js.Dynamic.literal(valueFunction = js.Any.fromFunction1(valueFunction))
    __obj.asInstanceOf[ValueFunction]
  }
}

