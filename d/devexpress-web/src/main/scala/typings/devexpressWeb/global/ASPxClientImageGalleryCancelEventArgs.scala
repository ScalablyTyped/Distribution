package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientImageGallery.FullscreenViewerShowing event.
  */
@JSGlobal("ASPxClientImageGalleryCancelEventArgs")
@js.native
class ASPxClientImageGalleryCancelEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientImageGalleryCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientImageGalleryCancelEventArgs class.
    * @param index A Int32 value that is the processed item index.
    * @param name A String value that specifies the processed item's unique identifier name.
    */
  def this(index: Double, name: String) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the index of the item related to the event.
    */
  /* CompleteClass */
  override var index: Double = js.native
  /**
    * Gets the unique identifier name of the item related to the event.
    */
  /* CompleteClass */
  override var name: String = js.native
}

