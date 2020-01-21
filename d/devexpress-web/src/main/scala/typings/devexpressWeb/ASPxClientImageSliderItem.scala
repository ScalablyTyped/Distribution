package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the image slider's ImageSliderItem object.
  */
@JSGlobal("ASPxClientImageSliderItem")
@js.native
class ASPxClientImageSliderItem () extends js.Object {
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

