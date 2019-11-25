package typings.googleDashAuthDashLibrary

import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersUri extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_HeadersUri {
  @scala.inline
  def apply(headers: Headers = null, uri: String = null, url: String = null): Anon_HeadersUri = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersUri]
  }
}

