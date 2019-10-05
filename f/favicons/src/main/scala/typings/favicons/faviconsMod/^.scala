package typings.favicons.faviconsMod

import typings.node.Buffer
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("favicons", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Generate favicons
    * @param source Source image(s)
    * @param configuration
    * @param callback
    */
  def apply(source: String): js.Promise[FavIconResponse] = js.native
  def apply(source: String, callback: Callback): Unit = js.native
  def apply(source: String, configuration: Partial[Configuration]): js.Promise[FavIconResponse] = js.native
  def apply(source: String, configuration: Partial[Configuration], callback: Callback): Unit = js.native
  def apply(source: js.Array[String]): js.Promise[FavIconResponse] = js.native
  def apply(source: js.Array[String], callback: Callback): Unit = js.native
  def apply(source: js.Array[String], configuration: Partial[Configuration]): js.Promise[FavIconResponse] = js.native
  def apply(source: js.Array[String], configuration: Partial[Configuration], callback: Callback): Unit = js.native
  def apply(source: Buffer): js.Promise[FavIconResponse] = js.native
  def apply(source: Buffer, callback: Callback): Unit = js.native
  def apply(source: Buffer, configuration: Partial[Configuration]): js.Promise[FavIconResponse] = js.native
  def apply(source: Buffer, configuration: Partial[Configuration], callback: Callback): Unit = js.native
}

