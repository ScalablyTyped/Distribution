package typings
package fpDashTsLib.es6EqMod.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var Eq: fpDashTsLib.es6EqMod.Eq[A]
}

object URItoKind {
  @scala.inline
  def apply[A](Eq: fpDashTsLib.es6EqMod.Eq[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(Eq = Eq)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

