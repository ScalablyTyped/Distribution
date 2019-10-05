package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishXunitXmlFilesRequest extends js.Object {
  /**
    * URI of the Xunit XML files to publish.
    *
    * The maximum size of the file this reference is pointing to is 50MB.
    *
    * Required.
    */
  var xunitXmlFiles: js.UndefOr[js.Array[FileReference]] = js.undefined
}

object PublishXunitXmlFilesRequest {
  @scala.inline
  def apply(xunitXmlFiles: js.Array[FileReference] = null): PublishXunitXmlFilesRequest = {
    val __obj = js.Dynamic.literal()
    if (xunitXmlFiles != null) __obj.updateDynamic("xunitXmlFiles")(xunitXmlFiles)
    __obj.asInstanceOf[PublishXunitXmlFilesRequest]
  }
}

