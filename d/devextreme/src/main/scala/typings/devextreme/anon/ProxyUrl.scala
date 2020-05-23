package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyUrl extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var proxyUrl: js.UndefOr[String] = js.undefined
}

object ProxyUrl {
  @scala.inline
  def apply(fileName: String = null, proxyUrl: String = null): ProxyUrl = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyUrl]
  }
}

