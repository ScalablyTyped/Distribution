package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlTextChangedEventArgs extends EventArgs {
  val inputIndex: scala.Double
}

object UploadControlTextChangedEventArgs {
  @scala.inline
  def apply(inputIndex: scala.Double, sender: Control): UploadControlTextChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inputIndex")(inputIndex)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[UploadControlTextChangedEventArgs]
  }
}

