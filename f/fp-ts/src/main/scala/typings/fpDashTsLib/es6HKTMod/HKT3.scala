package typings
package fpDashTsLib.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HKT3[URI, U, L, A] extends HKT2[URI, L, A] {
  val _U: U
}

object HKT3 {
  @scala.inline
  def apply[URI, U, L, A](_A: A, _L: L, _U: U, _URI: URI): HKT3[URI, U, L, A] = {
    val __obj = js.Dynamic.literal(_A = _A.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], _URI = _URI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HKT3[URI, U, L, A]]
  }
}

