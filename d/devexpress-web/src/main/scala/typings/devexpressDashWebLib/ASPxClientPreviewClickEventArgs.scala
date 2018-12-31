package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the PreviewClick events.
  */
@js.native
trait ASPxClientPreviewClickEventArgs extends ASPxClientEventArgs {
  /**
    * Provides information on a visual brick representing content of a report control that has been clicked.
    * Value: An object that provides information on a visual brick.
    */
  var Brick: ASPxClientWebDocumentViewerBrick = js.native
  /**
    * Specifies whether or not the event was handled and no default processing is required.
    * Value: true, if the event is completely handled by custom code and no default processing is required; otherwise, false.
    */
  var Handled: scala.Boolean = js.native
  /**
    * Gets a value specifying the zero-based index of the page that has been clicked.
    * Value: An integer value that specifies a page index.
    */
  var PageIndex: scala.Double = js.native
  /**
    * Specifies the default function used to handle the PreviewClick event.
    */
  def DefaultHandler(): scala.Unit = js.native
  /**
    * Returns the text displayed by the Brick.
    */
  def GetBrickText(): java.lang.String = js.native
  /**
    * Returns a string providing additional information on the Brick.
    */
  def GetBrickValue(): java.lang.String = js.native
  /**
    * Returns a string providing additional information about the current Brick by the specified key.
    * @param key A string that specifies a unique key.
    */
  def GetBrickValue(key: java.lang.String): java.lang.String = js.native
}

