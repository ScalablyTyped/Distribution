package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FullscreenViewerShowing event.
  */
trait ASPxClientImageGalleryCancelEventArgs extends ASPxClientCancelEventArgs {
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

object ASPxClientImageGalleryCancelEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, index: scala.Double, name: java.lang.String): ASPxClientImageGalleryCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientImageGalleryCancelEventArgs]
  }
}

