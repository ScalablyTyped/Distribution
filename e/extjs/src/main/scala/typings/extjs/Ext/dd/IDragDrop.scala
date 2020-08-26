package typings.extjs.Ext.dd

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IDragDropOps[Self <: IDragDrop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddInvalidHandleClass(value: /* cssClass */ js.UndefOr[String] => Unit): Self = this.set("addInvalidHandleClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddInvalidHandleClass: Self = this.set("addInvalidHandleClass", js.undefined)
    @scala.inline
    def setAddInvalidHandleId(value: /* id */ js.UndefOr[String] => Unit): Self = this.set("addInvalidHandleId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddInvalidHandleId: Self = this.set("addInvalidHandleId", js.undefined)
    @scala.inline
    def setAddInvalidHandleType(value: /* tagName */ js.UndefOr[String] => Unit): Self = this.set("addInvalidHandleType", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddInvalidHandleType: Self = this.set("addInvalidHandleType", js.undefined)
    @scala.inline
    def setAddToGroup(value: /* sGroup */ js.UndefOr[String] => Unit): Self = this.set("addToGroup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddToGroup: Self = this.set("addToGroup", js.undefined)
    @scala.inline
    def setApplyConfig(value: () => Unit): Self = this.set("applyConfig", js.Any.fromFunction0(value))
    @scala.inline
    def deleteApplyConfig: Self = this.set("applyConfig", js.undefined)
    @scala.inline
    def setAvailable(value: Boolean): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailable: Self = this.set("available", js.undefined)
    @scala.inline
    def setClearConstraints(value: () => Unit): Self = this.set("clearConstraints", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClearConstraints: Self = this.set("clearConstraints", js.undefined)
    @scala.inline
    def setClearTicks(value: () => Unit): Self = this.set("clearTicks", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClearTicks: Self = this.set("clearTicks", js.undefined)
    @scala.inline
    def setConstrainTo(
      value: (/* constrainTo */ js.UndefOr[js.Any], /* pad */ js.UndefOr[js.Any], /* inContent */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("constrainTo", js.Any.fromFunction3(value))
    @scala.inline
    def deleteConstrainTo: Self = this.set("constrainTo", js.undefined)
    @scala.inline
    def setDefaultPadding(value: js.Any): Self = this.set("defaultPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPadding: Self = this.set("defaultPadding", js.undefined)
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEndDrag(value: /* e */ js.UndefOr[Event] => Unit): Self = this.set("endDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEndDrag: Self = this.set("endDrag", js.undefined)
    @scala.inline
    def setGetDragEl(value: () => HTMLElement): Self = this.set("getDragEl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDragEl: Self = this.set("getDragEl", js.undefined)
    @scala.inline
    def setGetEl(value: () => HTMLElement): Self = this.set("getEl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetEl: Self = this.set("getEl", js.undefined)
    @scala.inline
    def setGroups(value: js.Any): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setHasOuterHandles(value: Boolean): Self = this.set("hasOuterHandles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasOuterHandles: Self = this.set("hasOuterHandles", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIgnoreSelf(value: Boolean): Self = this.set("ignoreSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreSelf: Self = this.set("ignoreSelf", js.undefined)
    @scala.inline
    def setInit(
      value: (/* id */ js.UndefOr[String], /* sGroup */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("init", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setInitTarget(
      value: (/* id */ js.UndefOr[String], /* sGroup */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("initTarget", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInitTarget: Self = this.set("initTarget", js.undefined)
    @scala.inline
    def setInvalidHandleClasses(value: Array): Self = this.set("invalidHandleClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidHandleClasses: Self = this.set("invalidHandleClasses", js.undefined)
    @scala.inline
    def setInvalidHandleIds(value: js.Any): Self = this.set("invalidHandleIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidHandleIds: Self = this.set("invalidHandleIds", js.undefined)
    @scala.inline
    def setInvalidHandleTypes(value: js.Any): Self = this.set("invalidHandleTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidHandleTypes: Self = this.set("invalidHandleTypes", js.undefined)
    @scala.inline
    def setIsLocked(value: () => Boolean): Self = this.set("isLocked", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsLocked: Self = this.set("isLocked", js.undefined)
    @scala.inline
    def setIsTarget(value: Boolean): Self = this.set("isTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTarget: Self = this.set("isTarget", js.undefined)
    @scala.inline
    def setIsValidHandleChild(value: /* node */ js.UndefOr[HTMLElement] => Boolean): Self = this.set("isValidHandleChild", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsValidHandleChild: Self = this.set("isValidHandleChild", js.undefined)
    @scala.inline
    def setLock(value: () => Unit): Self = this.set("lock", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLock: Self = this.set("lock", js.undefined)
    @scala.inline
    def setMaintainOffset(value: Boolean): Self = this.set("maintainOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintainOffset: Self = this.set("maintainOffset", js.undefined)
    @scala.inline
    def setMoveOnly(value: Boolean): Self = this.set("moveOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveOnly: Self = this.set("moveOnly", js.undefined)
    @scala.inline
    def setOnAvailable(value: () => Unit): Self = this.set("onAvailable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAvailable: Self = this.set("onAvailable", js.undefined)
    @scala.inline
    def setOnDrag(value: /* e */ js.UndefOr[Event] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragDrop(value: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit): Self = this.set("onDragDrop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDragDrop: Self = this.set("onDragDrop", js.undefined)
    @scala.inline
    def setOnDragEnter(value: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit): Self = this.set("onDragEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragOut(value: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit): Self = this.set("onDragOut", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDragOut: Self = this.set("onDragOut", js.undefined)
    @scala.inline
    def setOnDragOver(value: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit): Self = this.set("onDragOver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnInvalidDrop(value: /* e */ js.UndefOr[Event] => Unit): Self = this.set("onInvalidDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInvalidDrop: Self = this.set("onInvalidDrop", js.undefined)
    @scala.inline
    def setOnMouseDown(value: /* e */ js.UndefOr[Event] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseUp(value: /* e */ js.UndefOr[Event] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setPadding(value: Array): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPrimaryButtonOnly(value: Boolean): Self = this.set("primaryButtonOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryButtonOnly: Self = this.set("primaryButtonOnly", js.undefined)
    @scala.inline
    def setRemoveFromGroup(value: /* sGroup */ js.UndefOr[String] => Unit): Self = this.set("removeFromGroup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveFromGroup: Self = this.set("removeFromGroup", js.undefined)
    @scala.inline
    def setRemoveInvalidHandleClass(value: /* cssClass */ js.UndefOr[String] => Unit): Self = this.set("removeInvalidHandleClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveInvalidHandleClass: Self = this.set("removeInvalidHandleClass", js.undefined)
    @scala.inline
    def setRemoveInvalidHandleId(value: /* id */ js.UndefOr[String] => Unit): Self = this.set("removeInvalidHandleId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveInvalidHandleId: Self = this.set("removeInvalidHandleId", js.undefined)
    @scala.inline
    def setRemoveInvalidHandleType(value: /* tagName */ js.UndefOr[String] => Unit): Self = this.set("removeInvalidHandleType", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveInvalidHandleType: Self = this.set("removeInvalidHandleType", js.undefined)
    @scala.inline
    def setResetConstraints(value: /* maintainOffset */ js.UndefOr[Boolean] => Unit): Self = this.set("resetConstraints", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResetConstraints: Self = this.set("resetConstraints", js.undefined)
    @scala.inline
    def setSetDragElId(value: /* id */ js.UndefOr[String] => Unit): Self = this.set("setDragElId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDragElId: Self = this.set("setDragElId", js.undefined)
    @scala.inline
    def setSetHandleElId(value: /* id */ js.UndefOr[String] => Unit): Self = this.set("setHandleElId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHandleElId: Self = this.set("setHandleElId", js.undefined)
    @scala.inline
    def setSetInitPosition(value: (/* diffX */ js.UndefOr[Double], /* diffY */ js.UndefOr[Double]) => Unit): Self = this.set("setInitPosition", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetInitPosition: Self = this.set("setInitPosition", js.undefined)
    @scala.inline
    def setSetOuterHandleElId(value: /* id */ js.UndefOr[String] => Unit): Self = this.set("setOuterHandleElId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetOuterHandleElId: Self = this.set("setOuterHandleElId", js.undefined)
    @scala.inline
    def setSetPadding(
      value: (/* iTop */ js.UndefOr[Double], /* iRight */ js.UndefOr[Double], /* iBot */ js.UndefOr[Double], /* iLeft */ js.UndefOr[Double]) => Unit
    ): Self = this.set("setPadding", js.Any.fromFunction4(value))
    @scala.inline
    def deleteSetPadding: Self = this.set("setPadding", js.undefined)
    @scala.inline
    def setSetXConstraint(
      value: (/* iLeft */ js.UndefOr[Double], /* iRight */ js.UndefOr[Double], /* iTickSize */ js.UndefOr[Double]) => Unit
    ): Self = this.set("setXConstraint", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetXConstraint: Self = this.set("setXConstraint", js.undefined)
    @scala.inline
    def setSetYConstraint(
      value: (/* iUp */ js.UndefOr[Double], /* iDown */ js.UndefOr[Double], /* iTickSize */ js.UndefOr[Double]) => Unit
    ): Self = this.set("setYConstraint", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetYConstraint: Self = this.set("setYConstraint", js.undefined)
    @scala.inline
    def setStartDrag(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = this.set("startDrag", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStartDrag: Self = this.set("startDrag", js.undefined)
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
    @scala.inline
    def setUnlock(value: () => Unit): Self = this.set("unlock", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUnlock: Self = this.set("unlock", js.undefined)
    @scala.inline
    def setUnreg(value: () => Unit): Self = this.set("unreg", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUnreg: Self = this.set("unreg", js.undefined)
    @scala.inline
    def setXTicks(value: Array): Self = this.set("xTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXTicks: Self = this.set("xTicks", js.undefined)
    @scala.inline
    def setYTicks(value: Array): Self = this.set("yTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYTicks: Self = this.set("yTicks", js.undefined)
  }
  
}

