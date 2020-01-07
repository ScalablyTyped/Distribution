package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a File connector used by the job.
  */
@js.native
trait Schema$FileIODetails extends js.Object {
  /**
    * File Pattern used to access files by the connector.
    */
  var filePattern: js.UndefOr[String] = js.native
}

object Schema$FileIODetails {
  @scala.inline
  def apply(filePattern: String = null): Schema$FileIODetails = {
    val __obj = js.Dynamic.literal()
    if (filePattern != null) __obj.updateDynamic("filePattern")(filePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FileIODetails]
  }
}

