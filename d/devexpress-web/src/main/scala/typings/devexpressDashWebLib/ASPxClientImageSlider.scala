package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A client-side equivalent of the ASPxImageSlider object.
 */

trait ASPxClientImageSlider extends ASPxClientControl {
  /**
       * Occurs after the active image, displayed within the image area, is changed.
       */
  var ActiveItemChanged: ASPxClientEvent[ASPxClientImageSliderItemEventHandler[ASPxClientImageSlider]]
  /**
       * Fires after an image item has been clicked within the image area.
       */
  var ItemClick: ASPxClientEvent[ASPxClientImageSliderItemEventHandler[ASPxClientImageSlider]]
  /**
       * Occurs on the client side when a thumbnail is clicked.
       */
  var ThumbnailItemClick: ASPxClientEvent[ASPxClientImageSliderItemEventHandler[ASPxClientImageSlider]]
  /**
       * Sets input focus to the ASPxImageSlider control.
       */
  def Focus(): scala.Unit
  /**
       * Returns the active item within the ASPxImageSlider control.
       */
  def GetActiveItem(): ASPxClientImageSliderItem
  /**
       * Returns the index of the active item within the image slider control.
       */
  def GetActiveItemIndex(): scala.Double
  /**
       * Returns an item specified by its index within the image slider's item collection.
       * @param index An integer value specifying the zero-based index of the item to be retrieved.
       */
  def GetItem(index: scala.Double): ASPxClientImageSliderItem
  /**
       * Returns an item specified by its name.
       * @param name A string value specifying the name of the item.
       */
  def GetItemByName(name: java.lang.String): ASPxClientImageSliderItem
  /**
       * Gets the number of items contained in the control's item collection.
       */
  def GetItemCount(): scala.Double
  /**
       * Gets a value indicating whether the slide show is playing.
       */
  def IsSlideShowPlaying(): scala.Boolean
  /**
       * Pauses a slide show within image slider.
       */
  def Pause(): scala.Unit
  /**
       * Plays a slide show within an image slider.
       */
  def Play(): scala.Unit
  /**
       * Makes the specified item active within the image slider control on the client side.
       * @param item An ASPxClientImageSliderItem object specifying the item to select.
       * @param preventAnimation true to prevent animation effect; false to enable animation.
       */
  def SetActiveItem(item: ASPxClientImageSliderItem, preventAnimation: scala.Boolean): scala.Unit
  /**
       * Makes the specified item active within the image slider control on the client side.
       * @param index An integer value specifying the index of the item to select.
       * @param preventAnimation true to prevent the animation effect; false to change images using animation.
       */
  def SetActiveItemIndex(index: scala.Double, preventAnimation: scala.Boolean): scala.Unit
}

