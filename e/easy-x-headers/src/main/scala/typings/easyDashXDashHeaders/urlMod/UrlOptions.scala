package typings.easyDashXDashHeaders.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlOptions extends js.Object {
  var auth: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var pathname: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[js.Any] = js.undefined
  var search: js.UndefOr[String] = js.undefined
}

object UrlOptions {
  @scala.inline
  def apply(
    auth: String = null,
    hash: String = null,
    host: String = null,
    hostname: String = null,
    path: String = null,
    pathname: String = null,
    port: String = null,
    protocol: String = null,
    query: js.Any = null,
    search: String = null
  ): UrlOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    if (port != null) __obj.updateDynamic("port")(port)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (query != null) __obj.updateDynamic("query")(query)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[UrlOptions]
  }
}

