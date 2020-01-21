package typings.dojo.dojox.mvc

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.children
import typings.dojo.dojoStrings.index
import typings.dojo.dojoStrings.removeRepeatNode
import typings.dojo.dojoStrings.useParent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Repeat.html
  *
  * A model-bound container which binds to a collection within a data model
  * and produces a repeating user-interface from a template for each
  * iteration within the collection.
  * A repeat is bound to an intermediate dojo/Stateful node corresponding
  * to an array in the data model. Child dijits or custom view components
  * inside it inherit their parent data binding context from it.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mvc.Repeat")
@js.native
class Repeat () extends Container {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The array of data model that is used to render child nodes.
    *
    */
  var children: js.Object = js.native
  /**
    * An index used to track the current iteration when the repeating UI is
    * produced. This may be used to parameterize the content in the repeat
    * template for the current iteration.
    *
    * For example, consider a collection of search or query results where
    * each item contains a "Name" property used to prime the "Results" data
    * model. Then, the following CRUD-style UI displays all the names in
    * the search results in text boxes where they may be updated or such.
    *
    * <div dojoType="dojox/mvc/Repeat" ref="Results">
    *     <div class="row" dojoType="dojox/mvc/Group" ref="${this.index}">
    *         <label for="nameInput${this.index}">Name:</label>
    *         <input dojoType="dijit/form/TextBox" id="nameInput${this.index}" ref="'Name'"></input>
    *     </div>
    * </div>
    *
    */
  var index: Double = js.native
  /**
    * When true the dom node for the Repeat and Groups within the Repeat
    * will be removed, their children will be placed into the parent node
    * of the Repeat node.  This should be set to true when working with
    * a Repeat inside of a dojox.mobile list.
    *
    */
  var removeRepeatNode: Boolean = js.native
  /**
    * id of the DOM node to use as the parent for the repeating items, similar to useParentId processed a little differently
    *
    */
  var useParent: String = js.native
  @JSName("get")
  def get_children(property: children): js.Object = js.native
  @JSName("get")
  def get_index(property: index): Double = js.native
  @JSName("get")
  def get_removeRepeatNode(property: removeRepeatNode): Boolean = js.native
  @JSName("get")
  def get_useParent(property: useParent): String = js.native
  /**
    *
    * @param params
    * @param srcNodeRef
    */
  def postscript(params: js.Any): Unit = js.native
  def postscript(params: js.Any, srcNodeRef: js.Any): Unit = js.native
  @JSName("set")
  def set_children(property: children, value: js.Object): Unit = js.native
  @JSName("set")
  def set_index(property: index, value: Double): Unit = js.native
  @JSName("set")
  def set_removeRepeatNode(property: removeRepeatNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_useParent(property: useParent, value: String): Unit = js.native
  @JSName("watch")
  def watch_children(
    property: children,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_index(
    property: index,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_removeRepeatNode(
    property: removeRepeatNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_useParent(
    property: useParent,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

