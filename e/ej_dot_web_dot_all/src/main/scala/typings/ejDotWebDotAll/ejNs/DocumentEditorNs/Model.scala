package typings.ejDotWebDotAll.ejNs.DocumentEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Gets or sets an object that indicates initialization of importing and exporting documents in document editor.
    */
  var importExportSettings: js.UndefOr[ImportExportSettings] = js.undefined
  /** Triggers when the document changes.
    */
  var onDocumentChange: js.UndefOr[js.Function1[/* e */ OnDocumentChangeEventArgs, Unit]] = js.undefined
  /** Triggers when the hyperlink is clicked.
    */
  var onRequestNavigate: js.UndefOr[js.Function1[/* e */ OnRequestNavigateEventArgs, Unit]] = js.undefined
  /** Triggers when the selection changes.
    */
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ OnSelectionChangeEventArgs, Unit]] = js.undefined
  /** Triggers when the zoom factor changes.
    */
  var onZoomFactorChange: js.UndefOr[js.Function1[/* e */ OnZoomFactorChangeEventArgs, Unit]] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    importExportSettings: ImportExportSettings = null,
    onDocumentChange: /* e */ OnDocumentChangeEventArgs => Unit = null,
    onRequestNavigate: /* e */ OnRequestNavigateEventArgs => Unit = null,
    onSelectionChange: /* e */ OnSelectionChangeEventArgs => Unit = null,
    onZoomFactorChange: /* e */ OnZoomFactorChangeEventArgs => Unit = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (importExportSettings != null) __obj.updateDynamic("importExportSettings")(importExportSettings)
    if (onDocumentChange != null) __obj.updateDynamic("onDocumentChange")(js.Any.fromFunction1(onDocumentChange))
    if (onRequestNavigate != null) __obj.updateDynamic("onRequestNavigate")(js.Any.fromFunction1(onRequestNavigate))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onZoomFactorChange != null) __obj.updateDynamic("onZoomFactorChange")(js.Any.fromFunction1(onZoomFactorChange))
    __obj.asInstanceOf[Model]
  }
}

