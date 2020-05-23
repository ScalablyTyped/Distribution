package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationRemoveEventArgs extends js.Object {
  /** Returns the id of the annotation removed from the page of the PDF document.
    */
  var annotationID: js.UndefOr[Double] = js.undefined
  /** Returns the type of the annotation removed from the page of the PDF document.
    */
  var annotationType: js.UndefOr[String] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the page number in which the annotation is removed.
    */
  var pageID: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AnnotationRemoveEventArgs {
  @scala.inline
  def apply(
    annotationID: js.UndefOr[Double] = js.undefined,
    annotationType: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    pageID: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): AnnotationRemoveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotationID)) __obj.updateDynamic("annotationID")(annotationID.get.asInstanceOf[js.Any])
    if (annotationType != null) __obj.updateDynamic("annotationType")(annotationType.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(pageID)) __obj.updateDynamic("pageID")(pageID.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationRemoveEventArgs]
  }
}

