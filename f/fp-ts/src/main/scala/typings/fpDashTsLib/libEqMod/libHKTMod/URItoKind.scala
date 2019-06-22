package typings
package fpDashTsLib.libEqMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var Eq: fpDashTsLib.libEqMod.Eq[A]
}

object URItoKind {
  @scala.inline
  def apply[A](Eq: fpDashTsLib.libEqMod.Eq[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(Eq = Eq)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

