package typings
package fpDashTsLib.libOrdMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var Ord: fpDashTsLib.libOrdMod.Ord[A]
}

object URItoKind {
  @scala.inline
  def apply[A](Ord: fpDashTsLib.libOrdMod.Ord[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(Ord = Ord)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

