package typings
package fpDashTsLib.libStrMapMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var StrMap: fpDashTsLib.libStrMapMod.StrMap[A]
}

object URItoKind {
  @scala.inline
  def apply[A](StrMap: fpDashTsLib.libStrMapMod.StrMap[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(StrMap = StrMap)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

