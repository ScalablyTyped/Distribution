package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.SelectedTabPageChanged event.
  */
@JSGlobal("ASPxClientSelectedTabPageChangedEventArgs")
@js.native
class ASPxClientSelectedTabPageChangedEventArgs () extends ASPxClientEventArgs {
  /**
    * Gets the tab page that was selected.
    */
  var PreviousPage: String = js.native
  /**
    * Gets the tab page that is selected.
    */
  var SelectedPage: String = js.native
  /**
    * Gets the name of the tab container that contains the selected tab page.
    */
  var TabContainerName: String = js.native
}

