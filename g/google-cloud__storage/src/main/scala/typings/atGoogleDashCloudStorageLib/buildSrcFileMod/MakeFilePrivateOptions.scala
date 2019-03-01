package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeFilePrivateOptions extends js.Object {
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object MakeFilePrivateOptions {
  @scala.inline
  def apply(strict: js.UndefOr[scala.Boolean] = js.undefined, userProject: java.lang.String = null): MakeFilePrivateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[MakeFilePrivateOptions]
  }
}

