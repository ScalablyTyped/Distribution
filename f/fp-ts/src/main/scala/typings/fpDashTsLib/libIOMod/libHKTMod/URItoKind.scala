package typings
package fpDashTsLib.libIOMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var IO: fpDashTsLib.libIOMod.IO[A]
}

object URItoKind {
  @scala.inline
  def apply[A](IO: fpDashTsLib.libIOMod.IO[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(IO = IO)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

