package typings.dojo.dojo

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/html.html
  *
  * TODOC
  *
  */
@js.native
trait html extends js.Object {
  /**
    * inserts (replaces) the given content into the given node. dojo/dom-construct.place(cont, node, "only")
    * may be a better choice for simple HTML insertion.
    * Unless you need to use the params capabilities of this method, you should use
    * dojo/dom-construct.place(cont, node, "only"). dojo/dom-construct..place() has more robust support for injecting
    * an HTML string into the DOM, but it only handles inserting an HTML string as DOM
    * elements, or inserting a DOM node. dojo/dom-construct..place does not handle NodeList insertions
    * dojo/dom-construct.place(cont, node, "only"). dojo/dom-construct.place() has more robust support for injecting
    * an HTML string into the DOM, but it only handles inserting an HTML string as DOM
    * elements, or inserting a DOM node. dojo/dom-construct.place does not handle NodeList insertions
    * or the other capabilities as defined by the params object for this method.
    *
    * @param node the parent element that will receive the content
    * @param cont the content to be set on the parent element.This can be an html string, a node reference or a NodeList, dojo/NodeList, Array or other enumerable list of nodes
    * @param params               OptionalOptional flags/properties to configure the content-setting. See dojo/html/_ContentSetter
    */
  def set(node: HTMLElement, cont: String): js.Any = js.native
  def set(node: HTMLElement, cont: String, params: js.Object): js.Any = js.native
  /**
    * inserts (replaces) the given content into the given node. dojo/dom-construct.place(cont, node, "only")
    * may be a better choice for simple HTML insertion.
    * Unless you need to use the params capabilities of this method, you should use
    * dojo/dom-construct.place(cont, node, "only"). dojo/dom-construct..place() has more robust support for injecting
    * an HTML string into the DOM, but it only handles inserting an HTML string as DOM
    * elements, or inserting a DOM node. dojo/dom-construct..place does not handle NodeList insertions
    * dojo/dom-construct.place(cont, node, "only"). dojo/dom-construct.place() has more robust support for injecting
    * an HTML string into the DOM, but it only handles inserting an HTML string as DOM
    * elements, or inserting a DOM node. dojo/dom-construct.place does not handle NodeList insertions
    * or the other capabilities as defined by the params object for this method.
    *
    * @param node the parent element that will receive the content
    * @param cont the content to be set on the parent element.This can be an html string, a node reference or a NodeList, dojo/NodeList, Array or other enumerable list of nodes
    * @param params               OptionalOptional flags/properties to configure the content-setting. See dojo/html/_ContentSetter
    */
  def set(node: HTMLElement, cont: NodeList): js.Any = js.native
  def set(node: HTMLElement, cont: NodeList, params: js.Object): js.Any = js.native
  /**
    * inserts (replaces) the given content into the given node. dojo/dom-construct.place(cont, node, "only")
    * may be a better choice for simple HTML insertion.
    * Unless you need to use the params capabilities of this method, you should use
    * dojo/dom-construct.place(cont, node, "only"). dojo/dom-construct..place() has more robust support for injecting
    * an HTML string into the DOM, but it only handles inserting an HTML string as DOM
    * elements, or inserting a DOM node. dojo/dom-construct..place does not handle NodeList insertions
    * dojo/dom-construct.place(cont, node, "only"). dojo/dom-construct.place() has more robust support for injecting
    * an HTML string into the DOM, but it only handles inserting an HTML string as DOM
    * elements, or inserting a DOM node. dojo/dom-construct.place does not handle NodeList insertions
    * or the other capabilities as defined by the params object for this method.
    *
    * @param node the parent element that will receive the content
    * @param cont the content to be set on the parent element.This can be an html string, a node reference or a NodeList, dojo/NodeList, Array or other enumerable list of nodes
    * @param params               OptionalOptional flags/properties to configure the content-setting. See dojo/html/_ContentSetter
    */
  def set(node: HTMLElement, cont: HTMLElement): js.Any = js.native
  def set(node: HTMLElement, cont: HTMLElement, params: js.Object): js.Any = js.native
}

@JSGlobal("dojo.html")
@js.native
object html extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/html._ContentSetter.html
    *
    *
    * @param params
    * @param node
    */
  @js.native
  class _ContentSetter protected () extends js.Object {
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
  
}

