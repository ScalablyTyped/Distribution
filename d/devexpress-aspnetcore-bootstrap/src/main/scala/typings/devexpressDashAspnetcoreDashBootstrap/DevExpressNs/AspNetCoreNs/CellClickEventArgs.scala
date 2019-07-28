package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellClickEventArgs extends EventArgs {
  val htmlElement: js.Object
  val interval: BootstrapTimeInterval
  val resource: String
}

object CellClickEventArgs {
  @scala.inline
  def apply(htmlElement: js.Object, interval: BootstrapTimeInterval, resource: String, sender: Control): CellClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement, interval = interval, resource = resource, sender = sender)
  
    __obj.asInstanceOf[CellClickEventArgs]
  }
}

