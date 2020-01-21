package typings.googleCloudStorage.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object DeleteFileOptions {
  @scala.inline
  def apply(userProject: String = null): DeleteFileOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileOptions]
  }
}

