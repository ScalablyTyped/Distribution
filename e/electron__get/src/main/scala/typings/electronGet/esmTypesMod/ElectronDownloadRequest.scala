package typings.electronGet.esmTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectronDownloadRequest extends js.Object {
  /**
    * The type of artifact. For example:
    * * `electron`
    * * `ffmpeg`
    */
  var artifactName: String
  /**
    * The version of Electron associated with the artifact.
    */
  var version: String
}

object ElectronDownloadRequest {
  @scala.inline
  def apply(artifactName: String, version: String): ElectronDownloadRequest = {
    val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElectronDownloadRequest]
  }
}

