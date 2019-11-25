package typings.dojo.dojox.layout

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dijit.layout._LayoutWidget
import typings.dojo.dojoStrings.ChildWidgetProperties
import typings.dojo.dojoStrings.acceptTypes
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.autoRefresh
import typings.dojo.dojoStrings.colWidths
import typings.dojo.dojoStrings.doLayout
import typings.dojo.dojoStrings.dragHandleClass
import typings.dojo.dojoStrings.isAutoOrganized
import typings.dojo.dojoStrings.nbZones
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/GridContainerLite.html
  *
  * The GridContainerLite is a container of child elements that are placed in a kind of grid.
  * GridContainerLite displays the child elements by column
  * (ie: the children widths are fixed by the column width of the grid but
  * the children heights are free).
  * Each child is movable by drag and drop inside the GridContainer.
  * The position of other children is automatically calculated when a child is moved.
  *
  * @param props
  * @param node
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.layout.GridContainerLite")
@js.native
class GridContainerLite_ protected () extends _LayoutWidget {
  def this(props: js.Object, node: HTMLElement) = this()
  /**
    * Properties set on children of a GridContainerLite
    *
    */
  var ChildWidgetProperties: js.Object = js.native
  /**
    * The GridContainer will only accept the children that fit to the types.
    *
    */
  var acceptTypes: js.Array[_] = js.native
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * Enable the refresh of registered areas on drag start.
    *
    */
  var autoRefresh: Boolean = js.native
  /**
    * A comma separated list of column widths. If the column widths do not add up
    * to 100, the remaining columns split the rest of the width evenly
    * between them.
    *
    */
  var colWidths: String = js.native
  /**
    * If true, change the size of my currently displayed child to match my size.
    *
    */
  var doLayout: Boolean = js.native
  /**
    * CSS class enabling a drag handle on a child.
    *
    */
  var dragHandleClass: js.Array[_] = js.native
  /**
    * If true, widgets are organized automatically,
    * else the attribute colum of child will define the right column.
    *
    */
  var isAutoOrganized: Boolean = js.native
  /**
    * The number of dropped zones, by default 1.
    *
    */
  var nbZones: Double = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    *
    */
  var templatePath: String = js.native
  /**
    * template of gridContainer.
    *
    */
  var templateString: String = js.native
  def addChild(child: _WidgetBase, column: Double, p: Double): js.Any = js.native
  /**
    *
    * @param child
    * @param column               Optional
    * @param p               Optional
    */
  def addService(child: js.Object, column: Double, p: Double): Unit = js.native
  /**
    * Disable the Drag And Drop for children of GridContainer.
    *
    */
  def disableDnd(): Unit = js.native
  /**
    * Enable the Drag And Drop for children of GridContainer.
    *
    */
  def enableDnd(): Unit = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  def getCachedTemplate(): js.Any = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    * 
    * @param templateString The template             
    * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
    * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
    */
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
  @JSName("get")
  def get_ChildWidgetProperties(property: ChildWidgetProperties): js.Object = js.native
  @JSName("get")
  def get_acceptTypes(property: acceptTypes): js.Array[_] = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_autoRefresh(property: autoRefresh): Boolean = js.native
  @JSName("get")
  def get_colWidths(property: colWidths): String = js.native
  @JSName("get")
  def get_doLayout(property: doLayout): Boolean = js.native
  @JSName("get")
  def get_dragHandleClass(property: dragHandleClass): js.Array[_] = js.native
  @JSName("get")
  def get_isAutoOrganized(property: isAutoOrganized): Boolean = js.native
  @JSName("get")
  def get_nbZones(property: nbZones): Double = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  /**
    * Resize the GridContainerLite inner table only if the drag source
    * is a child of this gridContainer.
    *
    * @param node domNode of dragged widget.
    * @param sourceArea AreaManager Object containing information of sourceArea
    * @param indexChild Index where the dragged widget has been placed
    */
  def resizeChildAfterDragStart(node: HTMLElement, sourceArea: js.Object, indexChild: Double): Boolean = js.native
  /**
    * Resize the GridContainerLite inner table and the dropped widget.
    * These components are resized only if the targetArea.node is a
    * child of this instance of gridContainerLite.
    * To be resized, the dropped node must have also a method resize.
    *
    * @param node domNode of dropped widget.
    * @param targetArea AreaManager Object containing information of targetArea
    * @param indexChild Index where the dropped widget has been placed
    */
  def resizeChildAfterDrop(node: HTMLElement, targetArea: js.Object, indexChild: Double): js.Any = js.native
  @JSName("set")
  def set_ChildWidgetProperties(property: ChildWidgetProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_acceptTypes(property: acceptTypes, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_autoRefresh(property: autoRefresh, value: Boolean): Unit = js.native
  @JSName("set")
  def set_colWidths(property: colWidths, value: String): Unit = js.native
  @JSName("set")
  def set_doLayout(property: doLayout, value: Boolean): Unit = js.native
  @JSName("set")
  def set_dragHandleClass(property: dragHandleClass, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_isAutoOrganized(property: isAutoOrganized, value: Boolean): Unit = js.native
  @JSName("set")
  def set_nbZones(property: nbZones, value: Double): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("watch")
  def watch_ChildWidgetProperties(
    property: ChildWidgetProperties,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_acceptTypes(
    property: acceptTypes,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_attachScope(
    property: attachScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_autoRefresh(
    property: autoRefresh,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_colWidths(
    property: colWidths,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_doLayout(
    property: doLayout,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dragHandleClass(
    property: dragHandleClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_isAutoOrganized(
    property: isAutoOrganized,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_nbZones(
    property: nbZones,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(
    property: searchContainerNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(
    property: templatePath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(
    property: templateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

