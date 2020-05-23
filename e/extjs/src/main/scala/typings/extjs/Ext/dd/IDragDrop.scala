package typings.extjs.Ext.dd

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDrop extends IBase {
  /** [Method] Lets you specify a css class of elements that will not initiate a drag
    * @param cssClass String the class of the elements you wish to ignore
    */
  var addInvalidHandleClass: js.UndefOr[js.Function1[/* cssClass */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Lets you to specify an element id for a child of a drag handle that should not initiate a drag
    * @param id String the element id of the element you wish to ignore
    */
  var addInvalidHandleId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Allows you to specify a tag name that should not start a drag operation when clicked
    * @param tagName String the type of element to exclude
    */
  var addInvalidHandleType: js.UndefOr[js.Function1[/* tagName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Adds this instance to a group of related drag drop objects
    * @param sGroup String the name of the group
    */
  var addToGroup: js.UndefOr[js.Function1[/* sGroup */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Applies the configuration parameters that were passed into the constructor  */
  var applyConfig: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Boolean) */
  var available: js.UndefOr[Boolean] = js.undefined
  /** [Method] Clears any constraints applied to this instance  */
  var clearConstraints: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Clears any tick interval defined for this instance */
  var clearTicks: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Initializes the drag drop object s constraints to restrict movement to a certain element
    * @param constrainTo String/HTMLElement/Ext.Element The element or element ID to constrain to.
    * @param pad Object/Number Pad provides a way to specify "padding" of the constraints, and can be either a number for symmetrical padding (4 would be equal to {left:4, right:4, top:4, bottom:4}) or an object containing the sides to pad. For example: {right:10, bottom:10}
    * @param inContent Boolean Constrain the draggable in the content box of the element (inside padding and borders)
    */
  var constrainTo: js.UndefOr[
    js.Function3[
      /* constrainTo */ js.UndefOr[js.Any], 
      /* pad */ js.UndefOr[js.Any], 
      /* inContent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var defaultPadding: js.UndefOr[js.Any] = js.undefined
  /** [Method] Destroy this DragDrop instance */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Called when we are done dragging the object
    * @param e Event the mouseup event
    */
  var endDrag: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  /** [Method] Returns a reference to the actual element to drag
    * @returns HTMLElement the html element
    */
  var getDragEl: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  /** [Method] Returns a reference to the linked element
    * @returns HTMLElement the html element
    */
  var getEl: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  /** [Property] (Object) */
  var groups: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var hasOuterHandles: js.UndefOr[Boolean] = js.undefined
  /** [Property] (String) */
  var id: js.UndefOr[String] = js.undefined
  /** [Property] (Boolean) */
  var ignoreSelf: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets up the DragDrop object
    * @param id String the id of the linked element
    * @param sGroup String the group of related items
    * @param config Object configuration attributes
    */
  var init: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[String], 
      /* sGroup */ js.UndefOr[String], 
      /* config */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Initializes Targeting functionality only
    * @param id String the id of the linked element
    * @param sGroup String the group of related items
    * @param config Object configuration attributes
    */
  var initTarget: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[String], 
      /* sGroup */ js.UndefOr[String], 
      /* config */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Property] (String[]) */
  var invalidHandleClasses: js.UndefOr[Array] = js.undefined
  /** [Property] (Object) */
  var invalidHandleIds: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var invalidHandleTypes: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns true if this instance is locked or the drag drop mgr is locked meaning that all drag drop is disabled on th
    * @returns Boolean true if this obj or all drag/drop is locked, else false
    */
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isTarget: js.UndefOr[Boolean] = js.undefined
  /** [Method] Checks the tag exclusion list to see if this click should be ignored
    * @param node HTMLElement the HTMLElement to evaluate
    * @returns Boolean true if this is a valid tag type, false if not
    */
  var isValidHandleChild: js.UndefOr[js.Function1[/* node */ js.UndefOr[HTMLElement], Boolean]] = js.undefined
  /** [Method] Locks this instance */
  var lock: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Boolean) */
  var maintainOffset: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var moveOnly: js.UndefOr[Boolean] = js.undefined
  /** [Method] Override the onAvailable method to do what is needed after the initial position was determined  */
  var onAvailable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Abstract method called during the onMouseMove event while dragging an object
    * @param e Event the mousemove event
    */
  var onDrag: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  /** [Method] Abstract method called when this item is dropped on another DragDrop obj
    * @param e Event the mouseup event
    * @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this was dropped on. In INTERSECT mode, an array of dd items this was dropped on.
    */
  var onDragDrop: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Abstract method called when this element fist begins hovering over another DragDrop obj
    * @param e Event the mousemove event
    * @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this is hovering over. In INTERSECT mode, an array of one or more dragdrop items being hovered over.
    */
  var onDragEnter: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Abstract method called when we are no longer hovering over an element
    * @param e Event the mousemove event
    * @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this was hovering over. In INTERSECT mode, an array of dd items that the mouse is no longer over.
    */
  var onDragOut: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Abstract method called when this element is hovering over another DragDrop obj
    * @param e Event the mousemove event
    * @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this is hovering over. In INTERSECT mode, an array of dd items being hovered over.
    */
  var onDragOver: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Abstract method called when this item is dropped on an area with no drop target
    * @param e Event the mouseup event
    */
  var onInvalidDrop: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  /** [Method] Called when a drag drop obj gets a mousedown
    * @param e Event the mousedown event
    */
  var onMouseDown: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  /** [Method] Called when a drag drop obj gets a mouseup
    * @param e Event the mouseup event
    */
  var onMouseUp: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  /** [Property] (Number[]) */
  var padding: js.UndefOr[Array] = js.undefined
  /** [Property] (Boolean) */
  var primaryButtonOnly: js.UndefOr[Boolean] = js.undefined
  /** [Method] Removes this instance from the supplied interaction group
    * @param sGroup String The group to drop
    */
  var removeFromGroup: js.UndefOr[js.Function1[/* sGroup */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Unsets an invalid css class
    * @param cssClass String the class of the element(s) you wish to re-enable
    */
  var removeInvalidHandleClass: js.UndefOr[js.Function1[/* cssClass */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Unsets an invalid handle id
    * @param id String the id of the element to re-enable
    */
  var removeInvalidHandleId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Unsets an excluded tag name set by addInvalidHandleType
    * @param tagName String the type of element to unexclude
    */
  var removeInvalidHandleType: js.UndefOr[js.Function1[/* tagName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Must be called if you manually reposition a dd element
    * @param maintainOffset Boolean
    */
  var resetConstraints: js.UndefOr[js.Function1[/* maintainOffset */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Allows you to specify that an element other than the linked element will be moved with the cursor during a drag
    * @param id String the id of the element that will be used to initiate the drag
    */
  var setDragElId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Allows you to specify a child of the linked element that should be used to initiate the drag operation
    * @param id String the id of the element that will be used to initiate the drag.
    */
  var setHandleElId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Stores the initial placement of the linked element
    * @param diffX Number the X offset, default 0
    * @param diffY Number the Y offset, default 0
    */
  var setInitPosition: js.UndefOr[
    js.Function2[/* diffX */ js.UndefOr[Double], /* diffY */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] Allows you to set an element outside of the linked element as a drag handle
    * @param id String the id of the element that will be used to initiate the drag
    */
  var setOuterHandleElId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Configures the padding for the target zone in px
    * @param iTop Number Top pad
    * @param iRight Number Right pad
    * @param iBot Number Bot pad
    * @param iLeft Number Left pad
    */
  var setPadding: js.UndefOr[
    js.Function4[
      /* iTop */ js.UndefOr[Double], 
      /* iRight */ js.UndefOr[Double], 
      /* iBot */ js.UndefOr[Double], 
      /* iLeft */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] By default the element can be dragged any place on the screen
    * @param iLeft Number the number of pixels the element can move to the left
    * @param iRight Number the number of pixels the element can move to the right
    * @param iTickSize Number parameter for specifying that the element should move iTickSize pixels at a time.
    */
  var setXConstraint: js.UndefOr[
    js.Function3[
      /* iLeft */ js.UndefOr[Double], 
      /* iRight */ js.UndefOr[Double], 
      /* iTickSize */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] By default the element can be dragged any place on the screen
    * @param iUp Number the number of pixels the element can move up
    * @param iDown Number the number of pixels the element can move down
    * @param iTickSize Number parameter for specifying that the element should move iTickSize pixels at a time.
    */
  var setYConstraint: js.UndefOr[
    js.Function3[
      /* iUp */ js.UndefOr[Double], 
      /* iDown */ js.UndefOr[Double], 
      /* iTickSize */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Abstract method called after a drag drop object is clicked and the drag or mousedown time thresholds have beeen met
    * @param x Number X click location
    * @param y Number Y click location
    */
  var startDrag: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] toString method
    * @returns String string representation of the dd obj
    */
  @JSName("toString")
  var toString_FIDragDrop: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Unlocks this instace */
  var unlock: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Removes all drag and drop hooks for this element */
  var unreg: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Number[]) */
  var xTicks: js.UndefOr[Array] = js.undefined
  /** [Property] (Number[]) */
  var yTicks: js.UndefOr[Array] = js.undefined
}

object IDragDrop {
  @scala.inline
  def apply(
    addInvalidHandleClass: /* cssClass */ js.UndefOr[String] => Unit = null,
    addInvalidHandleId: /* id */ js.UndefOr[String] => Unit = null,
    addInvalidHandleType: /* tagName */ js.UndefOr[String] => Unit = null,
    addToGroup: /* sGroup */ js.UndefOr[String] => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    applyConfig: () => Unit = null,
    available: js.UndefOr[Boolean] = js.undefined,
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
    extend: String = null,
    getDragEl: () => HTMLElement = null,
    getEl: () => HTMLElement = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    groups: js.Any = null,
    hasOuterHandles: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    ignoreSelf: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    init: (/* id */ js.UndefOr[String], /* sGroup */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => Unit = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IDragDrop = null,
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
    removeFromGroup: /* sGroup */ js.UndefOr[String] => Unit = null,
    removeInvalidHandleClass: /* cssClass */ js.UndefOr[String] => Unit = null,
    removeInvalidHandleId: /* id */ js.UndefOr[String] => Unit = null,
    removeInvalidHandleType: /* tagName */ js.UndefOr[String] => Unit = null,
    requires: Array = null,
    resetConstraints: /* maintainOffset */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    setDragElId: /* id */ js.UndefOr[String] => Unit = null,
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
  ): IDragDrop = {
    val __obj = js.Dynamic.literal()
    if (addInvalidHandleClass != null) __obj.updateDynamic("addInvalidHandleClass")(js.Any.fromFunction1(addInvalidHandleClass))
    if (addInvalidHandleId != null) __obj.updateDynamic("addInvalidHandleId")(js.Any.fromFunction1(addInvalidHandleId))
    if (addInvalidHandleType != null) __obj.updateDynamic("addInvalidHandleType")(js.Any.fromFunction1(addInvalidHandleType))
    if (addToGroup != null) __obj.updateDynamic("addToGroup")(js.Any.fromFunction1(addToGroup))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (applyConfig != null) __obj.updateDynamic("applyConfig")(js.Any.fromFunction0(applyConfig))
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.get.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearConstraints != null) __obj.updateDynamic("clearConstraints")(js.Any.fromFunction0(clearConstraints))
    if (clearTicks != null) __obj.updateDynamic("clearTicks")(js.Any.fromFunction0(clearTicks))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(js.Any.fromFunction3(constrainTo))
    if (defaultPadding != null) __obj.updateDynamic("defaultPadding")(defaultPadding.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (endDrag != null) __obj.updateDynamic("endDrag")(js.Any.fromFunction1(endDrag))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getDragEl != null) __obj.updateDynamic("getDragEl")(js.Any.fromFunction0(getDragEl))
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction0(getEl))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(hasOuterHandles)) __obj.updateDynamic("hasOuterHandles")(hasOuterHandles.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSelf)) __obj.updateDynamic("ignoreSelf")(ignoreSelf.get.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction3(init))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initTarget != null) __obj.updateDynamic("initTarget")(js.Any.fromFunction3(initTarget))
    if (invalidHandleClasses != null) __obj.updateDynamic("invalidHandleClasses")(invalidHandleClasses.asInstanceOf[js.Any])
    if (invalidHandleIds != null) __obj.updateDynamic("invalidHandleIds")(invalidHandleIds.asInstanceOf[js.Any])
    if (invalidHandleTypes != null) __obj.updateDynamic("invalidHandleTypes")(invalidHandleTypes.asInstanceOf[js.Any])
    if (isLocked != null) __obj.updateDynamic("isLocked")(js.Any.fromFunction0(isLocked))
    if (!js.isUndefined(isTarget)) __obj.updateDynamic("isTarget")(isTarget.get.asInstanceOf[js.Any])
    if (isValidHandleChild != null) __obj.updateDynamic("isValidHandleChild")(js.Any.fromFunction1(isValidHandleChild))
    if (lock != null) __obj.updateDynamic("lock")(js.Any.fromFunction0(lock))
    if (!js.isUndefined(maintainOffset)) __obj.updateDynamic("maintainOffset")(maintainOffset.get.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOnly)) __obj.updateDynamic("moveOnly")(moveOnly.get.asInstanceOf[js.Any])
    if (onAvailable != null) __obj.updateDynamic("onAvailable")(js.Any.fromFunction0(onAvailable))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(js.Any.fromFunction2(onDragDrop))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction2(onDragEnter))
    if (onDragOut != null) __obj.updateDynamic("onDragOut")(js.Any.fromFunction2(onDragOut))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction2(onDragOver))
    if (onInvalidDrop != null) __obj.updateDynamic("onInvalidDrop")(js.Any.fromFunction1(onInvalidDrop))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryButtonOnly)) __obj.updateDynamic("primaryButtonOnly")(primaryButtonOnly.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (startDrag != null) __obj.updateDynamic("startDrag")(js.Any.fromFunction2(startDrag))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    if (unlock != null) __obj.updateDynamic("unlock")(js.Any.fromFunction0(unlock))
    if (unreg != null) __obj.updateDynamic("unreg")(js.Any.fromFunction0(unreg))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (xTicks != null) __obj.updateDynamic("xTicks")(xTicks.asInstanceOf[js.Any])
    if (yTicks != null) __obj.updateDynamic("yTicks")(yTicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragDrop]
  }
}

