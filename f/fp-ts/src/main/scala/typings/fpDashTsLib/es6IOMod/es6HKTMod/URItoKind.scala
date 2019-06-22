package typings
package fpDashTsLib.es6IOMod.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var IO: fpDashTsLib.es6IOMod.IO[A]
}

object URItoKind {
  @scala.inline
  def apply[A](IO: fpDashTsLib.es6IOMod.IO[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(IO = IO)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

