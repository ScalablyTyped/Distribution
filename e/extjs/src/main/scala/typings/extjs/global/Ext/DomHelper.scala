package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.ITemplate
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.DomHelper")
@js.native
open class DomHelper ()
  extends StObject
     with typings.extjs.Ext.DomHelper
/* static members */
object DomHelper {
  
  @JSGlobal("Ext.DomHelper")
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
  @JSGlobal("Ext.DomHelper.self")
  @js.native
  def self: IClass = js.native
  inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.DomHelper.useDom")
  @js.native
  def useDom: Boolean = js.native
  inline def useDom_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useDom")(x.asInstanceOf[js.Any])
}
