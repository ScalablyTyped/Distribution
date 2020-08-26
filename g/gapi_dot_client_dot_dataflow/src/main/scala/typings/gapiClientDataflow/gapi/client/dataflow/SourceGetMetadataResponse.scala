package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceGetMetadataResponse extends js.Object {
  /** The computed metadata. */
  var metadata: js.UndefOr[SourceMetadata] = js.native
}

object SourceGetMetadataResponse {
  @scala.inline
  def apply(): SourceGetMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceGetMetadataResponse]
  }
  @scala.inline
  implicit class SourceGetMetadataResponseOps[Self <: SourceGetMetadataResponse] (val x: Self) extends AnyVal {
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
    def setMetadata(value: SourceMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

