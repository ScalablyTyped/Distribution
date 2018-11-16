package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DocumentLoadEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the PDF document name displaying in the PDF viewer.
               */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the PDF viewer model
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

