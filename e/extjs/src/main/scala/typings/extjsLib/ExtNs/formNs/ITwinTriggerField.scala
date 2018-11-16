package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITwinTriggerField
  extends extjsLib.ExtNs.formNs.fieldNs.IText {
  /** [Config Option] (Boolean) */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Get the total width of the trigger button area
  		* @returns Number The total trigger width
  		*/
  var getTriggerWidth: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Boolean) */
  var hideTrigger: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Ext.Element) */
  var inputCell: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Method] The function that should handle the trigger s click event
  		* @param e Ext.EventObject
  		*/
  var onTriggerClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[extjsLib.ExtNs.IEventObject], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var repeatTriggerClick: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the editable state of this field
  		* @param editable Boolean True to allow the user to directly edit the field text. If false is passed, the user will only be able to modify the field using the trigger. Will also add a click event to the text field which will call the trigger.
  		*/
  var setEditable: js.UndefOr[js.Function1[/* editable */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var triggerBaseCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var triggerCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.CompositeElement) */
  var triggerEl: js.UndefOr[extjsLib.ExtNs.ICompositeElement] = js.undefined
  /** [Config Option] (String) */
  var triggerNoEditCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Element) */
  var triggerWrap: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Config Option] (String) */
  var triggerWrapCls: js.UndefOr[java.lang.String] = js.undefined
}

