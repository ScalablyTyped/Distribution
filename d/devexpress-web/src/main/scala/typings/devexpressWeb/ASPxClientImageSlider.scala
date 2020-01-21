package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxImageSlider object.
  */
@JSGlobal("ASPxClientImageSlider")
@js.native
class ASPxClientImageSlider () extends ASPxClientControl {
  /**
    * Occurs after the active image, displayed within the image area, is changed.
    */
  var ActiveItemChanged: ASPxClientEvent[ASPxClientImageSliderItemEventHandler[ASPxClientImageSlider]] = js.native
  /**
    * Fires after an image item has been clicked within the image area.
    */
  var ItemClick: ASPxClientEvent[ASPxClientImageSliderItemEventHandler[ASPxClientImageSlider]] = js.native
  /**
    * Fires for each Image Slider's item that is loaded on callback.
    */
  var ItemLoadedOnCallback: ASPxClientEvent[ASPxClientImageSliderItemEventHandler[ASPxClientImageSlider]] = js.native
  /**
    * Occurs on the client side when a thumbnail is clicked.
    */
  var ThumbnailItemClick: ASPxClientEvent[ASPxClientImageSliderItemEventHandler[ASPxClientImageSlider]] = js.native
  /**
    * Sets input focus to the ASPxImageSlider control.
    */
  def Focus(): Unit = js.native
  /**
    * Returns the active item within the ASPxImageSlider control.
    */
  def GetActiveItem(): ASPxClientImageSliderItem = js.native
  /**
    * Returns the index of the active item within the image slider control.
    */
  def GetActiveItemIndex(): Double = js.native
  /**
    * Returns an item specified by its index within the image slider's item collection. An ASPxClientImageSliderItem object that is the collection item found.
    * @param index An integer value specifying the zero-based index of the item to be retrieved.
    * @param forceLoad true, to force the item's loading; otherwise, false.
    */
  def GetItem(index: Double): ASPxClientImageSliderItem = js.native
  def GetItem(index: Double, forceLoad: Boolean): ASPxClientImageSliderItem = js.native
  /**
    * Returns the image slider's item by its name. An ASPxClientImageSliderItem object representing the Image
    * @param name A string value representing the item's name.
    * @param forceLoad true, to force the item's loading; otherwise, false.
    */
  def GetItemByName(name: String): ASPxClientImageSliderItem = js.native
  def GetItemByName(name: String, forceLoad: Boolean): ASPxClientImageSliderItem = js.native
  /**
    * Gets the number of items contained in the control's item collection.
    */
  def GetItemCount(): Double = js.native
  /**
    * Gets the loaded items.
    */
  def GetLoadedItems(): js.Array[ASPxClientImageSliderItem] = js.native
  /**
    * Gets a value indicating whether the slide show is playing.
    */
  def IsSlideShowPlaying(): Boolean = js.native
  /**
    * Pauses a slide show within image slider.
    */
  def Pause(): Unit = js.native
  /**
    * Plays a slide show within an image slider.
    */
  def Play(): Unit = js.native
  /**
    * Makes the specified item active within the image slider control on the client side.
    * @param item An ASPxClientImageSliderItem object specifying the item to select.
    * @param preventAnimation true to prevent animation effect; false to enable animation.
    */
  def SetActiveItem(item: ASPxClientImageSliderItem, preventAnimation: Boolean): Unit = js.native
  /**
    * Makes the specified item active within the image slider control on the client side.
    * @param index An integer value specifying the index of the item to select.
    * @param preventAnimation true to prevent the animation effect; false to change images using animation.
    */
  def SetActiveItemIndex(index: Double, preventAnimation: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientImageSlider")
@js.native
object ASPxClientImageSlider extends js.Object {
  /**
    * Converts the specified object to the ASPxClientImageSlider type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientImageSlider = js.native
}

