package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropTarget extends IDDTarget {
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dropAllowed: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dropNotAllowed: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] The function a Ext dd DragSource calls once to notify this drop target that the dragged item has been dropped on it
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop target
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		* @returns Boolean False if the drop was invalid.
  		*/
  var notifyDrop: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] The function a Ext dd DragSource calls once to notify this drop target that the source is now over the target
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop target
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		* @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
  		*/
  var notifyEnter: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      java.lang.String
    ]
  ] = js.undefined
  /** [Method] The function a Ext dd DragSource calls once to notify this drop target that the source has been dragged out of the ta
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop target
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		*/
  var notifyOut: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] The function a Ext dd DragSource calls continuously while it is being dragged over the target
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop target
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		* @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
  		*/
  var notifyOver: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      java.lang.String
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var overClass: js.UndefOr[java.lang.String] = js.undefined
}

object IDropTarget {
  @scala.inline
  def apply(
    addInvalidHandleClass: /* cssClass */ js.UndefOr[java.lang.String] => scala.Unit = null,
    addInvalidHandleId: /* id */ js.UndefOr[java.lang.String] => scala.Unit = null,
    addInvalidHandleType: /* tagName */ js.UndefOr[java.lang.String] => scala.Unit = null,
    addToGroup: /* sGroup */ js.UndefOr[java.lang.String] => scala.Unit = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    applyConfig: () => scala.Unit = null,
    available: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearConstraints: () => scala.Unit = null,
    clearTicks: () => scala.Unit = null,
    config: js.Any = null,
    constrainTo: (/* constrainTo */ js.UndefOr[js.Any], /* pad */ js.UndefOr[js.Any], /* inContent */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    ddGroup: java.lang.String = null,
    defaultPadding: js.Any = null,
    destroy: () => scala.Unit = null,
    dropAllowed: java.lang.String = null,
    dropNotAllowed: java.lang.String = null,
    endDrag: /* e */ js.UndefOr[stdLib.Event] => scala.Unit = null,
    extend: java.lang.String = null,
    getDragEl: () => stdLib.HTMLElement = null,
    getEl: () => stdLib.HTMLElement = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    groups: js.Any = null,
    hasOuterHandles: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    ignoreSelf: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    init: (/* id */ js.UndefOr[java.lang.String], /* sGroup */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[js.Any]) => scala.Unit = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IDropTarget = null,
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
    notifyDrop: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[stdLib.Event], /* data */ js.UndefOr[js.Any]) => scala.Boolean = null,
    notifyEnter: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[stdLib.Event], /* data */ js.UndefOr[js.Any]) => java.lang.String = null,
    notifyOut: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[stdLib.Event], /* data */ js.UndefOr[js.Any]) => scala.Unit = null,
    notifyOver: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[stdLib.Event], /* data */ js.UndefOr[js.Any]) => java.lang.String = null,
    onAvailable: () => scala.Unit = null,
    onDrag: /* e */ js.UndefOr[stdLib.Event] => scala.Unit = null,
    onDragDrop: (/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any]) => scala.Unit = null,
    onDragEnter: (/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any]) => scala.Unit = null,
    onDragOut: (/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any]) => scala.Unit = null,
    onDragOver: (/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any]) => scala.Unit = null,
    onInvalidDrop: /* e */ js.UndefOr[stdLib.Event] => scala.Unit = null,
    onMouseDown: /* e */ js.UndefOr[stdLib.Event] => scala.Unit = null,
    onMouseUp: /* e */ js.UndefOr[stdLib.Event] => scala.Unit = null,
    overClass: java.lang.String = null,
    padding: extjsLib.ExtNs.Array = null,
    primaryButtonOnly: js.UndefOr[scala.Boolean] = js.undefined,
    removeFromGroup: /* sGroup */ js.UndefOr[java.lang.String] => scala.Unit = null,
    removeInvalidHandleClass: /* cssClass */ js.UndefOr[java.lang.String] => scala.Unit = null,
    removeInvalidHandleId: /* id */ js.UndefOr[java.lang.String] => scala.Unit = null,
    removeInvalidHandleType: /* tagName */ js.UndefOr[java.lang.String] => scala.Unit = null,
    requires: extjsLib.ExtNs.Array = null,
    resetConstraints: /* maintainOffset */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    self: extjsLib.ExtNs.IClass = null,
    setDragElId: /* id */ js.UndefOr[java.lang.String] => scala.Unit = null,
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
  ): IDropTarget = {
    val __obj = js.Dynamic.literal()
    if (addInvalidHandleClass != null) __obj.updateDynamic("addInvalidHandleClass")(js.Any.fromFunction1(addInvalidHandleClass))
    if (addInvalidHandleId != null) __obj.updateDynamic("addInvalidHandleId")(js.Any.fromFunction1(addInvalidHandleId))
    if (addInvalidHandleType != null) __obj.updateDynamic("addInvalidHandleType")(js.Any.fromFunction1(addInvalidHandleType))
    if (addToGroup != null) __obj.updateDynamic("addToGroup")(js.Any.fromFunction1(addToGroup))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (applyConfig != null) __obj.updateDynamic("applyConfig")(js.Any.fromFunction0(applyConfig))
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearConstraints != null) __obj.updateDynamic("clearConstraints")(js.Any.fromFunction0(clearConstraints))
    if (clearTicks != null) __obj.updateDynamic("clearTicks")(js.Any.fromFunction0(clearTicks))
    if (config != null) __obj.updateDynamic("config")(config)
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(js.Any.fromFunction3(constrainTo))
    if (ddGroup != null) __obj.updateDynamic("ddGroup")(ddGroup)
    if (defaultPadding != null) __obj.updateDynamic("defaultPadding")(defaultPadding)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (dropAllowed != null) __obj.updateDynamic("dropAllowed")(dropAllowed)
    if (dropNotAllowed != null) __obj.updateDynamic("dropNotAllowed")(dropNotAllowed)
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
    if (notifyDrop != null) __obj.updateDynamic("notifyDrop")(js.Any.fromFunction3(notifyDrop))
    if (notifyEnter != null) __obj.updateDynamic("notifyEnter")(js.Any.fromFunction3(notifyEnter))
    if (notifyOut != null) __obj.updateDynamic("notifyOut")(js.Any.fromFunction3(notifyOut))
    if (notifyOver != null) __obj.updateDynamic("notifyOver")(js.Any.fromFunction3(notifyOver))
    if (onAvailable != null) __obj.updateDynamic("onAvailable")(js.Any.fromFunction0(onAvailable))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(js.Any.fromFunction2(onDragDrop))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction2(onDragEnter))
    if (onDragOut != null) __obj.updateDynamic("onDragOut")(js.Any.fromFunction2(onDragOut))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction2(onDragOver))
    if (onInvalidDrop != null) __obj.updateDynamic("onInvalidDrop")(js.Any.fromFunction1(onInvalidDrop))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (overClass != null) __obj.updateDynamic("overClass")(overClass)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(primaryButtonOnly)) __obj.updateDynamic("primaryButtonOnly")(primaryButtonOnly)
    if (removeFromGroup != null) __obj.updateDynamic("removeFromGroup")(js.Any.fromFunction1(removeFromGroup))
    if (removeInvalidHandleClass != null) __obj.updateDynamic("removeInvalidHandleClass")(js.Any.fromFunction1(removeInvalidHandleClass))
    if (removeInvalidHandleId != null) __obj.updateDynamic("removeInvalidHandleId")(js.Any.fromFunction1(removeInvalidHandleId))
    if (removeInvalidHandleType != null) __obj.updateDynamic("removeInvalidHandleType")(js.Any.fromFunction1(removeInvalidHandleType))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resetConstraints != null) __obj.updateDynamic("resetConstraints")(js.Any.fromFunction1(resetConstraints))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDragElId != null) __obj.updateDynamic("setDragElId")(js.Any.fromFunction1(setDragElId))
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
    __obj.asInstanceOf[IDropTarget]
  }
}

