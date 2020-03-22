package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePathWithHeaders extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/file-path-with-headers
  /**
    * Additional headers to be sent.
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * The path to the file to send.
    */
  var path: String
}

object FilePathWithHeaders {
  @scala.inline
  def apply(path: String, headers: Record[String, String] = null): FilePathWithHeaders = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePathWithHeaders]
  }
}

