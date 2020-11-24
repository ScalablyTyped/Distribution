package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.ITemplate
import typings.extjs.Ext.dom.IElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.core")
@js.native
object core extends js.Object {
  
  @js.native
  class DomHelper ()
    extends typings.extjs.Ext.core.DomHelper
  /* static members */
  @js.native
  object DomHelper extends js.Object {
    
    /** [Method] Creates new DOM element s and appends them to el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    def append(): js.Any = js.native
    def append(el: js.UndefOr[scala.Nothing], o: js.UndefOr[scala.Nothing], returnElement: Boolean): js.Any = js.native
    def append(el: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
    def append(el: js.UndefOr[scala.Nothing], o: js.Any, returnElement: Boolean): js.Any = js.native
    def append(el: js.Any): js.Any = js.native
    def append(el: js.Any, o: js.UndefOr[scala.Nothing], returnElement: Boolean): js.Any = js.native
    def append(el: js.Any, o: js.Any): js.Any = js.native
    def append(el: js.Any, o: js.Any, returnElement: Boolean): js.Any = js.native
    
    /** [Method] Applies a style specification to an element
      * @param el String/HTMLElement The element to apply styles to
      * @param styles String/Object/Function A style specification string e.g. 'width:100px', or object in the form {width:'100px'}, or a function which returns such a specification.
      */
    def applyStyles(): Unit = js.native
    def applyStyles(el: js.UndefOr[scala.Nothing], styles: js.Any): Unit = js.native
    def applyStyles(el: js.Any): Unit = js.native
    def applyStyles(el: js.Any, styles: js.Any): Unit = js.native
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    def callOverridden(): js.Any = js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    def callParent(): js.Any = js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    def callSuper(): js.Any = js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Creates new DOM element s without inserting them to the document
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @returns HTMLElement The new uninserted node
      */
    def createDom(): HTMLElement = js.native
    def createDom(o: js.Any): HTMLElement = js.native
    
    /** [Method] Alias for markup
      * @param spec Object The DOM object spec (and children)
      * @returns String
      */
    def createHtml(): java.lang.String = js.native
    def createHtml(spec: js.Any): java.lang.String = js.native
    
    /** [Method] Creates a new Ext Template from the DOM object spec
      * @param o Object The DOM object spec (and children)
      * @returns Ext.Template The new template
      */
    def createTemplate(): ITemplate = js.native
    def createTemplate(o: js.Any): ITemplate = js.native
    
    /** [Method] Converts the styles from the given object to text
      * @param styles Object The object describing the styles.
      * @param buffer String[] The output buffer.
      * @returns String/String[] If buffer is passed, it is returned. Otherwise the style string is returned.
      */
    def generateStyles(): js.Any = js.native
    def generateStyles(styles: js.UndefOr[scala.Nothing], buffer: typings.extjs.Ext.Array): js.Any = js.native
    def generateStyles(styles: js.Any): js.Any = js.native
    def generateStyles(styles: js.Any, buffer: typings.extjs.Ext.Array): js.Any = js.native
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    def getInitialConfig(): js.Any = js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    def initConfig(): IBase = js.native
    def initConfig(config: js.Any): IBase = js.native
    
    /** [Method] Creates new DOM element s and inserts them after el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object The DOM object spec (and children)
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    def insertAfter(): js.Any = js.native
    def insertAfter(el: js.UndefOr[scala.Nothing], o: js.UndefOr[scala.Nothing], returnElement: Boolean): js.Any = js.native
    def insertAfter(el: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
    def insertAfter(el: js.UndefOr[scala.Nothing], o: js.Any, returnElement: Boolean): js.Any = js.native
    def insertAfter(el: js.Any): js.Any = js.native
    def insertAfter(el: js.Any, o: js.UndefOr[scala.Nothing], returnElement: Boolean): js.Any = js.native
    def insertAfter(el: js.Any, o: js.Any): js.Any = js.native
    def insertAfter(el: js.Any, o: js.Any, returnElement: Boolean): js.Any = js.native
    
    /** [Method] Creates new DOM element s and inserts them before el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    def insertBefore(): js.Any = js.native
    def insertBefore(el: js.UndefOr[scala.Nothing], o: js.UndefOr[scala.Nothing], returnElement: Boolean): js.Any = js.native
    def insertBefore(el: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
    def insertBefore(el: js.UndefOr[scala.Nothing], o: js.Any, returnElement: Boolean): js.Any = js.native
    def insertBefore(el: js.Any): js.Any = js.native
    def insertBefore(el: js.Any, o: js.UndefOr[scala.Nothing], returnElement: Boolean): js.Any = js.native
    def insertBefore(el: js.Any, o: js.Any): js.Any = js.native
    def insertBefore(el: js.Any, o: js.Any, returnElement: Boolean): js.Any = js.native
    
    /** [Method] Creates new DOM element s and inserts them as the first child of el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    def insertFirst(): js.Any = js.native
    def insertFirst(el: js.UndefOr[scala.Nothing], o: js.UndefOr[scala.Nothing], returnElement: Boolean): js.Any = js.native
    def insertFirst(el: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
    def insertFirst(el: js.UndefOr[scala.Nothing], o: js.Any, returnElement: Boolean): js.Any = js.native
    def insertFirst(el: js.Any): js.Any = js.native
    def insertFirst(el: js.Any, o: js.UndefOr[scala.Nothing], returnElement: Boolean): js.Any = js.native
    def insertFirst(el: js.Any, o: js.Any): js.Any = js.native
    def insertFirst(el: js.Any, o: js.Any, returnElement: Boolean): js.Any = js.native
    
    /** [Method] Inserts an HTML fragment into the DOM
      * @param where String Where to insert the html in relation to el - beforeBegin, afterBegin, beforeEnd, afterEnd. For example take the following HTML: &lt;div&gt;Contents&lt;/div&gt; Using different where values inserts element to the following places:  beforeBegin: &lt;HERE&gt;&lt;div&gt;Contents&lt;/div&gt; afterBegin: &lt;div&gt;&lt;HERE&gt;Contents&lt;/div&gt; beforeEnd: &lt;div&gt;Contents&lt;HERE&gt;&lt;/div&gt; afterEnd: &lt;div&gt;Contents&lt;/div&gt;&lt;HERE&gt;
      * @param el HTMLElement/TextNode The context element
      * @param html String The HTML fragment
      * @returns HTMLElement The new node
      */
    def insertHtml(): HTMLElement = js.native
    def insertHtml(where: js.UndefOr[scala.Nothing], el: js.UndefOr[scala.Nothing], html: java.lang.String): HTMLElement = js.native
    def insertHtml(where: js.UndefOr[scala.Nothing], el: js.Any): HTMLElement = js.native
    def insertHtml(where: js.UndefOr[scala.Nothing], el: js.Any, html: java.lang.String): HTMLElement = js.native
    def insertHtml(where: java.lang.String): HTMLElement = js.native
    def insertHtml(where: java.lang.String, el: js.UndefOr[scala.Nothing], html: java.lang.String): HTMLElement = js.native
    def insertHtml(where: java.lang.String, el: js.Any): HTMLElement = js.native
    def insertHtml(where: java.lang.String, el: js.Any, html: java.lang.String): HTMLElement = js.native
    
    /** [Method] Returns the markup for the passed Element s config
      * @param spec Object The DOM object spec (and children)
      * @returns String
      */
    def markup(): java.lang.String = js.native
    def markup(spec: js.Any): java.lang.String = js.native
    
    /** [Method] Creates new DOM element s and overwrites the contents of el with them
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return an Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    def overwrite(): js.Any = js.native
    def overwrite(el: js.UndefOr[scala.Nothing], o: js.UndefOr[scala.Nothing], returnElement: Boolean): js.Any = js.native
    def overwrite(el: js.UndefOr[scala.Nothing], o: js.Any): js.Any = js.native
    def overwrite(el: js.UndefOr[scala.Nothing], o: js.Any, returnElement: Boolean): js.Any = js.native
    def overwrite(el: js.Any): js.Any = js.native
    def overwrite(el: js.Any, o: js.UndefOr[scala.Nothing], returnElement: Boolean): js.Any = js.native
    def overwrite(el: js.Any, o: js.Any): js.Any = js.native
    def overwrite(el: js.Any, o: js.Any, returnElement: Boolean): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    var self: IClass = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    def statics(): IClass = js.native
    
    /** [Property] (Boolean) */
    var useDom: Boolean = js.native
  }
  
  @js.native
  class DomQuery ()
    extends typings.extjs.Ext.core.DomQuery
  /* static members */
  @js.native
  object DomQuery extends js.Object {
    
    /** [Method] Compiles a selector xpath query into a reusable function
      * @param selector String The selector/xpath query
      * @param type String Either "select" or "simple" for a simple selector match
      * @returns Function
      */
    def compile(): js.Any = js.native
    def compile(selector: js.UndefOr[scala.Nothing], `type`: java.lang.String): js.Any = js.native
    def compile(selector: java.lang.String): js.Any = js.native
    def compile(selector: java.lang.String, `type`: java.lang.String): js.Any = js.native
    
    /** [Method] Filters an array of elements to only include matches of a simple selector e g
      * @param el HTMLElement[] An array of elements to filter
      * @param selector String The simple selector to test
      * @param nonMatches Boolean If true, it returns the elements that DON'T match the selector instead of the ones that match
      * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
      */
    def filter(): typings.extjs.Ext.Array = js.native
    def filter(el: js.UndefOr[scala.Nothing], selector: js.UndefOr[scala.Nothing], nonMatches: Boolean): typings.extjs.Ext.Array = js.native
    def filter(el: js.UndefOr[scala.Nothing], selector: java.lang.String): typings.extjs.Ext.Array = js.native
    def filter(el: js.UndefOr[scala.Nothing], selector: java.lang.String, nonMatches: Boolean): typings.extjs.Ext.Array = js.native
    def filter(el: typings.extjs.Ext.Array): typings.extjs.Ext.Array = js.native
    def filter(el: typings.extjs.Ext.Array, selector: js.UndefOr[scala.Nothing], nonMatches: Boolean): typings.extjs.Ext.Array = js.native
    def filter(el: typings.extjs.Ext.Array, selector: java.lang.String): typings.extjs.Ext.Array = js.native
    def filter(el: typings.extjs.Ext.Array, selector: java.lang.String, nonMatches: Boolean): typings.extjs.Ext.Array = js.native
    
    /** [Method] Returns true if the passed element s match the passed simple selector e g
      * @param el String/HTMLElement/HTMLElement[] An element id, element or array of elements
      * @param selector String The simple selector to test
      * @returns Boolean
      */
    def is(): Boolean = js.native
    def is(el: js.UndefOr[scala.Nothing], selector: java.lang.String): Boolean = js.native
    def is(el: js.Any): Boolean = js.native
    def is(el: js.Any, selector: java.lang.String): Boolean = js.native
    
    /** [Method] Selects an array of DOM nodes using JavaScript only implementation
      * @param selector String The selector/xpath query (can be a comma separated list of selectors)
      * @param root HTMLElement/String The start of the query.
      * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
      */
    def jsSelect(): typings.extjs.Ext.Array = js.native
    def jsSelect(selector: js.UndefOr[scala.Nothing], root: js.Any): typings.extjs.Ext.Array = js.native
    def jsSelect(selector: java.lang.String): typings.extjs.Ext.Array = js.native
    def jsSelect(selector: java.lang.String, root: js.Any): typings.extjs.Ext.Array = js.native
    
    /** [Property] (Object) */
    var matchers: js.Any = js.native
    
    /** [Property] (Object) */
    var operators: js.Any = js.native
    
    /** [Property] (Object) */
    var pseudos: js.Any = js.native
    
    /** [Method] Selects an array of DOM nodes by CSS XPath selector
      * @param path String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @param type String Either "select" or "simple" for a simple selector match (only valid when used when the call is deferred to the jsSelect method)
      * @param single Boolean Pass true to select only the first matching node using document.querySelector (where available)
      * @returns HTMLElement[] An array of DOM elements (not a NodeList as returned by querySelectorAll).
      */
    def select(): typings.extjs.Ext.Array = js.native
    def select(
      path: js.UndefOr[scala.Nothing],
      root: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      single: Boolean
    ): typings.extjs.Ext.Array = js.native
    def select(path: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], `type`: java.lang.String): typings.extjs.Ext.Array = js.native
    def select(
      path: js.UndefOr[scala.Nothing],
      root: js.UndefOr[scala.Nothing],
      `type`: java.lang.String,
      single: Boolean
    ): typings.extjs.Ext.Array = js.native
    def select(path: js.UndefOr[scala.Nothing], root: HTMLElement): typings.extjs.Ext.Array = js.native
    def select(
      path: js.UndefOr[scala.Nothing],
      root: HTMLElement,
      `type`: js.UndefOr[scala.Nothing],
      single: Boolean
    ): typings.extjs.Ext.Array = js.native
    def select(path: js.UndefOr[scala.Nothing], root: HTMLElement, `type`: java.lang.String): typings.extjs.Ext.Array = js.native
    def select(path: js.UndefOr[scala.Nothing], root: HTMLElement, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = js.native
    def select(path: java.lang.String): typings.extjs.Ext.Array = js.native
    def select(
      path: java.lang.String,
      root: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      single: Boolean
    ): typings.extjs.Ext.Array = js.native
    def select(path: java.lang.String, root: js.UndefOr[scala.Nothing], `type`: java.lang.String): typings.extjs.Ext.Array = js.native
    def select(path: java.lang.String, root: js.UndefOr[scala.Nothing], `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = js.native
    def select(path: java.lang.String, root: HTMLElement): typings.extjs.Ext.Array = js.native
    def select(path: java.lang.String, root: HTMLElement, `type`: js.UndefOr[scala.Nothing], single: Boolean): typings.extjs.Ext.Array = js.native
    def select(path: java.lang.String, root: HTMLElement, `type`: java.lang.String): typings.extjs.Ext.Array = js.native
    def select(path: java.lang.String, root: HTMLElement, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = js.native
    
    /** [Method] Selects a single element
      * @param selector String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @returns HTMLElement The DOM element which matched the selector.
      */
    def selectNode(): HTMLElement = js.native
    def selectNode(selector: js.UndefOr[scala.Nothing], root: HTMLElement): HTMLElement = js.native
    def selectNode(selector: java.lang.String): HTMLElement = js.native
    def selectNode(selector: java.lang.String, root: HTMLElement): HTMLElement = js.native
    
    /** [Method] Selects the value of a node parsing integers and floats
      * @param selector String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @param defaultValue Number When specified, this is return as empty value.
      * @returns Number
      */
    def selectNumber(): Double = js.native
    def selectNumber(selector: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], defaultValue: Double): Double = js.native
    def selectNumber(selector: js.UndefOr[scala.Nothing], root: HTMLElement): Double = js.native
    def selectNumber(selector: js.UndefOr[scala.Nothing], root: HTMLElement, defaultValue: Double): Double = js.native
    def selectNumber(selector: java.lang.String): Double = js.native
    def selectNumber(selector: java.lang.String, root: js.UndefOr[scala.Nothing], defaultValue: Double): Double = js.native
    def selectNumber(selector: java.lang.String, root: HTMLElement): Double = js.native
    def selectNumber(selector: java.lang.String, root: HTMLElement, defaultValue: Double): Double = js.native
    
    /** [Method] Selects the value of a node optionally replacing null with the defaultValue
      * @param selector String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @param defaultValue String When specified, this is return as empty value.
      * @returns String
      */
    def selectValue(): java.lang.String = js.native
    def selectValue(
      selector: js.UndefOr[scala.Nothing],
      root: js.UndefOr[scala.Nothing],
      defaultValue: java.lang.String
    ): java.lang.String = js.native
    def selectValue(selector: js.UndefOr[scala.Nothing], root: HTMLElement): java.lang.String = js.native
    def selectValue(selector: js.UndefOr[scala.Nothing], root: HTMLElement, defaultValue: java.lang.String): java.lang.String = js.native
    def selectValue(selector: java.lang.String): java.lang.String = js.native
    def selectValue(selector: java.lang.String, root: js.UndefOr[scala.Nothing], defaultValue: java.lang.String): java.lang.String = js.native
    def selectValue(selector: java.lang.String, root: HTMLElement): java.lang.String = js.native
    def selectValue(selector: java.lang.String, root: HTMLElement, defaultValue: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  class Element ()
    extends typings.extjs.Ext.core.Element
  /* static members */
  @js.native
  object Element extends js.Object {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    def addMembers(): Unit = js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    def addStatics(): IBase = js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    def createAlias(): Unit = js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    def createAlias(alias: js.Any): Unit = js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Returns the top Element that is located at the passed coordinates Defined in override Ext dom AbstractElement_static
      * @param x Number The x coordinate
      * @param y Number The y coordinate
      * @returns String The found Element
      */
    def fromPoint(): java.lang.String = js.native
    def fromPoint(x: js.UndefOr[scala.Nothing], y: Double): java.lang.String = js.native
    def fromPoint(x: Double): java.lang.String = js.native
    def fromPoint(x: Double, y: Double): java.lang.String = js.native
    
    /** [Method] Retrieves Ext dom Element objects
      * @param el String/HTMLElement/Ext.Element The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element The Element object (or null if no matching element was found)
      */
    def get(): IElement = js.native
    def get(el: js.Any): IElement = js.native
    
    /** [Method] Retrieves the document height Defined in override Ext dom AbstractElement_static
      * @returns Number documentHeight
      */
    def getDocumentHeight(): Double = js.native
    
    /** [Method] Retrieves the document width Defined in override Ext dom AbstractElement_static
      * @returns Number documentWidth
      */
    def getDocumentWidth(): Double = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    def getName(): java.lang.String = js.native
    
    /** [Method] Retrieves the current orientation of the window
      * @returns String Orientation of window: 'portrait' or 'landscape'
      */
    def getOrientation(): java.lang.String = js.native
    
    /** [Method] Retrieves the viewport size of the window
      * @returns Object object containing width and height properties
      */
    def getViewSize(): js.Any = js.native
    
    /** [Method] Retrieves the viewport height of the window
      * @returns Number viewportHeight
      */
    def getViewportHeight(): Double = js.native
    
    /** [Method] Retrieves the viewport width of the window
      * @returns Number viewportWidth
      */
    def getViewportWidth(): Double = js.native
    
    /** [Method] Adds members to class  */
    def implement(): Unit = js.native
    
    /** [Method] Returns an array of unique class names based upon the input strings or string arrays
      * @param clsList1 Mixed A string of class names, or an array of class names.
      * @param clsList2 Mixed A string of class names, or an array of class names.
      * @returns Array An array of strings representing remaining unique, merged class names. If class names were added to the first list, the changed property will be true.
      */
    def mergeClsList(): typings.extjs.Ext.Array = js.native
    def mergeClsList(clsList1: js.UndefOr[scala.Nothing], clsList2: js.Any): typings.extjs.Ext.Array = js.native
    def mergeClsList(clsList1: js.Any): typings.extjs.Ext.Array = js.native
    def mergeClsList(clsList1: js.Any, clsList2: js.Any): typings.extjs.Ext.Array = js.native
    
    /** [Method] Normalizes CSS property keys from dash delimited to camel case JavaScript Syntax
      * @param prop String The property to normalize
      * @returns String The normalized string
      */
    def normalize(): java.lang.String = js.native
    def normalize(prop: java.lang.String): java.lang.String = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    def `override`(): IBase = js.native
    def `override`(members: js.Any): IBase = js.native
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param box Number/String The encoded margins
      * @returns Object An object with margin sizes for top, right, bottom and left
      */
    def parseBox(): js.Any = js.native
    def parseBox(box: js.Any): js.Any = js.native
    
    /** [Method] Converts a CSS string into an object with a property for each style
      * @param styles String A CSS string
      * @returns Object styles
      */
    def parseStyles(): js.Any = js.native
    def parseStyles(styles: java.lang.String): js.Any = js.native
    
    /** [Method] Returns an array of unique class names deom the first parameter with all class names from the second parameter removed
      * @param existingClsList Mixed A string of class names, or an array of class names.
      * @param removeClsList Mixed A string of class names, or an array of class names to remove from existingClsList.
      * @returns Array An array of strings representing remaining class names. If class names were removed, the changed property will be true.
      */
    def removeCls(): typings.extjs.Ext.Array = js.native
    def removeCls(existingClsList: js.UndefOr[scala.Nothing], removeClsList: js.Any): typings.extjs.Ext.Array = js.native
    def removeCls(existingClsList: js.Any): typings.extjs.Ext.Array = js.native
    def removeCls(existingClsList: js.Any, removeClsList: js.Any): typings.extjs.Ext.Array = js.native
    
    /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
      * @param selector String/HTMLElement[] The CSS selector or an array of elements
      * @param unique Boolean true to create a unique Ext.Element for each element (defaults to a shared flyweight object)
      * @param root HTMLElement/String The root element of the query or id of the root
      * @returns Ext.CompositeElementLite/Ext.CompositeElement
      */
    def select(): js.Any = js.native
    def select(selector: js.UndefOr[scala.Nothing], unique: js.UndefOr[scala.Nothing], root: js.Any): js.Any = js.native
    def select(selector: js.UndefOr[scala.Nothing], unique: Boolean): js.Any = js.native
    def select(selector: js.UndefOr[scala.Nothing], unique: Boolean, root: js.Any): js.Any = js.native
    def select(selector: js.Any): js.Any = js.native
    def select(selector: js.Any, unique: js.UndefOr[scala.Nothing], root: js.Any): js.Any = js.native
    def select(selector: js.Any, unique: Boolean): js.Any = js.native
    def select(selector: js.Any, unique: Boolean, root: js.Any): js.Any = js.native
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param box Number/String/Object The encoded margins, or an object with top, right, bottom, and left properties
      * @param units String The type of units to add
      * @returns String An string with unitized (px if units is not specified) metrics for top, right, bottom and left
      */
    def unitizeBox(): java.lang.String = js.native
    def unitizeBox(box: js.UndefOr[scala.Nothing], units: java.lang.String): java.lang.String = js.native
    def unitizeBox(box: js.Any): java.lang.String = js.native
    def unitizeBox(box: js.Any, units: java.lang.String): java.lang.String = js.native
  }
}
