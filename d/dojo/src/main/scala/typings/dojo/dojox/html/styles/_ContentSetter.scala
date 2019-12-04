package typings.dojo.dojox.html.styles

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/html/styles._ContentSetter.html
  *
  *
  * @param params
  * @param node
  */
@JSGlobal("dojox.html.styles._ContentSetter")
@js.native
class _ContentSetter protected () extends js.Object {
  def this(params: js.Object, node: String) = this()
  /**
    * Adjust relative paths in html string content to point to this page
    * Only useful if you grab content from a another folder than the current one
    *
    */
  var adjustPaths: Boolean = js.native
  /**
    * Should the content be treated as a full html document,
    * and the real content stripped of ,  wrapper before injection
    *
    */
  var cleanContent: Boolean = js.native
  /**
    * The content to be placed in the node. Can be an HTML string, a node reference, or a enumerable list of nodes
    *
    */
  var content: String = js.native
  /**
    *
    */
  var executeScripts: Boolean = js.native
  /**
    * Should the content be treated as a full html document,
    * and the real content stripped of <html> <body> wrapper before injection
    *
    */
  var extractContent: Boolean = js.native
  /**
    * Usually only used internally, and auto-generated with each instance
    *
    */
  var id: js.Object = js.native
  /**
    * An node which will be the parent element that we set content into
    *
    */
  var node: HTMLElement = js.native
  /**
    * Should the node by passed to the parser after the new content is set
    *
    */
  var parseContent: Boolean = js.native
  /**
    * Flag passed to parser.  Root for attribute names to search for.   If scopeName is dojo,
    * will search for data-dojo-type (or dojoType).  For backwards compatibility
    * reasons defaults to dojo._scopeName (which is "dojo" except when
    * multi-version support is used, when it will be something like dojo16, dojo20, etc.)
    *
    */
  var parserScope: String = js.native
  /**
    *
    */
  var referencePath: String = js.native
  /**
    *
    */
  var renderStyles: Boolean = js.native
  /**
    *
    */
  var scriptHasHooks: Boolean = js.native
  /**
    *
    */
  var scriptHookReplacement: js.Object = js.native
  /**
    * Start the child widgets after parsing them.   Only obeyed if parseContent is true.
    *
    */
  var startup: Boolean = js.native
  /**
    *
    */
  def empty(): Unit = js.native
  /**
    * Called after instantiation, but before set();
    * It allows modification of any of the object properties - including the node and content
    * provided - before the set operation actually takes place
    * This implementation extends that of dojo.html._ContentSetter
    * to add handling for adjustPaths, renderStyles on the html string content before it is set
    *
    */
  def onBegin(): Unit = js.native
  /**
    *
    * @param err
    */
  def onContentError(err: js.Any): String = js.native
  /**
    * Called after set(), when the new content has been pushed into the node
    * It provides an opportunity for post-processing before handing back the node to the caller
    * This implementation extends that of dojo.html._ContentSetter
    *
    */
  def onEnd(): js.Any = js.native
  /**
    *
    * @param err
    */
  def onExecError(err: js.Any): String = js.native
  /**
    * front-end to the set-content sequence
    *
    * @param cont               OptionalAn html string, node or enumerable list of nodes for insertion into the domIf not provided, the object's content property will be used
    * @param params               Optional
    */
  def set(cont: String, params: js.Object): js.Any = js.native
  /**
    * front-end to the set-content sequence
    *
    * @param cont               OptionalAn html string, node or enumerable list of nodes for insertion into the domIf not provided, the object's content property will be used
    * @param params               Optional
    */
  def set(cont: HTMLElement, params: js.Object): js.Any = js.native
  /**
    * front-end to the set-content sequence
    *
    * @param cont               OptionalAn html string, node or enumerable list of nodes for insertion into the domIf not provided, the object's content property will be used
    * @param params               Optional
    */
  def set(cont: typings.std.NodeList, params: js.Object): js.Any = js.native
  /**
    * sets the content on the node
    *
    */
  def setContent(): Unit = js.native
  /**
    *
    */
  def tearDown(): Unit = js.native
}

