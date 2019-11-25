package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedURLOptions extends js.Object {
  /**
    * HTTP request headers.
    */
  var headers: js.UndefOr[Headers] = js.undefined
  /**
    * Either json or default, see the README for more information.
    */
  var serverType: js.UndefOr[String] = js.undefined
  var url: String
}

object FeedURLOptions {
  @scala.inline
  def apply(url: String, headers: Headers = null, serverType: String = null): FeedURLOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedURLOptions]
  }
}

