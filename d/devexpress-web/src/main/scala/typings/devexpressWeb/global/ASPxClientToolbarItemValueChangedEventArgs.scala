package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ReportToolbarClientSideEvents.ItemValueChanged event.
  */
@JSGlobal("ASPxClientToolbarItemValueChangedEventArgs")
@js.native
class ASPxClientToolbarItemValueChangedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientToolbarItemValueChangedEventArgs {
  /**
    * For internal use. Initializes a new instance of the ASPxClientToolbarItemValueChangedEventArgs class with the specified settings.
    */
  def this(
    processOnServer: Boolean,
    item: typings.devexpressWeb.ASPxClientMenuItem,
    editor: typings.devexpressWeb.ASPxClientControl
  ) = this()
}
