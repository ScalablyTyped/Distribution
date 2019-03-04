package typings
package electronLib.ElectronNs

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
  var serverType: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object FeedURLOptions {
  @scala.inline
  def apply(url: java.lang.String, headers: Headers = null, serverType: java.lang.String = null): FeedURLOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (serverType != null) __obj.updateDynamic("serverType")(serverType)
    __obj.asInstanceOf[FeedURLOptions]
  }
}

