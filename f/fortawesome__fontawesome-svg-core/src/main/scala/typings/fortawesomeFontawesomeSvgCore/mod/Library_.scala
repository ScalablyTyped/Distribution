package typings.fortawesomeFontawesomeSvgCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Library_ extends js.Object {
  def add(definitions: IconDefinitionOrPack*): Unit
  def reset(): Unit
}

object Library_ {
  @scala.inline
  def apply(add: /* repeated */ IconDefinitionOrPack => Unit, reset: () => Unit): Library_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Library_]
  }
}

