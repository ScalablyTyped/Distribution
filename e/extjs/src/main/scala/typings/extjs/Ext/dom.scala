package typings.extjs.Ext

import typings.extjs.Ext.dd.IDD
import typings.extjs.Ext.dd.IDDProxy
import typings.extjs.Ext.dd.IDDTarget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dom {
  
  trait AbstractElement_ extends StObject
  
  trait Element_ extends StObject
  
  trait IAbstractElement
    extends StObject
       with IBase {
    
    /** [Property] (Number) */
    var ASCLASS: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var DISPLAY: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var OFFSETS: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var VISIBILITY: js.UndefOr[Double] = js.undefined
    
    /** [Method] Adds one or more CSS classes to the element
      * @param className String/String[] The CSS classes to add separated by space, or an array of classes
      * @returns Ext.dom.Element this
      */
    var addCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[Any], typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Method] Appends the passed element s to this element Defined in override Ext dom AbstractElement_insertion
      * @param el String/HTMLElement/Ext.dom.AbstractElement/Object The id or element to insert or a DomHelper config The id of the node, a DOM Node or an existing Element.
      * @param returnDom Boolean True to return the raw DOM element instead of Ext.dom.AbstractElement
      * @returns Ext.dom.AbstractElement The inserted Element.
      */
    var appendChild: js.UndefOr[
        js.Function2[/* el */ js.UndefOr[Any], /* returnDom */ js.UndefOr[Boolean], this.type]
      ] = js.undefined
    
    /** [Method] Appends this element to the passed element Defined in override Ext dom AbstractElement_insertion
      * @param el String/HTMLElement/Ext.dom.AbstractElement The new parent element. The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.AbstractElement This element
      */
    var appendTo: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] More flexible version of setStyle for setting style properties
      * @param styles String/Object/Function A style specification string, e.g. "width:100px", or object in the form {width:"100px"}, or a function which returns such a specification.
      * @returns Ext.dom.Element this
      */
    var applyStyles: js.UndefOr[js.Function1[/* styles */ js.UndefOr[Any], typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Method] Selects a single direct child based on the passed CSS selector the selector should not contain an id
      * @param selector String The CSS selector
      * @param returnDom Boolean True to return the DOM node instead of Ext.dom.Element.
      * @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom = true)
      */
    var child: js.UndefOr[
        js.Function2[
          /* selector */ js.UndefOr[java.lang.String], 
          /* returnDom */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Returns true if this element is an ancestor of the passed element
      * @param el HTMLElement/String The element to check
      * @returns Boolean True if this element is an ancestor of el, else false
      */
    var contains: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], Boolean]] = js.undefined
    
    /** [Method] Creates the passed DomHelper config and appends it to this element or optionally inserts it before the passed child e
      * @param config Object DomHelper element config object. If no tag is specified (e.g., {tag:'input'}) then a div will be automatically generated with the specified attributes.
      * @param insertBefore HTMLElement a child element of this element
      * @param returnDom Boolean true to return the dom node instead of creating an Element
      * @returns Ext.dom.AbstractElement The new child element
      */
    var createChild: js.UndefOr[
        js.Function3[
          /* config */ js.UndefOr[Any], 
          /* insertBefore */ js.UndefOr[HTMLElement], 
          /* returnDom */ js.UndefOr[Boolean], 
          this.type
        ]
      ] = js.undefined
    
    /** [Property] (String) */
    var defaultUnit: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Alias to remove  */
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Property] (HTMLElement) */
    var dom: js.UndefOr[HTMLElement] = js.undefined
    
    /** [Method] Selects a single child at any depth below this element based on the passed CSS selector the selector should not cont
      * @param selector String The CSS selector
      * @param returnDom Boolean True to return the DOM node instead of Ext.dom.Element
      * @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom = true)
      */
    var down: js.UndefOr[
        js.Function2[
          /* selector */ js.UndefOr[java.lang.String], 
          /* returnDom */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Looks at this node and then at parent nodes for a match of the passed simple selector e g
      * @param selector String The simple selector to test
      * @param limit Number/String/HTMLElement/Ext.Element The max depth to search as a number or an element which causes the upward traversal to stop and is not considered for inclusion as the result. (defaults to 50 || document.documentElement)
      * @param returnEl Boolean True to return a Ext.Element object instead of DOM node
      * @returns HTMLElement The matching DOM node (or null if no match was found)
      */
    var findParent: js.UndefOr[
        js.Function3[
          /* selector */ js.UndefOr[java.lang.String], 
          /* limit */ js.UndefOr[Any], 
          /* returnEl */ js.UndefOr[Boolean], 
          HTMLElement
        ]
      ] = js.undefined
    
    /** [Method] Looks at parent nodes for a match of the passed simple selector e g
      * @param selector String The simple selector to test
      * @param limit Number/String/HTMLElement/Ext.Element The max depth to search as a number or an element which causes the upward traversal to stop and is not considered for inclusion as the result. (defaults to 50 || document.documentElement)
      * @param returnEl Boolean True to return a Ext.Element object instead of DOM node
      * @returns HTMLElement The matching DOM node (or null if no match was found)
      */
    var findParentNode: js.UndefOr[
        js.Function3[
          /* selector */ js.UndefOr[java.lang.String], 
          /* limit */ js.UndefOr[Any], 
          /* returnEl */ js.UndefOr[Boolean], 
          HTMLElement
        ]
      ] = js.undefined
    
    /** [Method] Gets the first child skipping text nodes Defined in override Ext dom AbstractElement_traversal
      * @param selector String Find the next sibling that matches the passed simple selector
      * @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
      * @returns Ext.dom.Element/HTMLElement The first child or null
      */
    var first: js.UndefOr[
        js.Function2[
          /* selector */ js.UndefOr[java.lang.String], 
          /* returnDom */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Returns the active element in the DOM
      * @returns HTMLElement The active (focused) element in the document.
      */
    var getActiveElement: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    /** [Method] Returns the value of an attribute from the element s underlying DOM node
      * @param name String The attribute name
      * @param namespace String The namespace in which to look for the attribute
      * @returns String The attribute value
      */
    var getAttribute: js.UndefOr[
        js.Function2[
          /* name */ js.UndefOr[java.lang.String], 
          /* namespace */ js.UndefOr[java.lang.String], 
          java.lang.String
        ]
      ] = js.undefined
    
    /** [Method] Gets the width of the border s for the specified side s  Defined in override Ext dom AbstractElement_style
      * @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the border left width + the border right width.
      * @returns Number The width of the sides passed added together
      */
    var getBorderWidth: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Double]] = js.undefined
    
    /** [Method] Returns a child element of this element given its id
      * @param id String The id of the desired child element.
      * @param asDom Boolean True to return the DOM element, false to return a wrapped Element object.
      */
    var getById: js.UndefOr[
        js.Function2[/* id */ js.UndefOr[java.lang.String], /* asDom */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /** [Method] Returns the innerHTML of an Element or an empty string if the element s dom no longer exists  */
    var getHTML: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns the offset height of the element Defined in override Ext dom AbstractElement_style
      * @param contentHeight Boolean true to get the height minus borders and padding
      * @returns Number The element's height
      */
    var getHeight: js.UndefOr[js.Function1[/* contentHeight */ js.UndefOr[Boolean], Double]] = js.undefined
    
    /** [Method] Returns an object with properties top left right and bottom representing the margins of this element unless sides i
      * @param sides String Any combination of l, r, t, b to get the sum of those sides
      * @returns Object/Number
      */
    var getMargin: js.UndefOr[js.Function1[/* sides */ js.UndefOr[java.lang.String], Any]] = js.undefined
    
    /** [Method] Gets the width of the padding s for the specified side s  Defined in override Ext dom AbstractElement_style
      * @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the padding left + the padding right.
      * @returns Number The padding of the sides passed added together
      */
    var getPadding: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Double]] = js.undefined
    
    /** [Method] Returns the size of the element
      * @param contentSize Boolean true to get the width/size minus borders and padding
      * @returns Object An object containing the element's size:
      */
    var getSize: js.UndefOr[js.Function1[/* contentSize */ js.UndefOr[Boolean], Any]] = js.undefined
    
    /** [Method] Returns a named style property based on computed currentStyle primary and inline style if primary is not available
      * @param property String/String[] The style property (or multiple property names in an array) whose value is returned.
      * @param inline Boolean if true only inline styles will be returned.
      * @returns String/Object The current value of the style property for this element (or a hash of named style values if multiple property arguments are requested).
      */
    var getStyle: js.UndefOr[
        js.Function2[/* property */ js.UndefOr[Any], /* inline */ js.UndefOr[Boolean], Any]
      ] = js.undefined
    
    /** [Method] Returns the value of the value attribute
      * @param asNumber Boolean true to parse the value as a number
      * @returns String/Number
      */
    var getValue: js.UndefOr[js.Function1[/* asNumber */ js.UndefOr[Boolean], Any]] = js.undefined
    
    /** [Method] Returns the dimensions of the element available to lay content out in
      * @returns Object Object describing width and height.
      */
    var getViewSize: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the offset width of the element Defined in override Ext dom AbstractElement_style
      * @param contentWidth Boolean true to get the width minus borders and padding
      * @returns Number The element's width
      */
    var getWidth: js.UndefOr[js.Function1[/* contentWidth */ js.UndefOr[Boolean], Double]] = js.undefined
    
    /** [Method] Checks if the specified CSS class exists on this element s DOM node
      * @param className String The CSS class to check for
      * @returns Boolean True if the class exists, else false
      */
    var hasCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
    
    /** [Method] Hide this element  Uses display mode to determine whether to use display or visibility
      * @param animate Boolean/Object true for the default animation or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    var hide: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Any], typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Property] (String) */
    var id: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Inserts this element after the passed element in the DOM Defined in override Ext dom AbstractElement_insertion
      * @param el String/HTMLElement/Ext.dom.AbstractElement The element to insert after. The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.AbstractElement This element
      */
    var insertAfter: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Inserts this element before the passed element in the DOM Defined in override Ext dom AbstractElement_insertion
      * @param el String/HTMLElement/Ext.dom.AbstractElement The element before which this element will be inserted. The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.AbstractElement This element
      */
    var insertBefore: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Inserts or creates an element or DomHelper config as the first child of this element Defined in override Ext dom
      * @param el String/HTMLElement/Ext.dom.AbstractElement/Object The id or element to insert or a DomHelper config to create and insert
      * @returns Ext.dom.AbstractElement The new child
      */
    var insertFirst: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Inserts an html fragment into this element Defined in override Ext dom AbstractElement_insertion
      * @param where String Where to insert the html in relation to this element - beforeBegin, afterBegin, beforeEnd, afterEnd. See Ext.dom.Helper.insertHtml for details.
      * @param html String The HTML fragment
      * @param returnEl Boolean True to return an Ext.dom.AbstractElement
      * @returns HTMLElement/Ext.dom.AbstractElement The inserted node (or nearest related if more than 1 inserted)
      */
    var insertHtml: js.UndefOr[
        js.Function3[
          /* where */ js.UndefOr[java.lang.String], 
          /* html */ js.UndefOr[java.lang.String], 
          /* returnEl */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Inserts or creates the passed element or DomHelper config as a sibling of this element Defined in override Ext d
      * @param el String/HTMLElement/Ext.dom.AbstractElement/Object/Array The id, element to insert or a DomHelper config to create and insert or an array of any of those.
      * @param where String 'before' or 'after'
      * @param returnDom Boolean True to return the raw DOM element instead of Ext.dom.AbstractElement
      * @returns Ext.dom.AbstractElement The inserted Element. If an array is passed, the last inserted element is returned.
      */
    var insertSibling: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[Any], 
          /* where */ js.UndefOr[java.lang.String], 
          /* returnDom */ js.UndefOr[Boolean], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Returns true if this element matches the passed simple selector e g
      * @param selector String The simple selector to test
      * @returns Boolean True if this element matches the selector, else false
      */
    var is: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
    
    /** [Method] Checks if the current value of a style is equal to a given value
      * @param style String property whose value is returned.
      * @param value String to check against.
      * @returns Boolean true for when the current value equals the given value.
      */
    var isStyle: js.UndefOr[
        js.Function2[
          /* style */ js.UndefOr[java.lang.String], 
          /* value */ js.UndefOr[java.lang.String], 
          Boolean
        ]
      ] = js.undefined
    
    /** [Method] Returns true if the value of the given property is visually transparent
      * @param prop String The style property whose value is to be tested.
      * @returns Boolean True if the style property is visually transparent.
      */
    var isTransparent: js.UndefOr[js.Function1[/* prop */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
    
    /** [Method] Gets the last child skipping text nodes Defined in override Ext dom AbstractElement_traversal
      * @param selector String Find the previous sibling that matches the passed simple selector
      * @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
      * @returns Ext.dom.Element/HTMLElement The last child or null
      */
    var last: js.UndefOr[
        js.Function2[
          /* selector */ js.UndefOr[java.lang.String], 
          /* returnDom */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Puts a mask over this element to disable user interaction
      * @param msg String A message to display in the mask
      * @param msgCls String A css class to apply to the msg element
      */
    var mask: js.UndefOr[
        js.Function2[
          /* msg */ js.UndefOr[java.lang.String], 
          /* msgCls */ js.UndefOr[java.lang.String], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Gets the next sibling skipping text nodes Defined in override Ext dom AbstractElement_traversal
      * @param selector String Find the next sibling that matches the passed simple selector
      * @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
      * @returns Ext.dom.Element/HTMLElement The next sibling or null
      */
    var next: js.UndefOr[
        js.Function2[
          /* selector */ js.UndefOr[java.lang.String], 
          /* returnDom */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Gets the parent node for this element optionally chaining up trying to match a selector Defined in override Ext dom
      * @param selector String Find a parent node that matches the passed simple selector
      * @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
      * @returns Ext.dom.Element/HTMLElement The parent node or null
      */
    var parent: js.UndefOr[
        js.Function2[
          /* selector */ js.UndefOr[java.lang.String], 
          /* returnDom */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Gets the previous sibling skipping text nodes Defined in override Ext dom AbstractElement_traversal
      * @param selector String Find the previous sibling that matches the passed simple selector
      * @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
      * @returns Ext.dom.Element/HTMLElement The previous sibling or null
      */
    var prev: js.UndefOr[
        js.Function2[
          /* selector */ js.UndefOr[java.lang.String], 
          /* returnDom */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Selects child nodes based on the passed CSS selector the selector should not contain an id
      * @param selector String The CSS selector
      * @returns HTMLElement[] An array of the matched nodes
      */
    var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Array]] = js.undefined
    
    /** [Method] Adds one or more CSS classes to this element and removes the same class es from all siblings
      * @param className String/String[] The CSS class to add, or an array of classes
      * @returns Ext.dom.Element this
      */
    var radioCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[Any], typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Method] Removes this element s dom reference  */
    var remove: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Removes one or more CSS classes from the element
      * @param className String/String[] The CSS classes to remove separated by space, or an array of classes
      * @returns Ext.dom.Element this
      */
    var removeCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[Any], typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Method] Forces the browser to repaint this element Defined in override Ext dom AbstractElement_style
      * @returns Ext.dom.Element this
      */
    var repaint: js.UndefOr[js.Function0[typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Method] Replaces the passed element with this element Defined in override Ext dom AbstractElement_insertion
      * @param el String/HTMLElement/Ext.dom.AbstractElement The element to replace. The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.AbstractElement This element
      */
    var replace: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Replaces a CSS class on the element with another
      * @param oldClassName String The CSS class to replace
      * @param newClassName String The replacement CSS class
      * @returns Ext.dom.Element this
      */
    var replaceCls: js.UndefOr[
        js.Function2[
          /* oldClassName */ js.UndefOr[java.lang.String], 
          /* newClassName */ js.UndefOr[java.lang.String], 
          typings.extjs.Ext.dom.IElement
        ]
      ] = js.undefined
    
    /** [Method] Replaces this element with the passed element Defined in override Ext dom AbstractElement_insertion
      * @param el String/HTMLElement/Ext.dom.AbstractElement/Object The new element (id of the node, a DOM Node or an existing Element) or a DomHelper config of an element to create
      * @returns Ext.dom.AbstractElement This element
      */
    var replaceWith: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Creates a Ext CompositeElement for child nodes based on the passed CSS selector the selector should not contain an id
      * @param selector String The CSS selector
      * @param unique Boolean True to create a unique Ext.Element for each element. Defaults to a shared flyweight object.
      * @returns Ext.CompositeElement The composite element
      */
    var select: js.UndefOr[
        js.Function2[
          /* selector */ js.UndefOr[java.lang.String], 
          /* unique */ js.UndefOr[Boolean], 
          typings.extjs.Ext.ICompositeElement
        ]
      ] = js.undefined
    
    /** [Method] Serializes a DOM form into a url encoded string Defined in override Ext dom AbstractElement_static
      * @param form Object The form
      * @returns String The url encoded form
      */
    var serializeForm: js.UndefOr[js.Function1[/* form */ js.UndefOr[Any], java.lang.String]] = js.undefined
    
    /** [Method] Sets the passed attributes as attributes of this element a style attribute can be a string object or function
      * @param o Object The object with the attributes
      * @param useSet Boolean false to override the default setAttribute to use expandos.
      * @returns Ext.dom.Element this
      */
    var set: js.UndefOr[
        js.Function2[
          /* o */ js.UndefOr[Any], 
          /* useSet */ js.UndefOr[Boolean], 
          typings.extjs.Ext.dom.IElement
        ]
      ] = js.undefined
    
    /** [Method] Set the innerHTML of this element
      * @param html String The new HTML
      * @returns Ext.Element this
      */
    var setHTML: js.UndefOr[
        js.Function1[/* html */ js.UndefOr[java.lang.String], typings.extjs.Ext.IElement]
      ] = js.undefined
    
    /** [Method] Set the height of this Element
      * @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels.) A String used to set the CSS height style. Animation may not be used.
      * @returns Ext.dom.Element this
      */
    var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[Any], typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Method] Set the size of this Element
      * @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used. A size object in the format {width: widthValue, height: heightValue}.
      * @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used.
      * @returns Ext.dom.Element this
      */
    var setSize: js.UndefOr[
        js.Function2[
          /* width */ js.UndefOr[Any], 
          /* height */ js.UndefOr[Any], 
          typings.extjs.Ext.dom.IElement
        ]
      ] = js.undefined
    
    /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
      * @param property String/Object The style property to be set, or an object of multiple styles.
      * @param value String The value to apply to the given property, or null if an object was passed.
      * @returns Ext.dom.Element this
      */
    var setStyle: js.UndefOr[
        js.Function2[
          /* property */ js.UndefOr[Any], 
          /* value */ js.UndefOr[java.lang.String], 
          typings.extjs.Ext.dom.IElement
        ]
      ] = js.undefined
    
    /** [Method] Use this to change the visibility mode between VISIBILITY DISPLAY OFFSETS or ASCLASS
      * @param mode Object
      * @returns Ext.dom.AbstractElement this
      */
    var setVisibilityMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the visibility of the element see details
      * @param visible Boolean Whether the element is visible
      * @param animate Boolean/Object True for the default animation, or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    var setVisible: js.UndefOr[
        js.Function2[
          /* visible */ js.UndefOr[Boolean], 
          /* animate */ js.UndefOr[Any], 
          typings.extjs.Ext.dom.IElement
        ]
      ] = js.undefined
    
    /** [Method] Set the width of this Element
      * @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used.
      * @returns Ext.dom.Element this
      */
    var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Any], typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Method] Show this element  Uses display mode to determine whether to use display or visibility
      * @param animate Boolean/Object true for the default animation or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    var show: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Any], typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Method] Toggles the specified CSS class on this element removes it if it already exists otherwise adds it
      * @param className String The CSS class to toggle
      * @returns Ext.dom.Element this
      */
    var toggleCls: js.UndefOr[
        js.Function1[/* className */ js.UndefOr[java.lang.String], typings.extjs.Ext.dom.IElement]
      ] = js.undefined
    
    /** [Method] Removes a previously applied mask  */
    var unmask: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Walks up the DOM looking for a parent node that matches the passed simple selector e g
      * @param selector String The simple selector to test
      * @param limit Number/String/HTMLElement/Ext.Element The max depth to search as a number or an element which causes the upward traversal to stop and is not considered for inclusion as the result. (defaults to 50 || document.documentElement)
      * @param returnDom Boolean True to return the DOM node instead of Ext.dom.Element
      * @returns Ext.Element The matching DOM node (or null if no match was found)
      */
    var up: js.UndefOr[
        js.Function3[
          /* selector */ js.UndefOr[java.lang.String], 
          /* limit */ js.UndefOr[Any], 
          /* returnDom */ js.UndefOr[Boolean], 
          typings.extjs.Ext.IElement
        ]
      ] = js.undefined
    
    /** [Method] Update the innerHTML of this element
      * @param html String The new HTML
      * @returns Ext.dom.Element this
      */
    var update: js.UndefOr[
        js.Function1[/* html */ js.UndefOr[java.lang.String], typings.extjs.Ext.dom.IElement]
      ] = js.undefined
    
    /** [Method] Creates and wraps this element with another element Defined in override Ext dom AbstractElement_insertion
      * @param config Object DomHelper element config object for the wrapper element or null for an empty div
      * @param returnDom Boolean True to return the raw DOM element instead of Ext.dom.AbstractElement
      * @param selector String A DomQuery selector to select a descendant node within the created element to use as the wrapping element.
      * @returns HTMLElement/Ext.dom.AbstractElement The newly created wrapper element
      */
    var wrap: js.UndefOr[
        js.Function3[
          /* config */ js.UndefOr[Any], 
          /* returnDom */ js.UndefOr[Boolean], 
          /* selector */ js.UndefOr[java.lang.String], 
          Any
        ]
      ] = js.undefined
  }
  object IAbstractElement {
    
    inline def apply(): IAbstractElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstractElement]
    }
    
    extension [Self <: IAbstractElement](x: Self) {
      
      inline def setASCLASS(value: Double): Self = StObject.set(x, "ASCLASS", value.asInstanceOf[js.Any])
      
      inline def setASCLASSUndefined: Self = StObject.set(x, "ASCLASS", js.undefined)
      
      inline def setAddCls(value: /* className */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "addCls", js.Any.fromFunction1(value))
      
      inline def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
      
      inline def setAppendChild(value: (/* el */ js.UndefOr[Any], /* returnDom */ js.UndefOr[Boolean]) => IAbstractElement): Self = StObject.set(x, "appendChild", js.Any.fromFunction2(value))
      
      inline def setAppendChildUndefined: Self = StObject.set(x, "appendChild", js.undefined)
      
      inline def setAppendTo(value: /* el */ js.UndefOr[Any] => IAbstractElement): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setApplyStyles(value: /* styles */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "applyStyles", js.Any.fromFunction1(value))
      
      inline def setApplyStylesUndefined: Self = StObject.set(x, "applyStyles", js.undefined)
      
      inline def setChild(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "child", js.Any.fromFunction2(value))
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setContains(value: /* el */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setCreateChild(
        value: (/* config */ js.UndefOr[Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => IAbstractElement
      ): Self = StObject.set(x, "createChild", js.Any.fromFunction3(value))
      
      inline def setCreateChildUndefined: Self = StObject.set(x, "createChild", js.undefined)
      
      inline def setDISPLAY(value: Double): Self = StObject.set(x, "DISPLAY", value.asInstanceOf[js.Any])
      
      inline def setDISPLAYUndefined: Self = StObject.set(x, "DISPLAY", js.undefined)
      
      inline def setDefaultUnit(value: java.lang.String): Self = StObject.set(x, "defaultUnit", value.asInstanceOf[js.Any])
      
      inline def setDefaultUnitUndefined: Self = StObject.set(x, "defaultUnit", js.undefined)
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
      
      inline def setDown(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "down", js.Any.fromFunction2(value))
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setFindParent(
        value: (/* selector */ js.UndefOr[java.lang.String], /* limit */ js.UndefOr[Any], /* returnEl */ js.UndefOr[Boolean]) => HTMLElement
      ): Self = StObject.set(x, "findParent", js.Any.fromFunction3(value))
      
      inline def setFindParentNode(
        value: (/* selector */ js.UndefOr[java.lang.String], /* limit */ js.UndefOr[Any], /* returnEl */ js.UndefOr[Boolean]) => HTMLElement
      ): Self = StObject.set(x, "findParentNode", js.Any.fromFunction3(value))
      
      inline def setFindParentNodeUndefined: Self = StObject.set(x, "findParentNode", js.undefined)
      
      inline def setFindParentUndefined: Self = StObject.set(x, "findParent", js.undefined)
      
      inline def setFirst(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "first", js.Any.fromFunction2(value))
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setGetActiveElement(value: () => HTMLElement): Self = StObject.set(x, "getActiveElement", js.Any.fromFunction0(value))
      
      inline def setGetActiveElementUndefined: Self = StObject.set(x, "getActiveElement", js.undefined)
      
      inline def setGetAttribute(
        value: (/* name */ js.UndefOr[java.lang.String], /* namespace */ js.UndefOr[java.lang.String]) => java.lang.String
      ): Self = StObject.set(x, "getAttribute", js.Any.fromFunction2(value))
      
      inline def setGetAttributeUndefined: Self = StObject.set(x, "getAttribute", js.undefined)
      
      inline def setGetBorderWidth(value: /* side */ js.UndefOr[java.lang.String] => Double): Self = StObject.set(x, "getBorderWidth", js.Any.fromFunction1(value))
      
      inline def setGetBorderWidthUndefined: Self = StObject.set(x, "getBorderWidth", js.undefined)
      
      inline def setGetById(value: (/* id */ js.UndefOr[java.lang.String], /* asDom */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "getById", js.Any.fromFunction2(value))
      
      inline def setGetByIdUndefined: Self = StObject.set(x, "getById", js.undefined)
      
      inline def setGetHTML(value: () => Unit): Self = StObject.set(x, "getHTML", js.Any.fromFunction0(value))
      
      inline def setGetHTMLUndefined: Self = StObject.set(x, "getHTML", js.undefined)
      
      inline def setGetHeight(value: /* contentHeight */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction1(value))
      
      inline def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
      
      inline def setGetMargin(value: /* sides */ js.UndefOr[java.lang.String] => Any): Self = StObject.set(x, "getMargin", js.Any.fromFunction1(value))
      
      inline def setGetMarginUndefined: Self = StObject.set(x, "getMargin", js.undefined)
      
      inline def setGetPadding(value: /* side */ js.UndefOr[java.lang.String] => Double): Self = StObject.set(x, "getPadding", js.Any.fromFunction1(value))
      
      inline def setGetPaddingUndefined: Self = StObject.set(x, "getPadding", js.undefined)
      
      inline def setGetSize(value: /* contentSize */ js.UndefOr[Boolean] => Any): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
      
      inline def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
      
      inline def setGetStyle(value: (/* property */ js.UndefOr[Any], /* inline */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "getStyle", js.Any.fromFunction2(value))
      
      inline def setGetStyleUndefined: Self = StObject.set(x, "getStyle", js.undefined)
      
      inline def setGetValue(value: /* asNumber */ js.UndefOr[Boolean] => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      inline def setGetViewSize(value: () => Any): Self = StObject.set(x, "getViewSize", js.Any.fromFunction0(value))
      
      inline def setGetViewSizeUndefined: Self = StObject.set(x, "getViewSize", js.undefined)
      
      inline def setGetWidth(value: /* contentWidth */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction1(value))
      
      inline def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
      
      inline def setHasCls(value: /* className */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "hasCls", js.Any.fromFunction1(value))
      
      inline def setHasClsUndefined: Self = StObject.set(x, "hasCls", js.undefined)
      
      inline def setHide(value: /* animate */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInsertAfter(value: /* el */ js.UndefOr[Any] => IAbstractElement): Self = StObject.set(x, "insertAfter", js.Any.fromFunction1(value))
      
      inline def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
      
      inline def setInsertBefore(value: /* el */ js.UndefOr[Any] => IAbstractElement): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
      
      inline def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
      
      inline def setInsertFirst(value: /* el */ js.UndefOr[Any] => IAbstractElement): Self = StObject.set(x, "insertFirst", js.Any.fromFunction1(value))
      
      inline def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
      
      inline def setInsertHtml(
        value: (/* where */ js.UndefOr[java.lang.String], /* html */ js.UndefOr[java.lang.String], /* returnEl */ js.UndefOr[Boolean]) => Any
      ): Self = StObject.set(x, "insertHtml", js.Any.fromFunction3(value))
      
      inline def setInsertHtmlUndefined: Self = StObject.set(x, "insertHtml", js.undefined)
      
      inline def setInsertSibling(
        value: (/* el */ js.UndefOr[Any], /* where */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => IAbstractElement
      ): Self = StObject.set(x, "insertSibling", js.Any.fromFunction3(value))
      
      inline def setInsertSiblingUndefined: Self = StObject.set(x, "insertSibling", js.undefined)
      
      inline def setIs(value: /* selector */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
      
      inline def setIsStyle(
        value: (/* style */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[java.lang.String]) => Boolean
      ): Self = StObject.set(x, "isStyle", js.Any.fromFunction2(value))
      
      inline def setIsStyleUndefined: Self = StObject.set(x, "isStyle", js.undefined)
      
      inline def setIsTransparent(value: /* prop */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "isTransparent", js.Any.fromFunction1(value))
      
      inline def setIsTransparentUndefined: Self = StObject.set(x, "isTransparent", js.undefined)
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setLast(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "last", js.Any.fromFunction2(value))
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setMask(value: (/* msg */ js.UndefOr[java.lang.String], /* msgCls */ js.UndefOr[java.lang.String]) => Unit): Self = StObject.set(x, "mask", js.Any.fromFunction2(value))
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setNext(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "next", js.Any.fromFunction2(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setOFFSETS(value: Double): Self = StObject.set(x, "OFFSETS", value.asInstanceOf[js.Any])
      
      inline def setOFFSETSUndefined: Self = StObject.set(x, "OFFSETS", js.undefined)
      
      inline def setParent(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "parent", js.Any.fromFunction2(value))
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPrev(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "prev", js.Any.fromFunction2(value))
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setQuery(value: /* selector */ js.UndefOr[java.lang.String] => Array): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRadioCls(value: /* className */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "radioCls", js.Any.fromFunction1(value))
      
      inline def setRadioClsUndefined: Self = StObject.set(x, "radioCls", js.undefined)
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setRemoveCls(value: /* className */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "removeCls", js.Any.fromFunction1(value))
      
      inline def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setRepaint(value: () => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "repaint", js.Any.fromFunction0(value))
      
      inline def setRepaintUndefined: Self = StObject.set(x, "repaint", js.undefined)
      
      inline def setReplace(value: /* el */ js.UndefOr[Any] => IAbstractElement): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      inline def setReplaceCls(
        value: (/* oldClassName */ js.UndefOr[java.lang.String], /* newClassName */ js.UndefOr[java.lang.String]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "replaceCls", js.Any.fromFunction2(value))
      
      inline def setReplaceClsUndefined: Self = StObject.set(x, "replaceCls", js.undefined)
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setReplaceWith(value: /* el */ js.UndefOr[Any] => IAbstractElement): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
      
      inline def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
      
      inline def setSelect(
        value: (/* selector */ js.UndefOr[java.lang.String], /* unique */ js.UndefOr[Boolean]) => typings.extjs.Ext.ICompositeElement
      ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSerializeForm(value: /* form */ js.UndefOr[Any] => java.lang.String): Self = StObject.set(x, "serializeForm", js.Any.fromFunction1(value))
      
      inline def setSerializeFormUndefined: Self = StObject.set(x, "serializeForm", js.undefined)
      
      inline def setSet(
        value: (/* o */ js.UndefOr[Any], /* useSet */ js.UndefOr[Boolean]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSetHTML(value: /* html */ js.UndefOr[java.lang.String] => typings.extjs.Ext.IElement): Self = StObject.set(x, "setHTML", js.Any.fromFunction1(value))
      
      inline def setSetHTMLUndefined: Self = StObject.set(x, "setHTML", js.undefined)
      
      inline def setSetHeight(value: /* height */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
      
      inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
      
      inline def setSetSize(
        value: (/* width */ js.UndefOr[Any], /* height */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
      
      inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      inline def setSetStyle(
        value: (/* property */ js.UndefOr[Any], /* value */ js.UndefOr[java.lang.String]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setSetVisibilityMode(value: /* mode */ js.UndefOr[Any] => IAbstractElement): Self = StObject.set(x, "setVisibilityMode", js.Any.fromFunction1(value))
      
      inline def setSetVisibilityModeUndefined: Self = StObject.set(x, "setVisibilityMode", js.undefined)
      
      inline def setSetVisible(
        value: (/* visible */ js.UndefOr[Boolean], /* animate */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "setVisible", js.Any.fromFunction2(value))
      
      inline def setSetVisibleUndefined: Self = StObject.set(x, "setVisible", js.undefined)
      
      inline def setSetWidth(value: /* width */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
      
      inline def setShow(value: /* animate */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setToggleCls(value: /* className */ js.UndefOr[java.lang.String] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "toggleCls", js.Any.fromFunction1(value))
      
      inline def setToggleClsUndefined: Self = StObject.set(x, "toggleCls", js.undefined)
      
      inline def setUnmask(value: () => Unit): Self = StObject.set(x, "unmask", js.Any.fromFunction0(value))
      
      inline def setUnmaskUndefined: Self = StObject.set(x, "unmask", js.undefined)
      
      inline def setUp(
        value: (/* selector */ js.UndefOr[java.lang.String], /* limit */ js.UndefOr[Any], /* returnDom */ js.UndefOr[Boolean]) => typings.extjs.Ext.IElement
      ): Self = StObject.set(x, "up", js.Any.fromFunction3(value))
      
      inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      
      inline def setUpdate(value: /* html */ js.UndefOr[java.lang.String] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setVISIBILITY(value: Double): Self = StObject.set(x, "VISIBILITY", value.asInstanceOf[js.Any])
      
      inline def setVISIBILITYUndefined: Self = StObject.set(x, "VISIBILITY", js.undefined)
      
      inline def setWrap(
        value: (/* config */ js.UndefOr[Any], /* returnDom */ js.UndefOr[Boolean], /* selector */ js.UndefOr[java.lang.String]) => Any
      ): Self = StObject.set(x, "wrap", js.Any.fromFunction3(value))
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait IAbstractHelper
    extends StObject
       with IBase {
    
    /** [Method] Creates new DOM element s and appends them to el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    var append: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[Any], 
          /* o */ js.UndefOr[Any], 
          /* returnElement */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Applies a style specification to an element
      * @param el String/HTMLElement The element to apply styles to
      * @param styles String/Object/Function A style specification string e.g. 'width:100px', or object in the form {width:'100px'}, or a function which returns such a specification.
      */
    var applyStyles: js.UndefOr[js.Function2[/* el */ js.UndefOr[Any], /* styles */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Converts the styles from the given object to text
      * @param styles Object The object describing the styles.
      * @param buffer String[] The output buffer.
      * @returns String/String[] If buffer is passed, it is returned. Otherwise the style string is returned.
      */
    var generateStyles: js.UndefOr[js.Function2[/* styles */ js.UndefOr[Any], /* buffer */ js.UndefOr[Array], Any]] = js.undefined
    
    /** [Method] Creates new DOM element s and inserts them after el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object The DOM object spec (and children)
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    var insertAfter: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[Any], 
          /* o */ js.UndefOr[Any], 
          /* returnElement */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Creates new DOM element s and inserts them before el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    var insertBefore: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[Any], 
          /* o */ js.UndefOr[Any], 
          /* returnElement */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Creates new DOM element s and inserts them as the first child of el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    var insertFirst: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[Any], 
          /* o */ js.UndefOr[Any], 
          /* returnElement */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Inserts an HTML fragment into the DOM
      * @param where String Where to insert the html in relation to el - beforeBegin, afterBegin, beforeEnd, afterEnd. For example take the following HTML: &lt;div&gt;Contents&lt;/div&gt; Using different where values inserts element to the following places:  beforeBegin: &lt;HERE&gt;&lt;div&gt;Contents&lt;/div&gt; afterBegin: &lt;div&gt;&lt;HERE&gt;Contents&lt;/div&gt; beforeEnd: &lt;div&gt;Contents&lt;HERE&gt;&lt;/div&gt; afterEnd: &lt;div&gt;Contents&lt;/div&gt;&lt;HERE&gt;
      * @param el HTMLElement/TextNode The context element
      * @param html String The HTML fragment
      * @returns HTMLElement The new node
      */
    var insertHtml: js.UndefOr[
        js.Function3[
          /* where */ js.UndefOr[java.lang.String], 
          /* el */ js.UndefOr[Any], 
          /* html */ js.UndefOr[java.lang.String], 
          HTMLElement
        ]
      ] = js.undefined
    
    /** [Method] Returns the markup for the passed Element s config
      * @param spec Object The DOM object spec (and children)
      * @returns String
      */
    var markup: js.UndefOr[js.Function1[/* spec */ js.UndefOr[Any], java.lang.String]] = js.undefined
    
    /** [Method] Creates new DOM element s and overwrites the contents of el with them
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    var overwrite: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[Any], 
          /* o */ js.UndefOr[Any], 
          /* returnElement */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
  }
  object IAbstractHelper {
    
    inline def apply(): IAbstractHelper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstractHelper]
    }
    
    extension [Self <: IAbstractHelper](x: Self) {
      
      inline def setAppend(
        value: (/* el */ js.UndefOr[Any], /* o */ js.UndefOr[Any], /* returnElement */ js.UndefOr[Boolean]) => Any
      ): Self = StObject.set(x, "append", js.Any.fromFunction3(value))
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setApplyStyles(value: (/* el */ js.UndefOr[Any], /* styles */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "applyStyles", js.Any.fromFunction2(value))
      
      inline def setApplyStylesUndefined: Self = StObject.set(x, "applyStyles", js.undefined)
      
      inline def setGenerateStyles(value: (/* styles */ js.UndefOr[Any], /* buffer */ js.UndefOr[Array]) => Any): Self = StObject.set(x, "generateStyles", js.Any.fromFunction2(value))
      
      inline def setGenerateStylesUndefined: Self = StObject.set(x, "generateStyles", js.undefined)
      
      inline def setInsertAfter(
        value: (/* el */ js.UndefOr[Any], /* o */ js.UndefOr[Any], /* returnElement */ js.UndefOr[Boolean]) => Any
      ): Self = StObject.set(x, "insertAfter", js.Any.fromFunction3(value))
      
      inline def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
      
      inline def setInsertBefore(
        value: (/* el */ js.UndefOr[Any], /* o */ js.UndefOr[Any], /* returnElement */ js.UndefOr[Boolean]) => Any
      ): Self = StObject.set(x, "insertBefore", js.Any.fromFunction3(value))
      
      inline def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
      
      inline def setInsertFirst(
        value: (/* el */ js.UndefOr[Any], /* o */ js.UndefOr[Any], /* returnElement */ js.UndefOr[Boolean]) => Any
      ): Self = StObject.set(x, "insertFirst", js.Any.fromFunction3(value))
      
      inline def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
      
      inline def setInsertHtml(
        value: (/* where */ js.UndefOr[java.lang.String], /* el */ js.UndefOr[Any], /* html */ js.UndefOr[java.lang.String]) => HTMLElement
      ): Self = StObject.set(x, "insertHtml", js.Any.fromFunction3(value))
      
      inline def setInsertHtmlUndefined: Self = StObject.set(x, "insertHtml", js.undefined)
      
      inline def setMarkup(value: /* spec */ js.UndefOr[Any] => java.lang.String): Self = StObject.set(x, "markup", js.Any.fromFunction1(value))
      
      inline def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
      
      inline def setOverwrite(
        value: (/* el */ js.UndefOr[Any], /* o */ js.UndefOr[Any], /* returnElement */ js.UndefOr[Boolean]) => Any
      ): Self = StObject.set(x, "overwrite", js.Any.fromFunction3(value))
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    }
  }
  
  trait IAbstractQuery
    extends StObject
       with IBase {
    
    /** [Method] Returns true if the passed element s match the passed simple selector e g
      * @param el String/HTMLElement/Array An element id, element or array of elements
      * @param selector String The simple selector to test
      * @returns Boolean
      */
    var is: js.UndefOr[
        js.Function2[/* el */ js.UndefOr[Any], /* selector */ js.UndefOr[java.lang.String], Boolean]
      ] = js.undefined
    
    /** [Method] Selects a group of elements
      * @param selector String The selector/xpath query (can be a comma separated list of selectors)
      * @param root HTMLElement/String The start of the query (defaults to document).
      * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
      */
    var select: js.UndefOr[
        js.Function2[/* selector */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[Any], Array]
      ] = js.undefined
    
    /** [Method] Selects a single element
      * @param selector String The selector/xpath query
      * @param root HTMLElement/String The start of the query (defaults to document).
      * @returns HTMLElement The DOM element which matched the selector.
      */
    var selectNode: js.UndefOr[
        js.Function2[/* selector */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[Any], HTMLElement]
      ] = js.undefined
  }
  object IAbstractQuery {
    
    inline def apply(): IAbstractQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstractQuery]
    }
    
    extension [Self <: IAbstractQuery](x: Self) {
      
      inline def setIs(value: (/* el */ js.UndefOr[Any], /* selector */ js.UndefOr[java.lang.String]) => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction2(value))
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setSelect(value: (/* selector */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[Any]) => Array): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      inline def setSelectNode(value: (/* selector */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[Any]) => HTMLElement): Self = StObject.set(x, "selectNode", js.Any.fromFunction2(value))
      
      inline def setSelectNodeUndefined: Self = StObject.set(x, "selectNode", js.undefined)
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    }
  }
  
  type ICompositeElement = typings.extjs.Ext.dom.ICompositeElementLite
  
  trait ICompositeElementLite
    extends StObject
       with IBase {
    
    /** [Method] Adds elements to this Composite object
      * @param els HTMLElement[]/Ext.dom.CompositeElement Either an Array of DOM elements to add, or another Composite object who's elements should be added.
      * @returns Ext.dom.CompositeElement This Composite object.
      */
    var add: js.UndefOr[js.Function1[/* els */ js.UndefOr[Any], typings.extjs.Ext.dom.ICompositeElement]] = js.undefined
    
    /** [Method] Removes all elements from this Composite
      * @param removeDom Boolean True to also remove the elements from the document.
      */
    var clear: js.UndefOr[js.Function1[/* removeDom */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Returns true if this composite contains the passed element
      * @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.Element, or an HtmlElement to find within the composite collection.
      * @returns Boolean
      */
    var contains: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], Boolean]] = js.undefined
    
    /** [Method] Calls the passed function for each element in this composite
      * @param fn Function The function to call.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
      * @returns Ext.dom.CompositeElement this
      */
    var each: js.UndefOr[
        js.Function2[
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          typings.extjs.Ext.dom.ICompositeElement
        ]
      ] = js.undefined
    
    /** [Property] (HTMLElement[]) */
    var elements: js.UndefOr[Array] = js.undefined
    
    /** [Method] Clears this Composite and adds the elements passed
      * @param els HTMLElement[]/Ext.dom.CompositeElement Either an array of DOM elements, or another Composite from which to fill this Composite.
      * @returns Ext.dom.CompositeElement this
      */
    var fill: js.UndefOr[js.Function1[/* els */ js.UndefOr[Any], typings.extjs.Ext.dom.ICompositeElement]] = js.undefined
    
    /** [Method] Filters this composite to only elements that match the passed selector
      * @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
      * @returns Ext.dom.CompositeElement this
      */
    var filter: js.UndefOr[
        js.Function1[/* selector */ js.UndefOr[Any], typings.extjs.Ext.dom.ICompositeElement]
      ] = js.undefined
    
    /** [Method] Returns the first Element
      * @returns Ext.dom.Element
      */
    var first: js.UndefOr[js.Function0[typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Method] Returns the number of elements in this Composite
      * @returns Number
      */
    var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Find the index of the passed element within the composite collection
      * @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
      * @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
      */
    var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], Double]] = js.undefined
    
    /** [Property] (Boolean) */
    var isComposite: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Returns a flyweight Element of the dom element object at the specified index
      * @param index Number
      * @returns Ext.dom.Element
      */
    var item: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Method] Returns the last Element
      * @returns Ext.dom.Element
      */
    var last: js.UndefOr[js.Function0[typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Method] Removes the specified element s
      * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
      * @param removeDom Boolean True to also remove the element from the document.
      * @returns Ext.dom.CompositeElement this
      */
    var removeElement: js.UndefOr[
        js.Function2[
          /* el */ js.UndefOr[Any], 
          /* removeDom */ js.UndefOr[Boolean], 
          typings.extjs.Ext.dom.ICompositeElement
        ]
      ] = js.undefined
    
    /** [Method] Replaces the specified element with the passed element
      * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
      * @param replacement String/Ext.Element The id of an element or the Element itself.
      * @param domReplace Boolean True to remove and replace the element in the document too.
      * @returns Ext.dom.CompositeElement this
      */
    var replaceElement: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[Any], 
          /* replacement */ js.UndefOr[Any], 
          /* domReplace */ js.UndefOr[Boolean], 
          typings.extjs.Ext.dom.ICompositeElement
        ]
      ] = js.undefined
    
    /** [Method] Gets a range nodes
      * @param start Number The index of the first node in the range
      * @param end Number The index of the last node in the range
      * @returns HTMLElement[] An array of nodes
      */
    var slice: js.UndefOr[
        js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
      ] = js.undefined
  }
  object ICompositeElementLite {
    
    inline def apply(): typings.extjs.Ext.dom.ICompositeElementLite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.dom.ICompositeElementLite]
    }
    
    extension [Self <: typings.extjs.Ext.dom.ICompositeElementLite](x: Self) {
      
      inline def setAdd(value: /* els */ js.UndefOr[Any] => typings.extjs.Ext.dom.ICompositeElement): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setClear(value: /* removeDom */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setContains(value: /* el */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setEach(
        value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typings.extjs.Ext.dom.ICompositeElement
      ): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
      
      inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      inline def setElements(value: Array): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setFill(value: /* els */ js.UndefOr[Any] => typings.extjs.Ext.dom.ICompositeElement): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(value: /* selector */ js.UndefOr[Any] => typings.extjs.Ext.dom.ICompositeElement): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFirst(value: () => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
      
      inline def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
      
      inline def setIndexOf(value: /* el */ js.UndefOr[Any] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
      
      inline def setIsComposite(value: Boolean): Self = StObject.set(x, "isComposite", value.asInstanceOf[js.Any])
      
      inline def setIsCompositeUndefined: Self = StObject.set(x, "isComposite", js.undefined)
      
      inline def setItem(value: /* index */ js.UndefOr[Double] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setLast(value: () => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setRemoveElement(
        value: (/* el */ js.UndefOr[Any], /* removeDom */ js.UndefOr[Boolean]) => typings.extjs.Ext.dom.ICompositeElement
      ): Self = StObject.set(x, "removeElement", js.Any.fromFunction2(value))
      
      inline def setRemoveElementUndefined: Self = StObject.set(x, "removeElement", js.undefined)
      
      inline def setReplaceElement(
        value: (/* el */ js.UndefOr[Any], /* replacement */ js.UndefOr[Any], /* domReplace */ js.UndefOr[Boolean]) => typings.extjs.Ext.dom.ICompositeElement
      ): Self = StObject.set(x, "replaceElement", js.Any.fromFunction3(value))
      
      inline def setReplaceElementUndefined: Self = StObject.set(x, "replaceElement", js.undefined)
      
      inline def setSlice(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array): Self = StObject.set(x, "slice", js.Any.fromFunction2(value))
      
      inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
    }
  }
  
  trait IElement
    extends StObject
       with IAbstractElement {
    
    /** [Method] Sets up event handlers to add and remove a css class when the mouse is down and then up on this element a click effe
      * @param className String The class to add
      * @param testFn Function A test function to execute before adding the class. The passed parameter will be the Element instance. If this functions returns false, the class will not be added.
      * @param scope Object The scope to execute the testFn in.
      * @returns Ext.dom.Element this
      */
    var addClsOnClick: js.UndefOr[
        js.Function3[
          /* className */ js.UndefOr[java.lang.String], 
          /* testFn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Sets up event handlers to add and remove a css class when this element has the focus Defined in override Ext dom Ele
      * @param className String The class to add
      * @param testFn Function A test function to execute before adding the class. The passed parameter will be the Element instance. If this functions returns false, the class will not be added.
      * @param scope Object The scope to execute the testFn in.
      * @returns Ext.dom.Element this
      */
    var addClsOnFocus: js.UndefOr[
        js.Function3[
          /* className */ js.UndefOr[java.lang.String], 
          /* testFn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Sets up event handlers to add and remove a css class when the mouse is over this element Defined in override Ext dom
      * @param className String The class to add
      * @param testFn Function A test function to execute before adding the class. The passed parameter will be the Element instance. If this functions returns false, the class will not be added.
      * @param scope Object The scope to execute the testFn in.
      * @returns Ext.dom.Element this
      */
    var addClsOnOver: js.UndefOr[
        js.Function3[
          /* className */ js.UndefOr[java.lang.String], 
          /* testFn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Convenience method for constructing a KeyMap
      * @param key String/Number/Number[]/Object Either a string with the keys to listen for, the numeric key code, array of key codes or an object with the following options:
      * @param fn Function The function to call
      * @param scope Object The scope (this reference) in which the specified function is executed. Defaults to this Element.
      * @returns Ext.util.KeyMap The KeyMap created
      */
    var addKeyListener: js.UndefOr[
        js.Function3[
          /* key */ js.UndefOr[Any], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          typings.extjs.Ext.util.IKeyMap
        ]
      ] = js.undefined
    
    /** [Method] Creates a KeyMap for this element
      * @param config Object The KeyMap config. See Ext.util.KeyMap for more details
      * @returns Ext.util.KeyMap The KeyMap created
      */
    var addKeyMap: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], typings.extjs.Ext.util.IKeyMap]] = js.undefined
    
    /** [Method] Shorthand for on
      * @param eventName String The name of event to handle.
      * @param fn Function The handler function the event invokes. This function is passed the following parameters: evt : EventObject The EventObject describing the event. el : HtmlElement The DOM element which was the target of the event. Note that this may be filtered by using the delegate option. o : Object The options object from the call that setup the listener.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to this Element.
      * @param options Object An object containing handler configuration properties. This may contain any of the following properties: scope Object : The scope (this reference) in which the handler function is executed. If omitted, defaults to this Element. delegate String: A simple selector to filter the target or look for a descendant of the target. See below for additional details. stopEvent Boolean: True to stop the event. That is stop propagation, and prevent the default action. preventDefault Boolean: True to prevent the default action stopPropagation Boolean: True to prevent event propagation normalized Boolean: False to pass a browser event to the handler function instead of an Ext.EventObject target Ext.dom.Element: Only call the handler if the event was fired on the target Element, not if the event was bubbled up from a child node. delay Number: The number of milliseconds to delay the invocation of the handler after the event fires. single Boolean: True to add a handler to handle just the next firing of the event, and then remove itself. buffer Number: Causes the handler to be scheduled to run in an Ext.util.DelayedTask delayed by the specified number of milliseconds. If the event fires again within that time, the original handler is not invoked, but the new handler is scheduled in its place. Combining Options  Using the options argument, it is possible to combine different types of listeners:  A delayed, one-time listener that auto stops the event and adds a custom argument (forumId) to the options object. The options object is available as the third parameter in the handler function.  Code:  el.on('click', this.onClick, this, {  single: true,  delay: 100,  stopEvent : true,  forumId: 4 }); Attaching multiple handlers in 1 call  The method also allows for a single argument to be passed which is a config object containing properties which specify multiple handlers.  Code:  el.on({  'click' : {  fn: this.onClick,  scope: this,  delay: 100  },  'mouseover' : {  fn: this.onMouseOver,  scope: this  },  'mouseout' : {  fn: this.onMouseOut,  scope: this  } }); Or a shorthand syntax:  Code:  el.on({  'click' : this.onClick,  'mouseover' : this.onMouseOver,  'mouseout' : this.onMouseOut,  scope: this }); delegate  This is a configuration option that you can pass along when registering a handler for an event to assist with event delegation. Event delegation is a technique that is used to reduce memory consumption and prevent exposure to memory-leaks. By registering an event for a container element as opposed to each element within a container. By setting this configuration option to a simple selector, the target element will be filtered to look for a descendant of the target. For example:  // using this markup: &lt;div id='elId'&gt;  &lt;p id='p1'&gt;paragraph one&lt;/p&gt;  &lt;p id='p2' class='clickable'&gt;paragraph two&lt;/p&gt;  &lt;p id='p3'&gt;paragraph three&lt;/p&gt; &lt;/div&gt; // utilize event delegation to registering just one handler on the container element: el = Ext.get('elId'); el.on(  'click',  function(e,t) {  // handle click  console.info(t.id); // 'p2'  },  this,  {  // filter the target element to be a descendant with the class 'clickable'  delegate: '.clickable'  } );
      * @returns Ext.dom.Element this
      */
    var addListener: js.UndefOr[
        js.Function4[
          /* eventName */ js.UndefOr[java.lang.String], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Performs custom animation on this Element
      * @param config Object Configuration for Ext.fx.Anim. Note that the to config is required.
      * @returns Ext.dom.Element this
      */
    var animate: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Property] (Boolean) */
    var autoBoxAdjust: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Tries to blur the element
      * @returns Ext.dom.Element this
      */
    var blur: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Wraps the specified element with a special 9 element markup CSS block that renders by default as a gray container wit
      * @param class String A base CSS class to apply to the containing wrapper element. Note that there are a number of CSS rules that are dependent on this name to make the overall effect work, so if you supply an alternate base class, make sure you also supply all of the necessary rules.
      * @returns Ext.dom.Element The outermost wrapping element of the created box structure.
      */
    var boxWrap: js.UndefOr[js.Function1[/* clazz */ js.UndefOr[java.lang.String], this.type]] = js.undefined
    
    /** [Method] When an element is moved around in the DOM or is hidden using display none it loses layout and therefore all scrol
      * @returns Function A function which will restore all descentant elements of this Element to their scroll positions recorded when this function was executed. Be aware that the returned function is a closure which has captured the scope of cacheScrollValues, so take care to derefence it as soon as not needed - if is it is a var it will drop out of scope, and the reference will be freed.
      */
    var cacheScrollValues: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Centers the Element in either the viewport or another Element
      * @param centerIn String/HTMLElement/Ext.dom.Element element in which to center the element.
      */
    var center: js.UndefOr[js.Function1[/* centerIn */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Removes Empty or whitespace filled text nodes
      * @param forceReclean Boolean By default the element keeps track if it has been cleaned already so you can call this over and over. However, if you update the element and need to force a reclean, you can pass true.
      */
    var clean: js.UndefOr[js.Function1[/* forceReclean */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Alias for removeAllListeners
      * @returns Ext.dom.Element this
      */
    var clearListeners: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Clears any opacity settings from this element
      * @returns Ext.dom.Element this
      */
    var clearOpacity: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Clears positioning back to the default when the document was loaded
      * @param value String The value to use for the left, right, top, bottom. You could use 'auto'.
      * @returns Ext.dom.Element this
      */
    var clearPositioning: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], this.type]] = js.undefined
    
    /** [Method] Store the current overflow setting and clip overflow on the element  use unclip to remove Defined in override Ext d
      * @returns Ext.dom.Element this
      */
    var clip: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Creates a proxy element of this element
      * @param config String/Object The class name of the proxy element or a DomHelper config object
      * @param renderTo String/HTMLElement The element or element id to render the proxy to. Defaults to: document.body.
      * @param matchBox Boolean True to align and size the proxy to this element now.
      * @returns Ext.dom.Element The new proxy element
      */
    var createProxy: js.UndefOr[
        js.Function3[
          /* config */ js.UndefOr[Any], 
          /* renderTo */ js.UndefOr[Any], 
          /* matchBox */ js.UndefOr[Boolean], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Creates an iframe shim for this element to keep selects and other windowed objects from showing through
      * @returns Ext.dom.Element The new shim element
      */
    var createShim: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Convenience method for setVisibilityMode Element DISPLAY
      * @param display String What to set display to when visible
      * @returns Ext.dom.Element this
      */
    var enableDisplayMode: js.UndefOr[js.Function1[/* display */ js.UndefOr[java.lang.String], this.type]] = js.undefined
    
    /** [Method] Fade an element in from transparent to opaque
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.Element The Element
      */
    var fadeIn: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Fade an element out from opaque to transparent
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.Element The Element
      */
    var fadeOut: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Tries to focus the element
      * @param defer Number Milliseconds to defer the focus
      * @returns Ext.dom.Element this
      */
    var focus: js.UndefOr[js.Function1[/* defer */ js.UndefOr[Double], this.type]] = js.undefined
    
    /** [Method] Alias for isFocusable
      * @returns Boolean True if the element is focusable
      */
    var focusable: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Shows a ripple of exploding attenuating borders to draw attention to an Element
      * @param color String The hex color value for the border.
      * @param count Number The number of ripples to display.
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.dom.Element The Element
      */
    var frame: js.UndefOr[
        js.Function3[
          /* color */ js.UndefOr[java.lang.String], 
          /* count */ js.UndefOr[Double], 
          /* options */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Returns the value of a namespaced attribute from the element s underlying DOM node
      * @param namespace String The namespace in which to look for the attribute
      * @param name String The attribute name
      * @returns String The attribute value
      */
    var getAttributeNS: js.UndefOr[
        js.Function2[
          /* namespace */ js.UndefOr[java.lang.String], 
          /* name */ js.UndefOr[java.lang.String], 
          java.lang.String
        ]
      ] = js.undefined
    
    /** [Method] Gets the bottom Y coordinate of the element element Y position  element height  Defined in override Ext dom Elemen
      * @param local Boolean True to get the local css position instead of page coordinate
      * @returns Number
      */
    var getBottom: js.UndefOr[js.Function1[/* local */ js.UndefOr[Boolean], Double]] = js.undefined
    
    /** [Method] Calculates the x y to center this element on the screen Defined in override Ext dom Element_position
      * @returns Number[] The x, y values [x, y]
      */
    var getCenterXY: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Return the CSS color for the specified CSS attribute
      * @param attr String The css attribute
      * @param defaultValue String The default value to use when a valid color isn't found
      * @param prefix String defaults to #. Use an empty string when working with color anims.
      */
    var getColor: js.UndefOr[
        js.Function3[
          /* attr */ js.UndefOr[java.lang.String], 
          /* defaultValue */ js.UndefOr[java.lang.String], 
          /* prefix */ js.UndefOr[java.lang.String], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Returns either the offsetHeight or the height of this element based on CSS height adjusted by padding or borders when
      * @returns Number
      */
    var getComputedHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns either the offsetWidth or the width of this element based on CSS width adjusted by padding or borders when ne
      * @returns Number
      */
    var getComputedWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the sum width of the padding and borders for the passed sides
      * @param sides String
      * @returns Number
      */
    var getFrameWidth: js.UndefOr[js.Function1[/* sides */ js.UndefOr[java.lang.String], Double]] = js.undefined
    
    /** [Method] Gets the left X coordinate Defined in override Ext dom Element_position
      * @param local Boolean True to get the local css position instead of page coordinate
      * @returns Number
      */
    var getLeft: js.UndefOr[js.Function1[/* local */ js.UndefOr[Boolean], Double]] = js.undefined
    
    /** [Method] Gets this element s ElementLoader
      * @returns Ext.ElementLoader The loader
      */
    var getLoader: js.UndefOr[js.Function0[IElementLoader]] = js.undefined
    
    /** [Method] Gets the local CSS X position for the element Defined in override Ext dom Element_position
      * @returns Number
      */
    var getLocalX: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Gets the local CSS X and Y position for the element Defined in override Ext dom Element_position
      * @returns Array [x, y]
      */
    var getLocalXY: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Gets the local CSS Y position for the element Defined in override Ext dom Element_position
      * @returns Number
      */
    var getLocalY: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns an object defining the area of this Element which can be passed to Ext util Positionable setBox to set anothe
      * @param asRegion Boolean If true an Ext.util.Region will be returned
      * @returns Object/Ext.util.Region box An object in the following format: {  left: &lt;Element's X position&gt;,  top: &lt;Element's Y position&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. So the result may also be used for setXY
      */
    var getPageBox: js.UndefOr[js.Function1[/* asRegion */ js.UndefOr[Boolean], Any]] = js.undefined
    
    /** [Method] Gets an object with all CSS positioning properties
      * @param autoPx Boolean true to return pixel values for "auto" styles.
      * @returns Object
      */
    var getPositioning: js.UndefOr[js.Function1[/* autoPx */ js.UndefOr[Boolean], Any]] = js.undefined
    
    /** [Method] Gets the right X coordinate of the element element X position  element width  Defined in override Ext dom Element_
      * @param local Boolean True to get the local css position instead of page coordinates
      * @returns Number
      */
    var getRight: js.UndefOr[js.Function1[/* local */ js.UndefOr[Boolean], Double]] = js.undefined
    
    /** [Method] Returns the current scroll position of the element
      * @returns Object An object containing the scroll position in the format {left: (scrollLeft), top: (scrollTop)}
      */
    var getScroll: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Gets the left scroll position Defined in override Ext dom Element_scroll
      * @returns Number The left scroll position
      */
    var getScrollLeft: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Gets the top scroll position Defined in override Ext dom Element_scroll
      * @returns Number The top scroll position
      */
    var getScrollTop: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the dimensions of the element available to lay content out in
      * @returns Object Object describing width and height.
      */
    var getStyleSize: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the width in pixels of the passed text or the width of the text in this Element
      * @param text String The text to measure. Defaults to the innerHTML of the element.
      * @param min Number The minumum value to return.
      * @param max Number The maximum value to return.
      * @returns Number The text width in pixels.
      */
    var getTextWidth: js.UndefOr[
        js.Function3[
          /* text */ js.UndefOr[java.lang.String], 
          /* min */ js.UndefOr[Double], 
          /* max */ js.UndefOr[Double], 
          Double
        ]
      ] = js.undefined
    
    /** [Method] Gets the top Y coordinate Defined in override Ext dom Element_position
      * @param local Boolean True to get the local css position instead of page coordinates
      * @returns Number
      */
    var getTop: js.UndefOr[js.Function1[/* local */ js.UndefOr[Boolean], Double]] = js.undefined
    
    /** [Method] Gets element X position in page coordinates Defined in override Ext dom Element_position
      * @returns Number
      */
    var getX: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Gets element X and Y positions in page coordinates Defined in override Ext dom Element_position
      * @returns Array [x, y]
      */
    var getXY: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Gets element Y position in page coordinates Defined in override Ext dom Element_position
      * @returns Number
      */
    var getY: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Slides the element while fading it out of view
      * @param anchor String One of the valid Ext.fx.Anim anchor positions (defaults to bottom: 'b')
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.dom.Element The Element
      */
    var ghost: js.UndefOr[
        js.Function2[/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any], this.type]
      ] = js.undefined
    
    /** [Method] Hide this element  Uses display mode to determine whether to use display or visibility
      * @param animate Boolean/Object true for the default animation or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    @JSName("hide")
    var hide_IElement: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Highlights the Element by setting a color applies to the background color by default but can be changed using the
      * @param color String The highlight color. Should be a 6 char hex color without the leading # (defaults to yellow: 'ffff9c')
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.dom.Element The Element
      */
    var highlight: js.UndefOr[
        js.Function2[/* color */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any], this.type]
      ] = js.undefined
    
    /** [Method] Sets up event handlers to call the passed functions when the mouse is moved into and out of the Element
      * @param overFn Function The function to call when the mouse enters the Element.
      * @param outFn Function The function to call when the mouse leaves the Element.
      * @param scope Object The scope (this reference) in which the functions are executed. Defaults to the Element's DOM element.
      * @param options Object Options for the listener. See the options parameter.
      * @returns Ext.dom.Element this
      */
    var hover: js.UndefOr[
        js.Function4[
          /* overFn */ js.UndefOr[Any], 
          /* outFn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Initializes a Ext dd DD drag drop object for this element
      * @param group String The group the DD object is member of
      * @param config Object The DD config object
      * @param overrides Object An object containing methods to override/implement on the DD object
      * @returns Ext.dd.DD The DD object
      */
    var initDD: js.UndefOr[
        js.Function3[
          /* group */ js.UndefOr[java.lang.String], 
          /* config */ js.UndefOr[Any], 
          /* overrides */ js.UndefOr[Any], 
          IDD
        ]
      ] = js.undefined
    
    /** [Method] Initializes a Ext dd DDProxy object for this element
      * @param group String The group the DDProxy object is member of
      * @param config Object The DDProxy config object
      * @param overrides Object An object containing methods to override/implement on the DDProxy object
      * @returns Ext.dd.DDProxy The DDProxy object
      */
    var initDDProxy: js.UndefOr[
        js.Function3[
          /* group */ js.UndefOr[java.lang.String], 
          /* config */ js.UndefOr[Any], 
          /* overrides */ js.UndefOr[Any], 
          IDDProxy
        ]
      ] = js.undefined
    
    /** [Method] Initializes a Ext dd DDTarget object for this element
      * @param group String The group the DDTarget object is member of
      * @param config Object The DDTarget config object
      * @param overrides Object An object containing methods to override/implement on the DDTarget object
      * @returns Ext.dd.DDTarget The DDTarget object
      */
    var initDDTarget: js.UndefOr[
        js.Function3[
          /* group */ js.UndefOr[java.lang.String], 
          /* config */ js.UndefOr[Any], 
          /* overrides */ js.UndefOr[Any], 
          IDDTarget
        ]
      ] = js.undefined
    
    /** [Method] Tests various css rules browsers to determine if this element uses a border box
      * @returns Boolean
      */
    var isBorderBox: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns true if display is not none
      * @returns Boolean
      */
    var isDisplayed: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Checks whether this element can be focused
      * @param asFocusEl Object
      * @returns Boolean True if the element is focusable
      */
    var isFocusable: js.UndefOr[js.Function1[/* asFocusEl */ js.UndefOr[Any], Boolean]] = js.undefined
    
    /** [Method] Returns true if this element is masked
      * @returns Boolean
      */
    var isMasked: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns true if this element is scrollable
      * @returns Boolean
      */
    var isScrollable: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Checks whether the element is currently visible using both visibility and display properties
      * @param deep Boolean True to walk the dom and see if parent elements are hidden. If false, the function only checks the visibility of the element itself and it may return true even though a parent is not visible.
      * @returns Boolean true if the element is currently visible, else false
      */
    var isVisible: js.UndefOr[js.Function1[/* deep */ js.UndefOr[Boolean], Boolean]] = js.undefined
    
    /** [Method] Direct access to the Ext ElementLoader Ext ElementLoader load method
      * @param options Object
      * @returns Ext.dom.Element this
      */
    var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Puts a mask over this element to disable user interaction
      * @param msg String A message to display in the mask
      * @param msgCls String A css class to apply to the msg element
      * @returns Ext.dom.Element The mask element
      */
    @JSName("mask")
    var mask_IElement: js.UndefOr[
        js.Function2[
          /* msg */ js.UndefOr[java.lang.String], 
          /* msgCls */ js.UndefOr[java.lang.String], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Monitors this Element for the mouse leaving
      * @param delay Number The delay in milliseconds to wait for possible mouse re-entry before calling the handler function.
      * @param handler Function The function to call if the mouse remains outside of this Element for the specified time.
      * @param scope Object The scope (this reference) in which the handler function executes. Defaults to this Element.
      * @returns Object The listeners object which was added to this element so that monitoring can be stopped. Example usage: // Hide the menu if the mouse moves out for 250ms or more this.mouseLeaveMonitor = this.menuEl.monitorMouseLeave(250, this.hideMenu, this); ... // Remove mouseleave monitor on menu destroy this.menuEl.un(this.mouseLeaveMonitor);
      */
    var monitorMouseLeave: js.UndefOr[
        js.Function3[
          /* delay */ js.UndefOr[Double], 
          /* handler */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Sets the position of the element in page coordinates
      * @param x Number X value for new position (coordinates are page-based)
      * @param y Number Y value for new position (coordinates are page-based)
      * @param animate Boolean/Object True for the default animation, or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    var moveTo: js.UndefOr[
        js.Function3[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* animate */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Returns true if this element needs an explicit tabIndex to make it focusable  */
    var needsTabIndex: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Appends an event handler to this element
      * @param eventName String The name of event to handle.
      * @param fn Function The handler function the event invokes. This function is passed the following parameters: evt : EventObject The EventObject describing the event. el : HtmlElement The DOM element which was the target of the event. Note that this may be filtered by using the delegate option. o : Object The options object from the call that setup the listener.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to this Element.
      * @param options Object An object containing handler configuration properties. This may contain any of the following properties: scope Object : The scope (this reference) in which the handler function is executed. If omitted, defaults to this Element. delegate String: A simple selector to filter the target or look for a descendant of the target. See below for additional details. stopEvent Boolean: True to stop the event. That is stop propagation, and prevent the default action. preventDefault Boolean: True to prevent the default action stopPropagation Boolean: True to prevent event propagation normalized Boolean: False to pass a browser event to the handler function instead of an Ext.EventObject target Ext.dom.Element: Only call the handler if the event was fired on the target Element, not if the event was bubbled up from a child node. delay Number: The number of milliseconds to delay the invocation of the handler after the event fires. single Boolean: True to add a handler to handle just the next firing of the event, and then remove itself. buffer Number: Causes the handler to be scheduled to run in an Ext.util.DelayedTask delayed by the specified number of milliseconds. If the event fires again within that time, the original handler is not invoked, but the new handler is scheduled in its place. Combining Options  Using the options argument, it is possible to combine different types of listeners:  A delayed, one-time listener that auto stops the event and adds a custom argument (forumId) to the options object. The options object is available as the third parameter in the handler function.  Code:  el.on('click', this.onClick, this, {  single: true,  delay: 100,  stopEvent : true,  forumId: 4 }); Attaching multiple handlers in 1 call  The method also allows for a single argument to be passed which is a config object containing properties which specify multiple handlers.  Code:  el.on({  'click' : {  fn: this.onClick,  scope: this,  delay: 100  },  'mouseover' : {  fn: this.onMouseOver,  scope: this  },  'mouseout' : {  fn: this.onMouseOut,  scope: this  } }); Or a shorthand syntax:  Code:  el.on({  'click' : this.onClick,  'mouseover' : this.onMouseOver,  'mouseout' : this.onMouseOut,  scope: this }); delegate  This is a configuration option that you can pass along when registering a handler for an event to assist with event delegation. Event delegation is a technique that is used to reduce memory consumption and prevent exposure to memory-leaks. By registering an event for a container element as opposed to each element within a container. By setting this configuration option to a simple selector, the target element will be filtered to look for a descendant of the target. For example:  // using this markup: &lt;div id='elId'&gt;  &lt;p id='p1'&gt;paragraph one&lt;/p&gt;  &lt;p id='p2' class='clickable'&gt;paragraph two&lt;/p&gt;  &lt;p id='p3'&gt;paragraph three&lt;/p&gt; &lt;/div&gt; // utilize event delegation to registering just one handler on the container element: el = Ext.get('elId'); el.on(  'click',  function(e,t) {  // handle click  console.info(t.id); // 'p2'  },  this,  {  // filter the target element to be a descendant with the class 'clickable'  delegate: '.clickable'  } );
      * @returns Ext.dom.Element this
      */
    var on: js.UndefOr[
        js.Function4[
          /* eventName */ js.UndefOr[java.lang.String], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Property] (String) */
    var originalDisplay: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Creates a pause before any subsequent queued effects begin
      * @param seconds Number The length of time to pause (in seconds)
      * @returns Ext.Element The Element
      */
    var pause: js.UndefOr[js.Function1[/* seconds */ js.UndefOr[Double], this.type]] = js.undefined
    
    /** [Method] Initializes positioning on this element
      * @param pos String Positioning to use "relative", "absolute" or "fixed"
      * @param zIndex Number The zIndex to apply
      * @param x Number Set the page X position
      * @param y Number Set the page Y position
      */
    var position: js.UndefOr[
        js.Function4[
          /* pos */ js.UndefOr[java.lang.String], 
          /* zIndex */ js.UndefOr[Double], 
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Fades the element out while slowly expanding it in all directions
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.dom.Element The Element
      */
    var puff: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Recursively removes all previous added listeners from this element and its children
      * @returns Ext.dom.Element this
      */
    var purgeAllListeners: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Create an event handler on this element such that when the event fires and is handled by this element it will be rel
      * @param eventName String The type of event to relay
      * @param observable Object Any object that extends Ext.util.Observable that will provide the context for firing the relayed event
      */
    var relayEvent: js.UndefOr[
        js.Function2[/* eventName */ js.UndefOr[java.lang.String], /* observable */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Method] Removes all previous added listeners from this element
      * @returns Ext.dom.Element this
      */
    var removeAllListeners: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Shorthand for un
      * @param eventName String The name of the event from which to remove the handler.
      * @param fn Function The handler function to remove. This must be a reference to the function passed into the on call.
      * @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
      * @returns Ext.dom.Element this
      */
    var removeListener: js.UndefOr[
        js.Function3[
          /* eventName */ js.UndefOr[java.lang.String], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Animates the transition of an element s dimensions from a starting height width to an ending height width
      * @param width Number The new width (pass undefined to keep the original width)
      * @param height Number The new height (pass undefined to keep the original height)
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.Element The Element
      */
    var scale: js.UndefOr[
        js.Function3[
          /* width */ js.UndefOr[Double], 
          /* height */ js.UndefOr[Double], 
          /* options */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Scrolls this element the specified direction
      * @param direction String Possible values are:  "l" (or "left") "r" (or "right") "t" (or "top", or "up") "b" (or "bottom", or "down")
      * @param distance Number How far to scroll the element in pixels
      * @param animate Boolean/Object true for the default animation or a standard Element animation config object
      * @returns Boolean Returns true if a scroll was triggered or false if the element was scrolled as far as it could go.
      */
    var scroll: js.UndefOr[
        js.Function3[
          /* direction */ js.UndefOr[java.lang.String], 
          /* distance */ js.UndefOr[Double], 
          /* animate */ js.UndefOr[Any], 
          Boolean
        ]
      ] = js.undefined
    
    /** [Method] Scrolls this element by the passed delta values optionally animating
      * @param deltaX Number/Number[]/Object Either the x delta, an Array specifying x and y deltas or an object with "x" and "y" properties.
      * @param deltaY Number/Boolean/Object Either the y delta, or an animate flag or config object.
      * @param animate Boolean/Object Animate flag/config object if the delta values were passed separately.
      * @returns Ext.Element this
      */
    var scrollBy: js.UndefOr[
        js.Function3[
          /* deltaX */ js.UndefOr[Any], 
          /* deltaY */ js.UndefOr[Any], 
          /* animate */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Scrolls this element into view within the passed container
      * @param container String/HTMLElement/Ext.Element The container element to scroll. Should be a string (id), dom node, or Ext.Element.
      * @param hscroll Boolean False to disable horizontal scroll.
      * @param animate Boolean/Object true for the default animation or a standard Element
      * @param highlight Boolean true to highlight the element when it is in view. animation config object
      * @returns Ext.dom.Element this
      */
    var scrollIntoView: js.UndefOr[
        js.Function4[
          /* container */ js.UndefOr[Any], 
          /* hscroll */ js.UndefOr[Boolean], 
          /* animate */ js.UndefOr[Any], 
          /* highlight */ js.UndefOr[Boolean], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Scrolls this element the specified scroll point
      * @param side String Either "left" for scrollLeft values or "top" for scrollTop values.
      * @param value Number The new scroll value
      * @param animate Boolean/Object true for the default animation or a standard Element animation config object
      * @returns Ext.Element this
      */
    var scrollTo: js.UndefOr[
        js.Function3[
          /* side */ js.UndefOr[java.lang.String], 
          /* value */ js.UndefOr[Double], 
          /* animate */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Enable text selection for this element normalized across browsers  Defined in override Ext dom Element_style
      * @returns Ext.Element this
      */
    var selectable: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Sets the element s CSS bottom style
      * @param bottom Number/String Number of pixels or CSS string value to set as the bottom CSS property value
      * @returns Ext.dom.Element this
      */
    var setBottom: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the element s position and size in one shot
      * @param x Number X value for new position (coordinates are page-based)
      * @param y Number Y value for new position (coordinates are page-based)
      * @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels) A String used to set the CSS width style. Animation may not be used.
      * @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels) A String used to set the CSS height style. Animation may not be used.
      * @param animate Boolean/Object true for the default animation or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    var setBounds: js.UndefOr[
        js.Function5[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* width */ js.UndefOr[Any], 
          /* height */ js.UndefOr[Any], 
          /* animate */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Sets the CSS display property
      * @param value Boolean/String Boolean value to display the element using its default display, or a string to set the display directly.
      * @returns Ext.dom.Element this
      */
    var setDisplayed: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the element s left position directly using CSS style instead of setX
      * @param left Number/String Number of pixels or CSS string value to set as the left CSS property value
      * @returns Ext.dom.Element this
      */
    var setLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the element s left and top positions directly using CSS style Defined in override Ext dom Element_position
      * @param left Number/String Number of pixels or CSS string value to set as the left CSS property value
      * @param top Number/String Number of pixels or CSS string value to set as the top CSS property value
      * @returns Ext.dom.Element this
      */
    var setLeftTop: js.UndefOr[js.Function2[/* left */ js.UndefOr[Any], /* top */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the position of the element in page coordinates
      * @param x Number X value for new position
      * @param y Number Y value for new position
      * @param animate Boolean/Object True for the default animation, or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    var setLocation: js.UndefOr[
        js.Function3[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* animate */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Set the opacity of the element Defined in override Ext dom Element_style
      * @param opacity Number The new opacity. 0 = transparent, .5 = 50% visibile, 1 = fully visible, etc
      * @param animate Boolean/Object a standard Element animation config object or true for the default animation ({duration: 350, easing: 'easeIn'})
      * @returns Ext.dom.Element this
      */
    var setOpacity: js.UndefOr[
        js.Function2[/* opacity */ js.UndefOr[Double], /* animate */ js.UndefOr[Any], this.type]
      ] = js.undefined
    
    /** [Method] Set positioning with an object returned by getPositioning
      * @param posCfg Object
      * @returns Ext.dom.Element this
      */
    var setPositioning: js.UndefOr[js.Function1[/* posCfg */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the element s CSS right style
      * @param right Number/String Number of pixels or CSS string value to set as the right CSS property value
      * @returns Ext.dom.Element this
      */
    var setRight: js.UndefOr[js.Function1[/* right */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the left scroll position Defined in override Ext dom Element_scroll
      * @param left Number The left scroll position
      * @returns Ext.dom.Element this
      */
    var setScrollLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[Double], this.type]] = js.undefined
    
    /** [Method] Sets the top scroll position Defined in override Ext dom Element_scroll
      * @param top Number The top scroll position
      * @returns Ext.dom.Element this
      */
    var setScrollTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[Double], this.type]] = js.undefined
    
    /** [Method] Sets the element s top position directly using CSS style instead of setY
      * @param top Number/String Number of pixels or CSS string value to set as the top CSS property value
      * @returns Ext.dom.Element this
      */
    var setTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the visibility of the element see details
      * @param visible Boolean Whether the element is visible
      * @param animate Boolean/Object True for the default animation, or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    @JSName("setVisible")
    var setVisible_IElement: js.UndefOr[
        js.Function2[/* visible */ js.UndefOr[Boolean], /* animate */ js.UndefOr[Any], this.type]
      ] = js.undefined
    
    /** [Method] Animates the transition of any combination of an element s dimensions xy position and or opacity
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.Element The Element
      */
    var shift: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Show this element  Uses display mode to determine whether to use display or visibility
      * @param animate Boolean/Object true for the default animation or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    @JSName("show")
    var show_IElement: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Slides the element into view
      * @param anchor String One of the valid Ext.fx.Anim anchor positions (defaults to top: 't')
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.dom.Element The Element
      */
    var slideIn: js.UndefOr[
        js.Function2[/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any], this.type]
      ] = js.undefined
    
    /** [Method] Slides the element out of view
      * @param anchor String One of the valid Ext.fx.Anim anchor positions (defaults to top: 't')
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.dom.Element The Element
      */
    var slideOut: js.UndefOr[
        js.Function2[/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any], this.type]
      ] = js.undefined
    
    /** [Method] Stops the specified event s from bubbling and optionally prevents the default action
      * @param eventName String/String[] an event / array of events to stop from bubbling
      * @param preventDefault Boolean true to prevent the default action too
      * @returns Ext.dom.Element this
      */
    var swallowEvent: js.UndefOr[
        js.Function2[/* eventName */ js.UndefOr[Any], /* preventDefault */ js.UndefOr[Boolean], this.type]
      ] = js.undefined
    
    /** [Method] Blinks the element as if it was clicked and then collapses on its center similar to switching off a television
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.dom.Element The Element
      */
    var switchOff: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Toggles the element s visibility or display depending on visibility mode
      * @param animate Boolean/Object True for the default animation, or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    var toggle: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Removes an event handler from this element
      * @param eventName String The name of the event from which to remove the handler.
      * @param fn Function The handler function to remove. This must be a reference to the function passed into the on call.
      * @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
      * @returns Ext.dom.Element this
      */
    var un: js.UndefOr[
        js.Function3[
          /* eventName */ js.UndefOr[java.lang.String], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Return clipping overflow to original clipping before clip was called Defined in override Ext dom Element_style
      * @returns Ext.dom.Element this
      */
    var unclip: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Disables text selection for this element normalized across browsers  Defined in override Ext dom Element_style
      * @returns Ext.dom.Element this
      */
    var unselectable: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Updates the innerHTML of this element optionally searching for and processing scripts
      * @param html String The new HTML
      * @param loadScripts Boolean True to look for and process scripts (defaults to false)
      * @param callback Function For async script loading you can be notified when the update completes
      * @returns Ext.dom.Element this
      */
    @JSName("update")
    var update_IElement: js.UndefOr[
        js.Function3[
          /* html */ js.UndefOr[java.lang.String], 
          /* loadScripts */ js.UndefOr[Boolean], 
          /* callback */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
  }
  object IElement {
    
    inline def apply(): typings.extjs.Ext.dom.IElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.dom.IElement]
    }
    
    extension [Self <: typings.extjs.Ext.dom.IElement](x: Self) {
      
      inline def setAddClsOnClick(
        value: (/* className */ js.UndefOr[java.lang.String], /* testFn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "addClsOnClick", js.Any.fromFunction3(value))
      
      inline def setAddClsOnClickUndefined: Self = StObject.set(x, "addClsOnClick", js.undefined)
      
      inline def setAddClsOnFocus(
        value: (/* className */ js.UndefOr[java.lang.String], /* testFn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "addClsOnFocus", js.Any.fromFunction3(value))
      
      inline def setAddClsOnFocusUndefined: Self = StObject.set(x, "addClsOnFocus", js.undefined)
      
      inline def setAddClsOnOver(
        value: (/* className */ js.UndefOr[java.lang.String], /* testFn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "addClsOnOver", js.Any.fromFunction3(value))
      
      inline def setAddClsOnOverUndefined: Self = StObject.set(x, "addClsOnOver", js.undefined)
      
      inline def setAddKeyListener(
        value: (/* key */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typings.extjs.Ext.util.IKeyMap
      ): Self = StObject.set(x, "addKeyListener", js.Any.fromFunction3(value))
      
      inline def setAddKeyListenerUndefined: Self = StObject.set(x, "addKeyListener", js.undefined)
      
      inline def setAddKeyMap(value: /* config */ js.UndefOr[Any] => typings.extjs.Ext.util.IKeyMap): Self = StObject.set(x, "addKeyMap", js.Any.fromFunction1(value))
      
      inline def setAddKeyMapUndefined: Self = StObject.set(x, "addKeyMap", js.undefined)
      
      inline def setAddListener(
        value: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "addListener", js.Any.fromFunction4(value))
      
      inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
      
      inline def setAnimate(value: /* config */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "animate", js.Any.fromFunction1(value))
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAutoBoxAdjust(value: Boolean): Self = StObject.set(x, "autoBoxAdjust", value.asInstanceOf[js.Any])
      
      inline def setAutoBoxAdjustUndefined: Self = StObject.set(x, "autoBoxAdjust", js.undefined)
      
      inline def setBlur(value: () => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setBoxWrap(value: /* clazz */ js.UndefOr[java.lang.String] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "boxWrap", js.Any.fromFunction1(value))
      
      inline def setBoxWrapUndefined: Self = StObject.set(x, "boxWrap", js.undefined)
      
      inline def setCacheScrollValues(value: () => Any): Self = StObject.set(x, "cacheScrollValues", js.Any.fromFunction0(value))
      
      inline def setCacheScrollValuesUndefined: Self = StObject.set(x, "cacheScrollValues", js.undefined)
      
      inline def setCenter(value: /* centerIn */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "center", js.Any.fromFunction1(value))
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setClean(value: /* forceReclean */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "clean", js.Any.fromFunction1(value))
      
      inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      inline def setClearListeners(value: () => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "clearListeners", js.Any.fromFunction0(value))
      
      inline def setClearListenersUndefined: Self = StObject.set(x, "clearListeners", js.undefined)
      
      inline def setClearOpacity(value: () => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "clearOpacity", js.Any.fromFunction0(value))
      
      inline def setClearOpacityUndefined: Self = StObject.set(x, "clearOpacity", js.undefined)
      
      inline def setClearPositioning(value: /* value */ js.UndefOr[java.lang.String] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "clearPositioning", js.Any.fromFunction1(value))
      
      inline def setClearPositioningUndefined: Self = StObject.set(x, "clearPositioning", js.undefined)
      
      inline def setClip(value: () => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "clip", js.Any.fromFunction0(value))
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setCreateProxy(
        value: (/* config */ js.UndefOr[Any], /* renderTo */ js.UndefOr[Any], /* matchBox */ js.UndefOr[Boolean]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "createProxy", js.Any.fromFunction3(value))
      
      inline def setCreateProxyUndefined: Self = StObject.set(x, "createProxy", js.undefined)
      
      inline def setCreateShim(value: () => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "createShim", js.Any.fromFunction0(value))
      
      inline def setCreateShimUndefined: Self = StObject.set(x, "createShim", js.undefined)
      
      inline def setEnableDisplayMode(value: /* display */ js.UndefOr[java.lang.String] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "enableDisplayMode", js.Any.fromFunction1(value))
      
      inline def setEnableDisplayModeUndefined: Self = StObject.set(x, "enableDisplayMode", js.undefined)
      
      inline def setFadeIn(value: /* options */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "fadeIn", js.Any.fromFunction1(value))
      
      inline def setFadeInUndefined: Self = StObject.set(x, "fadeIn", js.undefined)
      
      inline def setFadeOut(value: /* options */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "fadeOut", js.Any.fromFunction1(value))
      
      inline def setFadeOutUndefined: Self = StObject.set(x, "fadeOut", js.undefined)
      
      inline def setFocus(value: /* defer */ js.UndefOr[Double] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setFocusable(value: () => Boolean): Self = StObject.set(x, "focusable", js.Any.fromFunction0(value))
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setFrame(
        value: (/* color */ js.UndefOr[java.lang.String], /* count */ js.UndefOr[Double], /* options */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "frame", js.Any.fromFunction3(value))
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setGetAttributeNS(
        value: (/* namespace */ js.UndefOr[java.lang.String], /* name */ js.UndefOr[java.lang.String]) => java.lang.String
      ): Self = StObject.set(x, "getAttributeNS", js.Any.fromFunction2(value))
      
      inline def setGetAttributeNSUndefined: Self = StObject.set(x, "getAttributeNS", js.undefined)
      
      inline def setGetBottom(value: /* local */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getBottom", js.Any.fromFunction1(value))
      
      inline def setGetBottomUndefined: Self = StObject.set(x, "getBottom", js.undefined)
      
      inline def setGetCenterXY(value: () => Array): Self = StObject.set(x, "getCenterXY", js.Any.fromFunction0(value))
      
      inline def setGetCenterXYUndefined: Self = StObject.set(x, "getCenterXY", js.undefined)
      
      inline def setGetColor(
        value: (/* attr */ js.UndefOr[java.lang.String], /* defaultValue */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String]) => Unit
      ): Self = StObject.set(x, "getColor", js.Any.fromFunction3(value))
      
      inline def setGetColorUndefined: Self = StObject.set(x, "getColor", js.undefined)
      
      inline def setGetComputedHeight(value: () => Double): Self = StObject.set(x, "getComputedHeight", js.Any.fromFunction0(value))
      
      inline def setGetComputedHeightUndefined: Self = StObject.set(x, "getComputedHeight", js.undefined)
      
      inline def setGetComputedWidth(value: () => Double): Self = StObject.set(x, "getComputedWidth", js.Any.fromFunction0(value))
      
      inline def setGetComputedWidthUndefined: Self = StObject.set(x, "getComputedWidth", js.undefined)
      
      inline def setGetFrameWidth(value: /* sides */ js.UndefOr[java.lang.String] => Double): Self = StObject.set(x, "getFrameWidth", js.Any.fromFunction1(value))
      
      inline def setGetFrameWidthUndefined: Self = StObject.set(x, "getFrameWidth", js.undefined)
      
      inline def setGetLeft(value: /* local */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getLeft", js.Any.fromFunction1(value))
      
      inline def setGetLeftUndefined: Self = StObject.set(x, "getLeft", js.undefined)
      
      inline def setGetLoader(value: () => IElementLoader): Self = StObject.set(x, "getLoader", js.Any.fromFunction0(value))
      
      inline def setGetLoaderUndefined: Self = StObject.set(x, "getLoader", js.undefined)
      
      inline def setGetLocalX(value: () => Double): Self = StObject.set(x, "getLocalX", js.Any.fromFunction0(value))
      
      inline def setGetLocalXUndefined: Self = StObject.set(x, "getLocalX", js.undefined)
      
      inline def setGetLocalXY(value: () => Array): Self = StObject.set(x, "getLocalXY", js.Any.fromFunction0(value))
      
      inline def setGetLocalXYUndefined: Self = StObject.set(x, "getLocalXY", js.undefined)
      
      inline def setGetLocalY(value: () => Double): Self = StObject.set(x, "getLocalY", js.Any.fromFunction0(value))
      
      inline def setGetLocalYUndefined: Self = StObject.set(x, "getLocalY", js.undefined)
      
      inline def setGetPageBox(value: /* asRegion */ js.UndefOr[Boolean] => Any): Self = StObject.set(x, "getPageBox", js.Any.fromFunction1(value))
      
      inline def setGetPageBoxUndefined: Self = StObject.set(x, "getPageBox", js.undefined)
      
      inline def setGetPositioning(value: /* autoPx */ js.UndefOr[Boolean] => Any): Self = StObject.set(x, "getPositioning", js.Any.fromFunction1(value))
      
      inline def setGetPositioningUndefined: Self = StObject.set(x, "getPositioning", js.undefined)
      
      inline def setGetRight(value: /* local */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getRight", js.Any.fromFunction1(value))
      
      inline def setGetRightUndefined: Self = StObject.set(x, "getRight", js.undefined)
      
      inline def setGetScroll(value: () => Any): Self = StObject.set(x, "getScroll", js.Any.fromFunction0(value))
      
      inline def setGetScrollLeft(value: () => Double): Self = StObject.set(x, "getScrollLeft", js.Any.fromFunction0(value))
      
      inline def setGetScrollLeftUndefined: Self = StObject.set(x, "getScrollLeft", js.undefined)
      
      inline def setGetScrollTop(value: () => Double): Self = StObject.set(x, "getScrollTop", js.Any.fromFunction0(value))
      
      inline def setGetScrollTopUndefined: Self = StObject.set(x, "getScrollTop", js.undefined)
      
      inline def setGetScrollUndefined: Self = StObject.set(x, "getScroll", js.undefined)
      
      inline def setGetStyleSize(value: () => Any): Self = StObject.set(x, "getStyleSize", js.Any.fromFunction0(value))
      
      inline def setGetStyleSizeUndefined: Self = StObject.set(x, "getStyleSize", js.undefined)
      
      inline def setGetTextWidth(
        value: (/* text */ js.UndefOr[java.lang.String], /* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double]) => Double
      ): Self = StObject.set(x, "getTextWidth", js.Any.fromFunction3(value))
      
      inline def setGetTextWidthUndefined: Self = StObject.set(x, "getTextWidth", js.undefined)
      
      inline def setGetTop(value: /* local */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getTop", js.Any.fromFunction1(value))
      
      inline def setGetTopUndefined: Self = StObject.set(x, "getTop", js.undefined)
      
      inline def setGetX(value: () => Double): Self = StObject.set(x, "getX", js.Any.fromFunction0(value))
      
      inline def setGetXUndefined: Self = StObject.set(x, "getX", js.undefined)
      
      inline def setGetXY(value: () => Array): Self = StObject.set(x, "getXY", js.Any.fromFunction0(value))
      
      inline def setGetXYUndefined: Self = StObject.set(x, "getXY", js.undefined)
      
      inline def setGetY(value: () => Double): Self = StObject.set(x, "getY", js.Any.fromFunction0(value))
      
      inline def setGetYUndefined: Self = StObject.set(x, "getY", js.undefined)
      
      inline def setGhost(
        value: (/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "ghost", js.Any.fromFunction2(value))
      
      inline def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
      
      inline def setHide(value: /* animate */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setHighlight(
        value: (/* color */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "highlight", js.Any.fromFunction2(value))
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setHover(
        value: (/* overFn */ js.UndefOr[Any], /* outFn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "hover", js.Any.fromFunction4(value))
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setInitDD(
        value: (/* group */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[Any], /* overrides */ js.UndefOr[Any]) => IDD
      ): Self = StObject.set(x, "initDD", js.Any.fromFunction3(value))
      
      inline def setInitDDProxy(
        value: (/* group */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[Any], /* overrides */ js.UndefOr[Any]) => IDDProxy
      ): Self = StObject.set(x, "initDDProxy", js.Any.fromFunction3(value))
      
      inline def setInitDDProxyUndefined: Self = StObject.set(x, "initDDProxy", js.undefined)
      
      inline def setInitDDTarget(
        value: (/* group */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[Any], /* overrides */ js.UndefOr[Any]) => IDDTarget
      ): Self = StObject.set(x, "initDDTarget", js.Any.fromFunction3(value))
      
      inline def setInitDDTargetUndefined: Self = StObject.set(x, "initDDTarget", js.undefined)
      
      inline def setInitDDUndefined: Self = StObject.set(x, "initDD", js.undefined)
      
      inline def setIsBorderBox(value: () => Boolean): Self = StObject.set(x, "isBorderBox", js.Any.fromFunction0(value))
      
      inline def setIsBorderBoxUndefined: Self = StObject.set(x, "isBorderBox", js.undefined)
      
      inline def setIsDisplayed(value: () => Boolean): Self = StObject.set(x, "isDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsDisplayedUndefined: Self = StObject.set(x, "isDisplayed", js.undefined)
      
      inline def setIsFocusable(value: /* asFocusEl */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "isFocusable", js.Any.fromFunction1(value))
      
      inline def setIsFocusableUndefined: Self = StObject.set(x, "isFocusable", js.undefined)
      
      inline def setIsMasked(value: () => Boolean): Self = StObject.set(x, "isMasked", js.Any.fromFunction0(value))
      
      inline def setIsMaskedUndefined: Self = StObject.set(x, "isMasked", js.undefined)
      
      inline def setIsScrollable(value: () => Boolean): Self = StObject.set(x, "isScrollable", js.Any.fromFunction0(value))
      
      inline def setIsScrollableUndefined: Self = StObject.set(x, "isScrollable", js.undefined)
      
      inline def setIsVisible(value: /* deep */ js.UndefOr[Boolean] => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction1(value))
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setLoad(value: /* options */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setMask(
        value: (/* msg */ js.UndefOr[java.lang.String], /* msgCls */ js.UndefOr[java.lang.String]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "mask", js.Any.fromFunction2(value))
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMonitorMouseLeave(
        value: (/* delay */ js.UndefOr[Double], /* handler */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "monitorMouseLeave", js.Any.fromFunction3(value))
      
      inline def setMonitorMouseLeaveUndefined: Self = StObject.set(x, "monitorMouseLeave", js.undefined)
      
      inline def setMoveTo(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "moveTo", js.Any.fromFunction3(value))
      
      inline def setMoveToUndefined: Self = StObject.set(x, "moveTo", js.undefined)
      
      inline def setNeedsTabIndex(value: () => Unit): Self = StObject.set(x, "needsTabIndex", js.Any.fromFunction0(value))
      
      inline def setNeedsTabIndexUndefined: Self = StObject.set(x, "needsTabIndex", js.undefined)
      
      inline def setOn(
        value: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "on", js.Any.fromFunction4(value))
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setOriginalDisplay(value: java.lang.String): Self = StObject.set(x, "originalDisplay", value.asInstanceOf[js.Any])
      
      inline def setOriginalDisplayUndefined: Self = StObject.set(x, "originalDisplay", js.undefined)
      
      inline def setPause(value: /* seconds */ js.UndefOr[Double] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPosition(
        value: (/* pos */ js.UndefOr[java.lang.String], /* zIndex */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "position", js.Any.fromFunction4(value))
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPuff(value: /* options */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "puff", js.Any.fromFunction1(value))
      
      inline def setPuffUndefined: Self = StObject.set(x, "puff", js.undefined)
      
      inline def setPurgeAllListeners(value: () => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "purgeAllListeners", js.Any.fromFunction0(value))
      
      inline def setPurgeAllListenersUndefined: Self = StObject.set(x, "purgeAllListeners", js.undefined)
      
      inline def setRelayEvent(value: (/* eventName */ js.UndefOr[java.lang.String], /* observable */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "relayEvent", js.Any.fromFunction2(value))
      
      inline def setRelayEventUndefined: Self = StObject.set(x, "relayEvent", js.undefined)
      
      inline def setRemoveAllListeners(value: () => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
      
      inline def setRemoveAllListenersUndefined: Self = StObject.set(x, "removeAllListeners", js.undefined)
      
      inline def setRemoveListener(
        value: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "removeListener", js.Any.fromFunction3(value))
      
      inline def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
      
      inline def setScale(
        value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* options */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "scale", js.Any.fromFunction3(value))
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScroll(
        value: (/* direction */ js.UndefOr[java.lang.String], /* distance */ js.UndefOr[Double], /* animate */ js.UndefOr[Any]) => Boolean
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction3(value))
      
      inline def setScrollBy(
        value: (/* deltaX */ js.UndefOr[Any], /* deltaY */ js.UndefOr[Any], /* animate */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "scrollBy", js.Any.fromFunction3(value))
      
      inline def setScrollByUndefined: Self = StObject.set(x, "scrollBy", js.undefined)
      
      inline def setScrollIntoView(
        value: (/* container */ js.UndefOr[Any], /* hscroll */ js.UndefOr[Boolean], /* animate */ js.UndefOr[Any], /* highlight */ js.UndefOr[Boolean]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction4(value))
      
      inline def setScrollIntoViewUndefined: Self = StObject.set(x, "scrollIntoView", js.undefined)
      
      inline def setScrollTo(
        value: (/* side */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "scrollTo", js.Any.fromFunction3(value))
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setSelectable(value: () => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "selectable", js.Any.fromFunction0(value))
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSetBottom(value: /* bottom */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setBottom", js.Any.fromFunction1(value))
      
      inline def setSetBottomUndefined: Self = StObject.set(x, "setBottom", js.undefined)
      
      inline def setSetBounds(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Any], /* height */ js.UndefOr[Any], /* animate */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "setBounds", js.Any.fromFunction5(value))
      
      inline def setSetBoundsUndefined: Self = StObject.set(x, "setBounds", js.undefined)
      
      inline def setSetDisplayed(value: /* value */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setDisplayed", js.Any.fromFunction1(value))
      
      inline def setSetDisplayedUndefined: Self = StObject.set(x, "setDisplayed", js.undefined)
      
      inline def setSetLeft(value: /* left */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setLeft", js.Any.fromFunction1(value))
      
      inline def setSetLeftTop(value: (/* left */ js.UndefOr[Any], /* top */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setLeftTop", js.Any.fromFunction2(value))
      
      inline def setSetLeftTopUndefined: Self = StObject.set(x, "setLeftTop", js.undefined)
      
      inline def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
      
      inline def setSetLocation(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "setLocation", js.Any.fromFunction3(value))
      
      inline def setSetLocationUndefined: Self = StObject.set(x, "setLocation", js.undefined)
      
      inline def setSetOpacity(
        value: (/* opacity */ js.UndefOr[Double], /* animate */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "setOpacity", js.Any.fromFunction2(value))
      
      inline def setSetOpacityUndefined: Self = StObject.set(x, "setOpacity", js.undefined)
      
      inline def setSetPositioning(value: /* posCfg */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setPositioning", js.Any.fromFunction1(value))
      
      inline def setSetPositioningUndefined: Self = StObject.set(x, "setPositioning", js.undefined)
      
      inline def setSetRight(value: /* right */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setRight", js.Any.fromFunction1(value))
      
      inline def setSetRightUndefined: Self = StObject.set(x, "setRight", js.undefined)
      
      inline def setSetScrollLeft(value: /* left */ js.UndefOr[Double] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setScrollLeft", js.Any.fromFunction1(value))
      
      inline def setSetScrollLeftUndefined: Self = StObject.set(x, "setScrollLeft", js.undefined)
      
      inline def setSetScrollTop(value: /* top */ js.UndefOr[Double] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setScrollTop", js.Any.fromFunction1(value))
      
      inline def setSetScrollTopUndefined: Self = StObject.set(x, "setScrollTop", js.undefined)
      
      inline def setSetTop(value: /* top */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setTop", js.Any.fromFunction1(value))
      
      inline def setSetTopUndefined: Self = StObject.set(x, "setTop", js.undefined)
      
      inline def setSetVisible(
        value: (/* visible */ js.UndefOr[Boolean], /* animate */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "setVisible", js.Any.fromFunction2(value))
      
      inline def setSetVisibleUndefined: Self = StObject.set(x, "setVisible", js.undefined)
      
      inline def setShift(value: /* options */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      inline def setShow(value: /* animate */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSlideIn(
        value: (/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "slideIn", js.Any.fromFunction2(value))
      
      inline def setSlideInUndefined: Self = StObject.set(x, "slideIn", js.undefined)
      
      inline def setSlideOut(
        value: (/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "slideOut", js.Any.fromFunction2(value))
      
      inline def setSlideOutUndefined: Self = StObject.set(x, "slideOut", js.undefined)
      
      inline def setSwallowEvent(
        value: (/* eventName */ js.UndefOr[Any], /* preventDefault */ js.UndefOr[Boolean]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "swallowEvent", js.Any.fromFunction2(value))
      
      inline def setSwallowEventUndefined: Self = StObject.set(x, "swallowEvent", js.undefined)
      
      inline def setSwitchOff(value: /* options */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "switchOff", js.Any.fromFunction1(value))
      
      inline def setSwitchOffUndefined: Self = StObject.set(x, "switchOff", js.undefined)
      
      inline def setToggle(value: /* animate */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setUn(
        value: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "un", js.Any.fromFunction3(value))
      
      inline def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
      
      inline def setUnclip(value: () => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "unclip", js.Any.fromFunction0(value))
      
      inline def setUnclipUndefined: Self = StObject.set(x, "unclip", js.undefined)
      
      inline def setUnselectable(value: () => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "unselectable", js.Any.fromFunction0(value))
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setUpdate(
        value: (/* html */ js.UndefOr[java.lang.String], /* loadScripts */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait IHelper
    extends StObject
       with IAbstractHelper {
    
    /** [Method] Creates new DOM element s without inserting them to the document
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @returns HTMLElement The new uninserted node
      */
    var createDom: js.UndefOr[js.Function1[/* o */ js.UndefOr[Any], HTMLElement]] = js.undefined
    
    /** [Method] Alias for markup
      * @param spec Object The DOM object spec (and children)
      * @returns String
      */
    var createHtml: js.UndefOr[js.Function1[/* spec */ js.UndefOr[Any], java.lang.String]] = js.undefined
    
    /** [Method] Creates a new Ext Template from the DOM object spec
      * @param o Object The DOM object spec (and children)
      * @returns Ext.Template The new template
      */
    var createTemplate: js.UndefOr[js.Function1[/* o */ js.UndefOr[Any], ITemplate]] = js.undefined
    
    /** [Property] (Boolean) */
    var useDom: js.UndefOr[Boolean] = js.undefined
  }
  object IHelper {
    
    inline def apply(): IHelper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHelper]
    }
    
    extension [Self <: IHelper](x: Self) {
      
      inline def setCreateDom(value: /* o */ js.UndefOr[Any] => HTMLElement): Self = StObject.set(x, "createDom", js.Any.fromFunction1(value))
      
      inline def setCreateDomUndefined: Self = StObject.set(x, "createDom", js.undefined)
      
      inline def setCreateHtml(value: /* spec */ js.UndefOr[Any] => java.lang.String): Self = StObject.set(x, "createHtml", js.Any.fromFunction1(value))
      
      inline def setCreateHtmlUndefined: Self = StObject.set(x, "createHtml", js.undefined)
      
      inline def setCreateTemplate(value: /* o */ js.UndefOr[Any] => ITemplate): Self = StObject.set(x, "createTemplate", js.Any.fromFunction1(value))
      
      inline def setCreateTemplateUndefined: Self = StObject.set(x, "createTemplate", js.undefined)
      
      inline def setUseDom(value: Boolean): Self = StObject.set(x, "useDom", value.asInstanceOf[js.Any])
      
      inline def setUseDomUndefined: Self = StObject.set(x, "useDom", js.undefined)
    }
  }
  
  trait ILayer
    extends StObject
       with typings.extjs.Ext.IElement {
    
    /** [Config Option] (String) */
    var cls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var constrain: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Object) */
    var dh: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var hideMode: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] overridden Element method
      * @param x Object
      * @param y Object
      * @param width Object
      * @param height Object
      * @param animate Object
      * @param duration Object
      * @param callback Object
      * @param easing Object
      * @returns Ext.dom.Element this
      */
    @JSName("setBounds")
    var setBounds_ILayer: js.UndefOr[
        js.Function8[
          /* x */ js.UndefOr[Any], 
          /* y */ js.UndefOr[Any], 
          /* width */ js.UndefOr[Any], 
          /* height */ js.UndefOr[Any], 
          /* animate */ js.UndefOr[Any], 
          /* duration */ js.UndefOr[Any], 
          /* callback */ js.UndefOr[Any], 
          /* easing */ js.UndefOr[Any], 
          typings.extjs.Ext.dom.IElement
        ]
      ] = js.undefined
    
    /** [Method] overridden Element method
      * @param h Object
      * @param animate Object
      * @param duration Object
      * @param callback Object
      * @param easing Object
      * @returns Ext.dom.Element this
      */
    @JSName("setHeight")
    var setHeight_ILayer: js.UndefOr[
        js.Function5[
          /* h */ js.UndefOr[Any], 
          /* animate */ js.UndefOr[Any], 
          /* duration */ js.UndefOr[Any], 
          /* callback */ js.UndefOr[Any], 
          /* easing */ js.UndefOr[Any], 
          typings.extjs.Ext.dom.IElement
        ]
      ] = js.undefined
    
    /** [Method] Sets the element s left and top positions directly using CSS style Defined in override Ext dom Element_position
      * @param left Object
      * @param top Object
      * @returns Ext.dom.Element this
      */
    @JSName("setLeftTop")
    var setLeftTop_ILayer: js.UndefOr[
        js.Function2[
          /* left */ js.UndefOr[Any], 
          /* top */ js.UndefOr[Any], 
          typings.extjs.Ext.dom.IElement
        ]
      ] = js.undefined
    
    /** [Method] overridden Element method
      * @param left Object
      * @returns Ext.dom.Element this
      */
    @JSName("setLeft")
    var setLeft_ILayer: js.UndefOr[js.Function1[/* left */ js.UndefOr[Any], typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Method] overridden Element method
      * @param w Object
      * @param h Object
      * @param animate Object
      * @param duration Object
      * @param callback Object
      * @param easing Object
      * @returns Ext.dom.Element this
      */
    @JSName("setSize")
    var setSize_ILayer: js.UndefOr[
        js.Function6[
          /* w */ js.UndefOr[Any], 
          /* h */ js.UndefOr[Any], 
          /* animate */ js.UndefOr[Any], 
          /* duration */ js.UndefOr[Any], 
          /* callback */ js.UndefOr[Any], 
          /* easing */ js.UndefOr[Any], 
          typings.extjs.Ext.dom.IElement
        ]
      ] = js.undefined
    
    /** [Method] Sets the element s top position directly using CSS style instead of setY
      * @param top Object
      * @returns Ext.dom.Element this
      */
    @JSName("setTop")
    var setTop_ILayer: js.UndefOr[js.Function1[/* top */ js.UndefOr[Any], typings.extjs.Ext.dom.IElement]] = js.undefined
    
    /** [Method] overridden Element method
      * @param visible Object
      * @param animate Object
      * @param duration Object
      * @param callback Object
      * @param easing Object
      * @returns Ext.dom.Element this
      */
    @JSName("setVisible")
    var setVisible_ILayer: js.UndefOr[
        js.Function5[
          /* visible */ js.UndefOr[Any], 
          /* animate */ js.UndefOr[Any], 
          /* duration */ js.UndefOr[Any], 
          /* callback */ js.UndefOr[Any], 
          /* easing */ js.UndefOr[Any], 
          typings.extjs.Ext.dom.IElement
        ]
      ] = js.undefined
    
    /** [Method] overridden Element method
      * @param w Object
      * @param animate Object
      * @param duration Object
      * @param callback Object
      * @param easing Object
      * @returns Ext.dom.Element this
      */
    @JSName("setWidth")
    var setWidth_ILayer: js.UndefOr[
        js.Function5[
          /* w */ js.UndefOr[Any], 
          /* animate */ js.UndefOr[Any], 
          /* duration */ js.UndefOr[Any], 
          /* callback */ js.UndefOr[Any], 
          /* easing */ js.UndefOr[Any], 
          typings.extjs.Ext.dom.IElement
        ]
      ] = js.undefined
    
    /** [Method] Sets the z index of this layer and adjusts any shadow and shim z indexes
      * @param zindex Number The new z-index to set
      * @returns Ext.Layer The Layer
      */
    var setZIndex: js.UndefOr[js.Function1[/* zindex */ js.UndefOr[Double], this.type]] = js.undefined
    
    /** [Config Option] (String/Boolean) */
    var shadow: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Number) */
    var shadowOffset: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var shim: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var useDisplay: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var visibilityCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Number) */
    var zindex: js.UndefOr[Double] = js.undefined
  }
  object ILayer {
    
    inline def apply(): typings.extjs.Ext.dom.ILayer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.dom.ILayer]
    }
    
    extension [Self <: typings.extjs.Ext.dom.ILayer](x: Self) {
      
      inline def setCls(value: java.lang.String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
      
      inline def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
      
      inline def setConstrain(value: Boolean): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
      
      inline def setConstrainUndefined: Self = StObject.set(x, "constrain", js.undefined)
      
      inline def setDh(value: Any): Self = StObject.set(x, "dh", value.asInstanceOf[js.Any])
      
      inline def setDhUndefined: Self = StObject.set(x, "dh", js.undefined)
      
      inline def setHideMode(value: java.lang.String): Self = StObject.set(x, "hideMode", value.asInstanceOf[js.Any])
      
      inline def setHideModeUndefined: Self = StObject.set(x, "hideMode", js.undefined)
      
      inline def setSetBounds(
        value: (/* x */ js.UndefOr[Any], /* y */ js.UndefOr[Any], /* width */ js.UndefOr[Any], /* height */ js.UndefOr[Any], /* animate */ js.UndefOr[Any], /* duration */ js.UndefOr[Any], /* callback */ js.UndefOr[Any], /* easing */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "setBounds", js.Any.fromFunction8(value))
      
      inline def setSetBoundsUndefined: Self = StObject.set(x, "setBounds", js.undefined)
      
      inline def setSetHeight(
        value: (/* h */ js.UndefOr[Any], /* animate */ js.UndefOr[Any], /* duration */ js.UndefOr[Any], /* callback */ js.UndefOr[Any], /* easing */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "setHeight", js.Any.fromFunction5(value))
      
      inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
      
      inline def setSetLeft(value: /* left */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setLeft", js.Any.fromFunction1(value))
      
      inline def setSetLeftTop(value: (/* left */ js.UndefOr[Any], /* top */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setLeftTop", js.Any.fromFunction2(value))
      
      inline def setSetLeftTopUndefined: Self = StObject.set(x, "setLeftTop", js.undefined)
      
      inline def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
      
      inline def setSetSize(
        value: (/* w */ js.UndefOr[Any], /* h */ js.UndefOr[Any], /* animate */ js.UndefOr[Any], /* duration */ js.UndefOr[Any], /* callback */ js.UndefOr[Any], /* easing */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "setSize", js.Any.fromFunction6(value))
      
      inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      inline def setSetTop(value: /* top */ js.UndefOr[Any] => typings.extjs.Ext.dom.IElement): Self = StObject.set(x, "setTop", js.Any.fromFunction1(value))
      
      inline def setSetTopUndefined: Self = StObject.set(x, "setTop", js.undefined)
      
      inline def setSetVisible(
        value: (/* visible */ js.UndefOr[Any], /* animate */ js.UndefOr[Any], /* duration */ js.UndefOr[Any], /* callback */ js.UndefOr[Any], /* easing */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "setVisible", js.Any.fromFunction5(value))
      
      inline def setSetVisibleUndefined: Self = StObject.set(x, "setVisible", js.undefined)
      
      inline def setSetWidth(
        value: (/* w */ js.UndefOr[Any], /* animate */ js.UndefOr[Any], /* duration */ js.UndefOr[Any], /* callback */ js.UndefOr[Any], /* easing */ js.UndefOr[Any]) => typings.extjs.Ext.dom.IElement
      ): Self = StObject.set(x, "setWidth", js.Any.fromFunction5(value))
      
      inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
      
      inline def setSetZIndex(value: /* zindex */ js.UndefOr[Double] => typings.extjs.Ext.dom.ILayer): Self = StObject.set(x, "setZIndex", js.Any.fromFunction1(value))
      
      inline def setSetZIndexUndefined: Self = StObject.set(x, "setZIndex", js.undefined)
      
      inline def setShadow(value: Any): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowOffset(value: Double): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
      
      inline def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setShim(value: Boolean): Self = StObject.set(x, "shim", value.asInstanceOf[js.Any])
      
      inline def setShimUndefined: Self = StObject.set(x, "shim", js.undefined)
      
      inline def setUseDisplay(value: Boolean): Self = StObject.set(x, "useDisplay", value.asInstanceOf[js.Any])
      
      inline def setUseDisplayUndefined: Self = StObject.set(x, "useDisplay", js.undefined)
      
      inline def setVisibilityCls(value: java.lang.String): Self = StObject.set(x, "visibilityCls", value.asInstanceOf[js.Any])
      
      inline def setVisibilityClsUndefined: Self = StObject.set(x, "visibilityCls", js.undefined)
      
      inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  trait IQuery extends StObject
  
  trait Query extends StObject
  
  object abstractelement {
    
    trait IFly
      extends StObject
         with typings.extjs.Ext.dom.IElement {
      
      /** [Property] (Boolean) */
      var isFly: js.UndefOr[Boolean] = js.undefined
    }
    object IFly {
      
      inline def apply(): IFly = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFly]
      }
      
      extension [Self <: IFly](x: Self) {
        
        inline def setIsFly(value: Boolean): Self = StObject.set(x, "isFly", value.asInstanceOf[js.Any])
        
        inline def setIsFlyUndefined: Self = StObject.set(x, "isFly", js.undefined)
      }
    }
  }
  
  object element {
    
    trait IFly
      extends StObject
         with typings.extjs.Ext.dom.IElement {
      
      /** [Property] (Boolean) */
      var isFly: js.UndefOr[Boolean] = js.undefined
    }
    object IFly {
      
      inline def apply(): IFly = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFly]
      }
      
      extension [Self <: IFly](x: Self) {
        
        inline def setIsFly(value: Boolean): Self = StObject.set(x, "isFly", value.asInstanceOf[js.Any])
        
        inline def setIsFlyUndefined: Self = StObject.set(x, "isFly", js.undefined)
      }
    }
  }
}
