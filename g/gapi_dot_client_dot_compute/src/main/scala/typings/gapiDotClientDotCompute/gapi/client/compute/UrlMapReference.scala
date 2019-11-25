package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMapReference extends js.Object {
  var urlMap: js.UndefOr[String] = js.undefined
}

object UrlMapReference {
  @scala.inline
  def apply(urlMap: String = null): UrlMapReference = {
    val __obj = js.Dynamic.literal()
    if (urlMap != null) __obj.updateDynamic("urlMap")(urlMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlMapReference]
  }
}

