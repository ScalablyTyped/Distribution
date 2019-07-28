package typings.ejDotWebDotAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Val extends js.Object {
  def valueFunction(`val`: String): js.Any
}

object Anon_Val {
  @scala.inline
  def apply(valueFunction: String => js.Any): Anon_Val = {
    val __obj = js.Dynamic.literal(valueFunction = js.Any.fromFunction1(valueFunction))
  
    __obj.asInstanceOf[Anon_Val]
  }
}

