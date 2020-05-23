package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ASPxImageGallery control.
  */
@js.native
trait ASPxClientImageGallery extends ASPxClientDataView {
  /**
    * Occurs on the client side after an active item has been changed within the fullscreen viewer.
    */
  var FullscreenViewerActiveItemIndexChanged: ASPxClientEvent[ASPxClientImageGalleryFullscreenViewerEventHandler[ASPxClientImageGallery]] = js.native
  /**
    * Fires on the client side before the fullscreen viewer is shown and allows you to cancel the action.
    */
  var FullscreenViewerShowing: ASPxClientEvent[ASPxClientImageGalleryCancelEventHandler[ASPxClientImageGallery]] = js.native
  /**
    * Returns the index of the active item within the fullscreen viewer.
    */
  def GetFullscreenViewerActiveItemIndex(): Double = js.native
  /**
    * Gets the number of items contained in the control's item collection.
    */
  def GetFullscreenViewerItemCount(): Double = js.native
  /**
    * Hides the fullscreen viewer.
    */
  def HideFullscreenViewer(): Unit = js.native
  /**
    * Pauses a slide show within a fullscreen viewer.
    */
  def PauseSlideShow(): Unit = js.native
  /**
    * Plays a slide show within a fullscreen viewer.
    */
  def PlaySlideShow(): Unit = js.native
  /**
    * Makes the specified item active within the fullscreen viewer on the client side.
    * @param index An integer value specifying the index of the item to select.
    * @param preventAnimation true to prevent the animation effect; false to change images using animation.
    */
  def SetFullscreenViewerActiveItemIndex(index: Double, preventAnimation: Boolean): Unit = js.native
  /**
    * Shows the fullscreen viewer with the specified active item.
    * @param index An Int32 value that is an index of the active item.
    */
  def ShowFullscreenViewer(index: Double): Unit = js.native
}

