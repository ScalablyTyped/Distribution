package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEditCustomHighlightingEventArgs extends EventArgs {
  val filter: java.lang.String
  var highlighting: js.Any
}

object ListEditCustomHighlightingEventArgs {
  @scala.inline
  def apply(filter: java.lang.String, highlighting: js.Any, sender: Control): ListEditCustomHighlightingEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter, highlighting = highlighting, sender = sender)
  
    __obj.asInstanceOf[ListEditCustomHighlightingEventArgs]
  }
}

