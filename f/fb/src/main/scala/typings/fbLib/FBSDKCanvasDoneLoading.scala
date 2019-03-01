package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FBSDKCanvasDoneLoading extends js.Object {
  var time_delta_ms: stdLib.Number
}

object FBSDKCanvasDoneLoading {
  @scala.inline
  def apply(time_delta_ms: stdLib.Number): FBSDKCanvasDoneLoading = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("time_delta_ms")(time_delta_ms)
    __obj.asInstanceOf[FBSDKCanvasDoneLoading]
  }
}

