package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHidden
  extends extjsLib.ExtNs.formNs.fieldNs.IBase {
  /** [Method] Display one or more error messages associated with this field using msgTarget to determine how to display the messag  */
  @JSName("markInvalid")
  var markInvalid_IHidden: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the height of the component
  		* @returns Ext.Component this
  		*/
  @JSName("setHeight")
  var setHeight_IHidden: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Sets the page XY position of the component
  		* @returns Ext.Component this
  		*/
  @JSName("setPagePosition")
  var setPagePosition_IHidden: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Sets the left and top of the component
  		* @returns Ext.Component this
  		*/
  @JSName("setPosition")
  var setPosition_IHidden: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Sets the width and height of this Component
  		* @returns Ext.Component this
  		*/
  @JSName("setSize")
  var setSize_IHidden: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Sets the width of the component
  		* @returns Ext.Component this
  		*/
  @JSName("setWidth")
  var setWidth_IHidden: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
}

object IHidden {
  @scala.inline
  def apply(
    IBase: extjsLib.ExtNs.formNs.fieldNs.IBase = null,
    clearInvalid: () => scala.Unit = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hideLabel: js.UndefOr[scala.Boolean] = js.undefined,
    initComponent: () => scala.Unit = null,
    initEvents: () => scala.Unit = null,
    inputType: java.lang.String = null,
    markInvalid: () => scala.Unit = null,
    setHeight: () => extjsLib.ExtNs.IComponent = null,
    setPagePosition: () => extjsLib.ExtNs.IComponent = null,
    setPosition: () => extjsLib.ExtNs.IComponent = null,
    setSize: () => extjsLib.ExtNs.IComponent = null,
    setWidth: () => extjsLib.ExtNs.IComponent = null
  ): IHidden = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBase)
    if (clearInvalid != null) __obj.updateDynamic("clearInvalid")(js.Any.fromFunction0(clearInvalid))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(hideLabel)) __obj.updateDynamic("hideLabel")(hideLabel)
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (initEvents != null) __obj.updateDynamic("initEvents")(js.Any.fromFunction0(initEvents))
    if (inputType != null) __obj.updateDynamic("inputType")(inputType)
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(js.Any.fromFunction0(markInvalid))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction0(setHeight))
    if (setPagePosition != null) __obj.updateDynamic("setPagePosition")(js.Any.fromFunction0(setPagePosition))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction0(setPosition))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction0(setSize))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction0(setWidth))
    __obj.asInstanceOf[IHidden]
  }
}

