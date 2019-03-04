package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientSelectedTabPageChangedEventArgs extends ASPxClientEventArgs {
  var PreviousPage: java.lang.String
  var SelectedPage: java.lang.String
  var TabContainerName: java.lang.String
}

object ASPxClientSelectedTabPageChangedEventArgs {
  @scala.inline
  def apply(PreviousPage: java.lang.String, SelectedPage: java.lang.String, TabContainerName: java.lang.String): ASPxClientSelectedTabPageChangedEventArgs = {
    val __obj = js.Dynamic.literal(PreviousPage = PreviousPage, SelectedPage = SelectedPage, TabContainerName = TabContainerName)
  
    __obj.asInstanceOf[ASPxClientSelectedTabPageChangedEventArgs]
  }
}

