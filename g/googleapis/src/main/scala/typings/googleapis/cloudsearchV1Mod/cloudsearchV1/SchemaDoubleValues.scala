package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of double values.
  */
@js.native
trait SchemaDoubleValues extends js.Object {
  var values: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaDoubleValues {
  @scala.inline
  def apply(values: js.Array[Double] = null): SchemaDoubleValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDoubleValues]
  }
}

