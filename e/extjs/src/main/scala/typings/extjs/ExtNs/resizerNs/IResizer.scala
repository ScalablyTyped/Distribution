package typings.extjs.ExtNs.resizerNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IClass
import typings.extjs.ExtNs.IElement
import typings.extjs.ExtNs.utilNs.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizer extends IObservable {
  /** [Config Option] (Ext.Element/Ext.util.Region) */
  var constrainTo: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Ext.Element) */
  var el: js.UndefOr[IElement] = js.undefined
  /** [Method] Returns the element that was configured with the el or target config property
  		* @returns Ext.Element element
  		*/
  var getEl: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Returns the element or component that was configured with the target config property
  		* @returns Ext.Element/Ext.Component
  		*/
  var getTarget: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var handles: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var heightIncrement: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minHeight: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minWidth: js.UndefOr[Double] = js.undefined
  /** [Property] (Ext.Element/Ext.Component) */
  var originalTarget: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var pinned: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preserveRatio: js.UndefOr[Boolean] = js.undefined
  /** [Method] Perform a manual resize and fires the resize event
  		* @param width Number
  		* @param height Number
  		*/
  var resizeTo: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Property] (Ext.resizer.ResizeTracker) */
  var resizeTracker: js.UndefOr[IResizeTracker] = js.undefined
  /** [Config Option] (Ext.Element/Ext.Component) */
  var target: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var transparent: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var widthIncrement: js.UndefOr[Double] = js.undefined
}

object IResizer {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    config: js.Any = null,
    constrainTo: js.Any = null,
    dynamic: js.UndefOr[Boolean] = js.undefined,
    el: IElement = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => Boolean = null,
    getEl: () => IElement = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getTarget: () => _ = null,
    handles: java.lang.String = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hasListeners: js.Any = null,
    height: Int | Double = null,
    heightIncrement: Int | Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IResizer = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    originalTarget: js.Any = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    preserveRatio: js.UndefOr[Boolean] = js.undefined,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resizeTo: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit = null,
    resizeTracker: IResizeTracker = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    target: js.Any = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null,
    width: Int | Double = null,
    widthIncrement: Int | Double = null
  ): IResizer = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(constrainTo)
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic)
    if (el != null) __obj.updateDynamic("el")(el)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction0(getEl))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getTarget != null) __obj.updateDynamic("getTarget")(js.Any.fromFunction0(getTarget))
    if (handles != null) __obj.updateDynamic("handles")(handles)
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightIncrement != null) __obj.updateDynamic("heightIncrement")(heightIncrement.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (originalTarget != null) __obj.updateDynamic("originalTarget")(originalTarget)
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (!js.isUndefined(preserveRatio)) __obj.updateDynamic("preserveRatio")(preserveRatio)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resizeTo != null) __obj.updateDynamic("resizeTo")(js.Any.fromFunction2(resizeTo))
    if (resizeTracker != null) __obj.updateDynamic("resizeTracker")(resizeTracker)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (target != null) __obj.updateDynamic("target")(target)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widthIncrement != null) __obj.updateDynamic("widthIncrement")(widthIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizer]
  }
}

