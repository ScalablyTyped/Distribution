package typings
package goLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Random extends js.Object {
  def random(): scala.Double
}

object Anon_Random {
  @scala.inline
  def apply(random: () => scala.Double): Anon_Random = {
    val __obj = js.Dynamic.literal(random = js.Any.fromFunction0(random))
  
    __obj.asInstanceOf[Anon_Random]
  }
}

