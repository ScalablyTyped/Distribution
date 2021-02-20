package typings.extjs.Ext.dd

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDragDrop extends IBase {
  
  /** [Method] Lets you specify a css class of elements that will not initiate a drag
    * @param cssClass String the class of the elements you wish to ignore
    */
  var addInvalidHandleClass: js.UndefOr[js.Function1[/* cssClass */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Lets you to specify an element id for a child of a drag handle that should not initiate a drag
    * @param id String the element id of the element you wish to ignore
    */
  var addInvalidHandleId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Allows you to specify a tag name that should not start a drag operation when clicked
    * @param tagName String the type of element to exclude
    */
  var addInvalidHandleType: js.UndefOr[js.Function1[/* tagName */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Adds this instance to a group of related drag drop objects
    * @param sGroup String the name of the group
    */
  var addToGroup: js.UndefOr[js.Function1[/* sGroup */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Applies the configuration parameters that were passed into the constructor  */
  var applyConfig: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Boolean) */
  var available: js.UndefOr[Boolean] = js.native
  
  /** [Method] Clears any constraints applied to this instance  */
  var clearConstraints: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Clears any tick interval defined for this instance */
  var clearTicks: js.UndefOr[js.Function0[Unit]] = js.native
  
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
  ] = js.native
  
  /** [Property] (Object) */
  var defaultPadding: js.UndefOr[js.Any] = js.native
  
  /** [Method] Destroy this DragDrop instance */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Called when we are done dragging the object
    * @param e Event the mouseup event
    */
  var endDrag: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  
  /** [Method] Returns a reference to the actual element to drag
    * @returns HTMLElement the html element
    */
  var getDragEl: js.UndefOr[js.Function0[HTMLElement]] = js.native
  
  /** [Method] Returns a reference to the linked element
    * @returns HTMLElement the html element
    */
  var getEl: js.UndefOr[js.Function0[HTMLElement]] = js.native
  
  /** [Property] (Object) */
  var groups: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Boolean) */
  var hasOuterHandles: js.UndefOr[Boolean] = js.native
  
  /** [Property] (String) */
  var id: js.UndefOr[String] = js.native
  
  /** [Property] (Boolean) */
  var ignoreSelf: js.UndefOr[Boolean] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /** [Property] (String[]) */
  var invalidHandleClasses: js.UndefOr[Array] = js.native
  
  /** [Property] (Object) */
  var invalidHandleIds: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Object) */
  var invalidHandleTypes: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns true if this instance is locked or the drag drop mgr is locked meaning that all drag drop is disabled on th
    * @returns Boolean true if this obj or all drag/drop is locked, else false
    */
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Property] (Boolean) */
  var isTarget: js.UndefOr[Boolean] = js.native
  
  /** [Method] Checks the tag exclusion list to see if this click should be ignored
    * @param node HTMLElement the HTMLElement to evaluate
    * @returns Boolean true if this is a valid tag type, false if not
    */
  var isValidHandleChild: js.UndefOr[js.Function1[/* node */ js.UndefOr[HTMLElement], Boolean]] = js.native
  
  /** [Method] Locks this instance */
  var lock: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Boolean) */
  var maintainOffset: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var moveOnly: js.UndefOr[Boolean] = js.native
  
  /** [Method] Override the onAvailable method to do what is needed after the initial position was determined  */
  var onAvailable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Abstract method called during the onMouseMove event while dragging an object
    * @param e Event the mousemove event
    */
  var onDrag: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  
  /** [Method] Abstract method called when this item is dropped on another DragDrop obj
    * @param e Event the mouseup event
    * @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this was dropped on. In INTERSECT mode, an array of dd items this was dropped on.
    */
  var onDragDrop: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Abstract method called when this element fist begins hovering over another DragDrop obj
    * @param e Event the mousemove event
    * @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this is hovering over. In INTERSECT mode, an array of one or more dragdrop items being hovered over.
    */
  var onDragEnter: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Abstract method called when we are no longer hovering over an element
    * @param e Event the mousemove event
    * @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this was hovering over. In INTERSECT mode, an array of dd items that the mouse is no longer over.
    */
  var onDragOut: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Abstract method called when this element is hovering over another DragDrop obj
    * @param e Event the mousemove event
    * @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this is hovering over. In INTERSECT mode, an array of dd items being hovered over.
    */
  var onDragOver: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Abstract method called when this item is dropped on an area with no drop target
    * @param e Event the mouseup event
    */
  var onInvalidDrop: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  
  /** [Method] Called when a drag drop obj gets a mousedown
    * @param e Event the mousedown event
    */
  var onMouseDown: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  
  /** [Method] Called when a drag drop obj gets a mouseup
    * @param e Event the mouseup event
    */
  var onMouseUp: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  
  /** [Property] (Number[]) */
  var padding: js.UndefOr[Array] = js.native
  
  /** [Property] (Boolean) */
  var primaryButtonOnly: js.UndefOr[Boolean] = js.native
  
  /** [Method] Removes this instance from the supplied interaction group
    * @param sGroup String The group to drop
    */
  var removeFromGroup: js.UndefOr[js.Function1[/* sGroup */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Unsets an invalid css class
    * @param cssClass String the class of the element(s) you wish to re-enable
    */
  var removeInvalidHandleClass: js.UndefOr[js.Function1[/* cssClass */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Unsets an invalid handle id
    * @param id String the id of the element to re-enable
    */
  var removeInvalidHandleId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Unsets an excluded tag name set by addInvalidHandleType
    * @param tagName String the type of element to unexclude
    */
  var removeInvalidHandleType: js.UndefOr[js.Function1[/* tagName */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Must be called if you manually reposition a dd element
    * @param maintainOffset Boolean
    */
  var resetConstraints: js.UndefOr[js.Function1[/* maintainOffset */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Allows you to specify that an element other than the linked element will be moved with the cursor during a drag
    * @param id String the id of the element that will be used to initiate the drag
    */
  var setDragElId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Allows you to specify a child of the linked element that should be used to initiate the drag operation
    * @param id String the id of the element that will be used to initiate the drag.
    */
  var setHandleElId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Stores the initial placement of the linked element
    * @param diffX Number the X offset, default 0
    * @param diffY Number the Y offset, default 0
    */
  var setInitPosition: js.UndefOr[
    js.Function2[/* diffX */ js.UndefOr[Double], /* diffY */ js.UndefOr[Double], Unit]
  ] = js.native
  
  /** [Method] Allows you to set an element outside of the linked element as a drag handle
    * @param id String the id of the element that will be used to initiate the drag
    */
  var setOuterHandleElId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /** [Method] Abstract method called after a drag drop object is clicked and the drag or mousedown time thresholds have beeen met
    * @param x Number X click location
    * @param y Number Y click location
    */
  var startDrag: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] toString method
    * @returns String string representation of the dd obj
    */
  @JSName("toString")
  var toString_FIDragDrop: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Unlocks this instace */
  var unlock: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Removes all drag and drop hooks for this element */
  var unreg: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Number[]) */
  var xTicks: js.UndefOr[Array] = js.native
  
  /** [Property] (Number[]) */
  var yTicks: js.UndefOr[Array] = js.native
}
object IDragDrop {
  
  @scala.inline
  def apply(): IDragDrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragDrop]
  }
  
  @scala.inline
  implicit class IDragDropMutableBuilder[Self <: IDragDrop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddInvalidHandleClass(value: /* cssClass */ js.UndefOr[String] => Unit): Self = StObject.set(x, "addInvalidHandleClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddInvalidHandleClassUndefined: Self = StObject.set(x, "addInvalidHandleClass", js.undefined)
    
    @scala.inline
    def setAddInvalidHandleId(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "addInvalidHandleId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddInvalidHandleIdUndefined: Self = StObject.set(x, "addInvalidHandleId", js.undefined)
    
    @scala.inline
    def setAddInvalidHandleType(value: /* tagName */ js.UndefOr[String] => Unit): Self = StObject.set(x, "addInvalidHandleType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddInvalidHandleTypeUndefined: Self = StObject.set(x, "addInvalidHandleType", js.undefined)
    
    @scala.inline
    def setAddToGroup(value: /* sGroup */ js.UndefOr[String] => Unit): Self = StObject.set(x, "addToGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddToGroupUndefined: Self = StObject.set(x, "addToGroup", js.undefined)
    
    @scala.inline
    def setApplyConfig(value: () => Unit): Self = StObject.set(x, "applyConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyConfigUndefined: Self = StObject.set(x, "applyConfig", js.undefined)
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    @scala.inline
    def setClearConstraints(value: () => Unit): Self = StObject.set(x, "clearConstraints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearConstraintsUndefined: Self = StObject.set(x, "clearConstraints", js.undefined)
    
    @scala.inline
    def setClearTicks(value: () => Unit): Self = StObject.set(x, "clearTicks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearTicksUndefined: Self = StObject.set(x, "clearTicks", js.undefined)
    
    @scala.inline
    def setConstrainTo(
      value: (/* constrainTo */ js.UndefOr[js.Any], /* pad */ js.UndefOr[js.Any], /* inContent */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "constrainTo", js.Any.fromFunction3(value))
    
    @scala.inline
    def setConstrainToUndefined: Self = StObject.set(x, "constrainTo", js.undefined)
    
    @scala.inline
    def setDefaultPadding(value: js.Any): Self = StObject.set(x, "defaultPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPaddingUndefined: Self = StObject.set(x, "defaultPadding", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setEndDrag(value: /* e */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "endDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndDragUndefined: Self = StObject.set(x, "endDrag", js.undefined)
    
    @scala.inline
    def setGetDragEl(value: () => HTMLElement): Self = StObject.set(x, "getDragEl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDragElUndefined: Self = StObject.set(x, "getDragEl", js.undefined)
    
    @scala.inline
    def setGetEl(value: () => HTMLElement): Self = StObject.set(x, "getEl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElUndefined: Self = StObject.set(x, "getEl", js.undefined)
    
    @scala.inline
    def setGroups(value: js.Any): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setHasOuterHandles(value: Boolean): Self = StObject.set(x, "hasOuterHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasOuterHandlesUndefined: Self = StObject.set(x, "hasOuterHandles", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIgnoreSelf(value: Boolean): Self = StObject.set(x, "ignoreSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSelfUndefined: Self = StObject.set(x, "ignoreSelf", js.undefined)
    
    @scala.inline
    def setInit(
      value: (/* id */ js.UndefOr[String], /* sGroup */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInitTarget(
      value: (/* id */ js.UndefOr[String], /* sGroup */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "initTarget", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInitTargetUndefined: Self = StObject.set(x, "initTarget", js.undefined)
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setInvalidHandleClasses(value: Array): Self = StObject.set(x, "invalidHandleClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidHandleClassesUndefined: Self = StObject.set(x, "invalidHandleClasses", js.undefined)
    
    @scala.inline
    def setInvalidHandleIds(value: js.Any): Self = StObject.set(x, "invalidHandleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidHandleIdsUndefined: Self = StObject.set(x, "invalidHandleIds", js.undefined)
    
    @scala.inline
    def setInvalidHandleTypes(value: js.Any): Self = StObject.set(x, "invalidHandleTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidHandleTypesUndefined: Self = StObject.set(x, "invalidHandleTypes", js.undefined)
    
    @scala.inline
    def setIsLocked(value: () => Boolean): Self = StObject.set(x, "isLocked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
    
    @scala.inline
    def setIsTarget(value: Boolean): Self = StObject.set(x, "isTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTargetUndefined: Self = StObject.set(x, "isTarget", js.undefined)
    
    @scala.inline
    def setIsValidHandleChild(value: /* node */ js.UndefOr[HTMLElement] => Boolean): Self = StObject.set(x, "isValidHandleChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValidHandleChildUndefined: Self = StObject.set(x, "isValidHandleChild", js.undefined)
    
    @scala.inline
    def setLock(value: () => Unit): Self = StObject.set(x, "lock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
    
    @scala.inline
    def setMaintainOffset(value: Boolean): Self = StObject.set(x, "maintainOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainOffsetUndefined: Self = StObject.set(x, "maintainOffset", js.undefined)
    
    @scala.inline
    def setMoveOnly(value: Boolean): Self = StObject.set(x, "moveOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveOnlyUndefined: Self = StObject.set(x, "moveOnly", js.undefined)
    
    @scala.inline
    def setOnAvailable(value: () => Unit): Self = StObject.set(x, "onAvailable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAvailableUndefined: Self = StObject.set(x, "onAvailable", js.undefined)
    
    @scala.inline
    def setOnDrag(value: /* e */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragDrop(value: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onDragDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDragDropUndefined: Self = StObject.set(x, "onDragDrop", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragOut(value: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onDragOut", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDragOutUndefined: Self = StObject.set(x, "onDragOut", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    @scala.inline
    def setOnInvalidDrop(value: /* e */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "onInvalidDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInvalidDropUndefined: Self = StObject.set(x, "onInvalidDrop", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: /* e */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: /* e */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setPadding(value: Array): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPrimaryButtonOnly(value: Boolean): Self = StObject.set(x, "primaryButtonOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryButtonOnlyUndefined: Self = StObject.set(x, "primaryButtonOnly", js.undefined)
    
    @scala.inline
    def setRemoveFromGroup(value: /* sGroup */ js.UndefOr[String] => Unit): Self = StObject.set(x, "removeFromGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveFromGroupUndefined: Self = StObject.set(x, "removeFromGroup", js.undefined)
    
    @scala.inline
    def setRemoveInvalidHandleClass(value: /* cssClass */ js.UndefOr[String] => Unit): Self = StObject.set(x, "removeInvalidHandleClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveInvalidHandleClassUndefined: Self = StObject.set(x, "removeInvalidHandleClass", js.undefined)
    
    @scala.inline
    def setRemoveInvalidHandleId(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "removeInvalidHandleId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveInvalidHandleIdUndefined: Self = StObject.set(x, "removeInvalidHandleId", js.undefined)
    
    @scala.inline
    def setRemoveInvalidHandleType(value: /* tagName */ js.UndefOr[String] => Unit): Self = StObject.set(x, "removeInvalidHandleType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveInvalidHandleTypeUndefined: Self = StObject.set(x, "removeInvalidHandleType", js.undefined)
    
    @scala.inline
    def setResetConstraints(value: /* maintainOffset */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "resetConstraints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetConstraintsUndefined: Self = StObject.set(x, "resetConstraints", js.undefined)
    
    @scala.inline
    def setSetDragElId(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDragElId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDragElIdUndefined: Self = StObject.set(x, "setDragElId", js.undefined)
    
    @scala.inline
    def setSetHandleElId(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setHandleElId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHandleElIdUndefined: Self = StObject.set(x, "setHandleElId", js.undefined)
    
    @scala.inline
    def setSetInitPosition(value: (/* diffX */ js.UndefOr[Double], /* diffY */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "setInitPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetInitPositionUndefined: Self = StObject.set(x, "setInitPosition", js.undefined)
    
    @scala.inline
    def setSetOuterHandleElId(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setOuterHandleElId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOuterHandleElIdUndefined: Self = StObject.set(x, "setOuterHandleElId", js.undefined)
    
    @scala.inline
    def setSetPadding(
      value: (/* iTop */ js.UndefOr[Double], /* iRight */ js.UndefOr[Double], /* iBot */ js.UndefOr[Double], /* iLeft */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "setPadding", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetPaddingUndefined: Self = StObject.set(x, "setPadding", js.undefined)
    
    @scala.inline
    def setSetXConstraint(
      value: (/* iLeft */ js.UndefOr[Double], /* iRight */ js.UndefOr[Double], /* iTickSize */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "setXConstraint", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetXConstraintUndefined: Self = StObject.set(x, "setXConstraint", js.undefined)
    
    @scala.inline
    def setSetYConstraint(
      value: (/* iUp */ js.UndefOr[Double], /* iDown */ js.UndefOr[Double], /* iTickSize */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "setYConstraint", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetYConstraintUndefined: Self = StObject.set(x, "setYConstraint", js.undefined)
    
    @scala.inline
    def setStartDrag(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "startDrag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartDragUndefined: Self = StObject.set(x, "startDrag", js.undefined)
    
    @scala.inline
    def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    
    @scala.inline
    def setUnlock(value: () => Unit): Self = StObject.set(x, "unlock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnlockUndefined: Self = StObject.set(x, "unlock", js.undefined)
    
    @scala.inline
    def setUnreg(value: () => Unit): Self = StObject.set(x, "unreg", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnregUndefined: Self = StObject.set(x, "unreg", js.undefined)
    
    @scala.inline
    def setXTicks(value: Array): Self = StObject.set(x, "xTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXTicksUndefined: Self = StObject.set(x, "xTicks", js.undefined)
    
    @scala.inline
    def setYTicks(value: Array): Self = StObject.set(x, "yTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYTicksUndefined: Self = StObject.set(x, "yTicks", js.undefined)
  }
}
