package typings
package gcsDashResumableDashUploadLib.gcsDashResumableDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gcs-resumable-upload", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createURI(cfg: gcsDashResumableDashUploadLib.gcsDashResumableDashUploadMod.UploadConfig): js.Promise[java.lang.String] = js.native
  def createURI(
    cfg: gcsDashResumableDashUploadLib.gcsDashResumableDashUploadMod.UploadConfig,
    callback: gcsDashResumableDashUploadLib.gcsDashResumableDashUploadMod.CreateUriCallback
  ): scala.Unit = js.native
  def upload(cfg: gcsDashResumableDashUploadLib.gcsDashResumableDashUploadMod.UploadConfig): gcsDashResumableDashUploadLib.gcsDashResumableDashUploadMod.Upload = js.native
}

