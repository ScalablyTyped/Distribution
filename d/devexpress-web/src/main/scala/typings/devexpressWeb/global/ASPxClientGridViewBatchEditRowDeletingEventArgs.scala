package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditRowDeleting event.
  */
@JSGlobal("ASPxClientGridViewBatchEditRowDeletingEventArgs")
@js.native
class ASPxClientGridViewBatchEditRowDeletingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientGridViewBatchEditRowDeletingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditRowDeletingEventArgs class.
    * @param visibleIndex An integer value that specifies the row's visible index.
    * @param rowValues An object that provides row values.
    * @param key An object that is the row's key.
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
    * Gets a hashtable that maintains information about deleted cells.
    */
  /* CompleteClass */
  override var rowValues: js.Any = js.native
  /**
    * Gets the processed row's visible index.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

