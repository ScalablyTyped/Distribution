package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignaturePropertiesChangeEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current color of the signature.
    */
  var currentColor: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the current opacity of the signature.
    */
  var currentOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies that the color of the signature is changed.
    */
  var isColorChange: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies that the opacity of the signature is changed.
    */
  var isOpacityChange: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the page number in which the signature properties is changed.
    */
  var pageID: js.UndefOr[scala.Double] = js.undefined
  /** Returns the previous color of the signature.
    */
  var previousColor: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the previous opacity of the signature.
    */
  var previousOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

