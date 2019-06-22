package typings
package fpDashTsLib.libTreeMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var Tree: fpDashTsLib.libTreeMod.Tree[A]
}

object URItoKind {
  @scala.inline
  def apply[A](Tree: fpDashTsLib.libTreeMod.Tree[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(Tree = Tree)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

