package typings
package firstDashMateLib.firstDashMateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrammarToken extends js.Object {
  var scopes: js.Array[java.lang.String]
  var value: java.lang.String
}

object GrammarToken {
  @scala.inline
  def apply(scopes: js.Array[java.lang.String], value: java.lang.String): GrammarToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scopes")(scopes)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GrammarToken]
  }
}

