package typings
package fpDashTsLib.libNonEmptyArrayMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var NonEmptyArray: fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](NonEmptyArray: fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]): URI2HKT[A] = {
    val __obj = js.Dynamic.literal(NonEmptyArray = NonEmptyArray)
  
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

