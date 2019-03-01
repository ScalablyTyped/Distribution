package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMapReference extends js.Object {
  var urlMap: js.UndefOr[java.lang.String] = js.undefined
}

object UrlMapReference {
  @scala.inline
  def apply(urlMap: java.lang.String = null): UrlMapReference = {
    val __obj = js.Dynamic.literal()
    if (urlMap != null) __obj.updateDynamic("urlMap")(urlMap)
    __obj.asInstanceOf[UrlMapReference]
  }
}

