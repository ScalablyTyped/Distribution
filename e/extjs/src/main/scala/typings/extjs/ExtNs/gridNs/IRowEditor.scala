package typings.extjs.ExtNs.gridNs

import typings.extjs.ExtNs.dataNs.IModel
import typings.extjs.ExtNs.formNs.IBasic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowEditor
  extends typings.extjs.ExtNs.formNs.IPanel {
  /** [Method] Lie to the CQ system about our nesting structure  */
  @JSName("getRefItems")
  var getRefItems_IRowEditor: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Loads an Ext data Model into this form internally just calls Ext form Basic loadRecord See also trackResetOnLoad
  		* @param record Object
  		* @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
  		*/
  @JSName("loadRecord")
  var loadRecord_IRowEditor: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], IBasic]] = js.undefined
  /** [Method] Start editing the specified grid at the specified position
  		* @param record Ext.data.Model The Store data record which backs the row to be edited.
  		* @param columnHeader Ext.data.Model The Column object defining the column to be edited.
  		*/
  var startEdit: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel], Unit]
  ] = js.undefined
}

object IRowEditor {
  @scala.inline
  def apply(
    IPanel: typings.extjs.ExtNs.formNs.IPanel = null,
    afterRender: () => Unit = null,
    border: js.Any = null,
    getRefItems: () => Unit = null,
    hideMode: java.lang.String = null,
    isDirty: () => Boolean = null,
    loadRecord: /* record */ js.UndefOr[js.Any] => IBasic = null,
    onHide: () => Unit = null,
    onShow: () => Unit = null,
    startEdit: (/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel]) => Unit = null
  ): IRowEditor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPanel)
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction0(afterRender))
    if (border != null) __obj.updateDynamic("border")(border)
    if (getRefItems != null) __obj.updateDynamic("getRefItems")(js.Any.fromFunction0(getRefItems))
    if (hideMode != null) __obj.updateDynamic("hideMode")(hideMode)
    if (isDirty != null) __obj.updateDynamic("isDirty")(js.Any.fromFunction0(isDirty))
    if (loadRecord != null) __obj.updateDynamic("loadRecord")(js.Any.fromFunction1(loadRecord))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (startEdit != null) __obj.updateDynamic("startEdit")(js.Any.fromFunction2(startEdit))
    __obj.asInstanceOf[IRowEditor]
  }
}

