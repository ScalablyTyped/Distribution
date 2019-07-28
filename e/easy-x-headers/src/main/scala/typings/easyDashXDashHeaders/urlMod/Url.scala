package typings.easyDashXDashHeaders.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  var auth: String
  var hash: js.UndefOr[String] = js.undefined
  var host: String
  var hostname: String
  var href: String
  var path: js.UndefOr[String] = js.undefined
  var pathname: String
  var port: String
  var protocol: String
  var query: js.Any
  var search: String
   // string | Object
  var slashes: Boolean
}

object Url {
  @scala.inline
  def apply(
    auth: String,
    host: String,
    hostname: String,
    href: String,
    pathname: String,
    port: String,
    protocol: String,
    query: js.Any,
    search: String,
    slashes: Boolean,
    hash: String = null,
    path: String = null
  ): Url = {
    val __obj = js.Dynamic.literal(auth = auth, host = host, hostname = hostname, href = href, pathname = pathname, port = port, protocol = protocol, query = query, search = search, slashes = slashes)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Url]
  }
}

