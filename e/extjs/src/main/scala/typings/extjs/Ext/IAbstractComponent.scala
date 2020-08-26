package typings.extjs.Ext

import typings.extjs.Ext.enums.IWidget
import typings.extjs.Ext.state.IStateful
import typings.extjs.Ext.util.IPositionable
import typings.extjs.Ext.util.IRegion
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IRenderable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined afterRender, doAutoRender, ensureAttachedToBody, getInsertPosition, initRenderData, onRender, render
- typings.extjs.Ext.util.IElementContainer because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined addChildEls, removeChildEls
- typings.extjs.Ext.util.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx
- typings.extjs.Ext.util.IPositionable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined alignTo, anchorTo, calculateConstrainedPosition, getAlignToXY, getAnchorXY, getBox, getConstrainVector, getLocalX, getLocalXY, getLocalY, getOffsetsTo, getRegion, getViewRegion, getX, getXY, getY, move, removeAnchor, setBox, setLocalX, setLocalXY, setLocalY, setRegion, setX, setXY, setY, translatePoints */ @js.native
trait IAbstractComponent extends IStateful {
  /** [Property] (Boolean) */
  var _isLayoutRoot: js.UndefOr[Boolean] = js.native
  /** [Method] Adds each argument passed to this method to the childEls array  */
  var addChildEls: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Adds a CSS class to the top level element representing this component
    * @param cls String/String[] The CSS class name to add.
    * @returns Ext.Component Returns the Component to allow method chaining.
    */
  var addClass: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Adds a CSS class to the top level element representing this component
    * @param cls String/String[] The CSS class name to add.
    * @returns Ext.Component Returns the Component to allow method chaining.
    */
  var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Adds a cls to the uiCls array which will also call addUIClsToElement and adds to all elements of this component
    * @param classes String/String[] A string or an array of strings to add to the uiCls.
    * @param skip Object (Boolean) skip true to skip adding it to the class and do it later (via the return).
    */
  var addClsWithUI: js.UndefOr[
    js.Function2[/* classes */ js.UndefOr[js.Any], /* skip */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Save a property to the given state object if it is not its default or configured value
    * @param state Object The state object.
    * @param propName String The name of the property on this object to save.
    * @param value String The value of the state property (defaults to this[propName]).
    * @returns Boolean The state object or a new object if state was null and the property was saved.
    */
  var addPropertyToState: js.UndefOr[
    js.Function3[
      /* state */ js.UndefOr[js.Any], 
      /* propName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[java.lang.String], 
      Boolean
    ]
  ] = js.native
  /** [Method] Method which adds a specified UI  uiCls to the components element
    * @param ui String The UI to remove from the element.
    */
  var addUIClsToElement: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Called by the layout system after the Component has been laid out
    * @param width Number The width that was set
    * @param height Number The height that was set
    * @param oldWidth Number/undefined The old width, or undefined if this was the initial layout.
    * @param oldHeight Number/undefined The old height, or undefined if this was the initial layout.
    */
  var afterComponentLayout: js.UndefOr[
    js.Function4[
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* oldWidth */ js.UndefOr[js.Any], 
      /* oldHeight */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Allows addition of behavior after rendering is complete  */
  var afterRender: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Template method called after a Component has been positioned
    * @param x Number
    * @param y Number
    */
  var afterSetPosition: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Aligns the element with another element relative to the specified anchor points
    * @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
    * @param position String The position to align to
    * @param offsets Number[] Offset the positioning by [x, y]
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  var alignTo: js.UndefOr[
    js.Function4[
      js.UndefOr[js.Any], 
      js.UndefOr[java.lang.String], 
      js.UndefOr[Array], 
      js.UndefOr[js.Any], 
      this.type | IPositionable
    ]
  ] = js.native
  /** [Method] Anchors an element to another element and realigns it when the window is resized
    * @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
    * @param position String The position to align to
    * @param offsets Number[] Offset the positioning by [x, y]
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @param monitorScroll Boolean/Number True to monitor body scroll and reposition. If this parameter is a number, it is used as the buffer delay in milliseconds.
    * @param callback Function The function to call after the animation finishes
    * @returns Ext.util.Positionable this
    */
  var anchorTo: js.UndefOr[
    js.Function6[
      js.UndefOr[js.Any], 
      js.UndefOr[java.lang.String], 
      js.UndefOr[Array], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      this.type | IPositionable
    ]
  ] = js.native
  /** [Method] Performs custom animation on this object. ... */
  var animate: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Object) */
  var autoEl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.ComponentLoader/Object/String/Boolean) */
  var autoLoad: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean/String/HTMLElement/Ext.Element) */
  var autoRender: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var autoShow: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var baseCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Template method to do any pre blur processing
    * @param e Ext.EventObject The event object
    */
  var beforeBlur: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Method] Occurs before componentLayout is run
    * @param adjWidth Number The box-adjusted width that was set.
    * @param adjHeight Number The box-adjusted height that was set.
    */
  var beforeComponentLayout: js.UndefOr[
    js.Function2[/* adjWidth */ js.UndefOr[Double], /* adjHeight */ js.UndefOr[Double], Unit]
  ] = js.native
  /** [Method] Invoked before the Component is destroyed  */
  var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Template method to do any pre focus processing
    * @param e Ext.EventObject The event object
    */
  var beforeFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Method] Occurs before componentLayout is run  */
  var beforeLayout: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number/String/Boolean) */
  var border: js.UndefOr[js.Any] = js.native
  /** [Method] Calculates the new x y position to move this Positionable into a constrain region
    * @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this Positionable was rendered, or this Component's {@link Ext.Component.constrainTo.
    * @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to coerce into constraints instead of using this Positionable's current position.
    * @param local Boolean The proposedPosition is local (relative to floatParent if a floating Component)
    * @param proposedSize Number[] A proposed [width, height] size to use when calculating constraints instead of using this Positionable's current size.
    * @returns Number[] If the element needs to be translated, the new [X, Y] position within constraints if possible, giving priority to keeping the top and left edge in the constrain region. Otherwise, false.
    */
  var calculateConstrainedPosition: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[Boolean], js.UndefOr[Array], Array]
  ] = js.native
  /** [Config Option] (Object[]) */
  var childEls: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var cls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var componentCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String/Object) */
  var componentLayout: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var contentEl: js.UndefOr[java.lang.String] = js.native
  /** [Property] (String) */
  var contentPaddingProperty: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.native
  /** [Method] Disable the component
    * @param silent Boolean Passing true will suppress the disable event from being fired.
    */
  var disable: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var disabledCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Handles autoRender  */
  var doAutoRender: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] This method needs to be called whenever you change something on this component that requires the Component s layout t
    * @returns Ext.container.Container this
    */
  var doComponentLayout: js.UndefOr[js.Function0[typings.extjs.Ext.container.IContainer]] = js.native
  /** [Config Option] (Boolean) */
  var draggable: js.UndefOr[Boolean] = js.native
  /** [Method] Enable the component
    * @param silent Boolean Passing true will suppress the enable event from being fired.
    */
  var enable: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Ensures that this component is attached to document body
    * @param runLayout Boolean True to run the component's layout.
    */
  var ensureAttachedToBody: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Retrieves plugin from this component s collection by its ptype
    * @param ptype String The Plugin's ptype as specified by the class's alias configuration.
    * @returns Ext.AbstractPlugin plugin instance.
    */
  var findPlugin: js.UndefOr[js.Function1[/* ptype */ js.UndefOr[java.lang.String], IAbstractPlugin]] = js.native
  /** [Config Option] (Boolean) */
  var floating: js.UndefOr[Boolean] = js.native
  /** [Method] Forces this component to redo its componentLayout  */
  var forceComponentLayout: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var frame: js.UndefOr[Boolean] = js.native
  /** [Property] (Object) */
  var frameSize: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the x y coordinates to align this element with another element
    * @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
    * @param position String The position to align to
    * @param offsets Number[] Offset the positioning by [x, y]
    * @returns Number[] [x, y]
    */
  var getAlignToXY: js.UndefOr[
    js.Function3[js.UndefOr[js.Any], js.UndefOr[java.lang.String], js.UndefOr[Array], Array]
  ] = js.native
  /** [Method] Gets the x y coordinates specified by the anchor position on the element
    * @param anchor String The specified anchor position. See alignTo for details on supported anchor positions.
    * @param local Boolean True to get the local (element top/left-relative) anchor position instead of page coordinates
    * @param size Object An object containing the size to use for calculating anchor position {width: (target width), height: (target height)} (defaults to the element's current size)
    * @returns Number[] [x, y] An array containing the element's x and y coordinates
    */
  var getAnchorXY: js.UndefOr[
    js.Function3[js.UndefOr[java.lang.String], js.UndefOr[Boolean], js.UndefOr[js.Any], Array]
  ] = js.native
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
    * @param contentBox Boolean If true a box for the content of the element is returned.
    * @param local Boolean If true the element's left and top relative to its offsetParent are returned instead of page x/y.
    * @returns Object box An object in the format: {  x: &lt;Element's X position&gt;,  y: &lt;Element's Y position&gt;,  left: &lt;Element's X position (an alias for x)&gt;,  top: &lt;Element's Y position (an alias for y)&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. The result may also be used for setXY
    */
  var getBox: js.UndefOr[js.Function2[js.UndefOr[Boolean], js.UndefOr[Boolean], _]] = js.native
  /** [Method] Provides the link for Observable s fireEvent method to bubble up the ownership hierarchy
    * @returns Ext.container.Container the Container which owns this Component.
    */
  var getBubbleTarget: js.UndefOr[js.Function0[typings.extjs.Ext.container.IContainer]] = js.native
  /** [Method] Returns the X Y vector by which this Positionable s element must be translated to make a best attempt to constrain
    * @param constrainTo Ext.util.Positionable/HTMLElement/String/Ext.util.Region The Positionable, HTMLElement, element id, or Region into which the element is to be constrained.
    * @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to produce a vector for instead of using the element's current position
    * @param proposedSize Number[] A proposed [width, height] size to constrain instead of using the element's current size
    * @returns Number[]/Boolean If the element needs to be translated, an [X, Y] vector by which this element must be translated. Otherwise, false.
    */
  var getConstrainVector: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[Array], _]] = js.native
  /** [Method] Retrieves the top level element representing this component
    * @returns Ext.dom.Element
    */
  var getEl: js.UndefOr[js.Function0[typings.extjs.Ext.dom.IElement]] = js.native
  /** [Method] Gets the current height of the component s underlying element
    * @returns Number
    */
  var getHeight: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Retrieves the id of this component
    * @returns String
    */
  var getId: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] This function takes the position argument passed to onRender and returns a DOM element that you can use in the insert
    * @param position String/Number/Ext.dom.Element/HTMLElement Index, element id or element you want to put this component before.
    * @returns HTMLElement DOM element that you can use in the insertBefore
    */
  var getInsertPosition: js.UndefOr[js.Function1[js.UndefOr[js.Any], HTMLElement]] = js.native
  /** [Method] Returns the value of itemId assigned to this component or when that is not set returns the value of id
    * @returns String
    */
  var getItemId: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Gets the Ext ComponentLoader for this Component
    * @returns Ext.ComponentLoader The loader instance, null if it doesn't exist.
    */
  var getLoader: js.UndefOr[js.Function0[IComponentLoader]] = js.native
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @returns Number The local x coordinate
    */
  var getLocalX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @returns Number[] The local XY position of the element
    */
  var getLocalXY: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the y coordinate of this element reletive to its offsetParent
    * @returns Number The local y coordinate
    */
  var getLocalY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the offsets of this element from the passed element
    * @param offsetsTo Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or element id to get get the offsets from.
    * @returns Number[] The XY page offsets (e.g. [100, -200])
    */
  var getOffsetsTo: js.UndefOr[js.Function1[js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Retrieves a plugin from this component s collection by its pluginId
    * @param pluginId String
    * @returns Ext.AbstractPlugin plugin instance.
    */
  var getPlugin: js.UndefOr[js.Function1[/* pluginId */ js.UndefOr[java.lang.String], IAbstractPlugin]] = js.native
  /** [Method] Returns a region object that defines the area of this element
    * @returns Ext.util.Region A Region containing "top, left, bottom, right" properties.
    */
  var getRegion: js.UndefOr[js.Function0[IRegion]] = js.native
  /** [Method] Gets the current size of the component s underlying element
    * @returns Object An object containing the element's size {width: (element width), height: (element height)}
    */
  var getSize: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns an object that describes how this component s width and height are managed
    * @param ownerCtSizeModel Object
    * @returns Object The size model for this component.
    */
  var getSizeModel: js.UndefOr[js.Function1[/* ownerCtSizeModel */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the content region of this element
    * @returns Ext.util.Region A Region containing "top, left, bottom, right" member data.
    */
  var getViewRegion: js.UndefOr[js.Function0[IRegion]] = js.native
  /** [Method] Gets the current width of the component s underlying element
    * @returns Number
    */
  var getWidth: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Gets the current X position of the DOM element based on page coordinates
    * @returns Number The X position of the element
    */
  var getX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns this Component s xtype hierarchy as a slash delimited string
    * @returns String The xtype hierarchy string
    */
  var getXTypes: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Gets the current position of the DOM element based on page coordinates
    * @returns Number[] The XY position of the element
    */
  var getXY: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Gets the current Y position of the DOM element based on page coordinates
    * @returns Number The Y position of the element
    */
  var getY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
    * @param className String The CSS class to check for.
    * @returns Boolean true if the class exists, else false.
    */
  var hasCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[java.lang.String], Boolean]] = js.native
  /** [Method] Checks if there is currently a specified uiCls
    * @param cls String The cls to check.
    */
  var hasUICls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var hideMode: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String/Object) */
  var html: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.native
  /** [Method] Initialize any events on this component */
  var initEvents: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
    * @returns Object Object with keys and values that are going to be applied to the renderTpl
    */
  var initRenderData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Tests whether this Component matches the selector string
    * @param selector String The selector string to test against.
    * @returns Boolean true if this Component matches the selector.
    */
  var is: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Boolean]] = js.native
  /** [Property] (Boolean) */
  var isComponent: js.UndefOr[Boolean] = js.native
  /** [Method] Determines whether this component is the descendant of a particular container
    * @param container Ext.Container
    * @returns Boolean true if the component is the descendant of a particular container, otherwise false.
    */
  var isDescendantOf: js.UndefOr[js.Function1[/* container */ js.UndefOr[IContainer], Boolean]] = js.native
  /** [Method] Method to determine whether this Component is currently disabled
    * @returns Boolean the disabled state of this Component.
    */
  var isDisabled: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Method to determine whether this Component is draggable
    * @returns Boolean the draggable state of this component.
    */
  var isDraggable: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Method to determine whether this Component is droppable
    * @returns Boolean the droppable state of this component.
    */
  var isDroppable: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Method to determine whether this Component is floating
    * @returns Boolean the floating state of this component.
    */
  var isFloating: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Method to determine whether this Component is currently set to hidden
    * @returns Boolean the hidden state of this Component.
    */
  var isHidden: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Determines whether this Component is the root of a layout  */
  var isLayoutRoot: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns true if layout is suspended for this component
    * @returns Boolean true layout of this component is suspended.
    */
  var isLayoutSuspended: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this component is visible
    * @param deep Boolean Pass true to interrogate the visibility status of all parent Containers to determine whether this Component is truly visible to the user. Generally, to determine whether a Component is hidden, the no argument form is needed. For example when creating dynamically laid out UIs in a hidden Container before showing them.
    * @returns Boolean true if this component is visible, false otherwise.
    */
  var isVisible: js.UndefOr[js.Function1[/* deep */ js.UndefOr[Boolean], Boolean]] = js.native
  /** [Method] Tests whether or not this Component is of a specific xtype
    * @param xtype String The xtype to check for this Component
    * @param shallow Boolean true to check whether this Component is directly of the specified xtype, false to check whether this Component is descended from the xtype.
    * @returns Boolean true if this component descends from the specified xtype, false otherwise.
    */
  var isXType: js.UndefOr[
    js.Function2[/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean], Boolean]
  ] = js.native
  /** [Config Option] (String) */
  var itemId: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Ext.ComponentLoader/Object) */
  var loader: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/String) */
  var margin: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var maskOnDisable: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var maxHeight: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minHeight: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minWidth: js.UndefOr[Double] = js.native
  /** [Method] Move the element relative to its current position
    * @param direction String Possible values are:  "l" (or "left") "r" (or "right") "t" (or "top", or "up") "b" (or "bottom", or "down")
    * @param distance Number How far to move the element in pixels
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    */
  var move: js.UndefOr[
    js.Function3[js.UndefOr[java.lang.String], js.UndefOr[Double], js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Returns the next node in the Component tree in tree traversal order
    * @param selector String A ComponentQuery selector to filter the following nodes.
    * @returns Ext.Component The next node (or the next node which matches the selector). Returns null if there is no matching node.
    */
  var nextNode: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.native
  /** [Method] Returns the next sibling of this Component
    * @param selector String A ComponentQuery selector to filter the following items.
    * @returns Ext.Component The next sibling (or the next sibling which matches the selector). Returns null if there is no matching sibling.
    */
  var nextSibling: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.native
  /** [Method] Method to manage awareness of when components are added to their respective Container firing an added event
    * @param container Ext.container.Container Container which holds the component.
    * @param pos Number Position at which the component was added.
    */
  var onAdded: js.UndefOr[
    js.Function2[
      /* container */ js.UndefOr[typings.extjs.Ext.container.IContainer], 
      /* pos */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Allows addition of behavior to the disable operation  */
  var onDisable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Allows addition of behavior to the enable operation  */
  var onEnable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Called after the component is moved this method is empty by default but can be implemented by any subclass that need
    * @param x Number The new x position.
    * @param y Number The new y position.
    */
  var onPosition: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event
    * @param destroying Boolean Will be passed as true if the Container performing the remove operation will delete this Component upon remove.
    */
  var onRemoved: js.UndefOr[js.Function1[/* destroying */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Template method called when this Component s DOM structure is created
    * @param parentNode Ext.core.Element The parent Element in which this Component's encapsulating element is contained.
    * @param containerIdx Number The index within the parent Container's child collection of this Component.
    */
  var onRender: js.UndefOr[
    js.Function2[js.UndefOr[typings.extjs.Ext.core.IElement], js.UndefOr[Double], Unit]
  ] = js.native
  /** [Method] Allows addition of behavior to the resize operation
    * @param width Object
    * @param height Object
    * @param oldWidth Object
    * @param oldHeight Object
    */
  var onResize: js.UndefOr[
    js.Function4[
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* oldWidth */ js.UndefOr[js.Any], 
      /* oldHeight */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String) */
  var overCls: js.UndefOr[java.lang.String] = js.native
  /** [Property] (Ext.Container) */
  var ownerCt: js.UndefOr[IContainer] = js.native
  /** [Config Option] (Number/String) */
  var padding: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.AbstractPlugin[]/Ext.AbstractPlugin/Object[]/Object/Ext.enums.Plugin[]/Ext.enums.Plugin) */
  var plugins: js.UndefOr[js.Any] = js.native
  /** [Method] Template method to do any post blur processing
    * @param e Ext.EventObject The event object
    */
  var postBlur: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Method] Returns the previous node in the Component tree in tree traversal order
    * @param selector String A ComponentQuery selector to filter the preceding nodes.
    * @returns Ext.Component The previous node (or the previous node which matches the selector). Returns null if there is no matching node.
    */
  var previousNode: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.native
  /** [Method] Returns the previous sibling of this Component
    * @param selector String A ComponentQuery selector to filter the preceding items.
    * @returns Ext.Component The previous sibling (or the previous sibling which matches the selector). Returns null if there is no matching sibling.
    */
  var previousSibling: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.native
  /** [Method] Called by Component doAutoRender Register a Container configured floating true with this Component s ZIndexManager
    * @param cmp Object
    */
  var registerFloatingItem: js.UndefOr[js.Function1[/* cmp */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Remove any anchor to this element
    * @returns Ext.util.Positionable this
    */
  var removeAnchor: js.UndefOr[js.Function0[this.type | IPositionable]] = js.native
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
    * @param testFn Function The test function.
    */
  var removeChildEls: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Removes a CSS class from the top level element representing this component
    * @param cls String/String[] The CSS class name to remove.
    * @returns Ext.Component Returns the Component to allow method chaining.
    */
  var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Removes a cls to the uiCls array which will also call removeUIClsFromElement and removes it from all elements of thi
    * @param cls String/String[] A string or an array of strings to remove to the uiCls.
    */
  var removeClsWithUI: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Method which removes a specified UI  uiCls from the components element
    * @param ui String The UI to add to the element.
    */
  var removeUIClsFromElement: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Renders the Component into the passed HTML element
    * @param container Ext.Element/HTMLElement/String The element this Component should be rendered into. If it is being created from existing markup, this should be omitted.
    * @param position String/Number The element ID or DOM node index within the container before which this component will be inserted (defaults to appending to the end of the container)
    */
  var render: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var renderData: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var renderSelectors: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var renderTo: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.XTemplate/String/String[]) */
  var renderTpl: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var rendered: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var rtl: js.UndefOr[Boolean] = js.native
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
    * @returns Object this
    */
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Method]
    * @param border String/Number The border, see border. If a falsey value is passed the border will be removed.
    */
  var setBorder: js.UndefOr[js.Function1[/* border */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the element s box
    * @param box Object The box to fill {x, y, width, height}
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  var setBox: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], this.type | IPositionable]] = js.native
  /** [Method] Enable or disable the component
    * @param disabled Boolean true to disable.
    */
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the dock position of this component in its parent panel
    * @param dock Object The dock position.
    * @param layoutParent Boolean true to re-layout parent.
    * @returns Ext.Component this
    */
  var setDocked: js.UndefOr[
    js.Function2[/* dock */ js.UndefOr[js.Any], /* layoutParent */ js.UndefOr[Boolean], IComponent]
  ] = js.native
  /** [Method] Sets the height of the component
    * @param height Number The new height to set. This may be one of:  A Number specifying the new height in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS height style. undefined to leave the height unchanged.
    * @returns Ext.Component this
    */
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[Double], IComponent]] = js.native
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @param x Object
    * @returns Ext.util.Positionable this
    */
  var setLocalX: js.UndefOr[js.Function1[js.UndefOr[js.Any | Double], this.type | IPositionable]] = js.native
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @param x Object
    * @param y Object
    * @returns Ext.util.Positionable this
    */
  var setLocalXY: js.UndefOr[
    js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any | Double], this.type | IPositionable]
  ] = js.native
  /** [Method] Sets the local y coordinate of this element using CSS style
    * @param y Object
    * @returns Ext.util.Positionable this
    */
  var setLocalY: js.UndefOr[js.Function1[js.UndefOr[js.Any | Double], this.type | IPositionable]] = js.native
  /** [Method] Sets the margin on the target element
    * @param margin Number/String The margin to set. See the margin config.
    */
  var setMargin: js.UndefOr[js.Function1[/* margin */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the element s position and size to the specified region
    * @param region Ext.util.Region The region to fill
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  var setRegion: js.UndefOr[js.Function2[js.UndefOr[IRegion], js.UndefOr[js.Any], this.type | IPositionable]] = js.native
  /** [Method] Sets the width and height of this Component
    * @param width Number/String/Object The new width to set. This may be one of:  A Number specifying the new width in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS width style. A size object in the format {width: widthValue, height: heightValue}. undefined to leave the width unchanged.
    * @param height Number/String The new height to set (not required if a size object is passed as the first arg). This may be one of:  A Number specifying the new height in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used. undefined to leave the height unchanged.
    * @returns Ext.Component this
    */
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], IComponent]
  ] = js.native
  /** [Method] Sets the UI for the component
    * @param ui String The new UI for the component.
    */
  var setUI: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Convenience function to hide or show this component by Boolean
    * @param visible Boolean true to show, false to hide.
    * @returns Ext.Component this
    */
  var setVisible: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], IComponent]] = js.native
  /** [Method] Sets the width of the component
    * @param width Number The new width to setThis may be one of:  A Number specifying the new width in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS width style.
    * @returns Ext.Component this
    */
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], IComponent]] = js.native
  /** [Method] Sets the X position of the DOM element based on page coordinates
    * @param x Object
    * @param animate Object
    * @returns Ext.util.Positionable this
    */
  var setX: js.UndefOr[
    js.Function2[js.UndefOr[js.Any | Double], js.UndefOr[js.Any], this.type | IPositionable]
  ] = js.native
  /** [Method] Sets the position of the DOM element in page coordinates
    * @param xy Object
    * @param animate Object
    * @returns Ext.util.Positionable this
    */
  var setXY: js.UndefOr[
    js.Function2[js.UndefOr[js.Any | Array], js.UndefOr[js.Any], this.type | IPositionable]
  ] = js.native
  /** [Method] Sets the Y position of the DOM element based on page coordinates
    * @param y Object
    * @param animate Object
    * @returns Ext.util.Positionable this
    */
  var setY: js.UndefOr[
    js.Function2[js.UndefOr[js.Any | Double], js.UndefOr[js.Any], this.type | IPositionable]
  ] = js.native
  /** [Config Option] (Boolean/Number) */
  var shrinkWrap: js.UndefOr[js.Any] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Config Option] (String/Object) */
  var style: js.UndefOr[js.Any] = js.native
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
    * @returns Object this
    */
  var syncFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Ext.XTemplate/Ext.Template/String/String[]) */
  var tpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var tplWriteMode: js.UndefOr[java.lang.String] = js.native
  /** [Method] Translates the passed page coordinates into left top css values for the element
    * @param x Number/Array The page x or an array containing [x, y]
    * @param y Number The page y, required if x is not an array
    * @returns Object An object with left and top properties. e.g. {left: (value), top: (value)}
    */
  var translatePoints: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Double], _]] = js.native
  /** [Config Option] (String) */
  var ui: js.UndefOr[java.lang.String] = js.native
  /** [Method] Navigates up the ownership hierarchy searching for an ancestor Container which matches any passed simple selector or
    * @param selector String/Ext.Component The simple selector component or actual component to test. If not passed the immediate owner/activater is returned.
    * @param limit String/Number/Ext.Component This may be a selector upon which to stop the upward scan, or a limit of teh number of steps, or Component reference to stop on.
    * @returns Ext.container.Container The matching ancestor Container (or undefined if no match was found).
    */
  var up: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[js.Any], 
      /* limit */ js.UndefOr[js.Any], 
      typings.extjs.Ext.container.IContainer
    ]
  ] = js.native
  /** [Method] Update the content area of a component
    * @param htmlOrData String/Object If this component has been configured with a template via the tpl config then it will use this argument as data to populate the template. If this component was not configured with a template, the components content area will be updated via Ext.Element update.
    * @param loadScripts Boolean Only legitimate when using the html configuration.
    * @param callback Function Only legitimate when using the html configuration. Callback to execute when scripts have finished loading.
    */
  var update: js.UndefOr[
    js.Function3[
      /* htmlOrData */ js.UndefOr[js.Any], 
      /* loadScripts */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Updates this component s layout
    * @param options Object An object with layout options.
    */
  var updateLayout: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.native
  /** [Config Option] (Ext.enums.Widget) */
  var xtype: js.UndefOr[IWidget] = js.native
}

object IAbstractComponent {
  @scala.inline
  def apply(): IAbstractComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractComponent]
  }
  @scala.inline
  implicit class IAbstractComponentOps[Self <: IAbstractComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_isLayoutRoot(value: Boolean): Self = this.set("_isLayoutRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_isLayoutRoot: Self = this.set("_isLayoutRoot", js.undefined)
    @scala.inline
    def setAddChildEls(value: () => Unit): Self = this.set("addChildEls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAddChildEls: Self = this.set("addChildEls", js.undefined)
    @scala.inline
    def setAddClass(value: /* cls */ js.UndefOr[js.Any] => IComponent): Self = this.set("addClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    @scala.inline
    def setAddCls(value: /* cls */ js.UndefOr[js.Any] => IComponent): Self = this.set("addCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddCls: Self = this.set("addCls", js.undefined)
    @scala.inline
    def setAddClsWithUI(value: (/* classes */ js.UndefOr[js.Any], /* skip */ js.UndefOr[js.Any]) => Unit): Self = this.set("addClsWithUI", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddClsWithUI: Self = this.set("addClsWithUI", js.undefined)
    @scala.inline
    def setAddPropertyToState(
      value: (/* state */ js.UndefOr[js.Any], /* propName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[java.lang.String]) => Boolean
    ): Self = this.set("addPropertyToState", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAddPropertyToState: Self = this.set("addPropertyToState", js.undefined)
    @scala.inline
    def setAddUIClsToElement(value: /* ui */ js.UndefOr[java.lang.String] => Unit): Self = this.set("addUIClsToElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddUIClsToElement: Self = this.set("addUIClsToElement", js.undefined)
    @scala.inline
    def setAfterComponentLayout(
      value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* oldWidth */ js.UndefOr[js.Any], /* oldHeight */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("afterComponentLayout", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterComponentLayout: Self = this.set("afterComponentLayout", js.undefined)
    @scala.inline
    def setAfterRender(value: () => Unit): Self = this.set("afterRender", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterRender: Self = this.set("afterRender", js.undefined)
    @scala.inline
    def setAfterSetPosition(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = this.set("afterSetPosition", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterSetPosition: Self = this.set("afterSetPosition", js.undefined)
    @scala.inline
    def setAlignTo(
      value: (js.UndefOr[js.Any], js.UndefOr[java.lang.String], js.UndefOr[Array], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable
    ): Self = this.set("alignTo", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAlignTo: Self = this.set("alignTo", js.undefined)
    @scala.inline
    def setAnchorTo(
      value: (js.UndefOr[js.Any], js.UndefOr[java.lang.String], js.UndefOr[Array], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable
    ): Self = this.set("anchorTo", js.Any.fromFunction6(value))
    @scala.inline
    def deleteAnchorTo: Self = this.set("anchorTo", js.undefined)
    @scala.inline
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAutoEl(value: js.Any): Self = this.set("autoEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoEl: Self = this.set("autoEl", js.undefined)
    @scala.inline
    def setAutoLoad(value: js.Any): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    @scala.inline
    def setAutoRender(value: js.Any): Self = this.set("autoRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRender: Self = this.set("autoRender", js.undefined)
    @scala.inline
    def setAutoShow(value: Boolean): Self = this.set("autoShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoShow: Self = this.set("autoShow", js.undefined)
    @scala.inline
    def setBaseCls(value: java.lang.String): Self = this.set("baseCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseCls: Self = this.set("baseCls", js.undefined)
    @scala.inline
    def setBeforeBlur(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = this.set("beforeBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeBlur: Self = this.set("beforeBlur", js.undefined)
    @scala.inline
    def setBeforeComponentLayout(value: (/* adjWidth */ js.UndefOr[Double], /* adjHeight */ js.UndefOr[Double]) => Unit): Self = this.set("beforeComponentLayout", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeComponentLayout: Self = this.set("beforeComponentLayout", js.undefined)
    @scala.inline
    def setBeforeDestroy(value: () => Unit): Self = this.set("beforeDestroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeDestroy: Self = this.set("beforeDestroy", js.undefined)
    @scala.inline
    def setBeforeFocus(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = this.set("beforeFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeFocus: Self = this.set("beforeFocus", js.undefined)
    @scala.inline
    def setBeforeLayout(value: () => Unit): Self = this.set("beforeLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeLayout: Self = this.set("beforeLayout", js.undefined)
    @scala.inline
    def setBorder(value: js.Any): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setCalculateConstrainedPosition(value: (js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[Boolean], js.UndefOr[Array]) => Array): Self = this.set("calculateConstrainedPosition", js.Any.fromFunction4(value))
    @scala.inline
    def deleteCalculateConstrainedPosition: Self = this.set("calculateConstrainedPosition", js.undefined)
    @scala.inline
    def setChildEls(value: Array): Self = this.set("childEls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildEls: Self = this.set("childEls", js.undefined)
    @scala.inline
    def setCls(value: java.lang.String): Self = this.set("cls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCls: Self = this.set("cls", js.undefined)
    @scala.inline
    def setComponentCls(value: java.lang.String): Self = this.set("componentCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentCls: Self = this.set("componentCls", js.undefined)
    @scala.inline
    def setComponentLayout(value: js.Any): Self = this.set("componentLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentLayout: Self = this.set("componentLayout", js.undefined)
    @scala.inline
    def setContentEl(value: java.lang.String): Self = this.set("contentEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEl: Self = this.set("contentEl", js.undefined)
    @scala.inline
    def setContentPaddingProperty(value: java.lang.String): Self = this.set("contentPaddingProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentPaddingProperty: Self = this.set("contentPaddingProperty", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDisable(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = this.set("disable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledCls(value: java.lang.String): Self = this.set("disabledCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledCls: Self = this.set("disabledCls", js.undefined)
    @scala.inline
    def setDoAutoRender(value: () => Unit): Self = this.set("doAutoRender", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDoAutoRender: Self = this.set("doAutoRender", js.undefined)
    @scala.inline
    def setDoComponentLayout(value: () => typings.extjs.Ext.container.IContainer): Self = this.set("doComponentLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDoComponentLayout: Self = this.set("doComponentLayout", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEnable(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = this.set("enable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setEnsureAttachedToBody(value: js.UndefOr[Boolean] => Unit): Self = this.set("ensureAttachedToBody", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnsureAttachedToBody: Self = this.set("ensureAttachedToBody", js.undefined)
    @scala.inline
    def setFindPlugin(value: /* ptype */ js.UndefOr[java.lang.String] => IAbstractPlugin): Self = this.set("findPlugin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFindPlugin: Self = this.set("findPlugin", js.undefined)
    @scala.inline
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
    @scala.inline
    def setForceComponentLayout(value: () => Unit): Self = this.set("forceComponentLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteForceComponentLayout: Self = this.set("forceComponentLayout", js.undefined)
    @scala.inline
    def setFrame(value: Boolean): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setFrameSize(value: js.Any): Self = this.set("frameSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameSize: Self = this.set("frameSize", js.undefined)
    @scala.inline
    def setGetActiveAnimation(value: () => _): Self = this.set("getActiveAnimation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetActiveAnimation: Self = this.set("getActiveAnimation", js.undefined)
    @scala.inline
    def setGetAlignToXY(value: (js.UndefOr[js.Any], js.UndefOr[java.lang.String], js.UndefOr[Array]) => Array): Self = this.set("getAlignToXY", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetAlignToXY: Self = this.set("getAlignToXY", js.undefined)
    @scala.inline
    def setGetAnchorXY(value: (js.UndefOr[java.lang.String], js.UndefOr[Boolean], js.UndefOr[js.Any]) => Array): Self = this.set("getAnchorXY", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetAnchorXY: Self = this.set("getAnchorXY", js.undefined)
    @scala.inline
    def setGetBox(value: (js.UndefOr[Boolean], js.UndefOr[Boolean]) => _): Self = this.set("getBox", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetBox: Self = this.set("getBox", js.undefined)
    @scala.inline
    def setGetBubbleTarget(value: () => typings.extjs.Ext.container.IContainer): Self = this.set("getBubbleTarget", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBubbleTarget: Self = this.set("getBubbleTarget", js.undefined)
    @scala.inline
    def setGetConstrainVector(value: (js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[Array]) => _): Self = this.set("getConstrainVector", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetConstrainVector: Self = this.set("getConstrainVector", js.undefined)
    @scala.inline
    def setGetEl(value: () => typings.extjs.Ext.dom.IElement): Self = this.set("getEl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetEl: Self = this.set("getEl", js.undefined)
    @scala.inline
    def setGetHeight(value: () => Double): Self = this.set("getHeight", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHeight: Self = this.set("getHeight", js.undefined)
    @scala.inline
    def setGetId(value: () => java.lang.String): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetId: Self = this.set("getId", js.undefined)
    @scala.inline
    def setGetInsertPosition(value: js.UndefOr[js.Any] => HTMLElement): Self = this.set("getInsertPosition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetInsertPosition: Self = this.set("getInsertPosition", js.undefined)
    @scala.inline
    def setGetItemId(value: () => java.lang.String): Self = this.set("getItemId", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetItemId: Self = this.set("getItemId", js.undefined)
    @scala.inline
    def setGetLoader(value: () => IComponentLoader): Self = this.set("getLoader", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLoader: Self = this.set("getLoader", js.undefined)
    @scala.inline
    def setGetLocalX(value: () => Double): Self = this.set("getLocalX", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLocalX: Self = this.set("getLocalX", js.undefined)
    @scala.inline
    def setGetLocalXY(value: () => Array): Self = this.set("getLocalXY", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLocalXY: Self = this.set("getLocalXY", js.undefined)
    @scala.inline
    def setGetLocalY(value: () => Double): Self = this.set("getLocalY", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLocalY: Self = this.set("getLocalY", js.undefined)
    @scala.inline
    def setGetOffsetsTo(value: js.UndefOr[js.Any] => Array): Self = this.set("getOffsetsTo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetOffsetsTo: Self = this.set("getOffsetsTo", js.undefined)
    @scala.inline
    def setGetPlugin(value: /* pluginId */ js.UndefOr[java.lang.String] => IAbstractPlugin): Self = this.set("getPlugin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPlugin: Self = this.set("getPlugin", js.undefined)
    @scala.inline
    def setGetRegion(value: () => IRegion): Self = this.set("getRegion", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRegion: Self = this.set("getRegion", js.undefined)
    @scala.inline
    def setGetSize(value: () => _): Self = this.set("getSize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSize: Self = this.set("getSize", js.undefined)
    @scala.inline
    def setGetSizeModel(value: /* ownerCtSizeModel */ js.UndefOr[js.Any] => _): Self = this.set("getSizeModel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetSizeModel: Self = this.set("getSizeModel", js.undefined)
    @scala.inline
    def setGetViewRegion(value: () => IRegion): Self = this.set("getViewRegion", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetViewRegion: Self = this.set("getViewRegion", js.undefined)
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetWidth: Self = this.set("getWidth", js.undefined)
    @scala.inline
    def setGetX(value: () => Double): Self = this.set("getX", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetX: Self = this.set("getX", js.undefined)
    @scala.inline
    def setGetXTypes(value: () => java.lang.String): Self = this.set("getXTypes", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetXTypes: Self = this.set("getXTypes", js.undefined)
    @scala.inline
    def setGetXY(value: () => Array): Self = this.set("getXY", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetXY: Self = this.set("getXY", js.undefined)
    @scala.inline
    def setGetY(value: () => Double): Self = this.set("getY", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetY: Self = this.set("getY", js.undefined)
    @scala.inline
    def setHasActiveFx(value: () => _): Self = this.set("hasActiveFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasActiveFx: Self = this.set("hasActiveFx", js.undefined)
    @scala.inline
    def setHasCls(value: /* className */ js.UndefOr[java.lang.String] => Boolean): Self = this.set("hasCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasCls: Self = this.set("hasCls", js.undefined)
    @scala.inline
    def setHasUICls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("hasUICls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasUICls: Self = this.set("hasUICls", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHideMode(value: java.lang.String): Self = this.set("hideMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideMode: Self = this.set("hideMode", js.undefined)
    @scala.inline
    def setHtml(value: js.Any): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInitEvents(value: () => Unit): Self = this.set("initEvents", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitEvents: Self = this.set("initEvents", js.undefined)
    @scala.inline
    def setInitRenderData(value: () => _): Self = this.set("initRenderData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitRenderData: Self = this.set("initRenderData", js.undefined)
    @scala.inline
    def setIs(value: /* selector */ js.UndefOr[java.lang.String] => Boolean): Self = this.set("is", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    @scala.inline
    def setIsComponent(value: Boolean): Self = this.set("isComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsComponent: Self = this.set("isComponent", js.undefined)
    @scala.inline
    def setIsDescendantOf(value: /* container */ js.UndefOr[IContainer] => Boolean): Self = this.set("isDescendantOf", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsDescendantOf: Self = this.set("isDescendantOf", js.undefined)
    @scala.inline
    def setIsDisabled(value: () => Boolean): Self = this.set("isDisabled", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    @scala.inline
    def setIsDraggable(value: () => Boolean): Self = this.set("isDraggable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsDraggable: Self = this.set("isDraggable", js.undefined)
    @scala.inline
    def setIsDroppable(value: () => Boolean): Self = this.set("isDroppable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsDroppable: Self = this.set("isDroppable", js.undefined)
    @scala.inline
    def setIsFloating(value: () => Boolean): Self = this.set("isFloating", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsFloating: Self = this.set("isFloating", js.undefined)
    @scala.inline
    def setIsHidden(value: () => Boolean): Self = this.set("isHidden", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsHidden: Self = this.set("isHidden", js.undefined)
    @scala.inline
    def setIsLayoutRoot(value: () => Unit): Self = this.set("isLayoutRoot", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsLayoutRoot: Self = this.set("isLayoutRoot", js.undefined)
    @scala.inline
    def setIsLayoutSuspended(value: () => Boolean): Self = this.set("isLayoutSuspended", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsLayoutSuspended: Self = this.set("isLayoutSuspended", js.undefined)
    @scala.inline
    def setIsVisible(value: /* deep */ js.UndefOr[Boolean] => Boolean): Self = this.set("isVisible", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    @scala.inline
    def setIsXType(value: (/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean]) => Boolean): Self = this.set("isXType", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIsXType: Self = this.set("isXType", js.undefined)
    @scala.inline
    def setItemId(value: java.lang.String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    @scala.inline
    def setLoader(value: js.Any): Self = this.set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMaskOnDisable(value: Boolean): Self = this.set("maskOnDisable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskOnDisable: Self = this.set("maskOnDisable", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMove(value: (js.UndefOr[java.lang.String], js.UndefOr[Double], js.UndefOr[js.Any]) => Unit): Self = this.set("move", js.Any.fromFunction3(value))
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setNextNode(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = this.set("nextNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNextNode: Self = this.set("nextNode", js.undefined)
    @scala.inline
    def setNextSibling(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = this.set("nextSibling", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNextSibling: Self = this.set("nextSibling", js.undefined)
    @scala.inline
    def setOnAdded(
      value: (/* container */ js.UndefOr[typings.extjs.Ext.container.IContainer], /* pos */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onAdded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAdded: Self = this.set("onAdded", js.undefined)
    @scala.inline
    def setOnDisable(value: () => Unit): Self = this.set("onDisable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDisable: Self = this.set("onDisable", js.undefined)
    @scala.inline
    def setOnEnable(value: () => Unit): Self = this.set("onEnable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEnable: Self = this.set("onEnable", js.undefined)
    @scala.inline
    def setOnPosition(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = this.set("onPosition", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPosition: Self = this.set("onPosition", js.undefined)
    @scala.inline
    def setOnRemoved(value: /* destroying */ js.UndefOr[Boolean] => Unit): Self = this.set("onRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemoved: Self = this.set("onRemoved", js.undefined)
    @scala.inline
    def setOnRender(value: (js.UndefOr[typings.extjs.Ext.core.IElement], js.UndefOr[Double]) => Unit): Self = this.set("onRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    @scala.inline
    def setOnResize(
      value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* oldWidth */ js.UndefOr[js.Any], /* oldHeight */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onResize", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setOverCls(value: java.lang.String): Self = this.set("overCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverCls: Self = this.set("overCls", js.undefined)
    @scala.inline
    def setOwnerCt(value: IContainer): Self = this.set("ownerCt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerCt: Self = this.set("ownerCt", js.undefined)
    @scala.inline
    def setPadding(value: js.Any): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPlugins(value: js.Any): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setPostBlur(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = this.set("postBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deletePostBlur: Self = this.set("postBlur", js.undefined)
    @scala.inline
    def setPreviousNode(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = this.set("previousNode", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreviousNode: Self = this.set("previousNode", js.undefined)
    @scala.inline
    def setPreviousSibling(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = this.set("previousSibling", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreviousSibling: Self = this.set("previousSibling", js.undefined)
    @scala.inline
    def setRegisterFloatingItem(value: /* cmp */ js.UndefOr[js.Any] => Unit): Self = this.set("registerFloatingItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRegisterFloatingItem: Self = this.set("registerFloatingItem", js.undefined)
    @scala.inline
    def setRemoveAnchor(value: () => IAbstractComponent | IPositionable): Self = this.set("removeAnchor", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRemoveAnchor: Self = this.set("removeAnchor", js.undefined)
    @scala.inline
    def setRemoveChildEls(value: js.UndefOr[js.Any] => Unit): Self = this.set("removeChildEls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveChildEls: Self = this.set("removeChildEls", js.undefined)
    @scala.inline
    def setRemoveCls(value: /* cls */ js.UndefOr[js.Any] => IComponent): Self = this.set("removeCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveCls: Self = this.set("removeCls", js.undefined)
    @scala.inline
    def setRemoveClsWithUI(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = this.set("removeClsWithUI", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveClsWithUI: Self = this.set("removeClsWithUI", js.undefined)
    @scala.inline
    def setRemoveUIClsFromElement(value: /* ui */ js.UndefOr[java.lang.String] => Unit): Self = this.set("removeUIClsFromElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveUIClsFromElement: Self = this.set("removeUIClsFromElement", js.undefined)
    @scala.inline
    def setRender(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = this.set("render", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setRenderData(value: js.Any): Self = this.set("renderData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderData: Self = this.set("renderData", js.undefined)
    @scala.inline
    def setRenderSelectors(value: js.Any): Self = this.set("renderSelectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderSelectors: Self = this.set("renderSelectors", js.undefined)
    @scala.inline
    def setRenderTo(value: js.Any): Self = this.set("renderTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderTo: Self = this.set("renderTo", js.undefined)
    @scala.inline
    def setRenderTpl(value: js.Any): Self = this.set("renderTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderTpl: Self = this.set("renderTpl", js.undefined)
    @scala.inline
    def setRendered(value: Boolean): Self = this.set("rendered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setSequenceFx(value: () => _): Self = this.set("sequenceFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSequenceFx: Self = this.set("sequenceFx", js.undefined)
    @scala.inline
    def setSetBorder(value: /* border */ js.UndefOr[js.Any] => Unit): Self = this.set("setBorder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBorder: Self = this.set("setBorder", js.undefined)
    @scala.inline
    def setSetBox(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable): Self = this.set("setBox", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetBox: Self = this.set("setBox", js.undefined)
    @scala.inline
    def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = this.set("setDisabled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDisabled: Self = this.set("setDisabled", js.undefined)
    @scala.inline
    def setSetDocked(value: (/* dock */ js.UndefOr[js.Any], /* layoutParent */ js.UndefOr[Boolean]) => IComponent): Self = this.set("setDocked", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetDocked: Self = this.set("setDocked", js.undefined)
    @scala.inline
    def setSetHeight(value: /* height */ js.UndefOr[Double] => IComponent): Self = this.set("setHeight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHeight: Self = this.set("setHeight", js.undefined)
    @scala.inline
    def setSetLocalX(value: js.UndefOr[js.Any | Double] => IAbstractComponent | IPositionable): Self = this.set("setLocalX", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLocalX: Self = this.set("setLocalX", js.undefined)
    @scala.inline
    def setSetLocalXY(value: (js.UndefOr[js.Any], js.UndefOr[js.Any | Double]) => IAbstractComponent | IPositionable): Self = this.set("setLocalXY", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetLocalXY: Self = this.set("setLocalXY", js.undefined)
    @scala.inline
    def setSetLocalY(value: js.UndefOr[js.Any | Double] => IAbstractComponent | IPositionable): Self = this.set("setLocalY", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLocalY: Self = this.set("setLocalY", js.undefined)
    @scala.inline
    def setSetMargin(value: /* margin */ js.UndefOr[js.Any] => Unit): Self = this.set("setMargin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMargin: Self = this.set("setMargin", js.undefined)
    @scala.inline
    def setSetRegion(value: (js.UndefOr[IRegion], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable): Self = this.set("setRegion", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetRegion: Self = this.set("setRegion", js.undefined)
    @scala.inline
    def setSetSize(value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => IComponent): Self = this.set("setSize", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
    @scala.inline
    def setSetUI(value: /* ui */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setUI", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUI: Self = this.set("setUI", js.undefined)
    @scala.inline
    def setSetVisible(value: /* visible */ js.UndefOr[Boolean] => IComponent): Self = this.set("setVisible", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetVisible: Self = this.set("setVisible", js.undefined)
    @scala.inline
    def setSetWidth(value: /* width */ js.UndefOr[Double] => IComponent): Self = this.set("setWidth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetWidth: Self = this.set("setWidth", js.undefined)
    @scala.inline
    def setSetX(value: (js.UndefOr[js.Any | Double], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable): Self = this.set("setX", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetX: Self = this.set("setX", js.undefined)
    @scala.inline
    def setSetXY(value: (js.UndefOr[js.Any | Array], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable): Self = this.set("setXY", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetXY: Self = this.set("setXY", js.undefined)
    @scala.inline
    def setSetY(value: (js.UndefOr[js.Any | Double], js.UndefOr[js.Any]) => IAbstractComponent | IPositionable): Self = this.set("setY", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetY: Self = this.set("setY", js.undefined)
    @scala.inline
    def setShrinkWrap(value: js.Any): Self = this.set("shrinkWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShrinkWrap: Self = this.set("shrinkWrap", js.undefined)
    @scala.inline
    def setStopAnimation(value: () => IElement): Self = this.set("stopAnimation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStopAnimation: Self = this.set("stopAnimation", js.undefined)
    @scala.inline
    def setStopFx(value: () => IElement): Self = this.set("stopFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStopFx: Self = this.set("stopFx", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSyncFx(value: () => _): Self = this.set("syncFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSyncFx: Self = this.set("syncFx", js.undefined)
    @scala.inline
    def setTpl(value: js.Any): Self = this.set("tpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTpl: Self = this.set("tpl", js.undefined)
    @scala.inline
    def setTplWriteMode(value: java.lang.String): Self = this.set("tplWriteMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTplWriteMode: Self = this.set("tplWriteMode", js.undefined)
    @scala.inline
    def setTranslatePoints(value: (js.UndefOr[js.Any], js.UndefOr[Double]) => _): Self = this.set("translatePoints", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTranslatePoints: Self = this.set("translatePoints", js.undefined)
    @scala.inline
    def setUi(value: java.lang.String): Self = this.set("ui", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
    @scala.inline
    def setUp(
      value: (/* selector */ js.UndefOr[js.Any], /* limit */ js.UndefOr[js.Any]) => typings.extjs.Ext.container.IContainer
    ): Self = this.set("up", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
    @scala.inline
    def setUpdate(
      value: (/* htmlOrData */ js.UndefOr[js.Any], /* loadScripts */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("update", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setUpdateLayout(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("updateLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdateLayout: Self = this.set("updateLayout", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXtype(value: IWidget): Self = this.set("xtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXtype: Self = this.set("xtype", js.undefined)
  }
  
}

