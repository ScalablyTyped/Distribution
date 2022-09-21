package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for a splitter control's cancelable client events concerning manipulations with a pane.
  */
@JSGlobal("ASPxClientSplitterPaneCancelEventArgs")
@js.native
open class ASPxClientSplitterPaneCancelEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientSplitterPaneCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSplitterPaneCancelEventArgs class.
    * @param pane A ASPxClientSplitterPane object representing a splitter pane related to the generated event.
    */
  def this(pane: typings.devexpressWeb.ASPxClientSplitterPane) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the pane object related to the event.
    */
  /* CompleteClass */
  var pane: typings.devexpressWeb.ASPxClientSplitterPane = js.native
}
