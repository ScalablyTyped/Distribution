package typings
package fileDashTypeLib.fileDashTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-type", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * The minimum amount of bytes needed to detect a file type. Currently,
    * it's 4100 bytes, but it can change, so don't hard-code it.
    */
  val minimumBytes: scala.Double = js.native
  /**
    * The file type is detected by checking the
    * [magic number](http://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
    *
    * @param buf It only needs the first `.minimumBytes` bytes. The exception is detection of
    *            `docx`, `pptx`, and `xlsx` which potentially requires reading the whole file.
    * @returns an Object with:
    * - ext - One of the [supported file types](https://github.com/sindresorhus/file-type/blob/master/readme.md#supported-file-types)
    * - mime - The [MIME type](http://en.wikipedia.org/wiki/Internet_media_type)
    */
  def apply(buf: nodeLib.Buffer | stdLib.Uint8Array): fileDashTypeLib.fileDashTypeMod.FileTypeNs.FileTypeResult | scala.Null = js.native
}

