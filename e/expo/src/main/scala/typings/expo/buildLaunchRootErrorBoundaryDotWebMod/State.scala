package typings.expo.buildLaunchRootErrorBoundaryDotWebMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var error: Error | Null
}

object State {
  @scala.inline
  def apply(error: Error = null): State = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

