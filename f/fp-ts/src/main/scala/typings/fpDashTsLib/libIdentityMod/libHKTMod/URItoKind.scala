package typings
package fpDashTsLib.libIdentityMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var Identity: fpDashTsLib.libIdentityMod.Identity[A]
}

object URItoKind {
  @scala.inline
  def apply[A](Identity: fpDashTsLib.libIdentityMod.Identity[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(Identity = Identity)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

