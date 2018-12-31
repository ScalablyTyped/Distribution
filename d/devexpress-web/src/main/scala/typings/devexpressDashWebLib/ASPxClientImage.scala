package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxImage control.
  */
trait ASPxClientImage extends ASPxClientImageBase {
  /**
    * Returns the URL pointing to the image displayed within the image editor.
    */
  def GetImageUrl(): java.lang.String
  /**
    * Sets the URL which points to the image displayed within the image editor.
    * @param url A string value specifying the URL to the image displayed within the editor.
    */
  def SetImageUrl(url: java.lang.String): scala.Unit
}

