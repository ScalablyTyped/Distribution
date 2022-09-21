package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientImageSlider.ActiveItemChanged and ASPxClientImageSlider.ItemClick events.
  */
@JSGlobal("ASPxClientImageSliderItemEventArgs")
@js.native
open class ASPxClientImageSliderItemEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientImageSliderItemEventArgs {
  /**
    * Initializes a new instance of the ASPxClientImageSliderItemEventArgs class.
    * @param item An ASPxClientImageSliderItem object that is the item related to the generated event.
    */
  def this(item: typings.devexpressWeb.ASPxClientImageSliderItem) = this()
  
  /**
    * Gets an item object related to the event.
    */
  /* CompleteClass */
  var item: typings.devexpressWeb.ASPxClientImageSliderItem = js.native
}
