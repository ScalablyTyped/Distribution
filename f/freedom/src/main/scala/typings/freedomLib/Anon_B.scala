package typings
package freedomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_B extends js.Object {
  def removeEventListener(s: java.lang.String, f: js.Function, b: scala.Boolean): scala.Unit
}

object Anon_B {
  @scala.inline
  def apply(removeEventListener: (java.lang.String, js.Function, scala.Boolean) => scala.Unit): Anon_B = {
    val __obj = js.Dynamic.literal(removeEventListener = js.Any.fromFunction3(removeEventListener))
  
    __obj.asInstanceOf[Anon_B]
  }
}

