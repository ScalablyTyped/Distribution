package typings.dojo.dojox.mvc

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.`data-mvc-child-bindings`
import typings.dojo.dojoStrings.`data-mvc-child-mixins`
import typings.dojo.dojoStrings.`data-mvc-child-props`
import typings.dojo.dojoStrings.`data-mvc-child-type`
import typings.dojo.dojoStrings.childBindings
import typings.dojo.dojoStrings.childClz
import typings.dojo.dojoStrings.childMixins
import typings.dojo.dojoStrings.childParams
import typings.dojo.dojoStrings.childType
import typings.dojo.dojoStrings.children
import typings.dojo.dojoStrings.partialRebuild
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templateString
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/WidgetList.html
  *
  * A widget that creates child widgets repeatedly based on the children attribute (the repeated data) and childType/childMixins/childParams attributes (determines how to create each child widget).
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dojox.mvc.WidgetList")
@js.native
class WidgetList () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Data bindings for child widget.
    *
    */
  var childBindings: js.Object = js.native
  /**
    * The class of the child widget. Takes precedence over childType/childMixins.
    *
    */
  var childClz: js.Function = js.native
  /**
    * The list of module IDs (separated by comma), or a functinon that takes child data as the argument and returns it, of the classes that will be mixed into child widget. childClz takes precedence over childType/this.
    * Can be specified via data-mvc-child-mixins attribute of widget declaration.
    *
    */
  var childMixins: String = js.native
  /**
    * The mixin properties for child widget.
    * Can be specified via data-mvc-child-props attribute of widget declaration.
    * "this" in data-mvc-child-props will have the following properties:
    *
    * parent - This widget's instance.
    * target - The data item in children.
    *
    */
  var childParams: js.Object = js.native
  /**
    * The module ID of child widget, or a function that takes child data as the argument and returns the module ID of child widget. childClz takes precedence over this/childMixins.
    * Can be specified via data-mvc-child-type attribute of widget declaration.
    *
    */
  var childType: String = js.native
  /**
    * The array of data model that is used to render child nodes.
    *
    */
  var children: js.Object = js.native
  /**
    *
    */
  var `data-mvc-child-bindings`: String = js.native
  /**
    *
    */
  var `data-mvc-child-mixins`: String = js.native
  /**
    *
    */
  var `data-mvc-child-props`: String = js.native
  /**
    *
    */
  var `data-mvc-child-type`: String = js.native
  /**
    * If true, only rebuild repeat items for changed elements. Otherwise, rebuild everything if there is a change in children.
    *
    */
  var partialRebuild: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_WidgetList: String = js.native
  /**
    * The template string for each child items. templateString in child widgets take precedence over this.
    *
    */
  var templateString: String = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: WidgetBase): Unit = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def addChild(widget: WidgetBase, insertIndex: Double): Unit = js.native
  /**
    * Gets the index of the child in this container or -1 if not found
    *
    * @param child
    */
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  def getIndexOfChild(child: WidgetBase): js.Any = js.native
  @JSName("get")
  def get_childBindings(property: childBindings): js.Object = js.native
  @JSName("get")
  def get_childClz(property: childClz): js.Function = js.native
  @JSName("get")
  def get_childMixins(property: childMixins): String = js.native
  @JSName("get")
  def get_childParams(property: childParams): js.Object = js.native
  @JSName("get")
  def get_childType(property: childType): String = js.native
  @JSName("get")
  def get_children(property: children): js.Object = js.native
  @JSName("get")
  def get_datamvcchildbindings(property: `data-mvc-child-bindings`): String = js.native
  @JSName("get")
  def get_datamvcchildmixins(property: `data-mvc-child-mixins`): String = js.native
  @JSName("get")
  def get_datamvcchildprops(property: `data-mvc-child-props`): String = js.native
  @JSName("get")
  def get_datamvcchildtype(property: `data-mvc-child-type`): String = js.native
  @JSName("get")
  def get_partialRebuild(property: partialRebuild): Boolean = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    *
    */
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    * 
    */
  def hasChildren(): Boolean = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    *
    * @param widget
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: Double): Unit = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    *
    * @param widget
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: WidgetBase): Unit = js.native
  @JSName("set")
  def set_childBindings(property: childBindings, value: js.Object): Unit = js.native
  @JSName("set")
  def set_childClz(property: childClz, value: js.Function): Unit = js.native
  @JSName("set")
  def set_childMixins(property: childMixins, value: String): Unit = js.native
  @JSName("set")
  def set_childParams(property: childParams, value: js.Object): Unit = js.native
  @JSName("set")
  def set_childType(property: childType, value: String): Unit = js.native
  @JSName("set")
  def set_children(property: children, value: js.Object): Unit = js.native
  @JSName("set")
  def set_datamvcchildbindings(property: `data-mvc-child-bindings`, value: String): Unit = js.native
  @JSName("set")
  def set_datamvcchildmixins(property: `data-mvc-child-mixins`, value: String): Unit = js.native
  @JSName("set")
  def set_datamvcchildprops(property: `data-mvc-child-props`, value: String): Unit = js.native
  @JSName("set")
  def set_datamvcchildtype(property: `data-mvc-child-type`, value: String): Unit = js.native
  @JSName("set")
  def set_partialRebuild(property: partialRebuild, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("watch")
  def watch_childBindings(
    property: childBindings,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_childClz(
    property: childClz,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_childMixins(
    property: childMixins,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_childParams(
    property: childParams,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_childType(
    property: childType,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
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
  def watch_datamvcchildbindings(
    property: `data-mvc-child-bindings`,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_datamvcchildmixins(
    property: `data-mvc-child-mixins`,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_datamvcchildprops(
    property: `data-mvc-child-props`,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_datamvcchildtype(
    property: `data-mvc-child-type`,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_partialRebuild(
    property: partialRebuild,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_templateString(
    property: templateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

