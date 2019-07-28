package typings.extjs.ExtNs.ddNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IClass
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDD extends IDragDrop {
  /** [Method] Sets the element to the location of the mousedown or click event maintaining the cursor location relative to the loc
  		* @param el HTMLElement the element to move
  		* @param iPageX Number the X coordinate of the mousedown or drag event
  		* @param iPageY Number the Y coordinate of the mousedown or drag event
  		*/
  var alignElWithMouse: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[HTMLElement], 
      /* iPageX */ js.UndefOr[Double], 
      /* iPageY */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets the pointer offset to the distance between the linked element s top left corner and the location the element was
  		* @param iPageX Number the X coordinate of the click
  		* @param iPageY Number the Y coordinate of the click
  		*/
  var autoOffset: js.UndefOr[
    js.Function2[/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] Event that fires prior to the onDrag event
  		* @param e Object
  		*/
  var b4Drag: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Event that fires prior to the onMouseDown event
  		* @param e Object
  		*/
  var b4MouseDown: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Saves the most recent position so that we can reset the constraints and tick marks on demand
  		* @param iPageX Number the current x position (this just makes it so we don't have to look it up again)
  		* @param iPageY Number the current y position (this just makes it so we don't have to look it up again)
  		*/
  var cachePosition: js.UndefOr[
    js.Function2[/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Property] (Boolean) */
  var scroll: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the pointer offset
  		* @param iDeltaX Number the distance from the left
  		* @param iDeltaY Number the distance from the top
  		*/
  var setDelta: js.UndefOr[
    js.Function2[/* iDeltaX */ js.UndefOr[Double], /* iDeltaY */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] Sets the drag element to the location of the mousedown or click event maintaining the cursor location relative to th
  		* @param iPageX Number the X coordinate of the mousedown or drag event
  		* @param iPageY Number the Y coordinate of the mousedown or drag event
  		*/
  var setDragElPos: js.UndefOr[
    js.Function2[/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] toString method
  		* @returns String string representation of the dd obj
  		*/
  @JSName("toString")
  var toString_FIDD: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object IDD {
  @scala.inline
  def apply(
    addInvalidHandleClass: /* cssClass */ js.UndefOr[java.lang.String] => Unit = null,
    addInvalidHandleId: /* id */ js.UndefOr[java.lang.String] => Unit = null,
    addInvalidHandleType: /* tagName */ js.UndefOr[java.lang.String] => Unit = null,
    addToGroup: /* sGroup */ js.UndefOr[java.lang.String] => Unit = null,
    alias: Array = null,
    alignElWithMouse: (/* el */ js.UndefOr[HTMLElement], /* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Unit = null,
    alternateClassName: js.Any = null,
    applyConfig: () => Unit = null,
    autoOffset: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Unit = null,
    available: js.UndefOr[Boolean] = js.undefined,
    b4Drag: /* e */ js.UndefOr[js.Any] => Unit = null,
    b4MouseDown: /* e */ js.UndefOr[js.Any] => Unit = null,
    cachePosition: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearConstraints: () => Unit = null,
    clearTicks: () => Unit = null,
    config: js.Any = null,
    constrainTo: (/* constrainTo */ js.UndefOr[js.Any], /* pad */ js.UndefOr[js.Any], /* inContent */ js.UndefOr[Boolean]) => Unit = null,
    defaultPadding: js.Any = null,
    destroy: () => Unit = null,
    endDrag: /* e */ js.UndefOr[Event] => Unit = null,
    extend: java.lang.String = null,
    getDragEl: () => HTMLElement = null,
    getEl: () => HTMLElement = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    groups: js.Any = null,
    hasOuterHandles: js.UndefOr[Boolean] = js.undefined,
    id: java.lang.String = null,
    ignoreSelf: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    init: (/* id */ js.UndefOr[java.lang.String], /* sGroup */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[js.Any]) => Unit = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IDD = null,
    initTarget: (/* id */ js.UndefOr[java.lang.String], /* sGroup */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[js.Any]) => Unit = null,
    invalidHandleClasses: Array = null,
    invalidHandleIds: js.Any = null,
    invalidHandleTypes: js.Any = null,
    isLocked: () => Boolean = null,
    isTarget: js.UndefOr[Boolean] = js.undefined,
    isValidHandleChild: /* node */ js.UndefOr[HTMLElement] => Boolean = null,
    lock: () => Unit = null,
    maintainOffset: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    moveOnly: js.UndefOr[Boolean] = js.undefined,
    onAvailable: () => Unit = null,
    onDrag: /* e */ js.UndefOr[Event] => Unit = null,
    onDragDrop: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit = null,
    onDragEnter: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit = null,
    onDragOut: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit = null,
    onDragOver: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit = null,
    onInvalidDrop: /* e */ js.UndefOr[Event] => Unit = null,
    onMouseDown: /* e */ js.UndefOr[Event] => Unit = null,
    onMouseUp: /* e */ js.UndefOr[Event] => Unit = null,
    padding: Array = null,
    primaryButtonOnly: js.UndefOr[Boolean] = js.undefined,
    removeFromGroup: /* sGroup */ js.UndefOr[java.lang.String] => Unit = null,
    removeInvalidHandleClass: /* cssClass */ js.UndefOr[java.lang.String] => Unit = null,
    removeInvalidHandleId: /* id */ js.UndefOr[java.lang.String] => Unit = null,
    removeInvalidHandleType: /* tagName */ js.UndefOr[java.lang.String] => Unit = null,
    requires: Array = null,
    resetConstraints: /* maintainOffset */ js.UndefOr[Boolean] => Unit = null,
    scroll: js.UndefOr[Boolean] = js.undefined,
    self: IClass = null,
    setDelta: (/* iDeltaX */ js.UndefOr[Double], /* iDeltaY */ js.UndefOr[Double]) => Unit = null,
    setDragElId: /* id */ js.UndefOr[java.lang.String] => Unit = null,
    setDragElPos: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Unit = null,
    setHandleElId: /* id */ js.UndefOr[java.lang.String] => Unit = null,
    setInitPosition: (/* diffX */ js.UndefOr[Double], /* diffY */ js.UndefOr[Double]) => Unit = null,
    setOuterHandleElId: /* id */ js.UndefOr[java.lang.String] => Unit = null,
    setPadding: (/* iTop */ js.UndefOr[Double], /* iRight */ js.UndefOr[Double], /* iBot */ js.UndefOr[Double], /* iLeft */ js.UndefOr[Double]) => Unit = null,
    setXConstraint: (/* iLeft */ js.UndefOr[Double], /* iRight */ js.UndefOr[Double], /* iTickSize */ js.UndefOr[Double]) => Unit = null,
    setYConstraint: (/* iUp */ js.UndefOr[Double], /* iDown */ js.UndefOr[Double], /* iTickSize */ js.UndefOr[Double]) => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    startDrag: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit = null,
    statics: js.Any = null,
    toString: () => java.lang.String = null,
    unlock: () => Unit = null,
    unreg: () => Unit = null,
    uses: Array = null,
    xTicks: Array = null,
    yTicks: Array = null
  ): IDD = {
    val __obj = js.Dynamic.literal()
    if (addInvalidHandleClass != null) __obj.updateDynamic("addInvalidHandleClass")(js.Any.fromFunction1(addInvalidHandleClass))
    if (addInvalidHandleId != null) __obj.updateDynamic("addInvalidHandleId")(js.Any.fromFunction1(addInvalidHandleId))
    if (addInvalidHandleType != null) __obj.updateDynamic("addInvalidHandleType")(js.Any.fromFunction1(addInvalidHandleType))
    if (addToGroup != null) __obj.updateDynamic("addToGroup")(js.Any.fromFunction1(addToGroup))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alignElWithMouse != null) __obj.updateDynamic("alignElWithMouse")(js.Any.fromFunction3(alignElWithMouse))
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (applyConfig != null) __obj.updateDynamic("applyConfig")(js.Any.fromFunction0(applyConfig))
    if (autoOffset != null) __obj.updateDynamic("autoOffset")(js.Any.fromFunction2(autoOffset))
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available)
    if (b4Drag != null) __obj.updateDynamic("b4Drag")(js.Any.fromFunction1(b4Drag))
    if (b4MouseDown != null) __obj.updateDynamic("b4MouseDown")(js.Any.fromFunction1(b4MouseDown))
    if (cachePosition != null) __obj.updateDynamic("cachePosition")(js.Any.fromFunction2(cachePosition))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearConstraints != null) __obj.updateDynamic("clearConstraints")(js.Any.fromFunction0(clearConstraints))
    if (clearTicks != null) __obj.updateDynamic("clearTicks")(js.Any.fromFunction0(clearTicks))
    if (config != null) __obj.updateDynamic("config")(config)
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(js.Any.fromFunction3(constrainTo))
    if (defaultPadding != null) __obj.updateDynamic("defaultPadding")(defaultPadding)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (endDrag != null) __obj.updateDynamic("endDrag")(js.Any.fromFunction1(endDrag))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDragEl != null) __obj.updateDynamic("getDragEl")(js.Any.fromFunction0(getDragEl))
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction0(getEl))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (!js.isUndefined(hasOuterHandles)) __obj.updateDynamic("hasOuterHandles")(hasOuterHandles)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(ignoreSelf)) __obj.updateDynamic("ignoreSelf")(ignoreSelf)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction3(init))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initTarget != null) __obj.updateDynamic("initTarget")(js.Any.fromFunction3(initTarget))
    if (invalidHandleClasses != null) __obj.updateDynamic("invalidHandleClasses")(invalidHandleClasses)
    if (invalidHandleIds != null) __obj.updateDynamic("invalidHandleIds")(invalidHandleIds)
    if (invalidHandleTypes != null) __obj.updateDynamic("invalidHandleTypes")(invalidHandleTypes)
    if (isLocked != null) __obj.updateDynamic("isLocked")(js.Any.fromFunction0(isLocked))
    if (!js.isUndefined(isTarget)) __obj.updateDynamic("isTarget")(isTarget)
    if (isValidHandleChild != null) __obj.updateDynamic("isValidHandleChild")(js.Any.fromFunction1(isValidHandleChild))
    if (lock != null) __obj.updateDynamic("lock")(js.Any.fromFunction0(lock))
    if (!js.isUndefined(maintainOffset)) __obj.updateDynamic("maintainOffset")(maintainOffset)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (!js.isUndefined(moveOnly)) __obj.updateDynamic("moveOnly")(moveOnly)
    if (onAvailable != null) __obj.updateDynamic("onAvailable")(js.Any.fromFunction0(onAvailable))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(js.Any.fromFunction2(onDragDrop))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction2(onDragEnter))
    if (onDragOut != null) __obj.updateDynamic("onDragOut")(js.Any.fromFunction2(onDragOut))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction2(onDragOver))
    if (onInvalidDrop != null) __obj.updateDynamic("onInvalidDrop")(js.Any.fromFunction1(onInvalidDrop))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(primaryButtonOnly)) __obj.updateDynamic("primaryButtonOnly")(primaryButtonOnly)
    if (removeFromGroup != null) __obj.updateDynamic("removeFromGroup")(js.Any.fromFunction1(removeFromGroup))
    if (removeInvalidHandleClass != null) __obj.updateDynamic("removeInvalidHandleClass")(js.Any.fromFunction1(removeInvalidHandleClass))
    if (removeInvalidHandleId != null) __obj.updateDynamic("removeInvalidHandleId")(js.Any.fromFunction1(removeInvalidHandleId))
    if (removeInvalidHandleType != null) __obj.updateDynamic("removeInvalidHandleType")(js.Any.fromFunction1(removeInvalidHandleType))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resetConstraints != null) __obj.updateDynamic("resetConstraints")(js.Any.fromFunction1(resetConstraints))
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDelta != null) __obj.updateDynamic("setDelta")(js.Any.fromFunction2(setDelta))
    if (setDragElId != null) __obj.updateDynamic("setDragElId")(js.Any.fromFunction1(setDragElId))
    if (setDragElPos != null) __obj.updateDynamic("setDragElPos")(js.Any.fromFunction2(setDragElPos))
    if (setHandleElId != null) __obj.updateDynamic("setHandleElId")(js.Any.fromFunction1(setHandleElId))
    if (setInitPosition != null) __obj.updateDynamic("setInitPosition")(js.Any.fromFunction2(setInitPosition))
    if (setOuterHandleElId != null) __obj.updateDynamic("setOuterHandleElId")(js.Any.fromFunction1(setOuterHandleElId))
    if (setPadding != null) __obj.updateDynamic("setPadding")(js.Any.fromFunction4(setPadding))
    if (setXConstraint != null) __obj.updateDynamic("setXConstraint")(js.Any.fromFunction3(setXConstraint))
    if (setYConstraint != null) __obj.updateDynamic("setYConstraint")(js.Any.fromFunction3(setYConstraint))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (startDrag != null) __obj.updateDynamic("startDrag")(js.Any.fromFunction2(startDrag))
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    if (unlock != null) __obj.updateDynamic("unlock")(js.Any.fromFunction0(unlock))
    if (unreg != null) __obj.updateDynamic("unreg")(js.Any.fromFunction0(unreg))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (xTicks != null) __obj.updateDynamic("xTicks")(xTicks)
    if (yTicks != null) __obj.updateDynamic("yTicks")(yTicks)
    __obj.asInstanceOf[IDD]
  }
}

