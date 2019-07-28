package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEditItemSelectedChangedEventArgs extends ProcessingModeEventArgs {
  val index: Double
  val isSelected: Boolean
}

object ListEditItemSelectedChangedEventArgs {
  @scala.inline
  def apply(index: Double, isSelected: Boolean, processOnServer: Boolean, sender: Control): ListEditItemSelectedChangedEventArgs = {
    val __obj = js.Dynamic.literal(index = index, isSelected = isSelected, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[ListEditItemSelectedChangedEventArgs]
  }
}

