package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadThumbnailCallback extends js.Object {
  def apply(err: ApiError, imageData: java.lang.String, stat: dropboxjsLib.DropboxNs.FileNs.Stat): scala.Unit = js.native
  def apply(err: ApiError, imageData: stdLib.Blob, stat: dropboxjsLib.DropboxNs.FileNs.Stat): scala.Unit = js.native
}

