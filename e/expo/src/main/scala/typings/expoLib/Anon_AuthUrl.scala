package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthUrl extends js.Object {
  var authUrl: java.lang.String
  var returnUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AuthUrl {
  @scala.inline
  def apply(authUrl: java.lang.String, returnUrl: java.lang.String = null): Anon_AuthUrl = {
    val __obj = js.Dynamic.literal(authUrl = authUrl)
    if (returnUrl != null) __obj.updateDynamic("returnUrl")(returnUrl)
    __obj.asInstanceOf[Anon_AuthUrl]
  }
}

