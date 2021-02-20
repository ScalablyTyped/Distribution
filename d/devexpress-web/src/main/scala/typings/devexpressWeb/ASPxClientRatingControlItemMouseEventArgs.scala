package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the rating control's ItemMouseOver and ItemMouseOut client events (such as ASPxClientRatingControl.ItemMouseOver and ASPxClientRatingControl.ItemMouseOut).
  */
@js.native
trait ASPxClientRatingControlItemMouseEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double = js.native
}
object ASPxClientRatingControlItemMouseEventArgs {
  
  @scala.inline
  def apply(index: Double): ASPxClientRatingControlItemMouseEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRatingControlItemMouseEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRatingControlItemMouseEventArgsMutableBuilder[Self <: ASPxClientRatingControlItemMouseEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
