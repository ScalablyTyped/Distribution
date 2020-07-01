package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTimestamp extends js.Object {
  var nanos: js.UndefOr[Double] = js.native
  var seconds: js.UndefOr[String] = js.native
}

object SchemaTimestamp {
  @scala.inline
  def apply(nanos: js.UndefOr[Double] = js.undefined, seconds: String = null): SchemaTimestamp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nanos)) __obj.updateDynamic("nanos")(nanos.get.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTimestamp]
  }
}

