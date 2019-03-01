package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizable
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Config Option] (Ext.Element/Ext.util.Region) */
  var constrainTo: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[scala.Boolean] = js.undefined
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
  var height: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var heightIncrement: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Ext.Element/Ext.Component) */
  var originalTarget: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preserveRatio: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Perform a manual resize and fires the resize event
  		* @param width Number
  		* @param height Number
  		*/
  var resizeTo: js.UndefOr[
    js.Function2[
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Ext.resizer.ResizeTracker) */
  var resizeTracker: js.UndefOr[extjsLib.ExtNs.resizerNs.IResizeTracker] = js.undefined
  /** [Config Option] (Ext.Element/Ext.Component) */
  var target: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var widthIncrement: js.UndefOr[scala.Double] = js.undefined
}

object IResizable {
  @scala.inline
  def apply(
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    addManagedListener: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    constrainTo: js.Any = null,
    dynamic: js.UndefOr[scala.Boolean] = js.undefined,
    el: IElement = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[Array], 
      scala.Boolean
    ] = null,
    getEl: js.Function0[IElement] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getTarget: js.Function0[_] = null,
    handles: java.lang.String = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    height: scala.Int | scala.Double = null,
    heightIncrement: scala.Int | scala.Double = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IResizable] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    listeners: js.Any = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    mon: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    mun: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    on: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    originalTarget: js.Any = null,
    pinned: js.UndefOr[scala.Boolean] = js.undefined,
    preserveRatio: js.UndefOr[scala.Boolean] = js.undefined,
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ] = null,
    removeListener: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    requires: Array = null,
    resizeTo: js.Function2[
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    resizeTracker: extjsLib.ExtNs.resizerNs.IResizeTracker = null,
    resumeEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    resumeEvents: js.Function0[scala.Unit] = null,
    self: IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    target: js.Any = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: Array = null,
    width: scala.Int | scala.Double = null,
    widthIncrement: scala.Int | scala.Double = null
  ): IResizable = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(constrainTo)
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic)
    if (el != null) __obj.updateDynamic("el")(el)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (getEl != null) __obj.updateDynamic("getEl")(getEl)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getTarget != null) __obj.updateDynamic("getTarget")(getTarget)
    if (handles != null) __obj.updateDynamic("handles")(handles)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightIncrement != null) __obj.updateDynamic("heightIncrement")(heightIncrement.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (originalTarget != null) __obj.updateDynamic("originalTarget")(originalTarget)
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (!js.isUndefined(preserveRatio)) __obj.updateDynamic("preserveRatio")(preserveRatio)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resizeTo != null) __obj.updateDynamic("resizeTo")(resizeTo)
    if (resizeTracker != null) __obj.updateDynamic("resizeTracker")(resizeTracker)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (target != null) __obj.updateDynamic("target")(target)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (un != null) __obj.updateDynamic("un")(un)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widthIncrement != null) __obj.updateDynamic("widthIncrement")(widthIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizable]
  }
}

