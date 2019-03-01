package typings
package diacriticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: java.lang.String
  var chars: java.lang.String
}

object Anon_Base {
  @scala.inline
  def apply(base: java.lang.String, chars: java.lang.String): Anon_Base = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("base")(base)
    __obj.updateDynamic("chars")(chars)
    __obj.asInstanceOf[Anon_Base]
  }
}

