package typings.gapiClientAppengine.gapi.client.appengine

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployment extends js.Object {
  /** The Docker image for the container that runs the version. Only applicable for instances running in the App Engine flexible environment. */
  var container: js.UndefOr[ContainerInfo] = js.native
  /**
    * Manifest of the files stored in Google Cloud Storage that are included as part of this version. All files must be readable using the credentials
    * supplied with this call.
    */
  var files: js.UndefOr[Record[String, FileInfo]] = js.native
  /** The zip file for this deployment, if this is a zip deployment. */
  var zip: js.UndefOr[ZipInfo] = js.native
}

object Deployment {
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  @scala.inline
  implicit class DeploymentOps[Self <: Deployment] (val x: Self) extends AnyVal {
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
    def setContainer(value: ContainerInfo): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setFiles(value: Record[String, FileInfo]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setZip(value: ZipInfo): Self = this.set("zip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZip: Self = this.set("zip", js.undefined)
  }
  
}

