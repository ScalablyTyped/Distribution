package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the image slider's ImageSliderItem object.
  */
@js.native
trait ASPxClientImageSliderItem extends StObject {
  
  /**
    * Gets an image slider to which the current item belongs.
    */
  var imageSlider: ASPxClientImageSlider = js.native
  
  /**
    * Gets or sets the path to the image displayed within the ASPxClientImageSliderItem.
    */
  var imageUrl: String = js.native
  
  /**
    * Gets the item's index within an items collection.
    */
  var index: Double = js.native
  
  /**
    * Gets whether the image slider's item is loaded.
    */
  var loaded: Boolean = js.native
  
  /**
    * Gets the name that uniquely identifies the image slider item.
    */
  var name: String = js.native
  
  /**
    * Gets the item's display text.
    */
  var text: String = js.native
}
object ASPxClientImageSliderItem {
  
  @scala.inline
  def apply(
    imageSlider: ASPxClientImageSlider,
    imageUrl: String,
    index: Double,
    loaded: Boolean,
    name: String,
    text: String
  ): ASPxClientImageSliderItem = {
    val __obj = js.Dynamic.literal(imageSlider = imageSlider.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientImageSliderItem]
  }
  
  @scala.inline
  implicit class ASPxClientImageSliderItemMutableBuilder[Self <: ASPxClientImageSliderItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageSlider(value: ASPxClientImageSlider): Self = StObject.set(x, "imageSlider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
