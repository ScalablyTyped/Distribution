package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ToolbarUpdating event.
  */
@JSGlobal("ASPxClientFileManagerToolbarUpdatingEventArgs")
@js.native
open class ASPxClientFileManagerToolbarUpdatingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFileManagerToolbarUpdatingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerToolbarUpdatingEventArgs class with the specified setting.
    * @param activeAreaName The active file manager area. Initializes the ASPxClientFileManagerToolbarUpdatingEventArgs.activeAreaName property.
    */
  def this(activeAreaName: String) = this()
  
  /**
    * Gets the name of the currently active file manager area.
    */
  /* CompleteClass */
  var activeAreaName: String = js.native
}
