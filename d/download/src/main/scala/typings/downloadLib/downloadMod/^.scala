package typings
package downloadLib.downloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("download", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(url: java.lang.String): js.Promise[nodeLib.Buffer] with nodeLib.NodeJSNs.WritableStream with nodeLib.NodeJSNs.ReadableStream = js.native
  def apply(url: java.lang.String, destination: java.lang.String): js.Promise[nodeLib.Buffer] with nodeLib.NodeJSNs.WritableStream with nodeLib.NodeJSNs.ReadableStream = js.native
  def apply(
    url: java.lang.String,
    destination: java.lang.String,
    options: downloadLib.downloadMod.downloadNs.DownloadOptions
  ): js.Promise[nodeLib.Buffer] with nodeLib.NodeJSNs.WritableStream with nodeLib.NodeJSNs.ReadableStream = js.native
}

