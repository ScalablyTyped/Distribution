package typings.extjs.Ext.grid.header

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.dd.IDragDrop
import typings.extjs.Ext.dd.IStatusProxy
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragZone
  extends typings.extjs.Ext.dd.IDragZone

object IDragZone {
  @scala.inline
  def apply(
    addInvalidHandleClass: /* cssClass */ js.UndefOr[String] => Unit = null,
    addInvalidHandleId: /* id */ js.UndefOr[String] => Unit = null,
    addInvalidHandleType: /* tagName */ js.UndefOr[String] => Unit = null,
    addToGroup: /* sGroup */ js.UndefOr[String] => Unit = null,
    afterDragDrop: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Unit = null,
    afterDragEnter: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Unit = null,
    afterDragOut: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Unit = null,
    afterDragOver: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Unit = null,
    afterInvalidDrop: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Unit = null,
    afterValidDrop: (/* target */ js.UndefOr[js.Any], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Unit = null,
    alias: Array = null,
    alignElWithMouse: () => Unit = null,
    alternateClassName: js.Any = null,
    animRepair: js.UndefOr[Boolean] = js.undefined,
    applyConfig: () => Unit = null,
    autoOffset: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Unit = null,
    available: js.UndefOr[Boolean] = js.undefined,
    b4Drag: /* e */ js.UndefOr[js.Any] => Unit = null,
    b4MouseDown: /* e */ js.UndefOr[js.Any] => Unit = null,
    beforeDragDrop: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Boolean = null,
    beforeDragEnter: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Boolean = null,
    beforeDragOut: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Boolean = null,
    beforeDragOver: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Boolean = null,
    beforeInvalidDrop: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Boolean = null,
    cachePosition: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    centerFrame: js.UndefOr[Boolean] = js.undefined,
    clearConstraints: () => Unit = null,
    clearTicks: () => Unit = null,
    config: js.Any = null,
    constrainTo: (/* constrainTo */ js.UndefOr[js.Any], /* pad */ js.UndefOr[js.Any], /* inContent */ js.UndefOr[Boolean]) => Unit = null,
    containerScroll: js.Any = null,
    createFrame: () => Unit = null,
    ddGroup: String = null,
    defaultPadding: js.Any = null,
    destroy: () => Unit = null,
    dragData: js.Any = null,
    dragElId: String = null,
    dropAllowed: String = null,
    dropNotAllowed: String = null,
    endDrag: /* e */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    getDragData: /* e */ js.UndefOr[Event_] => _ = null,
    getDragEl: () => HTMLElement = null,
    getEl: () => HTMLElement = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getProxy: () => IStatusProxy = null,
    getRepairXY: /* e */ js.UndefOr[Event_] => Array = null,
    groups: js.Any = null,
    hasOuterHandles: js.UndefOr[Boolean] = js.undefined,
    hideProxy: () => Unit = null,
    id: String = null,
    ignoreSelf: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    init: (/* id */ js.UndefOr[String], /* sGroup */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => Unit = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IDragZone = null,
    initFrame: () => Unit = null,
    initTarget: (/* id */ js.UndefOr[String], /* sGroup */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => Unit = null,
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
    onBeforeDrag: (/* data */ js.UndefOr[js.Any], /* e */ js.UndefOr[Event_]) => Boolean = null,
    onDrag: /* e */ js.UndefOr[Event_] => Unit = null,
    onDragDrop: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[js.Any]) => Unit = null,
    onDragEnter: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[js.Any]) => Unit = null,
    onDragOut: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[js.Any]) => Unit = null,
    onDragOver: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[js.Any]) => Unit = null,
    onInitDrag: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Boolean = null,
    onInvalidDrop: /* e */ js.UndefOr[Event_] => Unit = null,
    onMouseDown: /* e */ js.UndefOr[Event_] => Unit = null,
    onMouseUp: /* e */ js.UndefOr[Event_] => Unit = null,
    onStartDrag: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit = null,
    padding: Array = null,
    primaryButtonOnly: js.UndefOr[Boolean] = js.undefined,
    removeFromGroup: /* sGroup */ js.UndefOr[String] => Unit = null,
    removeInvalidHandleClass: /* cssClass */ js.UndefOr[String] => Unit = null,
    removeInvalidHandleId: /* id */ js.UndefOr[String] => Unit = null,
    removeInvalidHandleType: /* tagName */ js.UndefOr[String] => Unit = null,
    repairHighlightColor: String = null,
    requires: Array = null,
    resetConstraints: /* maintainOffset */ js.UndefOr[Boolean] => Unit = null,
    resizeFrame: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollEl: js.Any = null,
    self: IClass = null,
    setDelta: (/* iDeltaX */ js.UndefOr[Double], /* iDeltaY */ js.UndefOr[Double]) => Unit = null,
    setDragElId: /* id */ js.UndefOr[String] => Unit = null,
    setDragElPos: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Unit = null,
    setHandleElId: /* id */ js.UndefOr[String] => Unit = null,
    setInitPosition: (/* diffX */ js.UndefOr[Double], /* diffY */ js.UndefOr[Double]) => Unit = null,
    setOuterHandleElId: /* id */ js.UndefOr[String] => Unit = null,
    setPadding: (/* iTop */ js.UndefOr[Double], /* iRight */ js.UndefOr[Double], /* iBot */ js.UndefOr[Double], /* iLeft */ js.UndefOr[Double]) => Unit = null,
    setXConstraint: (/* iLeft */ js.UndefOr[Double], /* iRight */ js.UndefOr[Double], /* iTickSize */ js.UndefOr[Double]) => Unit = null,
    setYConstraint: (/* iUp */ js.UndefOr[Double], /* iDown */ js.UndefOr[Double], /* iTickSize */ js.UndefOr[Double]) => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    startDrag: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit = null,
    statics: js.Any = null,
    toString: () => String = null,
    unlock: () => Unit = null,
    unreg: () => Unit = null,
    uses: Array = null,
    xTicks: Array = null,
    yTicks: Array = null
  ): IDragZone = {
    val __obj = js.Dynamic.literal()
    if (addInvalidHandleClass != null) __obj.updateDynamic("addInvalidHandleClass")(js.Any.fromFunction1(addInvalidHandleClass))
    if (addInvalidHandleId != null) __obj.updateDynamic("addInvalidHandleId")(js.Any.fromFunction1(addInvalidHandleId))
    if (addInvalidHandleType != null) __obj.updateDynamic("addInvalidHandleType")(js.Any.fromFunction1(addInvalidHandleType))
    if (addToGroup != null) __obj.updateDynamic("addToGroup")(js.Any.fromFunction1(addToGroup))
    if (afterDragDrop != null) __obj.updateDynamic("afterDragDrop")(js.Any.fromFunction3(afterDragDrop))
    if (afterDragEnter != null) __obj.updateDynamic("afterDragEnter")(js.Any.fromFunction3(afterDragEnter))
    if (afterDragOut != null) __obj.updateDynamic("afterDragOut")(js.Any.fromFunction3(afterDragOut))
    if (afterDragOver != null) __obj.updateDynamic("afterDragOver")(js.Any.fromFunction3(afterDragOver))
    if (afterInvalidDrop != null) __obj.updateDynamic("afterInvalidDrop")(js.Any.fromFunction2(afterInvalidDrop))
    if (afterValidDrop != null) __obj.updateDynamic("afterValidDrop")(js.Any.fromFunction3(afterValidDrop))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alignElWithMouse != null) __obj.updateDynamic("alignElWithMouse")(js.Any.fromFunction0(alignElWithMouse))
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(animRepair)) __obj.updateDynamic("animRepair")(animRepair.asInstanceOf[js.Any])
    if (applyConfig != null) __obj.updateDynamic("applyConfig")(js.Any.fromFunction0(applyConfig))
    if (autoOffset != null) __obj.updateDynamic("autoOffset")(js.Any.fromFunction2(autoOffset))
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.asInstanceOf[js.Any])
    if (b4Drag != null) __obj.updateDynamic("b4Drag")(js.Any.fromFunction1(b4Drag))
    if (b4MouseDown != null) __obj.updateDynamic("b4MouseDown")(js.Any.fromFunction1(b4MouseDown))
    if (beforeDragDrop != null) __obj.updateDynamic("beforeDragDrop")(js.Any.fromFunction3(beforeDragDrop))
    if (beforeDragEnter != null) __obj.updateDynamic("beforeDragEnter")(js.Any.fromFunction3(beforeDragEnter))
    if (beforeDragOut != null) __obj.updateDynamic("beforeDragOut")(js.Any.fromFunction3(beforeDragOut))
    if (beforeDragOver != null) __obj.updateDynamic("beforeDragOver")(js.Any.fromFunction3(beforeDragOver))
    if (beforeInvalidDrop != null) __obj.updateDynamic("beforeInvalidDrop")(js.Any.fromFunction3(beforeInvalidDrop))
    if (cachePosition != null) __obj.updateDynamic("cachePosition")(js.Any.fromFunction2(cachePosition))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (!js.isUndefined(centerFrame)) __obj.updateDynamic("centerFrame")(centerFrame.asInstanceOf[js.Any])
    if (clearConstraints != null) __obj.updateDynamic("clearConstraints")(js.Any.fromFunction0(clearConstraints))
    if (clearTicks != null) __obj.updateDynamic("clearTicks")(js.Any.fromFunction0(clearTicks))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(js.Any.fromFunction3(constrainTo))
    if (containerScroll != null) __obj.updateDynamic("containerScroll")(containerScroll.asInstanceOf[js.Any])
    if (createFrame != null) __obj.updateDynamic("createFrame")(js.Any.fromFunction0(createFrame))
    if (ddGroup != null) __obj.updateDynamic("ddGroup")(ddGroup.asInstanceOf[js.Any])
    if (defaultPadding != null) __obj.updateDynamic("defaultPadding")(defaultPadding.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (dragData != null) __obj.updateDynamic("dragData")(dragData.asInstanceOf[js.Any])
    if (dragElId != null) __obj.updateDynamic("dragElId")(dragElId.asInstanceOf[js.Any])
    if (dropAllowed != null) __obj.updateDynamic("dropAllowed")(dropAllowed.asInstanceOf[js.Any])
    if (dropNotAllowed != null) __obj.updateDynamic("dropNotAllowed")(dropNotAllowed.asInstanceOf[js.Any])
    if (endDrag != null) __obj.updateDynamic("endDrag")(js.Any.fromFunction1(endDrag))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getDragData != null) __obj.updateDynamic("getDragData")(js.Any.fromFunction1(getDragData))
    if (getDragEl != null) __obj.updateDynamic("getDragEl")(js.Any.fromFunction0(getDragEl))
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction0(getEl))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getProxy != null) __obj.updateDynamic("getProxy")(js.Any.fromFunction0(getProxy))
    if (getRepairXY != null) __obj.updateDynamic("getRepairXY")(js.Any.fromFunction1(getRepairXY))
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(hasOuterHandles)) __obj.updateDynamic("hasOuterHandles")(hasOuterHandles.asInstanceOf[js.Any])
    if (hideProxy != null) __obj.updateDynamic("hideProxy")(js.Any.fromFunction0(hideProxy))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSelf)) __obj.updateDynamic("ignoreSelf")(ignoreSelf.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction3(init))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initFrame != null) __obj.updateDynamic("initFrame")(js.Any.fromFunction0(initFrame))
    if (initTarget != null) __obj.updateDynamic("initTarget")(js.Any.fromFunction3(initTarget))
    if (invalidHandleClasses != null) __obj.updateDynamic("invalidHandleClasses")(invalidHandleClasses.asInstanceOf[js.Any])
    if (invalidHandleIds != null) __obj.updateDynamic("invalidHandleIds")(invalidHandleIds.asInstanceOf[js.Any])
    if (invalidHandleTypes != null) __obj.updateDynamic("invalidHandleTypes")(invalidHandleTypes.asInstanceOf[js.Any])
    if (isLocked != null) __obj.updateDynamic("isLocked")(js.Any.fromFunction0(isLocked))
    if (!js.isUndefined(isTarget)) __obj.updateDynamic("isTarget")(isTarget.asInstanceOf[js.Any])
    if (isValidHandleChild != null) __obj.updateDynamic("isValidHandleChild")(js.Any.fromFunction1(isValidHandleChild))
    if (lock != null) __obj.updateDynamic("lock")(js.Any.fromFunction0(lock))
    if (!js.isUndefined(maintainOffset)) __obj.updateDynamic("maintainOffset")(maintainOffset.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOnly)) __obj.updateDynamic("moveOnly")(moveOnly.asInstanceOf[js.Any])
    if (onAvailable != null) __obj.updateDynamic("onAvailable")(js.Any.fromFunction0(onAvailable))
    if (onBeforeDrag != null) __obj.updateDynamic("onBeforeDrag")(js.Any.fromFunction2(onBeforeDrag))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(js.Any.fromFunction2(onDragDrop))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction2(onDragEnter))
    if (onDragOut != null) __obj.updateDynamic("onDragOut")(js.Any.fromFunction2(onDragOut))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction2(onDragOver))
    if (onInitDrag != null) __obj.updateDynamic("onInitDrag")(js.Any.fromFunction2(onInitDrag))
    if (onInvalidDrop != null) __obj.updateDynamic("onInvalidDrop")(js.Any.fromFunction1(onInvalidDrop))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onStartDrag != null) __obj.updateDynamic("onStartDrag")(js.Any.fromFunction2(onStartDrag))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryButtonOnly)) __obj.updateDynamic("primaryButtonOnly")(primaryButtonOnly.asInstanceOf[js.Any])
    if (removeFromGroup != null) __obj.updateDynamic("removeFromGroup")(js.Any.fromFunction1(removeFromGroup))
    if (removeInvalidHandleClass != null) __obj.updateDynamic("removeInvalidHandleClass")(js.Any.fromFunction1(removeInvalidHandleClass))
    if (removeInvalidHandleId != null) __obj.updateDynamic("removeInvalidHandleId")(js.Any.fromFunction1(removeInvalidHandleId))
    if (removeInvalidHandleType != null) __obj.updateDynamic("removeInvalidHandleType")(js.Any.fromFunction1(removeInvalidHandleType))
    if (repairHighlightColor != null) __obj.updateDynamic("repairHighlightColor")(repairHighlightColor.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resetConstraints != null) __obj.updateDynamic("resetConstraints")(js.Any.fromFunction1(resetConstraints))
    if (!js.isUndefined(resizeFrame)) __obj.updateDynamic("resizeFrame")(resizeFrame.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollEl != null) __obj.updateDynamic("scrollEl")(scrollEl.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDelta != null) __obj.updateDynamic("setDelta")(js.Any.fromFunction2(setDelta))
    if (setDragElId != null) __obj.updateDynamic("setDragElId")(js.Any.fromFunction1(setDragElId))
    if (setDragElPos != null) __obj.updateDynamic("setDragElPos")(js.Any.fromFunction2(setDragElPos))
    if (setHandleElId != null) __obj.updateDynamic("setHandleElId")(js.Any.fromFunction1(setHandleElId))
    if (setInitPosition != null) __obj.updateDynamic("setInitPosition")(js.Any.fromFunction2(setInitPosition))
    if (setOuterHandleElId != null) __obj.updateDynamic("setOuterHandleElId")(js.Any.fromFunction1(setOuterHandleElId))
    if (setPadding != null) __obj.updateDynamic("setPadding")(js.Any.fromFunction4(setPadding))
    if (setXConstraint != null) __obj.updateDynamic("setXConstraint")(js.Any.fromFunction3(setXConstraint))
    if (setYConstraint != null) __obj.updateDynamic("setYConstraint")(js.Any.fromFunction3(setYConstraint))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (startDrag != null) __obj.updateDynamic("startDrag")(js.Any.fromFunction2(startDrag))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    if (unlock != null) __obj.updateDynamic("unlock")(js.Any.fromFunction0(unlock))
    if (unreg != null) __obj.updateDynamic("unreg")(js.Any.fromFunction0(unreg))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (xTicks != null) __obj.updateDynamic("xTicks")(xTicks.asInstanceOf[js.Any])
    if (yTicks != null) __obj.updateDynamic("yTicks")(yTicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragZone]
  }
}

