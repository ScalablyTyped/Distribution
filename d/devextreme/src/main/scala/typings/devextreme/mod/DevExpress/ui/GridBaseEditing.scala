package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.batch
import typings.devextreme.devextremeStrings.cell
import typings.devextreme.devextremeStrings.click
import typings.devextreme.devextremeStrings.dblClick
import typings.devextreme.devextremeStrings.form
import typings.devextreme.devextremeStrings.full
import typings.devextreme.devextremeStrings.popup
import typings.devextreme.devextremeStrings.repaint
import typings.devextreme.devextremeStrings.reshape
import typings.devextreme.devextremeStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBaseEditing extends js.Object {
  /** Configures the form. Used only if editing.mode is "form" or "popup". */
  var form: js.UndefOr[dxFormOptions] = js.undefined
  /** Specifies how a user edits data. */
  var mode: js.UndefOr[batch | cell | row | form | popup] = js.undefined
  /** Configures the popup. Used only if editing.mode is "popup". */
  var popup: js.UndefOr[dxPopupOptions[dxPopup]] = js.undefined
  /** Specifies operations that are performed after saving changes. */
  var refreshMode: js.UndefOr[full | reshape | repaint] = js.undefined
  /** Specifies whether to select text in a cell when a user starts editing. */
  var selectTextOnEditStart: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether a single or double click should switch a cell to the editing state. Applies if editing.mode is "cell" or "batch". */
  var startEditAction: js.UndefOr[click | dblClick] = js.undefined
  /** Contains options that specify texts for editing-related UI elements. */
  var texts: js.UndefOr[GridBaseEditingTexts] = js.undefined
  /** Specifies whether the editing column uses icons instead of links. */
  var useIcons: js.UndefOr[Boolean] = js.undefined
}

object GridBaseEditing {
  @scala.inline
  def apply(
    form: dxFormOptions = null,
    mode: batch | cell | row | form | popup = null,
    popup: dxPopupOptions[dxPopup] = null,
    refreshMode: full | reshape | repaint = null,
    selectTextOnEditStart: js.UndefOr[Boolean] = js.undefined,
    startEditAction: click | dblClick = null,
    texts: GridBaseEditingTexts = null,
    useIcons: js.UndefOr[Boolean] = js.undefined
  ): GridBaseEditing = {
    val __obj = js.Dynamic.literal()
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectTextOnEditStart)) __obj.updateDynamic("selectTextOnEditStart")(selectTextOnEditStart.asInstanceOf[js.Any])
    if (startEditAction != null) __obj.updateDynamic("startEditAction")(startEditAction.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(useIcons)) __obj.updateDynamic("useIcons")(useIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBaseEditing]
  }
}

