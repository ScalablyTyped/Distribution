package typings
package extjsLib.ExtNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropZone
  extends extjsLib.ExtNs.ddNs.IDropZone {
  /** [Method] Returns a custom data object associated with the DOM node that is the target of the event
  		* @param e Object
  		* @returns Object data The custom data
  		*/
  @JSName("getTargetFromEvent")
  var getTargetFromEvent_IDropZone: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Moved out of the DropZone without dropping
  		* @param node Object
  		* @param dragZone Object
  		* @param e Object
  		* @param data Object
  		*/
  @JSName("notifyOut")
  var notifyOut_IDropZone: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[js.Any], 
      /* dragZone */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Called when the DropZone determines that a Ext dd DragSource has been dropped on it but not on any of its registered
  		* @param dd Object
  		* @param e Object
  		* @param data Object
  		* @returns Boolean True if the drop was valid, else false
  		*/
  @JSName("onContainerDrop")
  var onContainerDrop_IDropZone: js.UndefOr[
    js.Function3[
      /* dd */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] The mouse is past the end of all nodes or there are no nodes
  		* @param dd Object
  		* @param e Object
  		* @param data Object
  		* @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
  		*/
  @JSName("onContainerOver")
  var onContainerOver_IDropZone: js.UndefOr[
    js.Function3[
      /* dd */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      java.lang.String
    ]
  ] = js.undefined
  /** [Method] Called when the DropZone determines that a Ext dd DragSource has been dropped onto the drop node
  		* @param targetNode Object
  		* @param dragZone Object
  		* @param e Object
  		* @param data Object
  		* @returns Boolean True if the drop was valid, else false
  		*/
  @JSName("onNodeDrop")
  var onNodeDrop_IDropZone: js.UndefOr[
    js.Function4[
      /* targetNode */ js.UndefOr[js.Any], 
      /* dragZone */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] The mouse is over a View node
  		* @param node Object
  		* @param dragZone Object
  		* @param e Object
  		* @param data Object
  		* @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
  		*/
  @JSName("onNodeOver")
  var onNodeOver_IDropZone: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[js.Any], 
      /* dragZone */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      java.lang.String
    ]
  ] = js.undefined
}

object IDropZone {
  @scala.inline
  def apply(
    addInvalidHandleClass: js.Function1[/* cssClass */ js.UndefOr[java.lang.String], scala.Unit] = null,
    addInvalidHandleId: js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit] = null,
    addInvalidHandleType: js.Function1[/* tagName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    addToGroup: js.Function1[/* sGroup */ js.UndefOr[java.lang.String], scala.Unit] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    applyConfig: js.Function0[scala.Unit] = null,
    available: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearConstraints: js.Function0[scala.Unit] = null,
    clearTicks: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    constrainTo: js.Function3[
      /* constrainTo */ js.UndefOr[js.Any], 
      /* pad */ js.UndefOr[js.Any], 
      /* inContent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    ddGroup: java.lang.String = null,
    defaultPadding: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    dropAllowed: java.lang.String = null,
    dropNotAllowed: java.lang.String = null,
    endDrag: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    extend: java.lang.String = null,
    getDragEl: js.Function0[stdLib.HTMLElement] = null,
    getEl: js.Function0[stdLib.HTMLElement] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getTargetFromEvent: js.Function1[/* e */ js.UndefOr[js.Any], _] = null,
    groups: js.Any = null,
    hasOuterHandles: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    ignoreSelf: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    init: js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* sGroup */ js.UndefOr[java.lang.String], 
      /* config */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IDropZone] = null,
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
    notifyDrop: js.Function3[
      /* source */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragSource], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      scala.Boolean
    ] = null,
    notifyEnter: js.Function3[
      /* source */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragSource], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      java.lang.String
    ] = null,
    notifyOut: js.Function4[
      /* node */ js.UndefOr[js.Any], 
      /* dragZone */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    notifyOver: js.Function3[
      /* source */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragSource], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      java.lang.String
    ] = null,
    onAvailable: js.Function0[scala.Unit] = null,
    onContainerDrop: js.Function3[
      /* dd */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      scala.Boolean
    ] = null,
    onContainerOver: js.Function3[
      /* dd */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      java.lang.String
    ] = null,
    onDrag: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    onDragDrop: js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit] = null,
    onDragEnter: js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit] = null,
    onDragOut: js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit] = null,
    onDragOver: js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit] = null,
    onInvalidDrop: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    onMouseDown: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    onMouseUp: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    onNodeDrop: js.Function4[
      /* targetNode */ js.UndefOr[js.Any], 
      /* dragZone */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      scala.Boolean
    ] = null,
    onNodeEnter: js.Function4[
      /* nodeData */ js.UndefOr[js.Any], 
      /* source */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragSource], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    onNodeOut: js.Function4[
      /* nodeData */ js.UndefOr[js.Any], 
      /* source */ js.UndefOr[extjsLib.ExtNs.ddNs.IDragSource], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    onNodeOver: js.Function4[
      /* node */ js.UndefOr[js.Any], 
      /* dragZone */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      java.lang.String
    ] = null,
    overClass: java.lang.String = null,
    padding: extjsLib.ExtNs.Array = null,
    primaryButtonOnly: js.UndefOr[scala.Boolean] = js.undefined,
    removeFromGroup: js.Function1[/* sGroup */ js.UndefOr[java.lang.String], scala.Unit] = null,
    removeInvalidHandleClass: js.Function1[/* cssClass */ js.UndefOr[java.lang.String], scala.Unit] = null,
    removeInvalidHandleId: js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit] = null,
    removeInvalidHandleType: js.Function1[/* tagName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    requires: extjsLib.ExtNs.Array = null,
    resetConstraints: js.Function1[/* maintainOffset */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    self: extjsLib.ExtNs.IClass = null,
    setDragElId: js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit] = null,
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
  ): IDropZone = {
    val __obj = js.Dynamic.literal()
    if (addInvalidHandleClass != null) __obj.updateDynamic("addInvalidHandleClass")(addInvalidHandleClass)
    if (addInvalidHandleId != null) __obj.updateDynamic("addInvalidHandleId")(addInvalidHandleId)
    if (addInvalidHandleType != null) __obj.updateDynamic("addInvalidHandleType")(addInvalidHandleType)
    if (addToGroup != null) __obj.updateDynamic("addToGroup")(addToGroup)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (applyConfig != null) __obj.updateDynamic("applyConfig")(applyConfig)
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearConstraints != null) __obj.updateDynamic("clearConstraints")(clearConstraints)
    if (clearTicks != null) __obj.updateDynamic("clearTicks")(clearTicks)
    if (config != null) __obj.updateDynamic("config")(config)
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(constrainTo)
    if (ddGroup != null) __obj.updateDynamic("ddGroup")(ddGroup)
    if (defaultPadding != null) __obj.updateDynamic("defaultPadding")(defaultPadding)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (dropAllowed != null) __obj.updateDynamic("dropAllowed")(dropAllowed)
    if (dropNotAllowed != null) __obj.updateDynamic("dropNotAllowed")(dropNotAllowed)
    if (endDrag != null) __obj.updateDynamic("endDrag")(endDrag)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDragEl != null) __obj.updateDynamic("getDragEl")(getDragEl)
    if (getEl != null) __obj.updateDynamic("getEl")(getEl)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getTargetFromEvent != null) __obj.updateDynamic("getTargetFromEvent")(getTargetFromEvent)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (!js.isUndefined(hasOuterHandles)) __obj.updateDynamic("hasOuterHandles")(hasOuterHandles)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(ignoreSelf)) __obj.updateDynamic("ignoreSelf")(ignoreSelf)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (init != null) __obj.updateDynamic("init")(init)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
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
    if (notifyDrop != null) __obj.updateDynamic("notifyDrop")(notifyDrop)
    if (notifyEnter != null) __obj.updateDynamic("notifyEnter")(notifyEnter)
    if (notifyOut != null) __obj.updateDynamic("notifyOut")(notifyOut)
    if (notifyOver != null) __obj.updateDynamic("notifyOver")(notifyOver)
    if (onAvailable != null) __obj.updateDynamic("onAvailable")(onAvailable)
    if (onContainerDrop != null) __obj.updateDynamic("onContainerDrop")(onContainerDrop)
    if (onContainerOver != null) __obj.updateDynamic("onContainerOver")(onContainerOver)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(onDragDrop)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragOut != null) __obj.updateDynamic("onDragOut")(onDragOut)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onInvalidDrop != null) __obj.updateDynamic("onInvalidDrop")(onInvalidDrop)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onNodeDrop != null) __obj.updateDynamic("onNodeDrop")(onNodeDrop)
    if (onNodeEnter != null) __obj.updateDynamic("onNodeEnter")(onNodeEnter)
    if (onNodeOut != null) __obj.updateDynamic("onNodeOut")(onNodeOut)
    if (onNodeOver != null) __obj.updateDynamic("onNodeOver")(onNodeOver)
    if (overClass != null) __obj.updateDynamic("overClass")(overClass)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(primaryButtonOnly)) __obj.updateDynamic("primaryButtonOnly")(primaryButtonOnly)
    if (removeFromGroup != null) __obj.updateDynamic("removeFromGroup")(removeFromGroup)
    if (removeInvalidHandleClass != null) __obj.updateDynamic("removeInvalidHandleClass")(removeInvalidHandleClass)
    if (removeInvalidHandleId != null) __obj.updateDynamic("removeInvalidHandleId")(removeInvalidHandleId)
    if (removeInvalidHandleType != null) __obj.updateDynamic("removeInvalidHandleType")(removeInvalidHandleType)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resetConstraints != null) __obj.updateDynamic("resetConstraints")(resetConstraints)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDragElId != null) __obj.updateDynamic("setDragElId")(setDragElId)
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
    __obj.asInstanceOf[IDropZone]
  }
}

