package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedURLOptions extends js.Object {
  /**
    * HTTP request headers.
    *
    * @platform darwin
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Either `json` or `default`, see the Squirrel.Mac README for more information.
    *
    * @platform darwin
    */
  var serverType: js.UndefOr[String] = js.undefined
  var url: String
}

object FeedURLOptions {
  @scala.inline
  def apply(url: String, headers: Record[String, String] = null, serverType: String = null): FeedURLOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedURLOptions]
  }
}

