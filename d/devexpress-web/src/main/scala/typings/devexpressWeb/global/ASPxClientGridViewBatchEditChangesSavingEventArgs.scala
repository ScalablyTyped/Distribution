package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditChangesSaving event.
  */
@JSGlobal("ASPxClientGridViewBatchEditChangesSavingEventArgs")
@js.native
open class ASPxClientGridViewBatchEditChangesSavingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewBatchEditChangesSavingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditChangesSavingEventArgs class.
    * @param insertedValues A hashtable that stores information about inserted cells.
    * @param deletedValues A hashtable that stores information about deleted cells.
    * @param updatedValues A hashtable that stores information about updated cells.
    */
  def this(insertedValues: Any, deletedValues: Any, updatedValues: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  /* CompleteClass */
  var deletedValues: Any = js.native
  
  /**
    * Gets a hashtable that maintains information about inserted cells.
    */
  /* CompleteClass */
  var insertedValues: Any = js.native
  
  /**
    * Gets a hashtable that maintains information about updated cells.
    */
  /* CompleteClass */
  var updatedValues: Any = js.native
}
