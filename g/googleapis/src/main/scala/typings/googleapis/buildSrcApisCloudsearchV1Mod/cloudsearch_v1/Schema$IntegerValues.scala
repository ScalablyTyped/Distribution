package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of integer values.
  */
@js.native
trait Schema$IntegerValues extends js.Object {
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Schema$IntegerValues {
  @scala.inline
  def apply(values: js.Array[String] = null): Schema$IntegerValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IntegerValues]
  }
}

