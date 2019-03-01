package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemClick events.
  */
trait ASPxClientImageSliderItemEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an item object related to the event.
    * Value: An <see cref="ASPxClientImageSliderItem" /> object, manipulations on which forced the event to be raised.
    */
  var item: ASPxClientImageSliderItem
}

object ASPxClientImageSliderItemEventArgs {
  @scala.inline
  def apply(item: ASPxClientImageSliderItem): ASPxClientImageSliderItemEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[ASPxClientImageSliderItemEventArgs]
  }
}

