package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientImageSlider.ActiveItemChanged and ASPxClientImageSlider.ItemClick events.
  */
@JSGlobal("ASPxClientImageSliderItemEventArgs")
@js.native
class ASPxClientImageSliderItemEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientImageSliderItemEventArgs class.
    * @param item An ASPxClientImageSliderItem object that is the item related to the generated event.
    */
  def this(item: ASPxClientImageSliderItem) = this()
  /**
    * Gets an item object related to the event.
    */
  var item: ASPxClientImageSliderItem = js.native
}

