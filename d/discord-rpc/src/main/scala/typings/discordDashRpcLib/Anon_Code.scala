package typings
package discordDashRpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: scala.Double
  var name: java.lang.String
  var `type`: scala.Double
}

object Anon_Code {
  @scala.inline
  def apply(code: scala.Double, name: java.lang.String, `type`: scala.Double): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Code]
  }
}

