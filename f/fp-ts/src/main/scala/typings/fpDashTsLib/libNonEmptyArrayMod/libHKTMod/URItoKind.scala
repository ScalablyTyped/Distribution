package typings
package fpDashTsLib.libNonEmptyArrayMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var NonEmptyArray: fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]
}

object URItoKind {
  @scala.inline
  def apply[A](NonEmptyArray: fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(NonEmptyArray = NonEmptyArray)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

