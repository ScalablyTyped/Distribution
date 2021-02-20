package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.dom.IElement
import typings.extjs.Ext.dom.element.IFly
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dom {
  
  @JSGlobal("Ext.dom.AbstractElement")
  @js.native
  class AbstractElement_ ()
    extends typings.extjs.Ext.dom.AbstractElement_
  /* static members */
  object AbstractElement_ {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.dom.AbstractElement.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.dom.AbstractElement.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.dom.AbstractElement.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.dom.AbstractElement.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.dom.AbstractElement.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.dom.AbstractElement.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.dom.AbstractElement.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.dom.AbstractElement.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.dom.AbstractElement.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Gets the singleton flyweight element with the passed node as the active element
      * @param dom String/HTMLElement The dom node or id
      * @param named String Allows for creation of named reusable flyweights to prevent conflicts (e.g. internally Ext uses "_global")
      * @returns Ext.dom.Element.Fly The singleton flyweight object (or null if no matching element was found)
      */
    @JSGlobal("Ext.dom.AbstractElement.fly")
    @js.native
    def fly(): IFly = js.native
    @JSGlobal("Ext.dom.AbstractElement.fly")
    @js.native
    def fly(dom: js.UndefOr[scala.Nothing], named: java.lang.String): IFly = js.native
    @JSGlobal("Ext.dom.AbstractElement.fly")
    @js.native
    def fly(dom: js.Any): IFly = js.native
    @JSGlobal("Ext.dom.AbstractElement.fly")
    @js.native
    def fly(dom: js.Any, named: java.lang.String): IFly = js.native
    
    /** [Method] Returns the top Element that is located at the passed coordinates Defined in override Ext dom AbstractElement_static
      * @param x Number The x coordinate
      * @param y Number The y coordinate
      * @returns String The found Element
      */
    @JSGlobal("Ext.dom.AbstractElement.fromPoint")
    @js.native
    def fromPoint(): java.lang.String = js.native
    @JSGlobal("Ext.dom.AbstractElement.fromPoint")
    @js.native
    def fromPoint(x: js.UndefOr[scala.Nothing], y: Double): java.lang.String = js.native
    @JSGlobal("Ext.dom.AbstractElement.fromPoint")
    @js.native
    def fromPoint(x: Double): java.lang.String = js.native
    @JSGlobal("Ext.dom.AbstractElement.fromPoint")
    @js.native
    def fromPoint(x: Double, y: Double): java.lang.String = js.native
    
    /** [Method] Retrieves Ext dom Element objects
      * @param el String/HTMLElement/Ext.Element The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element The Element object (or null if no matching element was found)
      */
    @JSGlobal("Ext.dom.AbstractElement.get")
    @js.native
    def get(): IElement = js.native
    @JSGlobal("Ext.dom.AbstractElement.get")
    @js.native
    def get(el: js.Any): IElement = js.native
    
    /** [Method] Retrieves the document height Defined in override Ext dom AbstractElement_static
      * @returns Number documentHeight
      */
    @JSGlobal("Ext.dom.AbstractElement.getDocumentHeight")
    @js.native
    def getDocumentHeight(): Double = js.native
    
    /** [Method] Retrieves the document width Defined in override Ext dom AbstractElement_static
      * @returns Number documentWidth
      */
    @JSGlobal("Ext.dom.AbstractElement.getDocumentWidth")
    @js.native
    def getDocumentWidth(): Double = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.dom.AbstractElement.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Retrieves the current orientation of the window
      * @returns String Orientation of window: 'portrait' or 'landscape'
      */
    @JSGlobal("Ext.dom.AbstractElement.getOrientation")
    @js.native
    def getOrientation(): java.lang.String = js.native
    
    /** [Method] Retrieves the viewport size of the window
      * @returns Object object containing width and height properties
      */
    @JSGlobal("Ext.dom.AbstractElement.getViewSize")
    @js.native
    def getViewSize(): js.Any = js.native
    
    /** [Method] Retrieves the viewport height of the window
      * @returns Number viewportHeight
      */
    @JSGlobal("Ext.dom.AbstractElement.getViewportHeight")
    @js.native
    def getViewportHeight(): Double = js.native
    
    /** [Method] Retrieves the viewport width of the window
      * @returns Number viewportWidth
      */
    @JSGlobal("Ext.dom.AbstractElement.getViewportWidth")
    @js.native
    def getViewportWidth(): Double = js.native
    
    /** [Method] Adds members to class  */
    @JSGlobal("Ext.dom.AbstractElement.implement")
    @js.native
    def implement(): Unit = js.native
    
    /** [Method] Returns an array of unique class names based upon the input strings or string arrays
      * @param clsList1 Mixed A string of class names, or an array of class names.
      * @param clsList2 Mixed A string of class names, or an array of class names.
      * @returns Array An array of strings representing remaining unique, merged class names. If class names were added to the first list, the changed property will be true.
      */
    @JSGlobal("Ext.dom.AbstractElement.mergeClsList")
    @js.native
    def mergeClsList(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.AbstractElement.mergeClsList")
    @js.native
    def mergeClsList(clsList1: js.UndefOr[scala.Nothing], clsList2: js.Any): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.AbstractElement.mergeClsList")
    @js.native
    def mergeClsList(clsList1: js.Any): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.AbstractElement.mergeClsList")
    @js.native
    def mergeClsList(clsList1: js.Any, clsList2: js.Any): typings.extjs.Ext.Array = js.native
    
    /** [Method] Normalizes CSS property keys from dash delimited to camel case JavaScript Syntax
      * @param prop String The property to normalize
      * @returns String The normalized string
      */
    @JSGlobal("Ext.dom.AbstractElement.normalize")
    @js.native
    def normalize(): java.lang.String = js.native
    @JSGlobal("Ext.dom.AbstractElement.normalize")
    @js.native
    def normalize(prop: java.lang.String): java.lang.String = js.native
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param box Number/String The encoded margins
      * @returns Object An object with margin sizes for top, right, bottom and left
      */
    @JSGlobal("Ext.dom.AbstractElement.parseBox")
    @js.native
    def parseBox(): js.Any = js.native
    @JSGlobal("Ext.dom.AbstractElement.parseBox")
    @js.native
    def parseBox(box: js.Any): js.Any = js.native
    
    /** [Method] Converts a CSS string into an object with a property for each style
      * @param styles String A CSS string
      * @returns Object styles
      */
    @JSGlobal("Ext.dom.AbstractElement.parseStyles")
    @js.native
    def parseStyles(): js.Any = js.native
    @JSGlobal("Ext.dom.AbstractElement.parseStyles")
    @js.native
    def parseStyles(styles: java.lang.String): js.Any = js.native
    
    /** [Method] Returns an array of unique class names deom the first parameter with all class names from the second parameter removed
      * @param existingClsList Mixed A string of class names, or an array of class names.
      * @param removeClsList Mixed A string of class names, or an array of class names to remove from existingClsList.
      * @returns Array An array of strings representing remaining class names. If class names were removed, the changed property will be true.
      */
    @JSGlobal("Ext.dom.AbstractElement.removeCls")
    @js.native
    def removeCls(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.AbstractElement.removeCls")
    @js.native
    def removeCls(existingClsList: js.UndefOr[scala.Nothing], removeClsList: js.Any): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.AbstractElement.removeCls")
    @js.native
    def removeCls(existingClsList: js.Any): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.AbstractElement.removeCls")
    @js.native
    def removeCls(existingClsList: js.Any, removeClsList: js.Any): typings.extjs.Ext.Array = js.native
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param box Number/String/Object The encoded margins, or an object with top, right, bottom, and left properties
      * @param units String The type of units to add
      * @returns String An string with unitized (px if units is not specified) metrics for top, right, bottom and left
      */
    @JSGlobal("Ext.dom.AbstractElement.unitizeBox")
    @js.native
    def unitizeBox(): java.lang.String = js.native
    @JSGlobal("Ext.dom.AbstractElement.unitizeBox")
    @js.native
    def unitizeBox(box: js.UndefOr[scala.Nothing], units: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.dom.AbstractElement.unitizeBox")
    @js.native
    def unitizeBox(box: js.Any): java.lang.String = js.native
    @JSGlobal("Ext.dom.AbstractElement.unitizeBox")
    @js.native
    def unitizeBox(box: js.Any, units: java.lang.String): java.lang.String = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.dom.AbstractElement.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.dom.AbstractElement.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.dom.Element")
  @js.native
  class Element_ ()
    extends typings.extjs.Ext.dom.Element_
  /* static members */
  object Element_ {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.dom.Element.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.dom.Element.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.dom.Element.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.dom.Element.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.dom.Element.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.dom.Element.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.dom.Element.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.dom.Element.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.dom.Element.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Returns the top Element that is located at the passed coordinates Defined in override Ext dom AbstractElement_static
      * @param x Number The x coordinate
      * @param y Number The y coordinate
      * @returns String The found Element
      */
    @JSGlobal("Ext.dom.Element.fromPoint")
    @js.native
    def fromPoint(): java.lang.String = js.native
    @JSGlobal("Ext.dom.Element.fromPoint")
    @js.native
    def fromPoint(x: js.UndefOr[scala.Nothing], y: Double): java.lang.String = js.native
    @JSGlobal("Ext.dom.Element.fromPoint")
    @js.native
    def fromPoint(x: Double): java.lang.String = js.native
    @JSGlobal("Ext.dom.Element.fromPoint")
    @js.native
    def fromPoint(x: Double, y: Double): java.lang.String = js.native
    
    /** [Method] Retrieves Ext dom Element objects
      * @param el String/HTMLElement/Ext.Element The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element The Element object (or null if no matching element was found)
      */
    @JSGlobal("Ext.dom.Element.get")
    @js.native
    def get(): IElement = js.native
    @JSGlobal("Ext.dom.Element.get")
    @js.native
    def get(el: js.Any): IElement = js.native
    
    /** [Method] Retrieves the document height Defined in override Ext dom AbstractElement_static
      * @returns Number documentHeight
      */
    @JSGlobal("Ext.dom.Element.getDocumentHeight")
    @js.native
    def getDocumentHeight(): Double = js.native
    
    /** [Method] Retrieves the document width Defined in override Ext dom AbstractElement_static
      * @returns Number documentWidth
      */
    @JSGlobal("Ext.dom.Element.getDocumentWidth")
    @js.native
    def getDocumentWidth(): Double = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.dom.Element.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Retrieves the current orientation of the window
      * @returns String Orientation of window: 'portrait' or 'landscape'
      */
    @JSGlobal("Ext.dom.Element.getOrientation")
    @js.native
    def getOrientation(): java.lang.String = js.native
    
    /** [Method] Retrieves the viewport size of the window
      * @returns Object object containing width and height properties
      */
    @JSGlobal("Ext.dom.Element.getViewSize")
    @js.native
    def getViewSize(): js.Any = js.native
    
    /** [Method] Retrieves the viewport height of the window
      * @returns Number viewportHeight
      */
    @JSGlobal("Ext.dom.Element.getViewportHeight")
    @js.native
    def getViewportHeight(): Double = js.native
    
    /** [Method] Retrieves the viewport width of the window
      * @returns Number viewportWidth
      */
    @JSGlobal("Ext.dom.Element.getViewportWidth")
    @js.native
    def getViewportWidth(): Double = js.native
    
    /** [Method] Adds members to class  */
    @JSGlobal("Ext.dom.Element.implement")
    @js.native
    def implement(): Unit = js.native
    
    /** [Method] Returns an array of unique class names based upon the input strings or string arrays
      * @param clsList1 Mixed A string of class names, or an array of class names.
      * @param clsList2 Mixed A string of class names, or an array of class names.
      * @returns Array An array of strings representing remaining unique, merged class names. If class names were added to the first list, the changed property will be true.
      */
    @JSGlobal("Ext.dom.Element.mergeClsList")
    @js.native
    def mergeClsList(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Element.mergeClsList")
    @js.native
    def mergeClsList(clsList1: js.UndefOr[scala.Nothing], clsList2: js.Any): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Element.mergeClsList")
    @js.native
    def mergeClsList(clsList1: js.Any): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Element.mergeClsList")
    @js.native
    def mergeClsList(clsList1: js.Any, clsList2: js.Any): typings.extjs.Ext.Array = js.native
    
    /** [Method] Normalizes CSS property keys from dash delimited to camel case JavaScript Syntax
      * @param prop String The property to normalize
      * @returns String The normalized string
      */
    @JSGlobal("Ext.dom.Element.normalize")
    @js.native
    def normalize(): java.lang.String = js.native
    @JSGlobal("Ext.dom.Element.normalize")
    @js.native
    def normalize(prop: java.lang.String): java.lang.String = js.native
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param box Number/String The encoded margins
      * @returns Object An object with margin sizes for top, right, bottom and left
      */
    @JSGlobal("Ext.dom.Element.parseBox")
    @js.native
    def parseBox(): js.Any = js.native
    @JSGlobal("Ext.dom.Element.parseBox")
    @js.native
    def parseBox(box: js.Any): js.Any = js.native
    
    /** [Method] Converts a CSS string into an object with a property for each style
      * @param styles String A CSS string
      * @returns Object styles
      */
    @JSGlobal("Ext.dom.Element.parseStyles")
    @js.native
    def parseStyles(): js.Any = js.native
    @JSGlobal("Ext.dom.Element.parseStyles")
    @js.native
    def parseStyles(styles: java.lang.String): js.Any = js.native
    
    /** [Method] Returns an array of unique class names deom the first parameter with all class names from the second parameter removed
      * @param existingClsList Mixed A string of class names, or an array of class names.
      * @param removeClsList Mixed A string of class names, or an array of class names to remove from existingClsList.
      * @returns Array An array of strings representing remaining class names. If class names were removed, the changed property will be true.
      */
    @JSGlobal("Ext.dom.Element.removeCls")
    @js.native
    def removeCls(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Element.removeCls")
    @js.native
    def removeCls(existingClsList: js.UndefOr[scala.Nothing], removeClsList: js.Any): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Element.removeCls")
    @js.native
    def removeCls(existingClsList: js.Any): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Element.removeCls")
    @js.native
    def removeCls(existingClsList: js.Any, removeClsList: js.Any): typings.extjs.Ext.Array = js.native
    
    /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
      * @param selector String/HTMLElement[] The CSS selector or an array of elements
      * @param unique Boolean true to create a unique Ext.Element for each element (defaults to a shared flyweight object)
      * @param root HTMLElement/String The root element of the query or id of the root
      * @returns Ext.CompositeElementLite/Ext.CompositeElement
      */
    @JSGlobal("Ext.dom.Element.select")
    @js.native
    def select(): js.Any = js.native
    @JSGlobal("Ext.dom.Element.select")
    @js.native
    def select(selector: js.UndefOr[scala.Nothing], unique: js.UndefOr[scala.Nothing], root: js.Any): js.Any = js.native
    @JSGlobal("Ext.dom.Element.select")
    @js.native
    def select(selector: js.UndefOr[scala.Nothing], unique: Boolean): js.Any = js.native
    @JSGlobal("Ext.dom.Element.select")
    @js.native
    def select(selector: js.UndefOr[scala.Nothing], unique: Boolean, root: js.Any): js.Any = js.native
    @JSGlobal("Ext.dom.Element.select")
    @js.native
    def select(selector: js.Any): js.Any = js.native
    @JSGlobal("Ext.dom.Element.select")
    @js.native
    def select(selector: js.Any, unique: js.UndefOr[scala.Nothing], root: js.Any): js.Any = js.native
    @JSGlobal("Ext.dom.Element.select")
    @js.native
    def select(selector: js.Any, unique: Boolean): js.Any = js.native
    @JSGlobal("Ext.dom.Element.select")
    @js.native
    def select(selector: js.Any, unique: Boolean, root: js.Any): js.Any = js.native
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param box Number/String/Object The encoded margins, or an object with top, right, bottom, and left properties
      * @param units String The type of units to add
      * @returns String An string with unitized (px if units is not specified) metrics for top, right, bottom and left
      */
    @JSGlobal("Ext.dom.Element.unitizeBox")
    @js.native
    def unitizeBox(): java.lang.String = js.native
    @JSGlobal("Ext.dom.Element.unitizeBox")
    @js.native
    def unitizeBox(box: js.UndefOr[scala.Nothing], units: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.dom.Element.unitizeBox")
    @js.native
    def unitizeBox(box: js.Any): java.lang.String = js.native
    @JSGlobal("Ext.dom.Element.unitizeBox")
    @js.native
    def unitizeBox(box: js.Any, units: java.lang.String): java.lang.String = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.dom.Element.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.dom.Element.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.dom.Query")
  @js.native
  class Query ()
    extends typings.extjs.Ext.dom.Query
  /* static members */
  object Query {
    
    @JSGlobal("Ext.dom.Query")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Compiles a selector xpath query into a reusable function
      * @param selector String The selector/xpath query
      * @param type String Either "select" or "simple" for a simple selector match
      * @returns Function
      */
    @JSGlobal("Ext.dom.Query.compile")
    @js.native
    def compile(): js.Any = js.native
    @JSGlobal("Ext.dom.Query.compile")
    @js.native
    def compile(selector: js.UndefOr[scala.Nothing], `type`: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.dom.Query.compile")
    @js.native
    def compile(selector: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.dom.Query.compile")
    @js.native
    def compile(selector: java.lang.String, `type`: java.lang.String): js.Any = js.native
    
    /** [Method] Filters an array of elements to only include matches of a simple selector e g
      * @param el HTMLElement[] An array of elements to filter
      * @param selector String The simple selector to test
      * @param nonMatches Boolean If true, it returns the elements that DON'T match the selector instead of the ones that match
      * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
      */
    @JSGlobal("Ext.dom.Query.filter")
    @js.native
    def filter(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.filter")
    @js.native
    def filter(el: js.UndefOr[scala.Nothing], selector: js.UndefOr[scala.Nothing], nonMatches: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.filter")
    @js.native
    def filter(el: js.UndefOr[scala.Nothing], selector: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.filter")
    @js.native
    def filter(el: js.UndefOr[scala.Nothing], selector: java.lang.String, nonMatches: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.filter")
    @js.native
    def filter(el: typings.extjs.Ext.Array): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.filter")
    @js.native
    def filter(el: typings.extjs.Ext.Array, selector: js.UndefOr[scala.Nothing], nonMatches: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.filter")
    @js.native
    def filter(el: typings.extjs.Ext.Array, selector: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.filter")
    @js.native
    def filter(el: typings.extjs.Ext.Array, selector: java.lang.String, nonMatches: Boolean): typings.extjs.Ext.Array = js.native
    
    /** [Method] Returns true if the passed element s match the passed simple selector e g
      * @param el String/HTMLElement/HTMLElement[] An element id, element or array of elements
      * @param selector String The simple selector to test
      * @returns Boolean
      */
    @JSGlobal("Ext.dom.Query.is")
    @js.native
    def is(): Boolean = js.native
    @JSGlobal("Ext.dom.Query.is")
    @js.native
    def is(el: js.UndefOr[scala.Nothing], selector: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.dom.Query.is")
    @js.native
    def is(el: js.Any): Boolean = js.native
    @JSGlobal("Ext.dom.Query.is")
    @js.native
    def is(el: js.Any, selector: java.lang.String): Boolean = js.native
    
    /** [Method] Selects an array of DOM nodes using JavaScript only implementation
      * @param selector String The selector/xpath query (can be a comma separated list of selectors)
      * @param root HTMLElement/String The start of the query.
      * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
      */
    @JSGlobal("Ext.dom.Query.jsSelect")
    @js.native
    def jsSelect(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.jsSelect")
    @js.native
    def jsSelect(selector: js.UndefOr[scala.Nothing], root: js.Any): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.jsSelect")
    @js.native
    def jsSelect(selector: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.jsSelect")
    @js.native
    def jsSelect(selector: java.lang.String, root: js.Any): typings.extjs.Ext.Array = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.dom.Query.matchers")
    @js.native
    def matchers: js.Any = js.native
    @scala.inline
    def matchers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchers")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.dom.Query.operators")
    @js.native
    def operators: js.Any = js.native
    @scala.inline
    def operators_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operators")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.dom.Query.pseudos")
    @js.native
    def pseudos: js.Any = js.native
    @scala.inline
    def pseudos_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pseudos")(x.asInstanceOf[js.Any])
    
    /** [Method] Selects an array of DOM nodes by CSS XPath selector
      * @param path String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @param type String Either "select" or "simple" for a simple selector match (only valid when used when the call is deferred to the jsSelect method)
      * @param single Boolean Pass true to select only the first matching node using document.querySelector (where available)
      * @returns HTMLElement[] An array of DOM elements (not a NodeList as returned by querySelectorAll).
      */
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(
      path: js.UndefOr[scala.Nothing],
      root: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      single: Boolean
    ): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(path: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], `type`: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(
      path: js.UndefOr[scala.Nothing],
      root: js.UndefOr[scala.Nothing],
      `type`: java.lang.String,
      single: Boolean
    ): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(path: js.UndefOr[scala.Nothing], root: HTMLElement): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(
      path: js.UndefOr[scala.Nothing],
      root: HTMLElement,
      `type`: js.UndefOr[scala.Nothing],
      single: Boolean
    ): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(path: js.UndefOr[scala.Nothing], root: HTMLElement, `type`: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(path: js.UndefOr[scala.Nothing], root: HTMLElement, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(path: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(
      path: java.lang.String,
      root: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      single: Boolean
    ): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(path: java.lang.String, root: js.UndefOr[scala.Nothing], `type`: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(path: java.lang.String, root: js.UndefOr[scala.Nothing], `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(path: java.lang.String, root: HTMLElement): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(path: java.lang.String, root: HTMLElement, `type`: js.UndefOr[scala.Nothing], single: Boolean): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(path: java.lang.String, root: HTMLElement, `type`: java.lang.String): typings.extjs.Ext.Array = js.native
    @JSGlobal("Ext.dom.Query.select")
    @js.native
    def select(path: java.lang.String, root: HTMLElement, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = js.native
    
    /** [Method] Selects a single element
      * @param selector String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @returns HTMLElement The DOM element which matched the selector.
      */
    @JSGlobal("Ext.dom.Query.selectNode")
    @js.native
    def selectNode(): HTMLElement = js.native
    @JSGlobal("Ext.dom.Query.selectNode")
    @js.native
    def selectNode(selector: js.UndefOr[scala.Nothing], root: HTMLElement): HTMLElement = js.native
    @JSGlobal("Ext.dom.Query.selectNode")
    @js.native
    def selectNode(selector: java.lang.String): HTMLElement = js.native
    @JSGlobal("Ext.dom.Query.selectNode")
    @js.native
    def selectNode(selector: java.lang.String, root: HTMLElement): HTMLElement = js.native
    
    /** [Method] Selects the value of a node parsing integers and floats
      * @param selector String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @param defaultValue Number When specified, this is return as empty value.
      * @returns Number
      */
    @JSGlobal("Ext.dom.Query.selectNumber")
    @js.native
    def selectNumber(): Double = js.native
    @JSGlobal("Ext.dom.Query.selectNumber")
    @js.native
    def selectNumber(selector: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], defaultValue: Double): Double = js.native
    @JSGlobal("Ext.dom.Query.selectNumber")
    @js.native
    def selectNumber(selector: js.UndefOr[scala.Nothing], root: HTMLElement): Double = js.native
    @JSGlobal("Ext.dom.Query.selectNumber")
    @js.native
    def selectNumber(selector: js.UndefOr[scala.Nothing], root: HTMLElement, defaultValue: Double): Double = js.native
    @JSGlobal("Ext.dom.Query.selectNumber")
    @js.native
    def selectNumber(selector: java.lang.String): Double = js.native
    @JSGlobal("Ext.dom.Query.selectNumber")
    @js.native
    def selectNumber(selector: java.lang.String, root: js.UndefOr[scala.Nothing], defaultValue: Double): Double = js.native
    @JSGlobal("Ext.dom.Query.selectNumber")
    @js.native
    def selectNumber(selector: java.lang.String, root: HTMLElement): Double = js.native
    @JSGlobal("Ext.dom.Query.selectNumber")
    @js.native
    def selectNumber(selector: java.lang.String, root: HTMLElement, defaultValue: Double): Double = js.native
    
    /** [Method] Selects the value of a node optionally replacing null with the defaultValue
      * @param selector String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @param defaultValue String When specified, this is return as empty value.
      * @returns String
      */
    @JSGlobal("Ext.dom.Query.selectValue")
    @js.native
    def selectValue(): java.lang.String = js.native
    @JSGlobal("Ext.dom.Query.selectValue")
    @js.native
    def selectValue(
      selector: js.UndefOr[scala.Nothing],
      root: js.UndefOr[scala.Nothing],
      defaultValue: java.lang.String
    ): java.lang.String = js.native
    @JSGlobal("Ext.dom.Query.selectValue")
    @js.native
    def selectValue(selector: js.UndefOr[scala.Nothing], root: HTMLElement): java.lang.String = js.native
    @JSGlobal("Ext.dom.Query.selectValue")
    @js.native
    def selectValue(selector: js.UndefOr[scala.Nothing], root: HTMLElement, defaultValue: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.dom.Query.selectValue")
    @js.native
    def selectValue(selector: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.dom.Query.selectValue")
    @js.native
    def selectValue(selector: java.lang.String, root: js.UndefOr[scala.Nothing], defaultValue: java.lang.String): java.lang.String = js.native
    @JSGlobal("Ext.dom.Query.selectValue")
    @js.native
    def selectValue(selector: java.lang.String, root: HTMLElement): java.lang.String = js.native
    @JSGlobal("Ext.dom.Query.selectValue")
    @js.native
    def selectValue(selector: java.lang.String, root: HTMLElement, defaultValue: java.lang.String): java.lang.String = js.native
  }
}
