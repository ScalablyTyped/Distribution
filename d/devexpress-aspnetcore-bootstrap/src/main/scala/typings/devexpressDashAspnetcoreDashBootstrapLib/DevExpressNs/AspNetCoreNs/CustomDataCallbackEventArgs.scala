package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataCallbackEventArgs extends EventArgs {
  var result: java.lang.String
}

object CustomDataCallbackEventArgs {
  @scala.inline
  def apply(result: java.lang.String, sender: Control): CustomDataCallbackEventArgs = {
    val __obj = js.Dynamic.literal(result = result, sender = sender)
  
    __obj.asInstanceOf[CustomDataCallbackEventArgs]
  }
}

