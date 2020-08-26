package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishXunitXmlFilesRequest extends js.Object {
  /**
    * URI of the Xunit XML files to publish.
    *
    * The maximum size of the file this reference is pointing to is 50MB.
    *
    * Required.
    */
  var xunitXmlFiles: js.UndefOr[js.Array[FileReference]] = js.native
}

object PublishXunitXmlFilesRequest {
  @scala.inline
  def apply(): PublishXunitXmlFilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishXunitXmlFilesRequest]
  }
  @scala.inline
  implicit class PublishXunitXmlFilesRequestOps[Self <: PublishXunitXmlFilesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setXunitXmlFilesVarargs(value: FileReference*): Self = this.set("xunitXmlFiles", js.Array(value :_*))
    @scala.inline
    def setXunitXmlFiles(value: js.Array[FileReference]): Self = this.set("xunitXmlFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXunitXmlFiles: Self = this.set("xunitXmlFiles", js.undefined)
  }
  
}

