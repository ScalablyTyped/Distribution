package typings
package fpDashTsLib.libArrayMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  /** phantom property added by `fp-ts` */
  var _A: T
  /** phantom property added by `fp-ts` */
  var _URI: fpDashTsLib.libArrayMod.URI
}

object Array {
  @scala.inline
  def apply[T](_A: T, _URI: fpDashTsLib.libArrayMod.URI): Array[T] = {
    val __obj = js.Dynamic.literal(_A = _A.asInstanceOf[js.Any], _URI = _URI)
  
    __obj.asInstanceOf[Array[T]]
  }
}

