package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaximumQps extends js.Object {
  var maximumQps: js.UndefOr[Double] = js.native
  var region: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object MaximumQps {
  @scala.inline
  def apply(maximumQps: js.UndefOr[Double] = js.undefined, region: String = null, url: String = null): MaximumQps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maximumQps)) __obj.updateDynamic("maximumQps")(maximumQps.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumQps]
  }
}

