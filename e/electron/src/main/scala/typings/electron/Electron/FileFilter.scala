package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileFilter extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/file-filter
  var extensions: js.Array[String]
  var name: String
}

object FileFilter {
  @scala.inline
  def apply(extensions: js.Array[String], name: String): FileFilter = {
    val __obj = js.Dynamic.literal(extensions = extensions, name = name)
  
    __obj.asInstanceOf[FileFilter]
  }
}

