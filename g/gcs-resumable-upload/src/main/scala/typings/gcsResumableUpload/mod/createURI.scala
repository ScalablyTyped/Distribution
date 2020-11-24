package typings.gcsResumableUpload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gcs-resumable-upload", "createURI")
@js.native
object createURI extends js.Object {
  
  def apply(cfg: UploadConfig): js.Promise[String] = js.native
  def apply(cfg: UploadConfig, callback: CreateUriCallback): Unit = js.native
}
