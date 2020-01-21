package typings.fsMerger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileMetaOption extends js.Object {
  var basePath: String
}

object FileMetaOption {
  @scala.inline
  def apply(basePath: String): FileMetaOption = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileMetaOption]
  }
}

