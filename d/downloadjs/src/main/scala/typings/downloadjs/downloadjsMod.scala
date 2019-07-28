package typings.downloadjs

import typings.std.Blob
import typings.std.File
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("downloadjs", JSImport.Namespace)
@js.native
object downloadjsMod extends js.Object {
  def apply(data: String | File | Blob): XMLHttpRequest | Boolean = js.native
  def apply(data: String | File | Blob, filename: String): XMLHttpRequest | Boolean = js.native
  def apply(data: String | File | Blob, filename: String, mimeType: String): XMLHttpRequest | Boolean = js.native
}

