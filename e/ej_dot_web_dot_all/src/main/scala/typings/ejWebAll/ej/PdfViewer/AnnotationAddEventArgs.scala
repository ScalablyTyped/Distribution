package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationAddEventArgs extends js.Object {
  /** Returns the bounds of the annotation added in the page of the PDF document.
    */
  var annotationBound: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the id of the annotation added in the page of the PDF document.
    */
  var annotationID: js.UndefOr[Double] = js.undefined
  /** Returns the settings of the annotation added to the PDF document.
    */
  var annotationSettings: js.UndefOr[js.Any] = js.undefined
  /** Returns the type of the annotation added in the page of the PDF document.
    */
  var annotationType: js.UndefOr[String] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the page number in which the annotation is added.
    */
  var pageID: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AnnotationAddEventArgs {
  @scala.inline
  def apply(
    annotationBound: js.Array[_] = null,
    annotationID: js.UndefOr[Double] = js.undefined,
    annotationSettings: js.Any = null,
    annotationType: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    pageID: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): AnnotationAddEventArgs = {
    val __obj = js.Dynamic.literal()
    if (annotationBound != null) __obj.updateDynamic("annotationBound")(annotationBound.asInstanceOf[js.Any])
    if (!js.isUndefined(annotationID)) __obj.updateDynamic("annotationID")(annotationID.get.asInstanceOf[js.Any])
    if (annotationSettings != null) __obj.updateDynamic("annotationSettings")(annotationSettings.asInstanceOf[js.Any])
    if (annotationType != null) __obj.updateDynamic("annotationType")(annotationType.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(pageID)) __obj.updateDynamic("pageID")(pageID.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationAddEventArgs]
  }
}

