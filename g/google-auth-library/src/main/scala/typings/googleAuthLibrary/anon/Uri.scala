package typings.googleAuthLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uri extends js.Object {
  var headers: js.UndefOr[typings.googleAuthLibrary.oauth2clientMod.Headers] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Uri {
  @scala.inline
  def apply(
    headers: typings.googleAuthLibrary.oauth2clientMod.Headers = null,
    uri: String = null,
    url: String = null
  ): Uri = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
}

