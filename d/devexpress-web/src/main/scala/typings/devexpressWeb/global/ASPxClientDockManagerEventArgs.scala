package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on panels.
  */
@JSGlobal("ASPxClientDockManagerEventArgs")
@js.native
class ASPxClientDockManagerEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDockManagerEventArgs {
  /**
    * For internal use only.
    */
  def this(panel: typings.devexpressWeb.ASPxClientDockPanel) = this()
  
  /**
    * Gets the panel currently being processed.
    */
  /* CompleteClass */
  var panel: typings.devexpressWeb.ASPxClientDockPanel = js.native
}
