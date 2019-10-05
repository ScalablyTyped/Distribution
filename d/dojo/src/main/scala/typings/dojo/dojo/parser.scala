package typings.dojo.dojo

import typings.dojo.dojo.promise.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/parser.html
  *
  * The Dom/Widget parsing package
  *
  */
@js.native
trait parser extends js.Object {
  /**
    * Calls new ctor(params, node), where params is the hash of parameters specified on the node,
    * excluding data-dojo-type and data-dojo-mixins.   Does not call startup().
    *
    * @param ctor Widget constructor.
    * @param node This node will be replaced/attached to by the widget.  It also specifies the arguments to pass to ctor.
    * @param mixin               OptionalAttributes in this object will be passed as parameters to ctor,overriding attributes specified on the node.
    * @param options               OptionalAn options object used to hold kwArgs for instantiation.   See parse.options argument for details.
    * @param scripts               OptionalArray of <script type="dojo//"> DOMNodes.  If not specified, will search for <script> tags inside node.
    * @param inherited               OptionalSettings from dir=rtl or lang=... on a node above this node.   Overrides options.inherited.
    */
  def construct(ctor: js.Function, node: HTMLElement): js.Any = js.native
  def construct(ctor: js.Function, node: HTMLElement, mixin: js.Object): js.Any = js.native
  def construct(ctor: js.Function, node: HTMLElement, mixin: js.Object, options: js.Object): js.Any = js.native
  def construct(
    ctor: js.Function,
    node: HTMLElement,
    mixin: js.Object,
    options: js.Object,
    scripts: js.Array[HTMLElement]
  ): js.Any = js.native
  def construct(
    ctor: js.Function,
    node: HTMLElement,
    mixin: js.Object,
    options: js.Object,
    scripts: js.Array[HTMLElement],
    inherited: js.Object
  ): js.Any = js.native
  /**
    * Takes array of nodes, and turns them into class instances and
    * potentially calls a startup method to allow them to connect with
    * any children.
    *
    * @param nodes Array of DOM nodes
    * @param mixin               OptionalAn object that will be mixed in with each node in the array.Values in the mixin will override values in the node, if theyexist.
    * @param options               OptionalAn object used to hold kwArgs for instantiation.See parse.options argument for details.
    */
  def instantiate(nodes: js.Array[_]): js.Any = js.native
  def instantiate(nodes: js.Array[_], mixin: js.Object): js.Any = js.native
  def instantiate(nodes: js.Array[_], mixin: js.Object, options: js.Object): js.Any = js.native
  /**
    * Scan the DOM for class instances, and instantiate them.
    * Search specified node (or root node) recursively for class instances,
    * and instantiate them. Searches for either data-dojo-type="Class" or
    * dojoType="Class" where "Class" is a a fully qualified class name,
    * like dijit/form/Button
    *
    * Using data-dojo-type:
    * Attributes using can be mixed into the parameters used to instantiate the
    * Class by using a data-dojo-props attribute on the node being converted.
    * data-dojo-props should be a string attribute to be converted from JSON.
    *
    * Using dojoType:
    * Attributes are read from the original domNode and converted to appropriate
    * types by looking up the Class prototype values. This is the default behavior
    * from Dojo 1.0 to Dojo 1.5. dojoType support is deprecated, and will
    * go away in Dojo 2.0.
    *
    * @param rootNode               OptionalA default starting root node from which to start the parsing. Can beomitted, defaulting to the entire document. If omitted, the optionsobject can be passed in this place. If the options object has arootNode member, that is used.
    * @param options               OptionalA hash of options.noStart: Boolean?:  when set will prevent the parser from calling .startup()  when locating the nodes.rootNode: DomNode?:  identical to the function's rootNode argument, though  allowed to be passed in via this `options object.template: Boolean:  If true, ignores ContentPane's stopParser flag and parses contents inside of  a ContentPane inside of a template.   This allows dojoAttachPoint on widgets/nodes  nested inside the ContentPane to work.inherited: Object:  Hash possibly containing dir and lang settings to be applied to  parsed widgets, unless there's another setting on a sub-node that overridesscope: String:  Root for attribute names to search for.   If scopeName is dojo,  will search for data-dojo-type (or dojoType).   For backwards compatibility  reasons defaults to dojo._scopeName (which is "dojo" except when  multi-version support is used, when it will be something like dojo16, dojo20, etc.)propsThis: Object:  If specified, "this" referenced from data-dojo-props will refer to propsThis.  Intended for use from the widgets-in-template feature of dijit._WidgetsInTemplateMixincontextRequire: Function:  If specified, this require is utilised for looking resolving modules instead of the  dojo/parser context require().  Intended for use from the widgets-in-template feature of  dijit._WidgetsInTemplateMixin.
    */
  def parse(): js.Any = js.native
  def parse(rootNode: HTMLElement): js.Any = js.native
  def parse(rootNode: HTMLElement, options: js.Object): js.Any = js.native
  /**
    * Scan a DOM tree and return an array of objects representing the DOMNodes
    * that need to be turned into widgets.
    * Search specified node (or document root node) recursively for class instances
    * and return an array of objects that represent potential widgets to be
    * instantiated. Searches for either data-dojo-type="MID" or dojoType="MID" where
    * "MID" is a module ID like "dijit/form/Button" or a fully qualified Class name
    * like "dijit/form/Button".  If the MID is not currently available, scan will
    * attempt to require() in the module.
    *
    * See parser.parse() for details of markup.
    *
    * @param root               OptionalA default starting root node from which to start the parsing. Can beomitted, defaulting to the entire document. If omitted, the optionsobject can be passed in this place. If the options object has arootNode member, that is used.
    * @param options a kwArgs options object, see parse() for details
    */
  def scan(): Promise[_] = js.native
  def scan(root: HTMLElement): Promise[_] = js.native
  def scan(root: HTMLElement, options: js.Object): Promise[_] = js.native
}

