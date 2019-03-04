package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Separated[A, B] extends js.Object {
  val left: A
  val right: B
}

object Separated {
  @scala.inline
  def apply[A, B](left: A, right: B): Separated[A, B] = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Separated[A, B]]
  }
}

