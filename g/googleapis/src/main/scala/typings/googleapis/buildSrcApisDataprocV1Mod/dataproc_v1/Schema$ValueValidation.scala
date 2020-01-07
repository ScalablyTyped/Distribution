package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Validation based on a list of allowed values.
  */
@js.native
trait Schema$ValueValidation extends js.Object {
  /**
    * Required. List of allowed values for the parameter.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ValueValidation {
  @scala.inline
  def apply(values: js.Array[String] = null): Schema$ValueValidation = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ValueValidation]
  }
}

