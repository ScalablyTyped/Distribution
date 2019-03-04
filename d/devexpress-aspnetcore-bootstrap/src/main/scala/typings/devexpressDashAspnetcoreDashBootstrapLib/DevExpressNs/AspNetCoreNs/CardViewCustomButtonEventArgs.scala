package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewCustomButtonEventArgs extends ProcessingModeEventArgs {
  val buttonID: java.lang.String
  val visibleIndex: scala.Double
}

object CardViewCustomButtonEventArgs {
  @scala.inline
  def apply(
    buttonID: java.lang.String,
    processOnServer: scala.Boolean,
    sender: Control,
    visibleIndex: scala.Double
  ): CardViewCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID, processOnServer = processOnServer, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[CardViewCustomButtonEventArgs]
  }
}

