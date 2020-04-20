package typings.enhancedResolve.descriptionFileUtilsMod

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
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadDescriptionFileResult]
  }
}

