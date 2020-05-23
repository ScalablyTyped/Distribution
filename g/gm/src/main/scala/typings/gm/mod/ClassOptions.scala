package typings.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassOptions extends js.Object {
  var appPath: js.UndefOr[String] = js.undefined
  var imageMagick: js.UndefOr[Boolean] = js.undefined
  var nativeAutoOrient: js.UndefOr[Boolean] = js.undefined
}

object ClassOptions {
  @scala.inline
  def apply(
    appPath: String = null,
    imageMagick: js.UndefOr[Boolean] = js.undefined,
    nativeAutoOrient: js.UndefOr[Boolean] = js.undefined
  ): ClassOptions = {
    val __obj = js.Dynamic.literal()
    if (appPath != null) __obj.updateDynamic("appPath")(appPath.asInstanceOf[js.Any])
    if (!js.isUndefined(imageMagick)) __obj.updateDynamic("imageMagick")(imageMagick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeAutoOrient)) __obj.updateDynamic("nativeAutoOrient")(nativeAutoOrient.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassOptions]
  }
}

