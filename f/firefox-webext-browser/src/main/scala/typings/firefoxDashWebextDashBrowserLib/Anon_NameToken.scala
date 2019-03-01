package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameToken extends js.Object {
  var name: java.lang.String
  var token: js.UndefOr[Anon_FWVersion] = js.undefined
}

object Anon_NameToken {
  @scala.inline
  def apply(name: java.lang.String, token: Anon_FWVersion = null): Anon_NameToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Anon_NameToken]
  }
}

