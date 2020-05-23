package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentDxTreeList
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

trait dxTreeListEditing extends GridBaseEditing {
  /** @name dxTreeList.Options.editing.allowAdding */
  var allowAdding: js.UndefOr[Boolean | (js.Function1[/* options */ ComponentDxTreeList, Boolean])] = js.undefined
  /** @name dxTreeList.Options.editing.allowDeleting */
  var allowDeleting: js.UndefOr[Boolean | (js.Function1[/* options */ ComponentDxTreeList, Boolean])] = js.undefined
  /** @name dxTreeList.Options.editing.allowUpdating */
  var allowUpdating: js.UndefOr[Boolean | (js.Function1[/* options */ ComponentDxTreeList, Boolean])] = js.undefined
  /** @name dxTreeList.Options.editing.texts */
  @JSName("texts")
  var texts_dxTreeListEditing: js.UndefOr[dxTreeListEditingTexts] = js.undefined
}

object dxTreeListEditing {
  @scala.inline
  def apply(
    allowAdding: Boolean | (js.Function1[/* options */ ComponentDxTreeList, Boolean]) = null,
    allowDeleting: Boolean | (js.Function1[/* options */ ComponentDxTreeList, Boolean]) = null,
    allowUpdating: Boolean | (js.Function1[/* options */ ComponentDxTreeList, Boolean]) = null,
    form: dxFormOptions = null,
    mode: batch | cell | row | form | popup = null,
    popup: dxPopupOptions[dxPopup] = null,
    refreshMode: full | reshape | repaint = null,
    selectTextOnEditStart: js.UndefOr[Boolean] = js.undefined,
    startEditAction: click | dblClick = null,
    texts: dxTreeListEditingTexts = null,
    useIcons: js.UndefOr[Boolean] = js.undefined
  ): dxTreeListEditing = {
    val __obj = js.Dynamic.literal()
    if (allowAdding != null) __obj.updateDynamic("allowAdding")(allowAdding.asInstanceOf[js.Any])
    if (allowDeleting != null) __obj.updateDynamic("allowDeleting")(allowDeleting.asInstanceOf[js.Any])
    if (allowUpdating != null) __obj.updateDynamic("allowUpdating")(allowUpdating.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectTextOnEditStart)) __obj.updateDynamic("selectTextOnEditStart")(selectTextOnEditStart.get.asInstanceOf[js.Any])
    if (startEditAction != null) __obj.updateDynamic("startEditAction")(startEditAction.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(useIcons)) __obj.updateDynamic("useIcons")(useIcons.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListEditing]
  }
}

