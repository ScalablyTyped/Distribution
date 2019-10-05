package typings.extjs.Ext.core

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.ITemplate
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.core.DomHelper")
@js.native
class DomHelper () extends js.Object

/* static members */
@JSGlobal("Ext.core.DomHelper")
@js.native
object DomHelper extends js.Object {
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Property] (Boolean) */
  var useDom: Boolean = js.native
  /** [Method] Creates new DOM element s and appends them to el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @param returnElement Boolean true to return a Ext.Element
  		* @returns HTMLElement/Ext.Element The new node
  		*/
  def append(): js.Any = js.native
  def append(el: js.Any): js.Any = js.native
  def append(el: js.Any, o: js.Any): js.Any = js.native
  def append(el: js.Any, o: js.Any, returnElement: Boolean): js.Any = js.native
  /** [Method] Applies a style specification to an element
  		* @param el String/HTMLElement The element to apply styles to
  		* @param styles String/Object/Function A style specification string e.g. 'width:100px', or object in the form {width:'100px'}, or a function which returns such a specification.
  		*/
  def applyStyles(): Unit = js.native
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
  def generateStyles(styles: js.Any): js.Any = js.native
  def generateStyles(styles: js.Any, buffer: Array): js.Any = js.native
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
  def insertAfter(el: js.Any): js.Any = js.native
  def insertAfter(el: js.Any, o: js.Any): js.Any = js.native
  def insertAfter(el: js.Any, o: js.Any, returnElement: Boolean): js.Any = js.native
  /** [Method] Creates new DOM element s and inserts them before el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @param returnElement Boolean true to return a Ext.Element
  		* @returns HTMLElement/Ext.Element The new node
  		*/
  def insertBefore(): js.Any = js.native
  def insertBefore(el: js.Any): js.Any = js.native
  def insertBefore(el: js.Any, o: js.Any): js.Any = js.native
  def insertBefore(el: js.Any, o: js.Any, returnElement: Boolean): js.Any = js.native
  /** [Method] Creates new DOM element s and inserts them as the first child of el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @param returnElement Boolean true to return a Ext.Element
  		* @returns HTMLElement/Ext.Element The new node
  		*/
  def insertFirst(): js.Any = js.native
  def insertFirst(el: js.Any): js.Any = js.native
  def insertFirst(el: js.Any, o: js.Any): js.Any = js.native
  def insertFirst(el: js.Any, o: js.Any, returnElement: Boolean): js.Any = js.native
  /** [Method] Inserts an HTML fragment into the DOM
  		* @param where String Where to insert the html in relation to el - beforeBegin, afterBegin, beforeEnd, afterEnd. For example take the following HTML: &lt;div&gt;Contents&lt;/div&gt; Using different where values inserts element to the following places:  beforeBegin: &lt;HERE&gt;&lt;div&gt;Contents&lt;/div&gt; afterBegin: &lt;div&gt;&lt;HERE&gt;Contents&lt;/div&gt; beforeEnd: &lt;div&gt;Contents&lt;HERE&gt;&lt;/div&gt; afterEnd: &lt;div&gt;Contents&lt;/div&gt;&lt;HERE&gt;
  		* @param el HTMLElement/TextNode The context element
  		* @param html String The HTML fragment
  		* @returns HTMLElement The new node
  		*/
  def insertHtml(): HTMLElement = js.native
  def insertHtml(where: java.lang.String): HTMLElement = js.native
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
  def overwrite(el: js.Any): js.Any = js.native
  def overwrite(el: js.Any, o: js.Any): js.Any = js.native
  def overwrite(el: js.Any, o: js.Any, returnElement: Boolean): js.Any = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
}

