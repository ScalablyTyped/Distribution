package typings
package enhancedDashResolveLib.libDescriptionFileUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadDescriptionFileResult extends js.Object {
  var content: DescriptionFileData
  var directory: java.lang.String
  var path: java.lang.String
}

object LoadDescriptionFileResult {
  @scala.inline
  def apply(content: DescriptionFileData, directory: java.lang.String, path: java.lang.String): LoadDescriptionFileResult = {
    val __obj = js.Dynamic.literal(content = content, directory = directory, path = path)
  
    __obj.asInstanceOf[LoadDescriptionFileResult]
  }
}

