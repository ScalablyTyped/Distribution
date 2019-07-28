package typings.atGoogleDashCloudStorage.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeFilePrivateOptions extends js.Object {
  var strict: js.UndefOr[Boolean] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object MakeFilePrivateOptions {
  @scala.inline
  def apply(strict: js.UndefOr[Boolean] = js.undefined, userProject: String = null): MakeFilePrivateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[MakeFilePrivateOptions]
  }
}

