package typings.flowdoc.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileAsset extends js.Object {
  var dirPath: String
  var fileName: String
}

object FileAsset {
  @scala.inline
  def apply(dirPath: String, fileName: String): FileAsset = {
    val __obj = js.Dynamic.literal(dirPath = dirPath, fileName = fileName)
  
    __obj.asInstanceOf[FileAsset]
  }
}

