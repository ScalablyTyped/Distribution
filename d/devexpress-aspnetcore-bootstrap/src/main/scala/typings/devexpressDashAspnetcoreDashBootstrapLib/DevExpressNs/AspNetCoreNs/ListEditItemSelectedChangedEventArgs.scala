package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEditItemSelectedChangedEventArgs extends ProcessingModeEventArgs {
  val index: scala.Double
  val isSelected: scala.Boolean
}

object ListEditItemSelectedChangedEventArgs {
  @scala.inline
  def apply(index: scala.Double, isSelected: scala.Boolean, processOnServer: scala.Boolean, sender: Control): ListEditItemSelectedChangedEventArgs = {
    val __obj = js.Dynamic.literal(index = index, isSelected = isSelected, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[ListEditItemSelectedChangedEventArgs]
  }
}

