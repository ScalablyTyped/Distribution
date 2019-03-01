package typings
package googleDashAuthDashLibraryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: js.UndefOr[googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.Headers] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Headers {
  @scala.inline
  def apply(
    headers: googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.Headers = null,
    uri: java.lang.String = null,
    url: java.lang.String = null
  ): Anon_Headers = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Headers]
  }
}

