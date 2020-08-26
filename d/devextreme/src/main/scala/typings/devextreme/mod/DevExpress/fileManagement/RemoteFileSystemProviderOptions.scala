package typings.devextreme.mod.DevExpress.fileManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteFileSystemProviderOptions extends FileSystemProviderBaseOptions[RemoteFileSystemProvider] {
  /** @name RemoteFileSystemProvider.Options.endpointUrl */
  var endpointUrl: js.UndefOr[String] = js.native
  /** @name RemoteFileSystemProvider.Options.hasSubDirectoriesExpr */
  var hasSubDirectoriesExpr: js.UndefOr[String | js.Function] = js.native
}

object RemoteFileSystemProviderOptions {
  @scala.inline
  def apply(): RemoteFileSystemProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteFileSystemProviderOptions]
  }
  @scala.inline
  implicit class RemoteFileSystemProviderOptionsOps[Self <: RemoteFileSystemProviderOptions] (val x: Self) extends AnyVal {
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
    def setEndpointUrl(value: String): Self = this.set("endpointUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointUrl: Self = this.set("endpointUrl", js.undefined)
    @scala.inline
    def setHasSubDirectoriesExpr(value: String | js.Function): Self = this.set("hasSubDirectoriesExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasSubDirectoriesExpr: Self = this.set("hasSubDirectoriesExpr", js.undefined)
  }
  
}

