package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.ITemplate
import typings.extjs.Ext.dom.IElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @JSGlobal("Ext.core.DomHelper")
  @js.native
  open class DomHelper ()
    extends StObject
       with typings.extjs.Ext.core.DomHelper
  /* static members */
  object DomHelper {
    
    @JSGlobal("Ext.core.DomHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Creates new DOM element s and appends them to el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    inline def append(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("append")().asInstanceOf[Any]
    inline def append(el: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("append")(el.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def append(el: Any, o: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def append(el: Any, o: Any, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def append(el: Any, o: Unit, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def append(el: Unit, o: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def append(el: Unit, o: Any, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def append(el: Unit, o: Unit, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** [Method] Applies a style specification to an element
      * @param el String/HTMLElement The element to apply styles to
      * @param styles String/Object/Function A style specification string e.g. 'width:100px', or object in the form {width:'100px'}, or a function which returns such a specification.
      */
    inline def applyStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyStyles")().asInstanceOf[Unit]
    inline def applyStyles(el: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyStyles")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def applyStyles(el: Any, styles: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStyles")(el.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyStyles(el: Unit, styles: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStyles")(el.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Creates new DOM element s without inserting them to the document
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @returns HTMLElement The new uninserted node
      */
    inline def createDom(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createDom")().asInstanceOf[HTMLElement]
    inline def createDom(o: Any): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createDom")(o.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    /** [Method] Alias for markup
      * @param spec Object The DOM object spec (and children)
      * @returns String
      */
    inline def createHtml(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createHtml")().asInstanceOf[java.lang.String]
    inline def createHtml(spec: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createHtml")(spec.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Creates a new Ext Template from the DOM object spec
      * @param o Object The DOM object spec (and children)
      * @returns Ext.Template The new template
      */
    inline def createTemplate(): ITemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createTemplate")().asInstanceOf[ITemplate]
    inline def createTemplate(o: Any): ITemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createTemplate")(o.asInstanceOf[js.Any]).asInstanceOf[ITemplate]
    
    /** [Method] Converts the styles from the given object to text
      * @param styles Object The object describing the styles.
      * @param buffer String[] The output buffer.
      * @returns String/String[] If buffer is passed, it is returned. Otherwise the style string is returned.
      */
    inline def generateStyles(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStyles")().asInstanceOf[Any]
    inline def generateStyles(styles: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def generateStyles(styles: Any, buffer: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generateStyles")(styles.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def generateStyles(styles: Unit, buffer: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generateStyles")(styles.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** [Method] Returns the initial configuration passed to constructor when instantiating this class
      * @param name String Name of the config option to return.
      * @returns Object/Mixed The full config object or a single config value when name parameter specified.
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param config Object
      * @returns Ext.Base this
      */
    inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
    inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Creates new DOM element s and inserts them after el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object The DOM object spec (and children)
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    inline def insertAfter(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")().asInstanceOf[Any]
    inline def insertAfter(el: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(el.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def insertAfter(el: Any, o: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertAfter(el: Any, o: Any, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertAfter(el: Any, o: Unit, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertAfter(el: Unit, o: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertAfter(el: Unit, o: Any, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertAfter(el: Unit, o: Unit, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** [Method] Creates new DOM element s and inserts them before el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    inline def insertBefore(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")().asInstanceOf[Any]
    inline def insertBefore(el: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(el.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def insertBefore(el: Any, o: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertBefore(el: Any, o: Any, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertBefore(el: Any, o: Unit, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertBefore(el: Unit, o: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertBefore(el: Unit, o: Any, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertBefore(el: Unit, o: Unit, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** [Method] Creates new DOM element s and inserts them as the first child of el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    inline def insertFirst(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFirst")().asInstanceOf[Any]
    inline def insertFirst(el: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFirst")(el.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def insertFirst(el: Any, o: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFirst")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertFirst(el: Any, o: Any, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFirst")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertFirst(el: Any, o: Unit, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFirst")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertFirst(el: Unit, o: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFirst")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertFirst(el: Unit, o: Any, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFirst")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def insertFirst(el: Unit, o: Unit, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFirst")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** [Method] Inserts an HTML fragment into the DOM
      * @param where String Where to insert the html in relation to el - beforeBegin, afterBegin, beforeEnd, afterEnd. For example take the following HTML: &lt;div&gt;Contents&lt;/div&gt; Using different where values inserts element to the following places:  beforeBegin: &lt;HERE&gt;&lt;div&gt;Contents&lt;/div&gt; afterBegin: &lt;div&gt;&lt;HERE&gt;Contents&lt;/div&gt; beforeEnd: &lt;div&gt;Contents&lt;HERE&gt;&lt;/div&gt; afterEnd: &lt;div&gt;Contents&lt;/div&gt;&lt;HERE&gt;
      * @param el HTMLElement/TextNode The context element
      * @param html String The HTML fragment
      * @returns HTMLElement The new node
      */
    inline def insertHtml(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("insertHtml")().asInstanceOf[HTMLElement]
    inline def insertHtml(where: java.lang.String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("insertHtml")(where.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    inline def insertHtml(where: java.lang.String, el: Any): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("insertHtml")(where.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    inline def insertHtml(where: java.lang.String, el: Any, html: java.lang.String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("insertHtml")(where.asInstanceOf[js.Any], el.asInstanceOf[js.Any], html.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    inline def insertHtml(where: java.lang.String, el: Unit, html: java.lang.String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("insertHtml")(where.asInstanceOf[js.Any], el.asInstanceOf[js.Any], html.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    inline def insertHtml(where: Unit, el: Any): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("insertHtml")(where.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    inline def insertHtml(where: Unit, el: Any, html: java.lang.String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("insertHtml")(where.asInstanceOf[js.Any], el.asInstanceOf[js.Any], html.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    inline def insertHtml(where: Unit, el: Unit, html: java.lang.String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("insertHtml")(where.asInstanceOf[js.Any], el.asInstanceOf[js.Any], html.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /** [Method] Returns the markup for the passed Element s config
      * @param spec Object The DOM object spec (and children)
      * @returns String
      */
    inline def markup(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("markup")().asInstanceOf[java.lang.String]
    inline def markup(spec: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("markup")(spec.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Creates new DOM element s and overwrites the contents of el with them
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return an Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    inline def overwrite(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")().asInstanceOf[Any]
    inline def overwrite(el: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")(el.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def overwrite(el: Any, o: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def overwrite(el: Any, o: Any, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def overwrite(el: Any, o: Unit, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def overwrite(el: Unit, o: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def overwrite(el: Unit, o: Any, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def overwrite(el: Unit, o: Unit, returnElement: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")(el.asInstanceOf[js.Any], o.asInstanceOf[js.Any], returnElement.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.core.DomHelper.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.core.DomHelper.useDom")
    @js.native
    def useDom: Boolean = js.native
    inline def useDom_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useDom")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.core.DomQuery")
  @js.native
  open class DomQuery ()
    extends StObject
       with typings.extjs.Ext.core.DomQuery
  /* static members */
  object DomQuery {
    
    @JSGlobal("Ext.core.DomQuery")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Compiles a selector xpath query into a reusable function
      * @param selector String The selector/xpath query
      * @param type String Either "select" or "simple" for a simple selector match
      * @returns Function
      */
    inline def compile(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")().asInstanceOf[Any]
    inline def compile(selector: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def compile(selector: java.lang.String, `type`: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def compile(selector: Unit, `type`: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** [Method] Filters an array of elements to only include matches of a simple selector e g
      * @param el HTMLElement[] An array of elements to filter
      * @param selector String The simple selector to test
      * @param nonMatches Boolean If true, it returns the elements that DON'T match the selector instead of the ones that match
      * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
      */
    inline def filter(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: Unit, selector: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: Unit, selector: java.lang.String, nonMatches: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nonMatches.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: Unit, selector: Unit, nonMatches: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nonMatches.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: typings.extjs.Ext.Array, selector: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: typings.extjs.Ext.Array, selector: java.lang.String, nonMatches: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nonMatches.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def filter(el: typings.extjs.Ext.Array, selector: Unit, nonMatches: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nonMatches.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Returns true if the passed element s match the passed simple selector e g
      * @param el String/HTMLElement/HTMLElement[] An element id, element or array of elements
      * @param selector String The simple selector to test
      * @returns Boolean
      */
    inline def is(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[Boolean]
    inline def is(el: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def is(el: Any, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def is(el: Unit, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Selects an array of DOM nodes using JavaScript only implementation
      * @param selector String The selector/xpath query (can be a comma separated list of selectors)
      * @param root HTMLElement/String The start of the query.
      * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
      */
    inline def jsSelect(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("jsSelect")().asInstanceOf[typings.extjs.Ext.Array]
    inline def jsSelect(selector: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("jsSelect")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def jsSelect(selector: java.lang.String, root: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("jsSelect")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def jsSelect(selector: Unit, root: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("jsSelect")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Property] (Object) */
    @JSGlobal("Ext.core.DomQuery.matchers")
    @js.native
    def matchers: Any = js.native
    inline def matchers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchers")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.core.DomQuery.operators")
    @js.native
    def operators: Any = js.native
    inline def operators_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operators")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.core.DomQuery.pseudos")
    @js.native
    def pseudos: Any = js.native
    inline def pseudos_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pseudos")(x.asInstanceOf[js.Any])
    
    /** [Method] Selects an array of DOM nodes by CSS XPath selector
      * @param path String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @param type String Either "select" or "simple" for a simple selector match (only valid when used when the call is deferred to the jsSelect method)
      * @param single Boolean Pass true to select only the first matching node using document.querySelector (where available)
      * @returns HTMLElement[] An array of DOM elements (not a NodeList as returned by querySelectorAll).
      */
    inline def select(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: Unit, `type`: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: Unit, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: Unit, `type`: Unit, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: HTMLElement): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: HTMLElement, `type`: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: HTMLElement, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: java.lang.String, root: HTMLElement, `type`: Unit, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: Unit, `type`: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: Unit, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: Unit, `type`: Unit, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: HTMLElement): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: HTMLElement, `type`: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: HTMLElement, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def select(path: Unit, root: HTMLElement, `type`: Unit, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Selects a single element
      * @param selector String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @returns HTMLElement The DOM element which matched the selector.
      */
    inline def selectNode(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")().asInstanceOf[HTMLElement]
    inline def selectNode(selector: java.lang.String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")(selector.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    inline def selectNode(selector: java.lang.String, root: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    inline def selectNode(selector: Unit, root: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /** [Method] Selects the value of a node parsing integers and floats
      * @param selector String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @param defaultValue Number When specified, this is return as empty value.
      * @returns Number
      */
    inline def selectNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")().asInstanceOf[Double]
    inline def selectNumber(selector: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def selectNumber(selector: java.lang.String, root: Unit, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def selectNumber(selector: java.lang.String, root: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def selectNumber(selector: java.lang.String, root: HTMLElement, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def selectNumber(selector: Unit, root: Unit, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def selectNumber(selector: Unit, root: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def selectNumber(selector: Unit, root: HTMLElement, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] Selects the value of a node optionally replacing null with the defaultValue
      * @param selector String The selector/xpath query
      * @param root HTMLElement The start of the query.
      * @param defaultValue String When specified, this is return as empty value.
      * @returns String
      */
    inline def selectValue(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")().asInstanceOf[java.lang.String]
    inline def selectValue(selector: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def selectValue(selector: java.lang.String, root: Unit, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def selectValue(selector: java.lang.String, root: HTMLElement): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def selectValue(selector: java.lang.String, root: HTMLElement, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def selectValue(selector: Unit, root: Unit, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def selectValue(selector: Unit, root: HTMLElement): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def selectValue(selector: Unit, root: HTMLElement, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  }
  
  @JSGlobal("Ext.core.Element")
  @js.native
  open class Element ()
    extends StObject
       with typings.extjs.Ext.core.Element
  /* static members */
  object Element {
    
    @JSGlobal("Ext.core.Element")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    inline def create(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: Any, origin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns the top Element that is located at the passed coordinates Defined in override Ext dom AbstractElement_static
      * @param x Number The x coordinate
      * @param y Number The y coordinate
      * @returns String The found Element
      */
    inline def fromPoint(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")().asInstanceOf[java.lang.String]
    inline def fromPoint(x: Double): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(x.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def fromPoint(x: Double, y: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def fromPoint(x: Unit, y: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Method] Retrieves Ext dom Element objects
      * @param el String/HTMLElement/Ext.Element The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element The Element object (or null if no matching element was found)
      */
    inline def get(): IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[IElement]
    inline def get(el: Any): IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(el.asInstanceOf[js.Any]).asInstanceOf[IElement]
    
    /** [Method] Retrieves the document height Defined in override Ext dom AbstractElement_static
      * @returns Number documentHeight
      */
    inline def getDocumentHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentHeight")().asInstanceOf[Double]
    
    /** [Method] Retrieves the document width Defined in override Ext dom AbstractElement_static
      * @returns Number documentWidth
      */
    inline def getDocumentWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentWidth")().asInstanceOf[Double]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Retrieves the current orientation of the window
      * @returns String Orientation of window: 'portrait' or 'landscape'
      */
    inline def getOrientation(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientation")().asInstanceOf[java.lang.String]
    
    /** [Method] Retrieves the viewport size of the window
      * @returns Object object containing width and height properties
      */
    inline def getViewSize(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewSize")().asInstanceOf[Any]
    
    /** [Method] Retrieves the viewport height of the window
      * @returns Number viewportHeight
      */
    inline def getViewportHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportHeight")().asInstanceOf[Double]
    
    /** [Method] Retrieves the viewport width of the window
      * @returns Number viewportWidth
      */
    inline def getViewportWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportWidth")().asInstanceOf[Double]
    
    /** [Method] Adds members to class  */
    inline def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
    
    /** [Method] Returns an array of unique class names based upon the input strings or string arrays
      * @param clsList1 Mixed A string of class names, or an array of class names.
      * @param clsList2 Mixed A string of class names, or an array of class names.
      * @returns Array An array of strings representing remaining unique, merged class names. If class names were added to the first list, the changed property will be true.
      */
    inline def mergeClsList(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClsList")().asInstanceOf[typings.extjs.Ext.Array]
    inline def mergeClsList(clsList1: Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClsList")(clsList1.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def mergeClsList(clsList1: Any, clsList2: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeClsList")(clsList1.asInstanceOf[js.Any], clsList2.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def mergeClsList(clsList1: Unit, clsList2: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeClsList")(clsList1.asInstanceOf[js.Any], clsList2.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Normalizes CSS property keys from dash delimited to camel case JavaScript Syntax
      * @param prop String The property to normalize
      * @returns String The normalized string
      */
    inline def normalize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[java.lang.String]
    inline def normalize(prop: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(prop.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param box Number/String The encoded margins
      * @returns Object An object with margin sizes for top, right, bottom and left
      */
    inline def parseBox(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBox")().asInstanceOf[Any]
    inline def parseBox(box: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBox")(box.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Converts a CSS string into an object with a property for each style
      * @param styles String A CSS string
      * @returns Object styles
      */
    inline def parseStyles(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStyles")().asInstanceOf[Any]
    inline def parseStyles(styles: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns an array of unique class names deom the first parameter with all class names from the second parameter removed
      * @param existingClsList Mixed A string of class names, or an array of class names.
      * @param removeClsList Mixed A string of class names, or an array of class names to remove from existingClsList.
      * @returns Array An array of strings representing remaining class names. If class names were removed, the changed property will be true.
      */
    inline def removeCls(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")().asInstanceOf[typings.extjs.Ext.Array]
    inline def removeCls(existingClsList: Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(existingClsList.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
    inline def removeCls(existingClsList: Any, removeClsList: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(existingClsList.asInstanceOf[js.Any], removeClsList.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    inline def removeCls(existingClsList: Unit, removeClsList: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(existingClsList.asInstanceOf[js.Any], removeClsList.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
    
    /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
      * @param selector String/HTMLElement[] The CSS selector or an array of elements
      * @param unique Boolean true to create a unique Ext.Element for each element (defaults to a shared flyweight object)
      * @param root HTMLElement/String The root element of the query or id of the root
      * @returns Ext.CompositeElementLite/Ext.CompositeElement
      */
    inline def select(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[Any]
    inline def select(selector: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def select(selector: Any, unique: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], unique.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def select(selector: Any, unique: Boolean, root: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], unique.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def select(selector: Any, unique: Unit, root: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], unique.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def select(selector: Unit, unique: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], unique.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def select(selector: Unit, unique: Boolean, root: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], unique.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def select(selector: Unit, unique: Unit, root: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], unique.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** [Method] Parses a number or string representing margin sizes into an object
      * @param box Number/String/Object The encoded margins, or an object with top, right, bottom, and left properties
      * @param units String The type of units to add
      * @returns String An string with unitized (px if units is not specified) metrics for top, right, bottom and left
      */
    inline def unitizeBox(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")().asInstanceOf[java.lang.String]
    inline def unitizeBox(box: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")(box.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def unitizeBox(box: Any, units: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")(box.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def unitizeBox(box: Unit, units: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")(box.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  }
}
