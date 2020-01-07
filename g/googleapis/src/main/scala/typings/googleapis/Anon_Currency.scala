package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Currency extends js.Object {
  var currency: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Anon_Currency {
  @scala.inline
  def apply(currency: String = null, name: String = null, `type`: String = null): Anon_Currency = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Currency]
  }
}

