package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for StepService.PublishXunitXmlFiles.
  */
@js.native
trait Schema$PublishXunitXmlFilesRequest extends js.Object {
  /**
    * URI of the Xunit XML files to publish.  The maximum size of the file this
    * reference is pointing to is 50MB.  Required.
    */
  var xunitXmlFiles: js.UndefOr[js.Array[Schema$FileReference]] = js.native
}

object Schema$PublishXunitXmlFilesRequest {
  @scala.inline
  def apply(xunitXmlFiles: js.Array[Schema$FileReference] = null): Schema$PublishXunitXmlFilesRequest = {
    val __obj = js.Dynamic.literal()
    if (xunitXmlFiles != null) __obj.updateDynamic("xunitXmlFiles")(xunitXmlFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PublishXunitXmlFilesRequest]
  }
}

