package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRatingControl.ItemClick event.
  */
@js.native
trait ASPxClientRatingControlItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double = js.native
}
object ASPxClientRatingControlItemClickEventArgs {
  
  @scala.inline
  def apply(index: Double, processOnServer: Boolean): ASPxClientRatingControlItemClickEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRatingControlItemClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRatingControlItemClickEventArgsMutableBuilder[Self <: ASPxClientRatingControlItemClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
