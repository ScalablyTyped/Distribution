package typings
package fpDashTsLib.es6IOMod.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var IO: fpDashTsLib.es6IOMod.IO[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](IO: fpDashTsLib.es6IOMod.IO[A]): URI2HKT[A] = {
    val __obj = js.Dynamic.literal(IO = IO)
  
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

