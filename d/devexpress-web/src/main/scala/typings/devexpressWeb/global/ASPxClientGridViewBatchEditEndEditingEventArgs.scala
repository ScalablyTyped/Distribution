package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditEndEditing event.
  */
@JSGlobal("ASPxClientGridViewBatchEditEndEditingEventArgs")
@js.native
class ASPxClientGridViewBatchEditEndEditingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientGridViewBatchEditEndEditingEventArgs {
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
  override var cancel: Boolean = js.native
  /**
    * Gets the row's key.
    */
  /* CompleteClass */
  override var key: js.Any = js.native
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  /* CompleteClass */
  override var rowValues: js.Any = js.native
  /**
    * Gets the visible index of the row whose cells has been edited.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

