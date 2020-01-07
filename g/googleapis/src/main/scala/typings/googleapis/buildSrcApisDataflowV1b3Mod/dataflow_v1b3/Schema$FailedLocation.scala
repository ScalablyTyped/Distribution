package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates which [regional endpoint]
  * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) failed
  * to respond to a request for data.
  */
@js.native
trait Schema$FailedLocation extends js.Object {
  /**
    * The name of the [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * failed to respond.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$FailedLocation {
  @scala.inline
  def apply(name: String = null): Schema$FailedLocation = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FailedLocation]
  }
}

