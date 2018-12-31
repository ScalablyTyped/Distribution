package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxImageZoom object.
  */
trait ASPxClientImageZoom extends ASPxClientControl {
  /**
    * Sets the properties on an image displayed in the image zoom control.
    * @param imageUrl A string value specifying the path to the preview image displayed in the preview image.
    * @param largeImageUrl A string value specifying the path to the preview image displayed in the zoom window and the expand window.
    * @param zoomWindowText A string value specifying the text displayed in the zoom window.
    * @param expandWindowText A string value specifying the text displayed in the expand window.
    * @param alternateText A string value that specifies the alternate text displayed instead of the image.
    */
  def SetImageProperties(
    imageUrl: java.lang.String,
    largeImageUrl: java.lang.String,
    zoomWindowText: java.lang.String,
    expandWindowText: java.lang.String,
    alternateText: java.lang.String
  ): scala.Unit
}

