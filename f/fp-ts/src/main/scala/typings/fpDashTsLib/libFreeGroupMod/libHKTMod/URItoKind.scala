package typings
package fpDashTsLib.libFreeGroupMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var FreeGroup: fpDashTsLib.libFreeGroupMod.FreeGroup[A]
}

object URItoKind {
  @scala.inline
  def apply[A](FreeGroup: fpDashTsLib.libFreeGroupMod.FreeGroup[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(FreeGroup = FreeGroup)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

