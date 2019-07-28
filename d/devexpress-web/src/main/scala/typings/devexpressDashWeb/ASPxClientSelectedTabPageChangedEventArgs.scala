package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientSelectedTabPageChangedEventArgs extends ASPxClientEventArgs {
  var PreviousPage: String
  var SelectedPage: String
  var TabContainerName: String
}

object ASPxClientSelectedTabPageChangedEventArgs {
  @scala.inline
  def apply(PreviousPage: String, SelectedPage: String, TabContainerName: String): ASPxClientSelectedTabPageChangedEventArgs = {
    val __obj = js.Dynamic.literal(PreviousPage = PreviousPage, SelectedPage = SelectedPage, TabContainerName = TabContainerName)
  
    __obj.asInstanceOf[ASPxClientSelectedTabPageChangedEventArgs]
  }
}

