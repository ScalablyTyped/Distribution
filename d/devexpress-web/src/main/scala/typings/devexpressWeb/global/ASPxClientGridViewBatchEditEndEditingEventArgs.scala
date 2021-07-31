package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditEndEditing event.
  */
@JSGlobal("ASPxClientGridViewBatchEditEndEditingEventArgs")
@js.native
class ASPxClientGridViewBatchEditEndEditingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewBatchEditEndEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditEndEditingEventArgs class.
    * @param visibleIndex An integer value that specifies the visible index.
    * @param rowValues An object that provides the row values.
    * @param key An object that provides the row key.
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
    * Gets a hashtable that maintains information about editable cells.
    */
  /* CompleteClass */
  var rowValues: js.Any = js.native
  
  /**
    * Gets the visible index of the row whose cells has been edited.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
