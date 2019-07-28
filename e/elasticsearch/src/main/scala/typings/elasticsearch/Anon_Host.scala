package typings.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: String
  var password: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Anon_Host {
  @scala.inline
  def apply(host: String, password: String = null, username: String = null): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Host]
  }
}

