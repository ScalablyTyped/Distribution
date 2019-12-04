package typings.extjs.Ext.tree

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.dd.IDragSource
import typings.extjs.Ext.view.IDropZone
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewDropZone extends IDropZone {
  /** [Config Option] (Boolean) */
  var allowContainerDrop: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowParentInserts: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var appendOnly: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var expandDelay: js.UndefOr[Double] = js.undefined
  /** [Method] Moved out of the DropZone without dropping  */
  @JSName("notifyOut")
  var notifyOut_IViewDropZone: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] The mouse is no longer over a tree node so dropping is not valid
  		* @param n Object
  		* @param dd Object
  		* @param e Object
  		* @param data Object
  		*/
  @JSName("onNodeOut")
  var onNodeOut_IViewDropZone: js.UndefOr[
    js.Function4[
      /* n */ js.UndefOr[js.Any], 
      /* dd */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}

object IViewDropZone {
  @scala.inline
  def apply(
    addInvalidHandleClass: /* cssClass */ js.UndefOr[java.lang.String] => Unit = null,
    addInvalidHandleId: /* id */ js.UndefOr[java.lang.String] => Unit = null,
    addInvalidHandleType: /* tagName */ js.UndefOr[java.lang.String] => Unit = null,
    addToGroup: /* sGroup */ js.UndefOr[java.lang.String] => Unit = null,
    alias: Array = null,
    allowContainerDrop: js.UndefOr[Boolean] = js.undefined,
    allowParentInserts: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    appendOnly: js.UndefOr[Boolean] = js.undefined,
    applyConfig: () => Unit = null,
    available: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearConstraints: () => Unit = null,
    clearTicks: () => Unit = null,
    config: js.Any = null,
    constrainTo: (/* constrainTo */ js.UndefOr[js.Any], /* pad */ js.UndefOr[js.Any], /* inContent */ js.UndefOr[Boolean]) => Unit = null,
    ddGroup: java.lang.String = null,
    defaultPadding: js.Any = null,
    destroy: () => Unit = null,
    dropAllowed: java.lang.String = null,
    dropNotAllowed: java.lang.String = null,
    endDrag: /* e */ js.UndefOr[Event] => Unit = null,
    expandDelay: Int | Double = null,
    extend: java.lang.String = null,
    getDragEl: () => HTMLElement = null,
    getEl: () => HTMLElement = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getTargetFromEvent: /* e */ js.UndefOr[Event] => _ = null,
    groups: js.Any = null,
    hasOuterHandles: js.UndefOr[Boolean] = js.undefined,
    id: java.lang.String = null,
    ignoreSelf: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    init: (/* id */ js.UndefOr[java.lang.String], /* sGroup */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[js.Any]) => Unit = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IViewDropZone = null,
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
    notifyDrop: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => Boolean = null,
    notifyEnter: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => java.lang.String = null,
    notifyOut: () => Unit = null,
    notifyOver: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => java.lang.String = null,
    onAvailable: () => Unit = null,
    onContainerDrop: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => Boolean = null,
    onContainerOver: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => java.lang.String = null,
    onDrag: /* e */ js.UndefOr[Event] => Unit = null,
    onDragDrop: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit = null,
    onDragEnter: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit = null,
    onDragOut: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit = null,
    onDragOver: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit = null,
    onInvalidDrop: /* e */ js.UndefOr[Event] => Unit = null,
    onMouseDown: /* e */ js.UndefOr[Event] => Unit = null,
    onMouseUp: /* e */ js.UndefOr[Event] => Unit = null,
    onNodeDrop: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => Boolean = null,
    onNodeEnter: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => Unit = null,
    onNodeOut: (/* n */ js.UndefOr[js.Any], /* dd */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => Unit = null,
    onNodeOver: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => java.lang.String = null,
    overClass: java.lang.String = null,
    padding: Array = null,
    primaryButtonOnly: js.UndefOr[Boolean] = js.undefined,
    removeFromGroup: /* sGroup */ js.UndefOr[java.lang.String] => Unit = null,
    removeInvalidHandleClass: /* cssClass */ js.UndefOr[java.lang.String] => Unit = null,
    removeInvalidHandleId: /* id */ js.UndefOr[java.lang.String] => Unit = null,
    removeInvalidHandleType: /* tagName */ js.UndefOr[java.lang.String] => Unit = null,
    requires: Array = null,
    resetConstraints: /* maintainOffset */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    setDragElId: /* id */ js.UndefOr[java.lang.String] => Unit = null,
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
  ): IViewDropZone = {
    val __obj = js.Dynamic.literal()
    if (addInvalidHandleClass != null) __obj.updateDynamic("addInvalidHandleClass")(js.Any.fromFunction1(addInvalidHandleClass))
    if (addInvalidHandleId != null) __obj.updateDynamic("addInvalidHandleId")(js.Any.fromFunction1(addInvalidHandleId))
    if (addInvalidHandleType != null) __obj.updateDynamic("addInvalidHandleType")(js.Any.fromFunction1(addInvalidHandleType))
    if (addToGroup != null) __obj.updateDynamic("addToGroup")(js.Any.fromFunction1(addToGroup))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowContainerDrop)) __obj.updateDynamic("allowContainerDrop")(allowContainerDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowParentInserts)) __obj.updateDynamic("allowParentInserts")(allowParentInserts.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(appendOnly)) __obj.updateDynamic("appendOnly")(appendOnly.asInstanceOf[js.Any])
    if (applyConfig != null) __obj.updateDynamic("applyConfig")(js.Any.fromFunction0(applyConfig))
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearConstraints != null) __obj.updateDynamic("clearConstraints")(js.Any.fromFunction0(clearConstraints))
    if (clearTicks != null) __obj.updateDynamic("clearTicks")(js.Any.fromFunction0(clearTicks))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(js.Any.fromFunction3(constrainTo))
    if (ddGroup != null) __obj.updateDynamic("ddGroup")(ddGroup.asInstanceOf[js.Any])
    if (defaultPadding != null) __obj.updateDynamic("defaultPadding")(defaultPadding.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (dropAllowed != null) __obj.updateDynamic("dropAllowed")(dropAllowed.asInstanceOf[js.Any])
    if (dropNotAllowed != null) __obj.updateDynamic("dropNotAllowed")(dropNotAllowed.asInstanceOf[js.Any])
    if (endDrag != null) __obj.updateDynamic("endDrag")(js.Any.fromFunction1(endDrag))
    if (expandDelay != null) __obj.updateDynamic("expandDelay")(expandDelay.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getDragEl != null) __obj.updateDynamic("getDragEl")(js.Any.fromFunction0(getDragEl))
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction0(getEl))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getTargetFromEvent != null) __obj.updateDynamic("getTargetFromEvent")(js.Any.fromFunction1(getTargetFromEvent))
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(hasOuterHandles)) __obj.updateDynamic("hasOuterHandles")(hasOuterHandles.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSelf)) __obj.updateDynamic("ignoreSelf")(ignoreSelf.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction3(init))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
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
    if (notifyDrop != null) __obj.updateDynamic("notifyDrop")(js.Any.fromFunction3(notifyDrop))
    if (notifyEnter != null) __obj.updateDynamic("notifyEnter")(js.Any.fromFunction3(notifyEnter))
    if (notifyOut != null) __obj.updateDynamic("notifyOut")(js.Any.fromFunction0(notifyOut))
    if (notifyOver != null) __obj.updateDynamic("notifyOver")(js.Any.fromFunction3(notifyOver))
    if (onAvailable != null) __obj.updateDynamic("onAvailable")(js.Any.fromFunction0(onAvailable))
    if (onContainerDrop != null) __obj.updateDynamic("onContainerDrop")(js.Any.fromFunction3(onContainerDrop))
    if (onContainerOver != null) __obj.updateDynamic("onContainerOver")(js.Any.fromFunction3(onContainerOver))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(js.Any.fromFunction2(onDragDrop))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction2(onDragEnter))
    if (onDragOut != null) __obj.updateDynamic("onDragOut")(js.Any.fromFunction2(onDragOut))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction2(onDragOver))
    if (onInvalidDrop != null) __obj.updateDynamic("onInvalidDrop")(js.Any.fromFunction1(onInvalidDrop))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onNodeDrop != null) __obj.updateDynamic("onNodeDrop")(js.Any.fromFunction4(onNodeDrop))
    if (onNodeEnter != null) __obj.updateDynamic("onNodeEnter")(js.Any.fromFunction4(onNodeEnter))
    if (onNodeOut != null) __obj.updateDynamic("onNodeOut")(js.Any.fromFunction4(onNodeOut))
    if (onNodeOver != null) __obj.updateDynamic("onNodeOver")(js.Any.fromFunction4(onNodeOver))
    if (overClass != null) __obj.updateDynamic("overClass")(overClass.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryButtonOnly)) __obj.updateDynamic("primaryButtonOnly")(primaryButtonOnly.asInstanceOf[js.Any])
    if (removeFromGroup != null) __obj.updateDynamic("removeFromGroup")(js.Any.fromFunction1(removeFromGroup))
    if (removeInvalidHandleClass != null) __obj.updateDynamic("removeInvalidHandleClass")(js.Any.fromFunction1(removeInvalidHandleClass))
    if (removeInvalidHandleId != null) __obj.updateDynamic("removeInvalidHandleId")(js.Any.fromFunction1(removeInvalidHandleId))
    if (removeInvalidHandleType != null) __obj.updateDynamic("removeInvalidHandleType")(js.Any.fromFunction1(removeInvalidHandleType))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resetConstraints != null) __obj.updateDynamic("resetConstraints")(js.Any.fromFunction1(resetConstraints))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDragElId != null) __obj.updateDynamic("setDragElId")(js.Any.fromFunction1(setDragElId))
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
    __obj.asInstanceOf[IViewDropZone]
  }
}

