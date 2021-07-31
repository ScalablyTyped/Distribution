package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientImageSlider.ActiveItemChanged and ASPxClientImageSlider.ItemClick events.
  */
trait ASPxClientImageSliderItemEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets an item object related to the event.
    */
  var item: ASPxClientImageSliderItem
}
object ASPxClientImageSliderItemEventArgs {
  
  @scala.inline
  def apply(item: ASPxClientImageSliderItem): ASPxClientImageSliderItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientImageSliderItemEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientImageSliderItemEventArgsMutableBuilder[Self <: ASPxClientImageSliderItemEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: ASPxClientImageSliderItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
