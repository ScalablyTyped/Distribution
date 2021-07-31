package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditChangesCanceling event.
  */
@JSGlobal("ASPxClientCardViewBatchEditChangesCancelingEventArgs")
@js.native
class ASPxClientCardViewBatchEditChangesCancelingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCardViewBatchEditChangesCancelingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditChangesCancelingEventArgs class.
    * @param insertedValues A hashtable that stores information about inserted cells.
    * @param deletedValues A hashtable that stores information about deleted cells.
    * @param updatedValues A hashtable that stores information about updated cells.
    */
  def this(insertedValues: js.Any, deletedValues: js.Any, updatedValues: js.Any) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  /* CompleteClass */
  var deletedValues: js.Any = js.native
  
  /**
    * Gets a hashtable that maintains information about inserted cells.
    */
  /* CompleteClass */
  var insertedValues: js.Any = js.native
  
  /**
    * Gets a hashtable that maintains information about updated cells.
    */
  /* CompleteClass */
  var updatedValues: js.Any = js.native
}
