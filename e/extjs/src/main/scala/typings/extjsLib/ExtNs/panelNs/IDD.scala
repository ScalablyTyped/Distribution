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
    addInvalidHandleClass: js.Function1[/* cssClass */ js.UndefOr[java.lang.String], scala.Unit] = null,
    addInvalidHandleId: js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit] = null,
    addInvalidHandleType: js.Function1[/* tagName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    addToGroup: js.Function1[/* sGroup */ js.UndefOr[java.lang.String], scala.Unit] = null,
    afterDragDrop: js.Function3[
      /* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    afterDragEnter: js.Function3[
      /* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    afterDragOut: js.Function3[
      /* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    afterDragOver: js.Function3[
      /* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    afterInvalidDrop: js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[java.lang.String], scala.Unit] = null,
    afterValidDrop: js.Function3[
      /* target */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    alias: extjsLib.ExtNs.Array = null,
    alignElWithMouse: js.Function0[scala.Unit] = null,
    alternateClassName: js.Any = null,
    animRepair: js.UndefOr[scala.Boolean] = js.undefined,
    applyConfig: js.Function0[scala.Unit] = null,
    autoOffset: js.Function2[
      /* iPageX */ js.UndefOr[scala.Double], 
      /* iPageY */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    available: js.UndefOr[scala.Boolean] = js.undefined,
    b4Drag: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit] = null,
    b4MouseDown: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeDragDrop: js.Function3[
      /* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ] = null,
    beforeDragEnter: js.Function3[
      /* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ] = null,
    beforeDragOut: js.Function3[
      /* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ] = null,
    beforeDragOver: js.Function3[
      /* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ] = null,
    beforeInvalidDrop: js.Function3[
      /* target */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ] = null,
    cachePosition: js.Function2[
      /* iPageX */ js.UndefOr[scala.Double], 
      /* iPageY */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    centerFrame: js.UndefOr[scala.Boolean] = js.undefined,
    clearConstraints: js.Function0[scala.Unit] = null,
    clearTicks: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    constrainTo: js.Function3[
      /* constrainTo */ js.UndefOr[js.Any], 
      /* pad */ js.UndefOr[js.Any], 
      /* inContent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    createFrame: js.Function0[scala.Unit] = null,
    ddGroup: java.lang.String = null,
    defaultPadding: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    dragData: js.Any = null,
    dragElId: java.lang.String = null,
    dropAllowed: java.lang.String = null,
    dropNotAllowed: java.lang.String = null,
    endDrag: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    getDragData: js.Function1[/* e */ js.UndefOr[js.Any], _] = null,
    getDragEl: js.Function1[/* e */ js.UndefOr[js.Any], stdLib.HTMLElement] = null,
    getEl: js.Function0[stdLib.HTMLElement] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getProxy: js.Function0[extjsLib.ExtNs.ddNs.IStatusProxy] = null,
    groups: js.Any = null,
    hasOuterHandles: js.UndefOr[scala.Boolean] = js.undefined,
    hideProxy: js.Function0[scala.Unit] = null,
    id: java.lang.String = null,
    ignoreSelf: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    init: js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* sGroup */ js.UndefOr[java.lang.String], 
      /* config */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IDD] = null,
    initFrame: js.Function0[scala.Unit] = null,
    initTarget: js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* sGroup */ js.UndefOr[java.lang.String], 
      /* config */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    invalidHandleClasses: extjsLib.ExtNs.Array = null,
    invalidHandleIds: js.Any = null,
    invalidHandleTypes: js.Any = null,
    isLocked: js.Function0[scala.Boolean] = null,
    isTarget: js.UndefOr[scala.Boolean] = js.undefined,
    isValidHandleChild: js.Function1[/* node */ js.UndefOr[stdLib.HTMLElement], scala.Boolean] = null,
    lock: js.Function0[scala.Unit] = null,
    maintainOffset: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    moveOnly: js.UndefOr[scala.Boolean] = js.undefined,
    onAvailable: js.Function0[scala.Unit] = null,
    onBeforeDrag: js.Function2[/* data */ js.UndefOr[js.Any], /* e */ js.UndefOr[stdLib.Event], scala.Boolean] = null,
    onDrag: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    onDragDrop: js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit] = null,
    onDragEnter: js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit] = null,
    onDragOut: js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit] = null,
    onDragOver: js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit] = null,
    onInvalidDrop: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    onMouseDown: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    onMouseUp: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    onStartDrag: js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Unit] = null,
    padding: extjsLib.ExtNs.Array = null,
    primaryButtonOnly: js.UndefOr[scala.Boolean] = js.undefined,
    removeFromGroup: js.Function1[/* sGroup */ js.UndefOr[java.lang.String], scala.Unit] = null,
    removeInvalidHandleClass: js.Function1[/* cssClass */ js.UndefOr[java.lang.String], scala.Unit] = null,
    removeInvalidHandleId: js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit] = null,
    removeInvalidHandleType: js.Function1[/* tagName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    repairHighlightColor: java.lang.String = null,
    requires: extjsLib.ExtNs.Array = null,
    resetConstraints: js.Function1[/* maintainOffset */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    resizeFrame: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    self: extjsLib.ExtNs.IClass = null,
    setDelta: js.Function2[
      /* iDeltaX */ js.UndefOr[scala.Double], 
      /* iDeltaY */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    setDragElId: js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDragElPos: js.Function2[
      /* iPageX */ js.UndefOr[scala.Double], 
      /* iPageY */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    setHandleElId: js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setInitPosition: js.Function2[
      /* diffX */ js.UndefOr[scala.Double], 
      /* diffY */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    setOuterHandleElId: js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setPadding: js.Function4[
      /* iTop */ js.UndefOr[scala.Double], 
      /* iRight */ js.UndefOr[scala.Double], 
      /* iBot */ js.UndefOr[scala.Double], 
      /* iLeft */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    setXConstraint: js.Function3[
      /* iLeft */ js.UndefOr[scala.Double], 
      /* iRight */ js.UndefOr[scala.Double], 
      /* iTickSize */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    setYConstraint: js.Function3[
      /* iUp */ js.UndefOr[scala.Double], 
      /* iDown */ js.UndefOr[scala.Double], 
      /* iTickSize */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    startDrag: js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Unit] = null,
    statics: js.Any = null,
    toString: js.Function0[java.lang.String] = null,
    unlock: js.Function0[scala.Unit] = null,
    unreg: js.Function0[scala.Unit] = null,
    uses: extjsLib.ExtNs.Array = null,
    xTicks: extjsLib.ExtNs.Array = null,
    yTicks: extjsLib.ExtNs.Array = null
  ): IDD = {
    val __obj = js.Dynamic.literal()
    if (addInvalidHandleClass != null) __obj.updateDynamic("addInvalidHandleClass")(addInvalidHandleClass)
    if (addInvalidHandleId != null) __obj.updateDynamic("addInvalidHandleId")(addInvalidHandleId)
    if (addInvalidHandleType != null) __obj.updateDynamic("addInvalidHandleType")(addInvalidHandleType)
    if (addToGroup != null) __obj.updateDynamic("addToGroup")(addToGroup)
    if (afterDragDrop != null) __obj.updateDynamic("afterDragDrop")(afterDragDrop)
    if (afterDragEnter != null) __obj.updateDynamic("afterDragEnter")(afterDragEnter)
    if (afterDragOut != null) __obj.updateDynamic("afterDragOut")(afterDragOut)
    if (afterDragOver != null) __obj.updateDynamic("afterDragOver")(afterDragOver)
    if (afterInvalidDrop != null) __obj.updateDynamic("afterInvalidDrop")(afterInvalidDrop)
    if (afterValidDrop != null) __obj.updateDynamic("afterValidDrop")(afterValidDrop)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alignElWithMouse != null) __obj.updateDynamic("alignElWithMouse")(alignElWithMouse)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(animRepair)) __obj.updateDynamic("animRepair")(animRepair)
    if (applyConfig != null) __obj.updateDynamic("applyConfig")(applyConfig)
    if (autoOffset != null) __obj.updateDynamic("autoOffset")(autoOffset)
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available)
    if (b4Drag != null) __obj.updateDynamic("b4Drag")(b4Drag)
    if (b4MouseDown != null) __obj.updateDynamic("b4MouseDown")(b4MouseDown)
    if (beforeDragDrop != null) __obj.updateDynamic("beforeDragDrop")(beforeDragDrop)
    if (beforeDragEnter != null) __obj.updateDynamic("beforeDragEnter")(beforeDragEnter)
    if (beforeDragOut != null) __obj.updateDynamic("beforeDragOut")(beforeDragOut)
    if (beforeDragOver != null) __obj.updateDynamic("beforeDragOver")(beforeDragOver)
    if (beforeInvalidDrop != null) __obj.updateDynamic("beforeInvalidDrop")(beforeInvalidDrop)
    if (cachePosition != null) __obj.updateDynamic("cachePosition")(cachePosition)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (!js.isUndefined(centerFrame)) __obj.updateDynamic("centerFrame")(centerFrame)
    if (clearConstraints != null) __obj.updateDynamic("clearConstraints")(clearConstraints)
    if (clearTicks != null) __obj.updateDynamic("clearTicks")(clearTicks)
    if (config != null) __obj.updateDynamic("config")(config)
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(constrainTo)
    if (createFrame != null) __obj.updateDynamic("createFrame")(createFrame)
    if (ddGroup != null) __obj.updateDynamic("ddGroup")(ddGroup)
    if (defaultPadding != null) __obj.updateDynamic("defaultPadding")(defaultPadding)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (dragData != null) __obj.updateDynamic("dragData")(dragData)
    if (dragElId != null) __obj.updateDynamic("dragElId")(dragElId)
    if (dropAllowed != null) __obj.updateDynamic("dropAllowed")(dropAllowed)
    if (dropNotAllowed != null) __obj.updateDynamic("dropNotAllowed")(dropNotAllowed)
    if (endDrag != null) __obj.updateDynamic("endDrag")(endDrag)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDragData != null) __obj.updateDynamic("getDragData")(getDragData)
    if (getDragEl != null) __obj.updateDynamic("getDragEl")(getDragEl)
    if (getEl != null) __obj.updateDynamic("getEl")(getEl)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getProxy != null) __obj.updateDynamic("getProxy")(getProxy)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (!js.isUndefined(hasOuterHandles)) __obj.updateDynamic("hasOuterHandles")(hasOuterHandles)
    if (hideProxy != null) __obj.updateDynamic("hideProxy")(hideProxy)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(ignoreSelf)) __obj.updateDynamic("ignoreSelf")(ignoreSelf)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (init != null) __obj.updateDynamic("init")(init)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (initFrame != null) __obj.updateDynamic("initFrame")(initFrame)
    if (initTarget != null) __obj.updateDynamic("initTarget")(initTarget)
    if (invalidHandleClasses != null) __obj.updateDynamic("invalidHandleClasses")(invalidHandleClasses)
    if (invalidHandleIds != null) __obj.updateDynamic("invalidHandleIds")(invalidHandleIds)
    if (invalidHandleTypes != null) __obj.updateDynamic("invalidHandleTypes")(invalidHandleTypes)
    if (isLocked != null) __obj.updateDynamic("isLocked")(isLocked)
    if (!js.isUndefined(isTarget)) __obj.updateDynamic("isTarget")(isTarget)
    if (isValidHandleChild != null) __obj.updateDynamic("isValidHandleChild")(isValidHandleChild)
    if (lock != null) __obj.updateDynamic("lock")(lock)
    if (!js.isUndefined(maintainOffset)) __obj.updateDynamic("maintainOffset")(maintainOffset)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (!js.isUndefined(moveOnly)) __obj.updateDynamic("moveOnly")(moveOnly)
    if (onAvailable != null) __obj.updateDynamic("onAvailable")(onAvailable)
    if (onBeforeDrag != null) __obj.updateDynamic("onBeforeDrag")(onBeforeDrag)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(onDragDrop)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragOut != null) __obj.updateDynamic("onDragOut")(onDragOut)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onInvalidDrop != null) __obj.updateDynamic("onInvalidDrop")(onInvalidDrop)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onStartDrag != null) __obj.updateDynamic("onStartDrag")(onStartDrag)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(primaryButtonOnly)) __obj.updateDynamic("primaryButtonOnly")(primaryButtonOnly)
    if (removeFromGroup != null) __obj.updateDynamic("removeFromGroup")(removeFromGroup)
    if (removeInvalidHandleClass != null) __obj.updateDynamic("removeInvalidHandleClass")(removeInvalidHandleClass)
    if (removeInvalidHandleId != null) __obj.updateDynamic("removeInvalidHandleId")(removeInvalidHandleId)
    if (removeInvalidHandleType != null) __obj.updateDynamic("removeInvalidHandleType")(removeInvalidHandleType)
    if (repairHighlightColor != null) __obj.updateDynamic("repairHighlightColor")(repairHighlightColor)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resetConstraints != null) __obj.updateDynamic("resetConstraints")(resetConstraints)
    if (!js.isUndefined(resizeFrame)) __obj.updateDynamic("resizeFrame")(resizeFrame)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDelta != null) __obj.updateDynamic("setDelta")(setDelta)
    if (setDragElId != null) __obj.updateDynamic("setDragElId")(setDragElId)
    if (setDragElPos != null) __obj.updateDynamic("setDragElPos")(setDragElPos)
    if (setHandleElId != null) __obj.updateDynamic("setHandleElId")(setHandleElId)
    if (setInitPosition != null) __obj.updateDynamic("setInitPosition")(setInitPosition)
    if (setOuterHandleElId != null) __obj.updateDynamic("setOuterHandleElId")(setOuterHandleElId)
    if (setPadding != null) __obj.updateDynamic("setPadding")(setPadding)
    if (setXConstraint != null) __obj.updateDynamic("setXConstraint")(setXConstraint)
    if (setYConstraint != null) __obj.updateDynamic("setYConstraint")(setYConstraint)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (startDrag != null) __obj.updateDynamic("startDrag")(startDrag)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toString != null) __obj.updateDynamic("toString")(toString)
    if (unlock != null) __obj.updateDynamic("unlock")(unlock)
    if (unreg != null) __obj.updateDynamic("unreg")(unreg)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (xTicks != null) __obj.updateDynamic("xTicks")(xTicks)
    if (yTicks != null) __obj.updateDynamic("yTicks")(yTicks)
    __obj.asInstanceOf[IDD]
  }
}

