package typings.extjs.ExtNs.toolbarNs

import typings.extjs.ExtNs.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItem extends IComponent {
  /** [Method] Disable the component  */
  @JSName("disable")
  var disable_IItem: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Enable the component */
  @JSName("enable")
  var enable_IItem: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Try to focus this component
  		* @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
  		*/
  @JSName("focus")
  var focus_IItem: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Config Option] (String) */
  var overflowText: js.UndefOr[java.lang.String] = js.undefined
}

object IItem {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    disable: () => Unit = null,
    enable: () => Unit = null,
    focus: () => IComponent = null,
    overflowText: java.lang.String = null
  ): IItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction0(focus))
    if (overflowText != null) __obj.updateDynamic("overflowText")(overflowText)
    __obj.asInstanceOf[IItem]
  }
}

