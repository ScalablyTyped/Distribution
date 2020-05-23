package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientImageGallery.FullscreenViewerShowing event.
  */
trait ASPxClientImageGalleryCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double
  /**
    * Gets the unique identifier name of the item related to the event.
    */
  var name: String
}

object ASPxClientImageGalleryCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, index: Double, name: String): ASPxClientImageGalleryCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientImageGalleryCancelEventArgs]
  }
}

