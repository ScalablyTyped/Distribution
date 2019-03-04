package typings
package fullcalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flash extends js.Object {
  def flash(): scala.Unit
  def teardown(): scala.Unit
}

object Anon_Flash {
  @scala.inline
  def apply(flash: js.Function0[scala.Unit], teardown: js.Function0[scala.Unit]): Anon_Flash = {
    val __obj = js.Dynamic.literal(flash = flash, teardown = teardown)
  
    __obj.asInstanceOf[Anon_Flash]
  }
}

