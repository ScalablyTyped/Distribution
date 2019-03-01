package typings
package extjsLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.utilNs.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx */ trait ISprite
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Adds one or more CSS classes to the element
  		* @param className String/String[] The CSS class to add, or an array of classes
  		* @returns Ext.draw.Sprite this
  		*/
  var addCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Performs custom animation on this object
  		* @param config Object Configuration for Ext.fx.Anim. Note that the to config is required.
  		* @returns Object this
  		*/
  var animate: js.UndefOr[js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _])] = js.undefined
  /** [Property] (Ext.dd.DragSource) */
  var dd: js.UndefOr[extjsLib.ExtNs.ddNs.IDragSource] = js.undefined
  /** [Method] Removes the sprite and clears all listeners  */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var font: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Retrieves the bounding box of the sprite
  		* @returns Object bbox
  		*/
  var getBBox: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String/String[]) */
  var group: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Hides the sprite
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.Sprite this
  		*/
  var hide: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Property] (Boolean) */
  var isSprite: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var radiusX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var radiusY: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Redraws the sprite
  		* @returns Ext.draw.Sprite this
  		*/
  var redraw: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Removes the sprite
  		* @returns Boolean True if sprite was successfully removed. False when there was no surface to remove it from.
  		*/
  var remove: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Removes one or more CSS classes from the element
  		* @param className String/String[] The CSS class to remove, or an array of classes. Note this method is severly limited in VML.
  		* @returns Ext.draw.Sprite this
  		*/
  var removeCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
  		* @returns Object this
  		*/
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Change the attributes of the sprite
  		* @param attrs Object attributes to be changed on the sprite.
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.Sprite this
  		*/
  var setAttributes: js.UndefOr[
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[scala.Boolean], this.type]
  ] = js.undefined
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
  		* @param property String/Object The style property to be set, or an object of multiple styles.
  		* @param value String The value to apply to the given property, or null if an object was passed.
  		* @returns Ext.draw.Sprite this
  		*/
  var setStyle: js.UndefOr[
    js.Function2[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Shows the sprite
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.Sprite this
  		*/
  var show: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Config Option] (String) */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopAnimation: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopFx: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Config Option] (String) */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var strokewidth: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
  		* @returns Object this
  		*/
  var syncFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object ISprite {
  @scala.inline
  def apply(
    addCls: js.Function1[/* className */ js.UndefOr[js.Any], ISprite] = null,
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
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    animate: js.Function1[/* config */ js.UndefOr[js.Any], _] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    dd: extjsLib.ExtNs.ddNs.IDragSource = null,
    destroy: js.Function0[scala.Unit] = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    fill: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    font: java.lang.String = null,
    getActiveAnimation: js.Function0[_] = null,
    getBBox: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    group: js.Any = null,
    hasActiveFx: js.Function0[_] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    height: scala.Int | scala.Double = null,
    hide: js.Function1[/* redraw */ js.UndefOr[scala.Boolean], ISprite] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ISprite] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isSprite: js.UndefOr[scala.Boolean] = js.undefined,
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
    opacity: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    radius: scala.Int | scala.Double = null,
    radiusX: scala.Int | scala.Double = null,
    radiusY: scala.Int | scala.Double = null,
    redraw: js.Function0[ISprite] = null,
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ] = null,
    remove: js.Function0[scala.Boolean] = null,
    removeCls: js.Function1[/* className */ js.UndefOr[js.Any], ISprite] = null,
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
    sequenceFx: js.Function0[_] = null,
    setAttributes: js.Function2[/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[scala.Boolean], ISprite] = null,
    setStyle: js.Function2[/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], ISprite] = null,
    show: js.Function1[/* redraw */ js.UndefOr[scala.Boolean], ISprite] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    src: java.lang.String = null,
    statics: js.Any = null,
    stopAnimation: js.Function0[extjsLib.ExtNs.IElement] = null,
    stopFx: js.Function0[extjsLib.ExtNs.IElement] = null,
    stroke: java.lang.String = null,
    strokewidth: scala.Int | scala.Double = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    syncFx: js.Function0[_] = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: extjsLib.ExtNs.Array = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): ISprite = {
    val __obj = js.Dynamic.literal()
    if (addCls != null) __obj.updateDynamic("addCls")(addCls)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (dd != null) __obj.updateDynamic("dd")(dd)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (font != null) __obj.updateDynamic("font")(font)
    if (getActiveAnimation != null) __obj.updateDynamic("getActiveAnimation")(getActiveAnimation)
    if (getBBox != null) __obj.updateDynamic("getBBox")(getBBox)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (group != null) __obj.updateDynamic("group")(group)
    if (hasActiveFx != null) __obj.updateDynamic("hasActiveFx")(hasActiveFx)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (!js.isUndefined(isSprite)) __obj.updateDynamic("isSprite")(isSprite)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusX != null) __obj.updateDynamic("radiusX")(radiusX.asInstanceOf[js.Any])
    if (radiusY != null) __obj.updateDynamic("radiusY")(radiusY.asInstanceOf[js.Any])
    if (redraw != null) __obj.updateDynamic("redraw")(redraw)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeCls != null) __obj.updateDynamic("removeCls")(removeCls)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (sequenceFx != null) __obj.updateDynamic("sequenceFx")(sequenceFx)
    if (setAttributes != null) __obj.updateDynamic("setAttributes")(setAttributes)
    if (setStyle != null) __obj.updateDynamic("setStyle")(setStyle)
    if (show != null) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (src != null) __obj.updateDynamic("src")(src)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (stopAnimation != null) __obj.updateDynamic("stopAnimation")(stopAnimation)
    if (stopFx != null) __obj.updateDynamic("stopFx")(stopFx)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokewidth != null) __obj.updateDynamic("strokewidth")(strokewidth.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (syncFx != null) __obj.updateDynamic("syncFx")(syncFx)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (un != null) __obj.updateDynamic("un")(un)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISprite]
  }
}

