package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRatingControl.ItemClick event.
  */
@JSGlobal("ASPxClientRatingControlItemClickEventArgs")
@js.native
open class ASPxClientRatingControlItemClickEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRatingControlItemClickEventArgs {
  /**
    * Initializes a new ASPxClientRatingControlItemClickEventArgs class instance with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param index An integer value that represents the index of the clicked item.
    */
  def this(processOnServer: Boolean, index: Double) = this()
  
  /**
    * Gets the index of the item related to the event.
    */
  /* CompleteClass */
  var index: Double = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
