package typings.favicons.faviconsMod

import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("favicons", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** You can programmatically access Favicons configuration (icon filenames, HTML, manifest files, etc) with this export */
  val config: Configuration = js.native
  /**
    * Generate favicons
    * @param source Source image(s)
    * @param configuration
    * @param callback
    */
  def apply(source: String | Buffer | js.Array[String]): js.Promise[FavIconResponse] = js.native
  def apply(source: String | Buffer | js.Array[String], callback: Callback): Unit = js.native
  def apply(source: String | Buffer | js.Array[String], configuration: Partial[Configuration]): js.Promise[FavIconResponse] = js.native
  def apply(
    source: String | Buffer | js.Array[String],
    configuration: Partial[Configuration],
    callback: Callback
  ): Unit = js.native
  def stream(): Duplex = js.native
  def stream(configuration: Configuration): Duplex = js.native
}

