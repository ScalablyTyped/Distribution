package typings
package fpDashTsLib.libPairMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var Pair: fpDashTsLib.libPairMod.Pair[A]
}

object URItoKind {
  @scala.inline
  def apply[A](Pair: fpDashTsLib.libPairMod.Pair[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(Pair = Pair)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

