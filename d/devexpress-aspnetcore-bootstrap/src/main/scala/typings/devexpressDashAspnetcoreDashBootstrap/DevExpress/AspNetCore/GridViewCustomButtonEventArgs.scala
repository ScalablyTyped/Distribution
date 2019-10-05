package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewCustomButtonEventArgs extends ProcessingModeEventArgs {
  val buttonID: String
  val visibleIndex: Double
}

object GridViewCustomButtonEventArgs {
  @scala.inline
  def apply(buttonID: String, processOnServer: Boolean, sender: Control, visibleIndex: Double): GridViewCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID, processOnServer = processOnServer, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[GridViewCustomButtonEventArgs]
  }
}

