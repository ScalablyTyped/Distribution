package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataCallbackEventArgs extends EventArgs {
  var result: String
}

object CustomDataCallbackEventArgs {
  @scala.inline
  def apply(result: String, sender: Control): CustomDataCallbackEventArgs = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDataCallbackEventArgs]
  }
}

