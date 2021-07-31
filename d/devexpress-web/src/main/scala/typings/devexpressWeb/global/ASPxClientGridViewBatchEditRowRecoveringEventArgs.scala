package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditRowRecovering event.
  */
@JSGlobal("ASPxClientGridViewBatchEditRowRecoveringEventArgs")
@js.native
class ASPxClientGridViewBatchEditRowRecoveringEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewBatchEditRowRecoveringEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditRowRecoveringEventArgs class.
    * @param visibleIndex An integer value that specifies the row's visible index.
    * @param rowValues An object that provides row values.
    * @param key An object that is the row's key.
    */
  def this(visibleIndex: Double, rowValues: js.Any, key: js.Any) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the row's key.
    */
  /* CompleteClass */
  var key: js.Any = js.native
  
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  /* CompleteClass */
  var rowValues: js.Any = js.native
  
  /**
    * Gets the processed row's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
