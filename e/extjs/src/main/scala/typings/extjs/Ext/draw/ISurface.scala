package typings.extjs.Ext.draw

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurface extends IObservable {
  /** [Method] Adds a Sprite to the surface
  		* @param args Ext.draw.Sprite[]/Ext.draw.Sprite... One or more Sprite objects or configs.
  		* @returns Ext.draw.Sprite[]/Ext.draw.Sprite The sprites added.
  		*/
  var add: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Adds one or more CSS classes to the element
  		* @param sprite Object The sprite to add the class to.
  		* @param className String/String[] The CSS class to add, or an array of classes
  		*/
  var addCls: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Adds a gradient definition to the Surface
  		* @param gradient Object A gradient config.
  		*/
  var addGradient: js.UndefOr[js.Function1[/* gradient */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Destroys the surface  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns a new group or an existent group associated with the current surface
  		* @param id String The unique identifier of the group.
  		* @returns Object The Ext.draw.CompositeSprite.
  		*/
  var getGroup: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Retrieves the id of this component  */
  var getId: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Ext.draw.Sprite[]) */
  var items: js.UndefOr[Array] = js.undefined
  /** [Method] Removes a given sprite from the surface optionally destroying the sprite in the process
  		* @param sprite Ext.draw.Sprite
  		* @param destroySprite Boolean
  		*/
  var remove: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Removes all sprites from the surface optionally destroying the sprites in the process
  		* @param destroySprites Boolean Whether to destroy all sprites when removing them.
  		*/
  var removeAll: js.UndefOr[js.Function1[/* destroySprites */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Removes one or more CSS classes from the element
  		* @param sprite Object The sprite to remove the class from.
  		* @param className String/String[] The CSS class to remove, or an array of classes
  		*/
  var removeCls: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Sets the size of the surface
  		* @param w Number The new width of the canvas.
  		* @param h Number The new height of the canvas.
  		*/
  var setSize: js.UndefOr[js.Function2[/* w */ js.UndefOr[Double], /* h */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets CSS style attributes to an element
  		* @param sprite Object The sprite to add, or an array of classes to
  		* @param styles Object An Object with CSS styles.
  		*/
  var setStyle: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Changes the text in the sprite element
  		* @param sprite Object The Sprite to change the text.
  		* @param text String The new text to be set.
  		*/
  var setText: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* text */ js.UndefOr[java.lang.String], Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.undefined
}

object ISurface {
  @scala.inline
  def apply(
    add: /* args */ js.UndefOr[js.Any] => _ = null,
    addCls: (/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addGradient: /* gradient */ js.UndefOr[js.Any] => Unit = null,
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
    destroy: () => Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => Boolean = null,
    getGroup: /* id */ js.UndefOr[java.lang.String] => _ = null,
    getId: () => Unit = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hasListeners: js.Any = null,
    height: Int | Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ISurface = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    items: Array = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    remove: (/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean]) => Unit = null,
    removeAll: /* destroySprites */ js.UndefOr[Boolean] => Unit = null,
    removeCls: (/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    self: IClass = null,
    setSize: (/* w */ js.UndefOr[Double], /* h */ js.UndefOr[Double]) => Unit = null,
    setStyle: (/* sprite */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any]) => Unit = null,
    setText: (/* sprite */ js.UndefOr[js.Any], /* text */ js.UndefOr[java.lang.String]) => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null,
    width: Int | Double = null
  ): ISurface = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction2(addCls))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addGradient != null) __obj.updateDynamic("addGradient")(js.Any.fromFunction1(addGradient))
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
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getGroup != null) __obj.updateDynamic("getGroup")(js.Any.fromFunction1(getGroup))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (items != null) __obj.updateDynamic("items")(items)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2(remove))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1(removeAll))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction2(removeCls))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction2(setStyle))
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction2(setText))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISurface]
  }
}

