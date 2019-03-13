package typings
package fileDashTypeLib.fileDashTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-type", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Detect the file type of a `Buffer`/`Uint8Array`. The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
    *
    * @param buffer - It only needs the first `.minimumBytes` bytes. The exception is detection of `docx`, `pptx`, and `xlsx` which potentially requires reading the whole file.
    * @returns An object with the detected file type and MIME type or `null` when there was no match.
    */
  val default: FileTypeModule = js.native
}

