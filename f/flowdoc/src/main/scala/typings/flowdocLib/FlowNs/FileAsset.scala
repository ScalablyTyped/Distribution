package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileAsset extends js.Object {
  var dirPath: java.lang.String
  var fileName: java.lang.String
}

object FileAsset {
  @scala.inline
  def apply(dirPath: java.lang.String, fileName: java.lang.String): FileAsset = {
    val __obj = js.Dynamic.literal(dirPath = dirPath, fileName = fileName)
  
    __obj.asInstanceOf[FileAsset]
  }
}

