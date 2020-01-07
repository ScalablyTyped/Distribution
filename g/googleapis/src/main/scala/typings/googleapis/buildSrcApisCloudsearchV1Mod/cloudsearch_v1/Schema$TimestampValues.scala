package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of timestamp values.
  */
@js.native
trait Schema$TimestampValues extends js.Object {
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Schema$TimestampValues {
  @scala.inline
  def apply(values: js.Array[String] = null): Schema$TimestampValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimestampValues]
  }
}

