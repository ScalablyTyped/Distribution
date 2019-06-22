package typings
package fpDashTsLib.libFreeMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind2[L, A] extends js.Object {
  var Free: fpDashTsLib.libFreeMod.Free[L, A]
}

object URItoKind2 {
  @scala.inline
  def apply[L, A](Free: fpDashTsLib.libFreeMod.Free[L, A]): URItoKind2[L, A] = {
    val __obj = js.Dynamic.literal(Free = Free.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[URItoKind2[L, A]]
  }
}

