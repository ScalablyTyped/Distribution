package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the image slider's ImageSliderItem object.
  */
@JSGlobal("ASPxClientImageSliderItem")
@js.native
class ASPxClientImageSliderItem ()
  extends typings.devexpressWeb.ASPxClientImageSliderItem {
  /**
    * Gets an image slider to which the current item belongs.
    */
  /* CompleteClass */
  override var imageSlider: typings.devexpressWeb.ASPxClientImageSlider = js.native
  /**
    * Gets or sets the path to the image displayed within the ASPxClientImageSliderItem.
    */
  /* CompleteClass */
  override var imageUrl: String = js.native
  /**
    * Gets the item's index within an items collection.
    */
  /* CompleteClass */
  override var index: Double = js.native
  /**
    * Gets whether the image slider's item is loaded.
    */
  /* CompleteClass */
  override var loaded: Boolean = js.native
  /**
    * Gets the name that uniquely identifies the image slider item.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Gets the item's display text.
    */
  /* CompleteClass */
  override var text: String = js.native
}

