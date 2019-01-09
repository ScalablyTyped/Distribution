package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditor
  extends extjsLib.ExtNs.containerNs.IContainer {
  /** [Method] private
  		* @param ct Object
  		* @param position Object
  		*/
  @JSName("afterRender")
  var afterRender_IEditor: js.UndefOr[
    js.Function2[/* ct */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var allowBlur: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var autoSize: js.UndefOr[js.Any] = js.undefined
  /** [Method] Cancels the editing process and hides the editor without persisting any changes
  		* @param remainVisible Boolean Override the default behavior and keep the editor visible after cancel
  		*/
  var cancelEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var cancelOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Ends the editing process persists the changed value to the underlying field and hides the editor
  		* @param remainVisible Boolean Override the default behavior and keep the editor visible after edit
  		*/
  var completeEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var completeOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.form.field.Field) */
  var field: js.UndefOr[extjsLib.ExtNs.formNs.fieldNs.IField] = js.undefined
  /** [Method] Gets the data value of the editor
  		* @returns Object The data value
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var hideEl: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreNoChange: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number[]) */
  var offsets: js.UndefOr[Array] = js.undefined
  /** [Method] private */
  @JSName("onHide")
  var onHide_IEditor: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] private */
  @JSName("onShow")
  var onShow_IEditor: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var parentEl: js.UndefOr[js.Any] = js.undefined
  /** [Method] Realigns the editor to the bound field based on the current alignment config value
  		* @param autoSize Boolean True to size the field to the dimensions of the bound element.
  		*/
  var realign: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var revertInvalid: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the data value of the editor
  		* @param value Object Any valid value supported by the underlying field
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Starts the editing process and shows the editor
  		* @param el String/HTMLElement/Ext.Element The element to edit
  		* @param value String A value to initialize the editor with. If a value is not provided, it defaults to the innerHTML of el.
  		*/
  var startEdit: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var swallowKeys: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var updateEl: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
}

