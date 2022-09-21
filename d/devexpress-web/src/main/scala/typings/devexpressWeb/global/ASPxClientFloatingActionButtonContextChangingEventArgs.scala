package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFloatingActionButton.ContextChanging event.
  */
@JSGlobal("ASPxClientFloatingActionButtonContextChangingEventArgs")
@js.native
open class ASPxClientFloatingActionButtonContextChangingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFloatingActionButtonContextChangingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFloatingActionButtonContextChangingEventArgs class.
    * @param action An ASPxClientFABAction object that is the floating action button's action.
    */
  def this(action: typings.devexpressWeb.ASPxClientFABAction) = this()
  
  /**
    * Returns the action related to the event.
    */
  /* CompleteClass */
  var action: typings.devexpressWeb.ASPxClientFABAction = js.native
}
