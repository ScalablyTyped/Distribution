package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the image slider's ImageSliderItem object.
  */
trait ASPxClientImageSliderItem extends js.Object {
  /**
    * Gets an image slider to which the current item belongs.
    */
  var imageSlider: ASPxClientImageSlider
  /**
    * Gets or sets the path to the image displayed within the ASPxClientImageSliderItem.
    */
  var imageUrl: String
  /**
    * Gets the item's index within an items collection.
    */
  var index: Double
  /**
    * Gets whether the image slider's item is loaded.
    */
  var loaded: Boolean
  /**
    * Gets the name that uniquely identifies the image slider item.
    */
  var name: String
  /**
    * Gets the item's display text.
    */
  var text: String
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
}

