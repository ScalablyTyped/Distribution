package typings.googleapis.anon

import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaErrorProto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors extends js.Object {
  var errors: js.UndefOr[js.Array[SchemaErrorProto]] = js.native
  var index: js.UndefOr[Double] = js.native
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[SchemaErrorProto] = null, index: js.UndefOr[Double] = js.undefined): Errors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

