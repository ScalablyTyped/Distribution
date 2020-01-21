package typings.googleapis

import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaErrorProto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrors extends js.Object {
  var errors: js.UndefOr[js.Array[SchemaErrorProto]] = js.native
  var index: js.UndefOr[Double] = js.native
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[SchemaErrorProto] = null, index: Int | Double = null): AnonErrors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrors]
  }
}

