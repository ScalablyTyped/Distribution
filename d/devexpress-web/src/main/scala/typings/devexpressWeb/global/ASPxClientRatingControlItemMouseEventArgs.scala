package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the rating control's ItemMouseOver and ItemMouseOut client events (such as ASPxClientRatingControl.ItemMouseOver and ASPxClientRatingControl.ItemMouseOut).
  */
@JSGlobal("ASPxClientRatingControlItemMouseEventArgs")
@js.native
class ASPxClientRatingControlItemMouseEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRatingControlItemMouseEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRatingControlItemMouseEventArgs class.
    * @param index An integer value that represents the index of the item being processed. This value is assigned to the ASPxClientRatingControlItemMouseEventArgs.index property.
    */
  def this(index: Double) = this()
  
  /**
    * Gets the index of the item related to the event.
    */
  /* CompleteClass */
  var index: Double = js.native
}
