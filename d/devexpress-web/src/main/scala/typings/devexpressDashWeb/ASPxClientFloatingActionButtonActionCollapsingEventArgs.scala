package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFloatingActionButtonActionCollapsingEventArgs extends ASPxClientEventArgs {
  var collapseReason: ASPxClientFloatingActionButtonCollapseReason
  var contextName: String
}

object ASPxClientFloatingActionButtonActionCollapsingEventArgs {
  @scala.inline
  def apply(collapseReason: ASPxClientFloatingActionButtonCollapseReason, contextName: String): ASPxClientFloatingActionButtonActionCollapsingEventArgs = {
    val __obj = js.Dynamic.literal(collapseReason = collapseReason, contextName = contextName)
  
    __obj.asInstanceOf[ASPxClientFloatingActionButtonActionCollapsingEventArgs]
  }
}

