package typings
package fpDashTsLib.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HKT4[URI, X, U, L, A] extends HKT3[URI, U, L, A] {
  val _X: X
}

object HKT4 {
  @scala.inline
  def apply[URI, X, U, L, A](_A: A, _L: L, _U: U, _URI: URI, _X: X): HKT4[URI, X, U, L, A] = {
    val __obj = js.Dynamic.literal(_A = _A.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], _URI = _URI.asInstanceOf[js.Any], _X = _X.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HKT4[URI, X, U, L, A]]
  }
}

