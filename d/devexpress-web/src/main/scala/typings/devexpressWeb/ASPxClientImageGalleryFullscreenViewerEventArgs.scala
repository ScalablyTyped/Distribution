package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientImageGallery.FullscreenViewerActiveItemIndexChanged event.
  */
trait ASPxClientImageGalleryFullscreenViewerEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double
  /**
    * Gets the unique identifier name of the item related to the event.
    */
  var name: String
}

object ASPxClientImageGalleryFullscreenViewerEventArgs {
  @scala.inline
  def apply(index: Double, name: String): ASPxClientImageGalleryFullscreenViewerEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientImageGalleryFullscreenViewerEventArgs]
  }
}

