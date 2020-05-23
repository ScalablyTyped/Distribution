package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.SelectedTabPageChanged event.
  */
@JSGlobal("ASPxClientSelectedTabPageChangedEventArgs")
@js.native
class ASPxClientSelectedTabPageChangedEventArgs ()
  extends typings.devexpressWeb.ASPxClientSelectedTabPageChangedEventArgs {
  /**
    * Gets the tab page that was selected.
    */
  /* CompleteClass */
  override var PreviousPage: String = js.native
  /**
    * Gets the tab page that is selected.
    */
  /* CompleteClass */
  override var SelectedPage: String = js.native
  /**
    * Gets the name of the tab container that contains the selected tab page.
    */
  /* CompleteClass */
  override var TabContainerName: String = js.native
}

