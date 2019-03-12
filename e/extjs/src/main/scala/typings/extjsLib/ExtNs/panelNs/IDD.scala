package typings
package extjsLib.ExtNs.panelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDD
  extends extjsLib.ExtNs.ddNs.IDragSource {
  /** [Method] Returns a reference to the actual element to drag
  		* @param e Object
  		* @returns HTMLElement the html element
  		*/
  @JSName("getDragEl")
  var getDragEl_IDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], stdLib.HTMLElement]] = js.undefined
}

object IDD {
  @scala.inline
  def apply(
    addInvalidHandleClass: /* cssClass */ js.UndefOr[java.lang.String] => scala.Unit = null,
    addInvalidHandleId: /* id */ js.UndefOr[java.lang.String] => scala.Unit = null,
    addInvalidHandleType: /* tagName */ js.UndefOr[java.lang.String] => scala.Unit = null,
    addToGroup: /* sGroup */ js.UndefOr[java.lang.String] => scala.Unit = null,
    afterDragDrop: (/* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], /* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    afterDragEnter: (/* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], /* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    afterDragOut: (/* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], /* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    afterDragOver: (/* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], /* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    afterInvalidDrop: (/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    afterValidDrop: (/* target */ js.UndefOr[js.Any], /* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    alias: extjsLib.ExtNs.Array = null,
    alignElWithMouse: () => scala.Unit = null,
    alternateClassName: js.Any = null,
    animRepair: js.UndefOr[scala.Boolean] = js.undefined,
    applyConfig: () => scala.Unit = null,
    autoOffset: (/* iPageX */ js.UndefOr[scala.Double], /* iPageY */ js.UndefOr[scala.Double]) => scala.Unit = null,
    available: js.UndefOr[scala.Boolean] = js.undefined,
    b4Drag: /* e */ js.UndefOr[js.Any] => scala.Unit = null,
    b4MouseDown: /* e */ js.UndefOr[js.Any] => scala.Unit = null,
    beforeDragDrop: (/* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], /* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[java.lang.String]) => scala.Boolean = null,
    beforeDragEnter: (/* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], /* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[java.lang.String]) => scala.Boolean = null,
    beforeDragOut: (/* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], /* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[java.lang.String]) => scala.Boolean = null,
    beforeDragOver: (/* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], /* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[java.lang.String]) => scala.Boolean = null,
    beforeInvalidDrop: (/* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], /* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[java.lang.String]) => scala.Boolean = null,
    cachePosition: (/* iPageX */ js.UndefOr[scala.Double], /* iPageY */ js.UndefOr[scala.Double]) => scala.Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    centerFrame: js.UndefOr[scala.Boolean] = js.undefined,
    clearConstraints: () => scala.Unit = null,
    clearTicks: () => scala.Unit = null,
    config: js.Any = null,
    constrainTo: (/* constrainTo */ js.UndefOr[js.Any], /* pad */ js.UndefOr[js.Any], /* inContent */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    createFrame: () => scala.Unit = null,
    ddGroup: java.lang.String = null,
    defaultPadding: js.Any = null,
    destroy: () => scala.Unit = null,
    dragData: js.Any = null,
    dragElId: java.lang.String = null,
    dropAllowed: java.lang.String = null,
    dropNotAllowed: java.lang.String = null,
    endDrag: /* e */ js.UndefOr[js.Any] => scala.Unit = null,
    extend: java.lang.String = null,
    getDragData: /* e */ js.UndefOr[js.Any] => _ = null,
    getDragEl: /* e */ js.UndefOr[js.Any] => stdLib.HTMLElement = null,
    getEl: () => stdLib.HTMLElement = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getProxy: () => extjsLib.ExtNs.ddNs.IStatusProxy = null,
    groups: js.Any = null,
    hasOuterHandles: js.UndefOr[scala.Boolean] = js.undefined,
    hideProxy: () => scala.Unit = null,
    id: java.lang.String = null,
    ignoreSelf: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    init: (/* id */ js.UndefOr[java.lang.String], /* sGroup */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[js.Any]) => scala.Unit = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IDD = null,
    initFrame: () => scala.Unit = null,
    initTarget: (/* id */ js.UndefOr[java.lang.String], /* sGroup */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[js.Any]) => scala.Unit = null,
    invalidHandleClasses: extjsLib.ExtNs.Array = null,
    invalidHandleIds: js.Any = null,
    invalidHandleTypes: js.Any = null,
    isLocked: () => scala.Boolean = null,
    isTarget: js.UndefOr[scala.Boolean] = js.undefined,
    isValidHandleChild: /* node */ js.UndefOr[stdLib.HTMLElement] => scala.Boolean = null,
    lock: () => scala.Unit = null,
    maintainOffset: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    moveOnly: js.UndefOr[scala.Boolean] = js.undefined,
    onAvailable: () => scala.Unit = null,
    onBeforeDrag: (/* data */ js.UndefOr[js.Any], /* e */ js.UndefOr[stdLib.Event]) => scala.Boolean = null,
    onDrag: /* e */ js.UndefOr[stdLib.Event] => scala.Unit = null,
    onDragDrop: (/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any]) => scala.Unit = null,
    onDragEnter: (/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any]) => scala.Unit = null,
    onDragOut: (/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any]) => scala.Unit = null,
    onDragOver: (/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any]) => scala.Unit = null,
    onInvalidDrop: /* e */ js.UndefOr[stdLib.Event] => scala.Unit = null,
    onMouseDown: /* e */ js.UndefOr[stdLib.Event] => scala.Unit = null,
    onMouseUp: /* e */ js.UndefOr[stdLib.Event] => scala.Unit = null,
    onStartDrag: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double]) => scala.Unit = null,
    padding: extjsLib.ExtNs.Array = null,
    primaryButtonOnly: js.UndefOr[scala.Boolean] = js.undefined,
    removeFromGroup: /* sGroup */ js.UndefOr[java.lang.String] => scala.Unit = null,
    removeInvalidHandleClass: /* cssClass */ js.UndefOr[java.lang.String] => scala.Unit = null,
    removeInvalidHandleId: /* id */ js.UndefOr[java.lang.String] => scala.Unit = null,
    removeInvalidHandleType: /* tagName */ js.UndefOr[java.lang.String] => scala.Unit = null,
    repairHighlightColor: java.lang.String = null,
    requires: extjsLib.ExtNs.Array = null,
    resetConstraints: /* maintainOffset */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    resizeFrame: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    self: extjsLib.ExtNs.IClass = null,
    setDelta: (/* iDeltaX */ js.UndefOr[scala.Double], /* iDeltaY */ js.UndefOr[scala.Double]) => scala.Unit = null,
    setDragElId: /* id */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setDragElPos: (/* iPageX */ js.UndefOr[scala.Double], /* iPageY */ js.UndefOr[scala.Double]) => scala.Unit = null,
    setHandleElId: /* id */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setInitPosition: (/* diffX */ js.UndefOr[scala.Double], /* diffY */ js.UndefOr[scala.Double]) => scala.Unit = null,
    setOuterHandleElId: /* id */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setPadding: (/* iTop */ js.UndefOr[scala.Double], /* iRight */ js.UndefOr[scala.Double], /* iBot */ js.UndefOr[scala.Double], /* iLeft */ js.UndefOr[scala.Double]) => scala.Unit = null,
    setXConstraint: (/* iLeft */ js.UndefOr[scala.Double], /* iRight */ js.UndefOr[scala.Double], /* iTickSize */ js.UndefOr[scala.Double]) => scala.Unit = null,
    setYConstraint: (/* iUp */ js.UndefOr[scala.Double], /* iDown */ js.UndefOr[scala.Double], /* iTickSize */ js.UndefOr[scala.Double]) => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    startDrag: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double]) => scala.Unit = null,
    statics: js.Any = null,
    toString: () => java.lang.String = null,
    unlock: () => scala.Unit = null,
    unreg: () => scala.Unit = null,
    uses: extjsLib.ExtNs.Array = null,
    xTicks: extjsLib.ExtNs.Array = null,
    yTicks: extjsLib.ExtNs.Array = null
  ): IDD = {
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
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alignElWithMouse != null) __obj.updateDynamic("alignElWithMouse")(js.Any.fromFunction0(alignElWithMouse))
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(animRepair)) __obj.updateDynamic("animRepair")(animRepair)
    if (applyConfig != null) __obj.updateDynamic("applyConfig")(js.Any.fromFunction0(applyConfig))
    if (autoOffset != null) __obj.updateDynamic("autoOffset")(js.Any.fromFunction2(autoOffset))
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available)
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
    if (!js.isUndefined(centerFrame)) __obj.updateDynamic("centerFrame")(centerFrame)
    if (clearConstraints != null) __obj.updateDynamic("clearConstraints")(js.Any.fromFunction0(clearConstraints))
    if (clearTicks != null) __obj.updateDynamic("clearTicks")(js.Any.fromFunction0(clearTicks))
    if (config != null) __obj.updateDynamic("config")(config)
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(js.Any.fromFunction3(constrainTo))
    if (createFrame != null) __obj.updateDynamic("createFrame")(js.Any.fromFunction0(createFrame))
    if (ddGroup != null) __obj.updateDynamic("ddGroup")(ddGroup)
    if (defaultPadding != null) __obj.updateDynamic("defaultPadding")(defaultPadding)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (dragData != null) __obj.updateDynamic("dragData")(dragData)
    if (dragElId != null) __obj.updateDynamic("dragElId")(dragElId)
    if (dropAllowed != null) __obj.updateDynamic("dropAllowed")(dropAllowed)
    if (dropNotAllowed != null) __obj.updateDynamic("dropNotAllowed")(dropNotAllowed)
    if (endDrag != null) __obj.updateDynamic("endDrag")(js.Any.fromFunction1(endDrag))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDragData != null) __obj.updateDynamic("getDragData")(js.Any.fromFunction1(getDragData))
    if (getDragEl != null) __obj.updateDynamic("getDragEl")(js.Any.fromFunction1(getDragEl))
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction0(getEl))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getProxy != null) __obj.updateDynamic("getProxy")(js.Any.fromFunction0(getProxy))
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (!js.isUndefined(hasOuterHandles)) __obj.updateDynamic("hasOuterHandles")(hasOuterHandles)
    if (hideProxy != null) __obj.updateDynamic("hideProxy")(js.Any.fromFunction0(hideProxy))
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(ignoreSelf)) __obj.updateDynamic("ignoreSelf")(ignoreSelf)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction3(init))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initFrame != null) __obj.updateDynamic("initFrame")(js.Any.fromFunction0(initFrame))
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
    if (onBeforeDrag != null) __obj.updateDynamic("onBeforeDrag")(js.Any.fromFunction2(onBeforeDrag))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(js.Any.fromFunction2(onDragDrop))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction2(onDragEnter))
    if (onDragOut != null) __obj.updateDynamic("onDragOut")(js.Any.fromFunction2(onDragOut))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction2(onDragOver))
    if (onInvalidDrop != null) __obj.updateDynamic("onInvalidDrop")(js.Any.fromFunction1(onInvalidDrop))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onStartDrag != null) __obj.updateDynamic("onStartDrag")(js.Any.fromFunction2(onStartDrag))
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(primaryButtonOnly)) __obj.updateDynamic("primaryButtonOnly")(primaryButtonOnly)
    if (removeFromGroup != null) __obj.updateDynamic("removeFromGroup")(js.Any.fromFunction1(removeFromGroup))
    if (removeInvalidHandleClass != null) __obj.updateDynamic("removeInvalidHandleClass")(js.Any.fromFunction1(removeInvalidHandleClass))
    if (removeInvalidHandleId != null) __obj.updateDynamic("removeInvalidHandleId")(js.Any.fromFunction1(removeInvalidHandleId))
    if (removeInvalidHandleType != null) __obj.updateDynamic("removeInvalidHandleType")(js.Any.fromFunction1(removeInvalidHandleType))
    if (repairHighlightColor != null) __obj.updateDynamic("repairHighlightColor")(repairHighlightColor)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resetConstraints != null) __obj.updateDynamic("resetConstraints")(js.Any.fromFunction1(resetConstraints))
    if (!js.isUndefined(resizeFrame)) __obj.updateDynamic("resizeFrame")(resizeFrame)
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

