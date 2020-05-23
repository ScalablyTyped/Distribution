package typings.docxTemplates

import typings.jszip.mod.JSZip
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates/lib/zip", JSImport.Namespace)
@js.native
object zipMod extends js.Object {
  def zipGetText(zip: JSZip, filename: String): js.Promise[String] | Null = js.native
  def zipLoad(inputFile: ArrayBuffer): js.Promise[JSZip] = js.native
  def zipSave(zip: JSZip): js.Promise[Uint8Array] = js.native
  def zipSetBase64(zip: JSZip, filename: String, data: String): JSZip = js.native
  def zipSetBinary(zip: JSZip, filename: String, data: ArrayBuffer): JSZip = js.native
  def zipSetText(zip: JSZip, filename: String, data: String): JSZip = js.native
}

