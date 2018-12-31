package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

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
  var files: js.UndefOr[stdLib.Record[java.lang.String, FileInfo]] = js.undefined
  /** The zip file for this deployment, if this is a zip deployment. */
  var zip: js.UndefOr[ZipInfo] = js.undefined
}

