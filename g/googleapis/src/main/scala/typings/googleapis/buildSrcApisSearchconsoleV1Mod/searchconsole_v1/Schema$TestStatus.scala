package typings.googleapis.buildSrcApisSearchconsoleV1Mod.searchconsole_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Final state of the test, including error details if necessary.
  */
@js.native
trait Schema$TestStatus extends js.Object {
  /**
    * Error details if applicable.
    */
  var details: js.UndefOr[String] = js.native
  /**
    * Status of the test.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$TestStatus {
  @scala.inline
  def apply(details: String = null, status: String = null): Schema$TestStatus = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestStatus]
  }
}

