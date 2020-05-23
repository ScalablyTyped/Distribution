package typings.forkTsCheckerWebpackPlugin.anon

import typings.forkTsCheckerWebpackPlugin.filesRegisterMod.DataShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: DataShape
  var mtime: js.UndefOr[Double] = js.undefined
}

object Data {
  @scala.inline
  def apply(data: DataShape, mtime: js.UndefOr[Double] = js.undefined): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(mtime)) __obj.updateDynamic("mtime")(mtime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

