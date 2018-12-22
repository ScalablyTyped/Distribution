package typings
package downloadjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("downloadjs", JSImport.Namespace)
@js.native
object downloadjsMod extends js.Object {
  def apply(data: java.lang.String | stdLib.File | stdLib.Blob): stdLib.XMLHttpRequest | scala.Boolean = js.native
  def apply(data: java.lang.String | stdLib.File | stdLib.Blob, filename: java.lang.String): stdLib.XMLHttpRequest | scala.Boolean = js.native
  def apply(
    data: java.lang.String | stdLib.File | stdLib.Blob,
    filename: java.lang.String,
    mimeType: java.lang.String
  ): stdLib.XMLHttpRequest | scala.Boolean = js.native
}

