package typings.extjs.Ext.grid

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.form.IBasic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowEditor
  extends typings.extjs.Ext.form.IPanel {
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
    IPanel: typings.extjs.Ext.form.IPanel = null,
    getRefItems: () => Unit = null,
    loadRecord: /* record */ js.UndefOr[js.Any] => IBasic = null,
    startEdit: (/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel]) => Unit = null
  ): IRowEditor = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    if (getRefItems != null) __obj.updateDynamic("getRefItems")(js.Any.fromFunction0(getRefItems))
    if (loadRecord != null) __obj.updateDynamic("loadRecord")(js.Any.fromFunction1(loadRecord))
    if (startEdit != null) __obj.updateDynamic("startEdit")(js.Any.fromFunction2(startEdit))
    __obj.asInstanceOf[IRowEditor]
  }
}

