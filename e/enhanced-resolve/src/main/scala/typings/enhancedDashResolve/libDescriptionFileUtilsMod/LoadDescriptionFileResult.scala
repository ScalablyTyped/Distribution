package typings.enhancedDashResolve.libDescriptionFileUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadDescriptionFileResult extends js.Object {
  var content: DescriptionFileData
  var directory: String
  var path: String
}

object LoadDescriptionFileResult {
  @scala.inline
  def apply(content: DescriptionFileData, directory: String, path: String): LoadDescriptionFileResult = {
    val __obj = js.Dynamic.literal(content = content, directory = directory, path = path)
  
    __obj.asInstanceOf[LoadDescriptionFileResult]
  }
}

