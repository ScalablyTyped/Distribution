package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.RowFocusing event.
  */
@JSGlobal("ASPxClientGridViewRowFocusingEventArgs")
@js.native
class ASPxClientGridViewRowFocusingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewRowFocusingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewRowFocusingEventArgs class.
    * @param visibleIndex An integer value specifying the row visible index.
    * @param htmlEvent An object specifying the HTML event.
    */
  def this(visibleIndex: Double, htmlEvent: js.Any) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.RowFocusing event.
    */
  /* CompleteClass */
  var htmlEvent: js.Any = js.native
  
  /**
    * Gets the processed row's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
