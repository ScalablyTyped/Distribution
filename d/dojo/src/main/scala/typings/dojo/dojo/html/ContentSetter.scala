package typings.dojo.dojo.html

import typings.dojo.dojo.NodeList
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/html._ContentSetter.html
  *
  *
  * @param params
  * @param node
  */
@JSGlobal("dojo.html._ContentSetter")
@js.native
class ContentSetter protected () extends js.Object {
  def this(params: js.Object, node: String) = this()
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
    * Start the child widgets after parsing them.   Only obeyed if parseContent is true.
    *
    */
  var startup: Boolean = js.native
  /**
    * cleanly empty out existing content
    *
    */
  def empty(): Unit = js.native
  /**
    * Called after instantiation, but before set();
    * It allows modification of any of the object properties -
    * including the node and content provided - before the set operation actually takes place
    * This default implementation checks for cleanContent and extractContent flags to
    * optionally pre-process html string content
    *
    */
  def onBegin(): js.Any = js.native
  /**
    *
    * @param err
    */
  def onContentError(err: js.Any): String = js.native
  /**
    * Called after set(), when the new content has been pushed into the node
    * It provides an opportunity for post-processing before handing back the node to the caller
    * This default implementation checks a parseContent flag to optionally run the dojo parser over the new content
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
  def set(cont: String): js.Any = js.native
  def set(cont: String, params: js.Object): js.Any = js.native
  /**
    * front-end to the set-content sequence
    *
    * @param cont               OptionalAn html string, node or enumerable list of nodes for insertion into the domIf not provided, the object's content property will be used
    * @param params               Optional
    */
  def set(cont: NodeList): js.Any = js.native
  def set(cont: NodeList, params: js.Object): js.Any = js.native
  /**
    * front-end to the set-content sequence
    *
    * @param cont               OptionalAn html string, node or enumerable list of nodes for insertion into the domIf not provided, the object's content property will be used
    * @param params               Optional
    */
  def set(cont: HTMLElement): js.Any = js.native
  def set(cont: HTMLElement, params: js.Object): js.Any = js.native
  /**
    * sets the content on the node
    *
    */
  def setContent(): Unit = js.native
  /**
    * manually reset the Setter instance if its being re-used for example for another set()
    * tearDown() is not called automatically.
    * In normal use, the Setter instance properties are simply allowed to fall out of scope
    * but the tearDown method can be called to explicitly reset this instance.
    *
    */
  def tearDown(): Unit = js.native
}

