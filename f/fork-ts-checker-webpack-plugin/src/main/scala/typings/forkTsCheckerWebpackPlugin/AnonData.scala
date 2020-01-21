package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.filesRegisterMod.DataShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: DataShape
  var mtime: js.UndefOr[Double] = js.undefined
}

object AnonData {
  @scala.inline
  def apply(data: DataShape, mtime: Int | Double = null): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

