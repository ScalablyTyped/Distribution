package typings
package fpDashTsLib.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HKT2[URI, L, A] extends HKT[URI, A] {
  val _L: L
}

object HKT2 {
  @scala.inline
  def apply[URI, L, A](_A: A, _L: L, _URI: URI): HKT2[URI, L, A] = {
    val __obj = js.Dynamic.literal(_A = _A.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _URI = _URI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HKT2[URI, L, A]]
  }
}

