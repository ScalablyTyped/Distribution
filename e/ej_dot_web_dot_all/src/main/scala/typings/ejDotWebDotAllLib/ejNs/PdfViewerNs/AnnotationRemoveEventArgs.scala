package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnnotationRemoveEventArgs extends js.Object {
  /** Returns the id of the annotation removed from the page of the PDF document.
               */
  var annotationID: js.UndefOr[scala.Double] = js.undefined
  /** Returns the type of the annotation removed from the page of the PDF document.
               */
  var annotationType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the PDF viewer model
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the page number in which the annotation is removed.
               */
  var pageID: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

