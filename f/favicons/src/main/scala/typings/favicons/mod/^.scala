package typings.favicons.mod

import typings.node.Buffer
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("favicons", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(source: String): Unit = js.native
  def apply(source: String, callback: Callback): Unit = js.native
  def apply(source: String, configuration: Partial[Configuration]): Unit = js.native
  def apply(source: String, configuration: Partial[Configuration], callback: Callback): Unit = js.native
  def apply(source: js.Array[String]): Unit = js.native
  def apply(source: js.Array[String], callback: Callback): Unit = js.native
  def apply(source: js.Array[String], configuration: Partial[Configuration]): Unit = js.native
  def apply(source: js.Array[String], configuration: Partial[Configuration], callback: Callback): Unit = js.native
  def apply(source: Buffer): Unit = js.native
  def apply(source: Buffer, callback: Callback): Unit = js.native
  def apply(source: Buffer, configuration: Partial[Configuration]): Unit = js.native
  def apply(source: Buffer, configuration: Partial[Configuration], callback: Callback): Unit = js.native
}

