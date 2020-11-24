package typings.electronGet.esmTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElectronDownloadRequest extends js.Object {
  
  /**
    * The type of artifact. For example:
    * * `electron`
    * * `ffmpeg`
    */
  var artifactName: String = js.native
  
  /**
    * The version of Electron associated with the artifact.
    */
  var version: String = js.native
}
object ElectronDownloadRequest {
  
  @scala.inline
  def apply(artifactName: String, version: String): ElectronDownloadRequest = {
    val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElectronDownloadRequest]
  }
  
  @scala.inline
  implicit class ElectronDownloadRequestOps[Self <: ElectronDownloadRequest] (val x: Self) extends AnyVal {
    
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
    def setArtifactName(value: String): Self = this.set("artifactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
