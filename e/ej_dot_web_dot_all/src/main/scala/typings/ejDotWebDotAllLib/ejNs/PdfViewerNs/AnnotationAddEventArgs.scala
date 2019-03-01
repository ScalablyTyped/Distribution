package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationAddEventArgs extends js.Object {
  /** Returns the bounds of the annotation added in the page of the PDF document.
    */
  var annotationBound: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the id of the annotation added in the page of the PDF document.
    */
  var annotationID: js.UndefOr[scala.Double] = js.undefined
  /** Returns the settings of the annotation added to the PDF document.
    */
  var annotationSettings: js.UndefOr[js.Any] = js.undefined
  /** Returns the type of the annotation added in the page of the PDF document.
    */
  var annotationType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the page number in which the annotation is added.
    */
  var pageID: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AnnotationAddEventArgs {
  @scala.inline
  def apply(
    annotationBound: js.Array[_] = null,
    annotationID: scala.Int | scala.Double = null,
    annotationSettings: js.Any = null,
    annotationType: java.lang.String = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    pageID: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): AnnotationAddEventArgs = {
    val __obj = js.Dynamic.literal()
    if (annotationBound != null) __obj.updateDynamic("annotationBound")(annotationBound)
    if (annotationID != null) __obj.updateDynamic("annotationID")(annotationID.asInstanceOf[js.Any])
    if (annotationSettings != null) __obj.updateDynamic("annotationSettings")(annotationSettings)
    if (annotationType != null) __obj.updateDynamic("annotationType")(annotationType)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (pageID != null) __obj.updateDynamic("pageID")(pageID.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnnotationAddEventArgs]
  }
}

