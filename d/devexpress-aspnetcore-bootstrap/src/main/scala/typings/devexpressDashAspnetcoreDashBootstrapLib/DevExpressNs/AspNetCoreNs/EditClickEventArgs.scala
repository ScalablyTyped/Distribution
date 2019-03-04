package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditClickEventArgs extends EventArgs {
  val htmlElement: js.Any
  val htmlEvent: js.Any
}

object EditClickEventArgs {
  @scala.inline
  def apply(htmlElement: js.Any, htmlEvent: js.Any, sender: Control): EditClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement, htmlEvent = htmlEvent, sender = sender)
  
    __obj.asInstanceOf[EditClickEventArgs]
  }
}

