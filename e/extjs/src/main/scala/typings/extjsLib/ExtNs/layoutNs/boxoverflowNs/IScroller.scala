package typings
package extjsLib.ExtNs.layoutNs.boxoverflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScroller
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Config Option] (String) */
  var afterCtCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var afterScrollerCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var animateScroll: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var beforeCtCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var beforeScrollerCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the current scroll position of the innerCt element
  		* @returns Number The current scroll position
  		*/
  var getScrollPosition: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Number) */
  var scrollDuration: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var scrollIncrement: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var scrollRepeatInterval: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Scrolls to the given component
  		* @param item String/Number/Ext.Component The item to scroll to. Can be a numerical index, component id or a reference to the component itself.
  		* @param animate Boolean True to animate the scrolling
  		*/
  var scrollToItem: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* animate */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var scrollerCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var wheelIncrement: js.UndefOr[scala.Double] = js.undefined
}

object IScroller {
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
    afterCtCls: java.lang.String = null,
    afterScrollerCls: java.lang.String = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    animateScroll: js.UndefOr[scala.Boolean] = js.undefined,
    beforeCtCls: java.lang.String = null,
    beforeScrollerCls: java.lang.String = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getScrollPosition: js.Function0[scala.Double] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IScroller] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    listeners: js.Any = null,
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
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
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
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    resumeEvents: js.Function0[scala.Unit] = null,
    scrollDuration: scala.Int | scala.Double = null,
    scrollIncrement: scala.Int | scala.Double = null,
    scrollRepeatInterval: scala.Int | scala.Double = null,
    scrollToItem: js.Function2[/* item */ js.UndefOr[js.Any], /* animate */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    scrollerCls: java.lang.String = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: extjsLib.ExtNs.Array = null,
    wheelIncrement: scala.Int | scala.Double = null
  ): IScroller = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (afterCtCls != null) __obj.updateDynamic("afterCtCls")(afterCtCls)
    if (afterScrollerCls != null) __obj.updateDynamic("afterScrollerCls")(afterScrollerCls)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(animateScroll)) __obj.updateDynamic("animateScroll")(animateScroll)
    if (beforeCtCls != null) __obj.updateDynamic("beforeCtCls")(beforeCtCls)
    if (beforeScrollerCls != null) __obj.updateDynamic("beforeScrollerCls")(beforeScrollerCls)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getScrollPosition != null) __obj.updateDynamic("getScrollPosition")(getScrollPosition)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (scrollDuration != null) __obj.updateDynamic("scrollDuration")(scrollDuration.asInstanceOf[js.Any])
    if (scrollIncrement != null) __obj.updateDynamic("scrollIncrement")(scrollIncrement.asInstanceOf[js.Any])
    if (scrollRepeatInterval != null) __obj.updateDynamic("scrollRepeatInterval")(scrollRepeatInterval.asInstanceOf[js.Any])
    if (scrollToItem != null) __obj.updateDynamic("scrollToItem")(scrollToItem)
    if (scrollerCls != null) __obj.updateDynamic("scrollerCls")(scrollerCls)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (un != null) __obj.updateDynamic("un")(un)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (wheelIncrement != null) __obj.updateDynamic("wheelIncrement")(wheelIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScroller]
  }
}

