package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.SelectedTabPageChanged event.
  */
trait ASPxClientSelectedTabPageChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the tab page that was selected.
    */
  var PreviousPage: String
  /**
    * Gets the tab page that is selected.
    */
  var SelectedPage: String
  /**
    * Gets the name of the tab container that contains the selected tab page.
    */
  var TabContainerName: String
}

object ASPxClientSelectedTabPageChangedEventArgs {
  @scala.inline
  def apply(PreviousPage: String, SelectedPage: String, TabContainerName: String): ASPxClientSelectedTabPageChangedEventArgs = {
    val __obj = js.Dynamic.literal(PreviousPage = PreviousPage.asInstanceOf[js.Any], SelectedPage = SelectedPage.asInstanceOf[js.Any], TabContainerName = TabContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSelectedTabPageChangedEventArgs]
  }
}

