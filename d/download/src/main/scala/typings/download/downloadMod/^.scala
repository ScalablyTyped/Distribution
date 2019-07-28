package typings.download.downloadMod

import typings.node.Buffer
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("download", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(url: String): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
  def apply(url: String, destination: String): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
  def apply(url: String, destination: String, options: DownloadOptions): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
}

