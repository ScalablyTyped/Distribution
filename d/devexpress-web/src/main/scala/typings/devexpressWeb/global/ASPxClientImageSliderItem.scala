package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the image slider's ImageSliderItem object.
  */
@JSGlobal("ASPxClientImageSliderItem")
@js.native
open class ASPxClientImageSliderItem ()
  extends StObject
     with typings.devexpressWeb.ASPxClientImageSliderItem {
  
  /**
    * Gets an image slider to which the current item belongs.
    */
  /* CompleteClass */
  var imageSlider: typings.devexpressWeb.ASPxClientImageSlider = js.native
  
  /**
    * Gets or sets the path to the image displayed within the ASPxClientImageSliderItem.
    */
  /* CompleteClass */
  var imageUrl: String = js.native
  
  /**
    * Gets the item's index within an items collection.
    */
  /* CompleteClass */
  var index: Double = js.native
  
  /**
    * Gets whether the image slider's item is loaded.
    */
  /* CompleteClass */
  var loaded: Boolean = js.native
  
  /**
    * Gets the name that uniquely identifies the image slider item.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the item's display text.
    */
  /* CompleteClass */
  var text: String = js.native
}
