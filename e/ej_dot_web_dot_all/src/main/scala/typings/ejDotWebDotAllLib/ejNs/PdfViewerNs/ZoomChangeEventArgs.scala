package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ZoomChangeEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current zoom percentage of the PDF viewer control
               */
  var currentZoomPercentage: js.UndefOr[scala.Double] = js.undefined
  /** Returns the PDF viewer model
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous zoom percentage of the PDF viewer control
               */
  var previousZoomPercentage: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

