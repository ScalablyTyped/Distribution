package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Idempotent extends js.Object {
  var idempotent: scala.Boolean
}

object Anon_Idempotent {
  @scala.inline
  def apply(idempotent: scala.Boolean): Anon_Idempotent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("idempotent")(idempotent)
    __obj.asInstanceOf[Anon_Idempotent]
  }
}

