package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An explanation of a report failure.
  */
@js.native
trait Schema$ReportFailure extends js.Object {
  /**
    * Error code that shows why the report was not created.
    */
  var errorCode: js.UndefOr[String] = js.native
}

object Schema$ReportFailure {
  @scala.inline
  def apply(errorCode: String = null): Schema$ReportFailure = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReportFailure]
  }
}

