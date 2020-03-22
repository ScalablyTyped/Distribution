package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProxyUrl extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var proxyUrl: js.UndefOr[String] = js.undefined
}

object AnonProxyUrl {
  @scala.inline
  def apply(fileName: String = null, proxyUrl: String = null): AnonProxyUrl = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProxyUrl]
  }
}

