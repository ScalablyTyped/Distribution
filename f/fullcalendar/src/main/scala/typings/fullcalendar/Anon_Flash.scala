package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flash extends js.Object {
  def flash(): Unit
  def teardown(): Unit
}

object Anon_Flash {
  @scala.inline
  def apply(flash: () => Unit, teardown: () => Unit): Anon_Flash = {
    val __obj = js.Dynamic.literal(flash = js.Any.fromFunction0(flash), teardown = js.Any.fromFunction0(teardown))
  
    __obj.asInstanceOf[Anon_Flash]
  }
}

