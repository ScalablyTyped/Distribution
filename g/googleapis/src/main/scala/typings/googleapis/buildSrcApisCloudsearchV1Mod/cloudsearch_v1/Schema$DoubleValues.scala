package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of double values.
  */
@js.native
trait Schema$DoubleValues extends js.Object {
  var values: js.UndefOr[js.Array[Double]] = js.native
}

object Schema$DoubleValues {
  @scala.inline
  def apply(values: js.Array[Double] = null): Schema$DoubleValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DoubleValues]
  }
}

