package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDrop
  extends extjsLib.ExtNs.IBase {
  /** [Method] Lets you specify a css class of elements that will not initiate a drag
  		* @param cssClass String the class of the elements you wish to ignore
  		*/
  var addInvalidHandleClass: js.UndefOr[js.Function1[/* cssClass */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Lets you to specify an element id for a child of a drag handle that should not initiate a drag
  		* @param id String the element id of the element you wish to ignore
  		*/
  var addInvalidHandleId: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Allows you to specify a tag name that should not start a drag operation when clicked
  		* @param tagName String the type of element to exclude
  		*/
  var addInvalidHandleType: js.UndefOr[js.Function1[/* tagName */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Adds this instance to a group of related drag drop objects
  		* @param sGroup String the name of the group
  		*/
  var addToGroup: js.UndefOr[js.Function1[/* sGroup */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Applies the configuration parameters that were passed into the constructor  */
  var applyConfig: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var available: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Clears any constraints applied to this instance  */
  var clearConstraints: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Clears any tick interval defined for this instance */
  var clearTicks: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Initializes the drag drop object s constraints to restrict movement to a certain element
  		* @param constrainTo String/HTMLElement/Ext.Element The element or element ID to constrain to.
  		* @param pad Object/Number Pad provides a way to specify "padding" of the constraints, and can be either a number for symmetrical padding (4 would be equal to {left:4, right:4, top:4, bottom:4}) or an object containing the sides to pad. For example: {right:10, bottom:10}
  		* @param inContent Boolean Constrain the draggable in the content box of the element (inside padding and borders)
  		*/
  var constrainTo: js.UndefOr[
    js.Function3[
      /* constrainTo */ js.UndefOr[js.Any], 
      /* pad */ js.UndefOr[js.Any], 
      /* inContent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var defaultPadding: js.UndefOr[js.Any] = js.undefined
  /** [Method] Destroy this DragDrop instance */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Called when we are done dragging the object
  		* @param e Event the mouseup event
  		*/
  var endDrag: js.UndefOr[js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit]] = js.undefined
  /** [Method] Returns a reference to the actual element to drag
  		* @returns HTMLElement the html element
  		*/
  var getDragEl: js.UndefOr[js.Function0[stdLib.HTMLElement]] = js.undefined
  /** [Method] Returns a reference to the linked element
  		* @returns HTMLElement the html element
  		*/
  var getEl: js.UndefOr[js.Function0[stdLib.HTMLElement]] = js.undefined
  /** [Property] (Object) */
  var groups: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var hasOuterHandles: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (String) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var ignoreSelf: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets up the DragDrop object
  		* @param id String the id of the linked element
  		* @param sGroup String the group of related items
  		* @param config Object configuration attributes
  		*/
  var init: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* sGroup */ js.UndefOr[java.lang.String], 
      /* config */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Initializes Targeting functionality only
  		* @param id String the id of the linked element
  		* @param sGroup String the group of related items
  		* @param config Object configuration attributes
  		*/
  var initTarget: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* sGroup */ js.UndefOr[java.lang.String], 
      /* config */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (String[]) */
  var invalidHandleClasses: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Property] (Object) */
  var invalidHandleIds: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var invalidHandleTypes: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns true if this instance is locked or the drag drop mgr is locked meaning that all drag drop is disabled on th
  		* @returns Boolean true if this obj or all drag/drop is locked, else false
  		*/
  var isLocked: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isTarget: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Checks the tag exclusion list to see if this click should be ignored
  		* @param node HTMLElement the HTMLElement to evaluate
  		* @returns Boolean true if this is a valid tag type, false if not
  		*/
  var isValidHandleChild: js.UndefOr[js.Function1[/* node */ js.UndefOr[stdLib.HTMLElement], scala.Boolean]] = js.undefined
  /** [Method] Locks this instance */
  var lock: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var maintainOffset: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var moveOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Override the onAvailable method to do what is needed after the initial position was determined  */
  var onAvailable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Abstract method called during the onMouseMove event while dragging an object
  		* @param e Event the mousemove event
  		*/
  var onDrag: js.UndefOr[js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit]] = js.undefined
  /** [Method] Abstract method called when this item is dropped on another DragDrop obj
  		* @param e Event the mouseup event
  		* @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this was dropped on. In INTERSECT mode, an array of dd items this was dropped on.
  		*/
  var onDragDrop: js.UndefOr[
    js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Abstract method called when this element fist begins hovering over another DragDrop obj
  		* @param e Event the mousemove event
  		* @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this is hovering over. In INTERSECT mode, an array of one or more dragdrop items being hovered over.
  		*/
  var onDragEnter: js.UndefOr[
    js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Abstract method called when we are no longer hovering over an element
  		* @param e Event the mousemove event
  		* @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this was hovering over. In INTERSECT mode, an array of dd items that the mouse is no longer over.
  		*/
  var onDragOut: js.UndefOr[
    js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Abstract method called when this element is hovering over another DragDrop obj
  		* @param e Event the mousemove event
  		* @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this is hovering over. In INTERSECT mode, an array of dd items being hovered over.
  		*/
  var onDragOver: js.UndefOr[
    js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Abstract method called when this item is dropped on an area with no drop target
  		* @param e Event the mouseup event
  		*/
  var onInvalidDrop: js.UndefOr[js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit]] = js.undefined
  /** [Method] Called when a drag drop obj gets a mousedown
  		* @param e Event the mousedown event
  		*/
  var onMouseDown: js.UndefOr[js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit]] = js.undefined
  /** [Method] Called when a drag drop obj gets a mouseup
  		* @param e Event the mouseup event
  		*/
  var onMouseUp: js.UndefOr[js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit]] = js.undefined
  /** [Property] (Number[]) */
  var padding: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Property] (Boolean) */
  var primaryButtonOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Removes this instance from the supplied interaction group
  		* @param sGroup String The group to drop
  		*/
  var removeFromGroup: js.UndefOr[js.Function1[/* sGroup */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Unsets an invalid css class
  		* @param cssClass String the class of the element(s) you wish to re-enable
  		*/
  var removeInvalidHandleClass: js.UndefOr[js.Function1[/* cssClass */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Unsets an invalid handle id
  		* @param id String the id of the element to re-enable
  		*/
  var removeInvalidHandleId: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Unsets an excluded tag name set by addInvalidHandleType
  		* @param tagName String the type of element to unexclude
  		*/
  var removeInvalidHandleType: js.UndefOr[js.Function1[/* tagName */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Must be called if you manually reposition a dd element
  		* @param maintainOffset Boolean
  		*/
  var resetConstraints: js.UndefOr[js.Function1[/* maintainOffset */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Allows you to specify that an element other than the linked element will be moved with the cursor during a drag
  		* @param id String the id of the element that will be used to initiate the drag
  		*/
  var setDragElId: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Allows you to specify a child of the linked element that should be used to initiate the drag operation
  		* @param id String the id of the element that will be used to initiate the drag.
  		*/
  var setHandleElId: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Stores the initial placement of the linked element
  		* @param diffX Number the X offset, default 0
  		* @param diffY Number the Y offset, default 0
  		*/
  var setInitPosition: js.UndefOr[
    js.Function2[
      /* diffX */ js.UndefOr[scala.Double], 
      /* diffY */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Allows you to set an element outside of the linked element as a drag handle
  		* @param id String the id of the element that will be used to initiate the drag
  		*/
  var setOuterHandleElId: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Configures the padding for the target zone in px
  		* @param iTop Number Top pad
  		* @param iRight Number Right pad
  		* @param iBot Number Bot pad
  		* @param iLeft Number Left pad
  		*/
  var setPadding: js.UndefOr[
    js.Function4[
      /* iTop */ js.UndefOr[scala.Double], 
      /* iRight */ js.UndefOr[scala.Double], 
      /* iBot */ js.UndefOr[scala.Double], 
      /* iLeft */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] By default the element can be dragged any place on the screen
  		* @param iLeft Number the number of pixels the element can move to the left
  		* @param iRight Number the number of pixels the element can move to the right
  		* @param iTickSize Number parameter for specifying that the element should move iTickSize pixels at a time.
  		*/
  var setXConstraint: js.UndefOr[
    js.Function3[
      /* iLeft */ js.UndefOr[scala.Double], 
      /* iRight */ js.UndefOr[scala.Double], 
      /* iTickSize */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] By default the element can be dragged any place on the screen
  		* @param iUp Number the number of pixels the element can move up
  		* @param iDown Number the number of pixels the element can move down
  		* @param iTickSize Number parameter for specifying that the element should move iTickSize pixels at a time.
  		*/
  var setYConstraint: js.UndefOr[
    js.Function3[
      /* iUp */ js.UndefOr[scala.Double], 
      /* iDown */ js.UndefOr[scala.Double], 
      /* iTickSize */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Abstract method called after a drag drop object is clicked and the drag or mousedown time thresholds have beeen met
  		* @param x Number X click location
  		* @param y Number Y click location
  		*/
  var startDrag: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Method] toString method
  		* @returns String string representation of the dd obj
  		*/
  @JSName("toString")
  var toString_FIDragDrop: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Unlocks this instace */
  var unlock: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Removes all drag and drop hooks for this element */
  var unreg: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Number[]) */
  var xTicks: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Property] (Number[]) */
  var yTicks: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
}

object IDragDrop {
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
    defaultPadding: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    endDrag: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    extend: java.lang.String = null,
    getDragEl: js.Function0[stdLib.HTMLElement] = null,
    getEl: js.Function0[stdLib.HTMLElement] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
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
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IDragDrop] = null,
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
    onDrag: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    onDragDrop: js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit] = null,
    onDragEnter: js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit] = null,
    onDragOut: js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit] = null,
    onDragOver: js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[js.Any], scala.Unit] = null,
    onInvalidDrop: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    onMouseDown: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    onMouseUp: js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit] = null,
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
  ): IDragDrop = {
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
    if (defaultPadding != null) __obj.updateDynamic("defaultPadding")(defaultPadding)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (endDrag != null) __obj.updateDynamic("endDrag")(endDrag)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDragEl != null) __obj.updateDynamic("getDragEl")(getDragEl)
    if (getEl != null) __obj.updateDynamic("getEl")(getEl)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
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
    if (onAvailable != null) __obj.updateDynamic("onAvailable")(onAvailable)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(onDragDrop)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragOut != null) __obj.updateDynamic("onDragOut")(onDragOut)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onInvalidDrop != null) __obj.updateDynamic("onInvalidDrop")(onInvalidDrop)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
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
    __obj.asInstanceOf[IDragDrop]
  }
}

