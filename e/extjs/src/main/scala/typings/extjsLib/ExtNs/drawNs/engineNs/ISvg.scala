package typings
package extjsLib.ExtNs.drawNs.engineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISvg
  extends extjsLib.ExtNs.drawNs.ISurface {
  /** [Method] Insert or move a given sprite s element to the correct place in the DOM list for its zIndex
  		* @param sprite Ext.draw.Sprite
  		*/
  var applyZIndex: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[extjsLib.ExtNs.drawNs.ISprite], scala.Unit]] = js.undefined
  /** [Method] Get the region for the surface s canvas area
  		* @returns Ext.util.Region
  		*/
  var getRegion: js.UndefOr[js.Function0[extjsLib.ExtNs.utilNs.IRegion]] = js.undefined
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
  		* @param sprite Ext.draw.Sprite The sprite to look into.
  		* @param className String The CSS class to check for
  		* @returns Boolean True if the class exists, else false
  		*/
  var hasCls: js.UndefOr[
    js.Function2[
      /* sprite */ js.UndefOr[extjsLib.ExtNs.drawNs.ISprite], 
      /* className */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] Sets the size of the surface
  		* @param width Object
  		* @param height Object
  		*/
  @JSName("setSize")
  var setSize_ISvg: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Changes the text in the sprite element
  		* @param sprite Object
  		* @param textString Object
  		*/
  @JSName("setText")
  var setText_ISvg: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* textString */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

object ISvg {
  @scala.inline
  def apply(
    add: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    addCls: js.Function2[/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any], scala.Unit] = null,
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addGradient: js.Function1[/* gradient */ js.UndefOr[js.Any], scala.Unit] = null,
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
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    applyZIndex: js.Function1[/* sprite */ js.UndefOr[extjsLib.ExtNs.drawNs.ISprite], scala.Unit] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    getGroup: js.Function1[/* id */ js.UndefOr[java.lang.String], _] = null,
    getId: js.Function0[scala.Unit] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getRegion: js.Function0[extjsLib.ExtNs.utilNs.IRegion] = null,
    hasCls: js.Function2[
      /* sprite */ js.UndefOr[extjsLib.ExtNs.drawNs.ISprite], 
      /* className */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    height: scala.Int | scala.Double = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ISvg] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    items: extjsLib.ExtNs.Array = null,
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
    remove: js.Function2[
      /* sprite */ js.UndefOr[extjsLib.ExtNs.drawNs.ISprite], 
      /* destroySprite */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    removeAll: js.Function1[/* destroySprites */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    removeCls: js.Function2[/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any], scala.Unit] = null,
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
    self: extjsLib.ExtNs.IClass = null,
    setSize: js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], scala.Unit] = null,
    setStyle: js.Function2[/* sprite */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any], scala.Unit] = null,
    setText: js.Function2[/* sprite */ js.UndefOr[js.Any], /* textString */ js.UndefOr[js.Any], scala.Unit] = null,
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
    width: scala.Int | scala.Double = null
  ): ISvg = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (addCls != null) __obj.updateDynamic("addCls")(addCls)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addGradient != null) __obj.updateDynamic("addGradient")(addGradient)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (applyZIndex != null) __obj.updateDynamic("applyZIndex")(applyZIndex)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (getGroup != null) __obj.updateDynamic("getGroup")(getGroup)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getRegion != null) __obj.updateDynamic("getRegion")(getRegion)
    if (hasCls != null) __obj.updateDynamic("hasCls")(hasCls)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (items != null) __obj.updateDynamic("items")(items)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeAll != null) __obj.updateDynamic("removeAll")(removeAll)
    if (removeCls != null) __obj.updateDynamic("removeCls")(removeCls)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setSize != null) __obj.updateDynamic("setSize")(setSize)
    if (setStyle != null) __obj.updateDynamic("setStyle")(setStyle)
    if (setText != null) __obj.updateDynamic("setText")(setText)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (un != null) __obj.updateDynamic("un")(un)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISvg]
  }
}

