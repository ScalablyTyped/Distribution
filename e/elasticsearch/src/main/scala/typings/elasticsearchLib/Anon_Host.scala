package typings
package elasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: java.lang.String
  var password: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Host {
  @scala.inline
  def apply(host: java.lang.String, password: java.lang.String = null, username: java.lang.String = null): Anon_Host = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Host]
  }
}

