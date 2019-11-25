package typings.gapiDotClientDotAppengine.gapi.client.appengine

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployment extends js.Object {
  /** The Docker image for the container that runs the version. Only applicable for instances running in the App Engine flexible environment. */
  var container: js.UndefOr[ContainerInfo] = js.undefined
  /**
    * Manifest of the files stored in Google Cloud Storage that are included as part of this version. All files must be readable using the credentials
    * supplied with this call.
    */
  var files: js.UndefOr[Record[String, FileInfo]] = js.undefined
  /** The zip file for this deployment, if this is a zip deployment. */
  var zip: js.UndefOr[ZipInfo] = js.undefined
}

object Deployment {
  @scala.inline
  def apply(container: ContainerInfo = null, files: Record[String, FileInfo] = null, zip: ZipInfo = null): Deployment = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (zip != null) __obj.updateDynamic("zip")(zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
}

