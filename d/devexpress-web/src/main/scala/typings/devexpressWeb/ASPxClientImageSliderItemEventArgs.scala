package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientImageSlider.ActiveItemChanged and ASPxClientImageSlider.ItemClick events.
  */
trait ASPxClientImageSliderItemEventArgs extends ASPxClientEventArgs {
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
}

