package typings.forkDashTsDashCheckerDashWebpackDashPlugin

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libFilesRegisterMod.DataShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: DataShape
  var mtime: js.UndefOr[Double] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(data: DataShape, mtime: Int | Double = null): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

