package typings
package gcsDashResumableDashUploadLib.gcsDashResumableDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gcs-resumable-upload", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createURI(cfg: UploadConfig): js.Promise[java.lang.String] = js.native
  def createURI(cfg: UploadConfig, callback: CreateUriCallback): scala.Unit = js.native
  def upload(cfg: UploadConfig): Upload = js.native
}

