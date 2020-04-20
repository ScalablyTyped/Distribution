package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEditItemSelectedChangedEventArgs]
  }
}

