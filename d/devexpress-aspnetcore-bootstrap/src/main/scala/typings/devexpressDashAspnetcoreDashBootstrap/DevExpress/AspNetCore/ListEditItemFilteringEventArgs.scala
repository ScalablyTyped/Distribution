package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEditItemFilteringEventArgs extends EventArgs {
  val filter: String
  var isFit: Boolean
  val item: BootstrapListBoxItem
}

object ListEditItemFilteringEventArgs {
  @scala.inline
  def apply(filter: String, isFit: Boolean, item: BootstrapListBoxItem, sender: Control): ListEditItemFilteringEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter, isFit = isFit, item = item, sender = sender)
  
    __obj.asInstanceOf[ListEditItemFilteringEventArgs]
  }
}

