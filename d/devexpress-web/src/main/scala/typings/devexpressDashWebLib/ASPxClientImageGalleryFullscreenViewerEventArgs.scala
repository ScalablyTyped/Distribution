package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FullscreenViewerActiveItemIndexChanged event.
  */
trait ASPxClientImageGalleryFullscreenViewerEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the index of the item related to the event.
    * Value: An <see cref="Int32" /> value that is the related item's index.
    */
  var index: scala.Double
  /**
    * Gets the unique identifier name of the item related to the event.
    * Value: A string value that specifies the item's unique identifier name.
    */
  var name: java.lang.String
}

object ASPxClientImageGalleryFullscreenViewerEventArgs {
  @scala.inline
  def apply(index: scala.Double, name: java.lang.String): ASPxClientImageGalleryFullscreenViewerEventArgs = {
    val __obj = js.Dynamic.literal(index = index, name = name)
  
    __obj.asInstanceOf[ASPxClientImageGalleryFullscreenViewerEventArgs]
  }
}

