package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.AutoCorrect event.
  */
@JSGlobal("ASPxClientRichEditAutoCorrectEventArgs")
@js.native
open class ASPxClientRichEditAutoCorrectEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRichEditAutoCorrectEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditAutoCorrectEventArgs object. For internal use only.
    * @param text The input string to check whether it should be replaced.
    * @param interval The Interval object specifying the input string.
    * @param handled true if the event is handled and no default processing is required; otherwise false.
    */
  def this(text: Any, interval: Any, handled: Any) = this()
  
  /**
    * Specifies whether the event is handled.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets the input string's interval.
    */
  /* CompleteClass */
  var interval: typings.devexpressWeb.Interval = js.native
  
  /**
    * Gets the input string to check whether it should be replaced.
    */
  /* CompleteClass */
  var text: String = js.native
}
