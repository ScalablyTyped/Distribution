package typings.discordDashRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: Double
  var name: String
  var `type`: Double
}

object Anon_Code {
  @scala.inline
  def apply(code: Double, name: String, `type`: Double): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Code]
  }
}

