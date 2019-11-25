package typings.fb

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FBSDKCanvasDoneLoading extends js.Object {
  var time_delta_ms: Number
}

object FBSDKCanvasDoneLoading {
  @scala.inline
  def apply(time_delta_ms: Number): FBSDKCanvasDoneLoading = {
    val __obj = js.Dynamic.literal(time_delta_ms = time_delta_ms.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FBSDKCanvasDoneLoading]
  }
}

