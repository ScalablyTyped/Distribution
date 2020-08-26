package typings.enhancedResolve.descriptionFileUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadDescriptionFileResult extends js.Object {
  var content: DescriptionFileData = js.native
  var directory: String = js.native
  var path: String = js.native
}

object LoadDescriptionFileResult {
  @scala.inline
  def apply(content: DescriptionFileData, directory: String, path: String): LoadDescriptionFileResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadDescriptionFileResult]
  }
  @scala.inline
  implicit class LoadDescriptionFileResultOps[Self <: LoadDescriptionFileResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: DescriptionFileData): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

