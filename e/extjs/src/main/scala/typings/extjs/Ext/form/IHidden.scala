package typings.extjs.Ext.form

import typings.extjs.Ext.IComponent
import typings.extjs.Ext.form.field.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHidden extends IBase {
  /** [Method] Display one or more error messages associated with this field using msgTarget to determine how to display the messag  */
  @JSName("markInvalid")
  var markInvalid_IHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the height of the component
    * @returns Ext.Component this
    */
  @JSName("setHeight")
  var setHeight_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Sets the page XY position of the component
    * @returns Ext.Component this
    */
  @JSName("setPagePosition")
  var setPagePosition_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Sets the left and top of the component
    * @returns Ext.Component this
    */
  @JSName("setPosition")
  var setPosition_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Sets the width and height of this Component
    * @returns Ext.Component this
    */
  @JSName("setSize")
  var setSize_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Sets the width of the component
    * @returns Ext.Component this
    */
  @JSName("setWidth")
  var setWidth_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
}

object IHidden {
  @scala.inline
  def apply(
    IBase: IBase = null,
    markInvalid: () => Unit = null,
    setHeight: () => IComponent = null,
    setPagePosition: () => IComponent = null,
    setPosition: () => IComponent = null,
    setSize: () => IComponent = null,
    setWidth: () => IComponent = null
  ): IHidden = {
    val __obj = js.Dynamic.literal()
    if (IBase != null) js.Dynamic.global.Object.assign(__obj, IBase)
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(js.Any.fromFunction0(markInvalid))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction0(setHeight))
    if (setPagePosition != null) __obj.updateDynamic("setPagePosition")(js.Any.fromFunction0(setPagePosition))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction0(setPosition))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction0(setSize))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction0(setWidth))
    __obj.asInstanceOf[IHidden]
  }
}

