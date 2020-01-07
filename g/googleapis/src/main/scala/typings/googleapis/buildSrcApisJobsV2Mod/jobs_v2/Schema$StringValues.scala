package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents array of string values.
  */
@js.native
trait Schema$StringValues extends js.Object {
  /**
    * Required.  String values.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Schema$StringValues {
  @scala.inline
  def apply(values: js.Array[String] = null): Schema$StringValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StringValues]
  }
}

