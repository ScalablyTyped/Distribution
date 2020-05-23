package typings.extjs.Ext.draw

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IElement
import typings.extjs.Ext.dd.IDragSource
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx */ trait ISprite extends IObservable {
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
  var dd: js.UndefOr[IDragSource] = js.undefined
  /** [Method] Removes the sprite and clears all listeners  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var fill: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var font: js.UndefOr[String] = js.undefined
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
  var height: js.UndefOr[Double] = js.undefined
  /** [Method] Hides the sprite
    * @param redraw Boolean Flag to immediately draw the change.
    * @returns Ext.draw.Sprite this
    */
  var hide: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.undefined
  /** [Property] (Boolean) */
  var isSprite: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var opacity: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var path: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var radiusX: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var radiusY: js.UndefOr[Double] = js.undefined
  /** [Method] Redraws the sprite
    * @returns Ext.draw.Sprite this
    */
  var redraw: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Removes the sprite
    * @returns Boolean True if sprite was successfully removed. False when there was no surface to remove it from.
    */
  var remove: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
    * @param property String/Object The style property to be set, or an object of multiple styles.
    * @param value String The value to apply to the given property, or null if an object was passed.
    * @returns Ext.draw.Sprite this
    */
  var setStyle: js.UndefOr[
    js.Function2[/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], this.type]
  ] = js.undefined
  /** [Method] Shows the sprite
    * @param redraw Boolean Flag to immediately draw the change.
    * @returns Ext.draw.Sprite this
    */
  var show: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.undefined
  /** [Config Option] (String) */
  var src: js.UndefOr[String] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Config Option] (String) */
  var stroke: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var strokewidth: js.UndefOr[Double] = js.undefined
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
    * @returns Object this
    */
  var syncFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.undefined
}

object ISprite {
  @scala.inline
  def apply(
    addCls: /* className */ js.UndefOr[js.Any] => ISprite = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    animate: js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _]) = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    config: js.Any = null,
    dd: IDragSource = null,
    destroy: () => Unit = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    fill: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => Boolean = null,
    font: String = null,
    getActiveAnimation: () => _ = null,
    getBBox: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    group: js.Any = null,
    hasActiveFx: () => _ = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    hasListeners: js.Any = null,
    height: js.UndefOr[Double] = js.undefined,
    hide: /* redraw */ js.UndefOr[Boolean] => ISprite = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ISprite = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isSprite: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    opacity: js.UndefOr[Double] = js.undefined,
    path: String = null,
    radius: js.UndefOr[Double] = js.undefined,
    radiusX: js.UndefOr[Double] = js.undefined,
    radiusY: js.UndefOr[Double] = js.undefined,
    redraw: () => ISprite = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => _ = null,
    remove: () => Boolean = null,
    removeCls: /* className */ js.UndefOr[js.Any] => ISprite = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    self: IClass = null,
    sequenceFx: () => _ = null,
    setAttributes: (/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean]) => ISprite = null,
    setStyle: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => ISprite = null,
    show: /* redraw */ js.UndefOr[Boolean] => ISprite = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    statics: js.Any = null,
    stopAnimation: () => IElement = null,
    stopFx: () => IElement = null,
    stroke: String = null,
    strokewidth: js.UndefOr[Double] = js.undefined,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    syncFx: () => _ = null,
    text: String = null,
    `type`: String = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): ISprite = {
    val __obj = js.Dynamic.literal()
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction1(addCls))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (dd != null) __obj.updateDynamic("dd")(dd.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (getActiveAnimation != null) __obj.updateDynamic("getActiveAnimation")(js.Any.fromFunction0(getActiveAnimation))
    if (getBBox != null) __obj.updateDynamic("getBBox")(js.Any.fromFunction0(getBBox))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (hasActiveFx != null) __obj.updateDynamic("hasActiveFx")(js.Any.fromFunction0(hasActiveFx))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSprite)) __obj.updateDynamic("isSprite")(isSprite.get.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusX)) __obj.updateDynamic("radiusX")(radiusX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusY)) __obj.updateDynamic("radiusY")(radiusY.get.asInstanceOf[js.Any])
    if (redraw != null) __obj.updateDynamic("redraw")(js.Any.fromFunction0(redraw))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction0(remove))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction1(removeCls))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (sequenceFx != null) __obj.updateDynamic("sequenceFx")(js.Any.fromFunction0(sequenceFx))
    if (setAttributes != null) __obj.updateDynamic("setAttributes")(js.Any.fromFunction2(setAttributes))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction2(setStyle))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (stopAnimation != null) __obj.updateDynamic("stopAnimation")(js.Any.fromFunction0(stopAnimation))
    if (stopFx != null) __obj.updateDynamic("stopFx")(js.Any.fromFunction0(stopFx))
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(strokewidth)) __obj.updateDynamic("strokewidth")(strokewidth.get.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (syncFx != null) __obj.updateDynamic("syncFx")(js.Any.fromFunction0(syncFx))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISprite]
  }
}

