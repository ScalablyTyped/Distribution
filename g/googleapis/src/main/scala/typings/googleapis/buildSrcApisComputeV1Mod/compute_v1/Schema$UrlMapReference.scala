package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$UrlMapReference extends js.Object {
  var urlMap: js.UndefOr[String] = js.native
}

object Schema$UrlMapReference {
  @scala.inline
  def apply(urlMap: String = null): Schema$UrlMapReference = {
    val __obj = js.Dynamic.literal()
    if (urlMap != null) __obj.updateDynamic("urlMap")(urlMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UrlMapReference]
  }
}

