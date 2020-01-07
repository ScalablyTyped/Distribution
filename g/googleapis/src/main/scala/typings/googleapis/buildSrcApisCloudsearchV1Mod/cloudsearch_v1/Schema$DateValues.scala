package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of date values.
  */
@js.native
trait Schema$DateValues extends js.Object {
  var values: js.UndefOr[js.Array[Schema$Date]] = js.native
}

object Schema$DateValues {
  @scala.inline
  def apply(values: js.Array[Schema$Date] = null): Schema$DateValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DateValues]
  }
}

