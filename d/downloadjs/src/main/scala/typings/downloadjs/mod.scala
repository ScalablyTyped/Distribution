package typings.downloadjs

import typings.std.Blob
import typings.std.File
import typings.std.Uint8Array
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("downloadjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(data: String): XMLHttpRequest | Boolean = js.native
  def apply(data: String, filename: js.UndefOr[scala.Nothing], mimeType: String): XMLHttpRequest | Boolean = js.native
  def apply(data: String, filename: String): XMLHttpRequest | Boolean = js.native
  def apply(data: String, filename: String, mimeType: String): XMLHttpRequest | Boolean = js.native
  def apply(data: Blob): XMLHttpRequest | Boolean = js.native
  def apply(data: Blob, filename: js.UndefOr[scala.Nothing], mimeType: String): XMLHttpRequest | Boolean = js.native
  def apply(data: Blob, filename: String): XMLHttpRequest | Boolean = js.native
  def apply(data: Blob, filename: String, mimeType: String): XMLHttpRequest | Boolean = js.native
  def apply(data: File): XMLHttpRequest | Boolean = js.native
  def apply(data: File, filename: js.UndefOr[scala.Nothing], mimeType: String): XMLHttpRequest | Boolean = js.native
  def apply(data: File, filename: String): XMLHttpRequest | Boolean = js.native
  def apply(data: File, filename: String, mimeType: String): XMLHttpRequest | Boolean = js.native
  def apply(data: Uint8Array): XMLHttpRequest | Boolean = js.native
  def apply(data: Uint8Array, filename: js.UndefOr[scala.Nothing], mimeType: String): XMLHttpRequest | Boolean = js.native
  def apply(data: Uint8Array, filename: String): XMLHttpRequest | Boolean = js.native
  def apply(data: Uint8Array, filename: String, mimeType: String): XMLHttpRequest | Boolean = js.native
}

