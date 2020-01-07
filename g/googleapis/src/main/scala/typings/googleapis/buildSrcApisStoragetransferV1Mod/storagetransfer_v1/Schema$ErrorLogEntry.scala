package typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entry describing an error that has occurred.
  */
@js.native
trait Schema$ErrorLogEntry extends js.Object {
  /**
    * A list of messages that carry the error details.
    */
  var errorDetails: js.UndefOr[js.Array[String]] = js.native
  /**
    * A URL that refers to the target (a data source, a data sink, or an
    * object) with which the error is associated. Required.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$ErrorLogEntry {
  @scala.inline
  def apply(errorDetails: js.Array[String] = null, url: String = null): Schema$ErrorLogEntry = {
    val __obj = js.Dynamic.literal()
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ErrorLogEntry]
  }
}

