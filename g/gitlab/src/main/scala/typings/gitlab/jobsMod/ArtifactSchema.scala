package typings.gitlab.jobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactSchema extends js.Object {
  var file_format: js.UndefOr[String] = js.undefined
  var file_type: String
  var filename: String
  var size: Double
}

object ArtifactSchema {
  @scala.inline
  def apply(file_type: String, filename: String, size: Double, file_format: String = null): ArtifactSchema = {
    val __obj = js.Dynamic.literal(file_type = file_type.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (file_format != null) __obj.updateDynamic("file_format")(file_format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSchema]
  }
}

