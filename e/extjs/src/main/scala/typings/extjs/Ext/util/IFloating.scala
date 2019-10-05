package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFloating extends IBase {
  /** [Method] Center this Component in its container
  		* @returns Ext.Component this
  		*/
  var center: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.undefined
  /** [Method] Moves this floating Component into a constrain region
  		* @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this floating Component was rendered.
  		*/
  var doConstrain: js.UndefOr[js.Function1[/* constrainTo */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var fixed: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var focusOnToFront: js.UndefOr[Boolean] = js.undefined
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
  		* @param active Boolean True to activate the Component, false to deactivate it.
  		* @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
  		*/
  var setActive: js.UndefOr[
    js.Function2[/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent], Unit]
  ] = js.undefined
  /** [Config Option] (String/Boolean) */
  var shadow: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var shadowOffset: js.UndefOr[Double] = js.undefined
  /** [Method] Sends this Component to the back of lower z index than any other visible windows
  		* @returns Ext.Component this
  		*/
  var toBack: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Brings this floating Component to the front of any other visible floating Components managed by the same ZIndexManag
  		* @param preventFocus Boolean Specify true to prevent the Component from being focused.
  		* @returns Ext.Component this
  		*/
  var toFront: js.UndefOr[js.Function1[/* preventFocus */ js.UndefOr[Boolean], IComponent]] = js.undefined
}

object IFloating {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    center: () => IComponent = null,
    config: js.Any = null,
    constrain: js.UndefOr[Boolean] = js.undefined,
    doConstrain: /* constrainTo */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    focusOnToFront: js.UndefOr[Boolean] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IFloating = null,
    mixins: js.Any = null,
    requires: Array = null,
    self: IClass = null,
    setActive: (/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent]) => Unit = null,
    shadow: js.Any = null,
    shadowOffset: Int | Double = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    toBack: () => IComponent = null,
    toFront: /* preventFocus */ js.UndefOr[Boolean] => IComponent = null,
    uses: Array = null
  ): IFloating = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (center != null) __obj.updateDynamic("center")(js.Any.fromFunction0(center))
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(constrain)) __obj.updateDynamic("constrain")(constrain)
    if (doConstrain != null) __obj.updateDynamic("doConstrain")(js.Any.fromFunction1(doConstrain))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (!js.isUndefined(focusOnToFront)) __obj.updateDynamic("focusOnToFront")(focusOnToFront)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setActive != null) __obj.updateDynamic("setActive")(js.Any.fromFunction2(setActive))
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toBack != null) __obj.updateDynamic("toBack")(js.Any.fromFunction0(toBack))
    if (toFront != null) __obj.updateDynamic("toFront")(js.Any.fromFunction1(toFront))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IFloating]
  }
}

