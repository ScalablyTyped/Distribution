package typings
package extjsLib.ExtNs.formNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHidden extends IBase {
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
    IBase: IBase = null,
    clearInvalid: js.Function0[scala.Unit] = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hideLabel: js.UndefOr[scala.Boolean] = js.undefined,
    initComponent: js.Function0[scala.Unit] = null,
    initEvents: js.Function0[scala.Unit] = null,
    inputType: java.lang.String = null,
    markInvalid: js.Function0[scala.Unit] = null,
    setHeight: js.Function0[extjsLib.ExtNs.IComponent] = null,
    setPagePosition: js.Function0[extjsLib.ExtNs.IComponent] = null,
    setPosition: js.Function0[extjsLib.ExtNs.IComponent] = null,
    setSize: js.Function0[extjsLib.ExtNs.IComponent] = null,
    setWidth: js.Function0[extjsLib.ExtNs.IComponent] = null
  ): IHidden = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBase)
    if (clearInvalid != null) __obj.updateDynamic("clearInvalid")(clearInvalid)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(hideLabel)) __obj.updateDynamic("hideLabel")(hideLabel)
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    if (initEvents != null) __obj.updateDynamic("initEvents")(initEvents)
    if (inputType != null) __obj.updateDynamic("inputType")(inputType)
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(markInvalid)
    if (setHeight != null) __obj.updateDynamic("setHeight")(setHeight)
    if (setPagePosition != null) __obj.updateDynamic("setPagePosition")(setPagePosition)
    if (setPosition != null) __obj.updateDynamic("setPosition")(setPosition)
    if (setSize != null) __obj.updateDynamic("setSize")(setSize)
    if (setWidth != null) __obj.updateDynamic("setWidth")(setWidth)
    __obj.asInstanceOf[IHidden]
  }
}

