package typings.dojo.dojox.grid

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.classTag
import typings.dojo.dojoStrings.defaultWidth
import typings.dojo.dojoStrings.firstScroll
import typings.dojo.dojoStrings.lastTop
import typings.dojo.dojoStrings.marginBottom
import typings.dojo.dojoStrings.rowPad
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.viewWidth
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/_View.html
  *
  * A collection of grid columns. A grid is comprised of a set of views that stack horizontally.
  * Grid creates views automatically based on grid's layout structure.
  * Users should typically not need to access individual views directly.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.grid._View")
@js.native
class _View () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    *
    */
  var classTag: String = js.native
  /**
    * Default width of the view
    *
    */
  var defaultWidth: String = js.native
  /**
    *
    */
  var firstScroll: Double = js.native
  /**
    *
    */
  var lastTop: Double = js.native
  /**
    *
    */
  var marginBottom: Double = js.native
  /**
    *
    */
  var rowPad: Double = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style__View: String = js.native
  /**
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    *
    */
  var templatePath: String = js.native
  /**
    *
    */
  var templateString: String = js.native
  /**
    * Width for the view, in valid css unit
    *
    */
  var viewWidth: String = js.native
  /**
    *
    * @param minusScroll
    */
  def adaptHeight(minusScroll: js.Any): Unit = js.native
  /**
    *
    */
  def adaptWidth(): Unit = js.native
  /**
    *
    * @param inRowIndex
    * @param inRowNode
    */
  def buildRow(inRowIndex: js.Any, inRowNode: js.Any): Unit = js.native
  /**
    *
    * @param inRowIndex
    * @param inRowNode
    */
  def buildRowContent(inRowIndex: js.Any, inRowNode: js.Any): Unit = js.native
  /**
    *
    */
  def convertColPctToFixed(): Boolean = js.native
  /**
    *
    * @param inRowIndex
    */
  def createRowNode(inRowIndex: js.Any): js.Any = js.native
  /**
    *
    * @param e
    */
  def dispatchContentEvent(e: js.Any): js.Any = js.native
  /**
    *
    * @param e
    */
  def dispatchHeaderEvent(e: js.Any): js.Any = js.native
  /**
    *
    * @param e
    */
  def doContentEvent(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def doHeaderEvent(e: js.Any): Unit = js.native
  /**
    *
    * @param inRowIndex
    * @param inRowNode
    */
  def doStyleRowNode(inRowIndex: js.Any, inRowNode: js.Any): Unit = js.native
  /**
    *
    * @param inEvent
    */
  def doscroll(inEvent: js.Any): Unit = js.native
  /**
    *
    */
  def focus(): Unit = js.native
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
  /**
    *
    * @param inRowIndex
    * @param inCellIndex
    */
  def getCellNode(inRowIndex: js.Any, inCellIndex: js.Any): js.Any = js.native
  /**
    *
    */
  def getColumnsWidth(): Double = js.native
  /**
    *
    */
  def getContentWidth(): String = js.native
  /**
    *
    * @param inCellIndex
    */
  def getHeaderCellNode(inCellIndex: js.Any): js.Any = js.native
  /**
    *
    * @param inRowIndex
    */
  def getRowNode(inRowIndex: js.Any): js.Any = js.native
  /**
    *
    */
  def getScrollbarWidth(): js.Any = js.native
  /**
    *
    */
  def getWidth(): String = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_classTag(property: classTag): String = js.native
  @JSName("get")
  def get_defaultWidth(property: defaultWidth): String = js.native
  @JSName("get")
  def get_firstScroll(property: firstScroll): Double = js.native
  @JSName("get")
  def get_lastTop(property: lastTop): Double = js.native
  @JSName("get")
  def get_marginBottom(property: marginBottom): Double = js.native
  @JSName("get")
  def get_rowPad(property: rowPad): Double = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_viewWidth(property: viewWidth): String = js.native
  /**
    *
    * @param reset
    */
  def hasHScrollbar(reset: js.Any): Boolean = js.native
  /**
    *
    * @param reset
    */
  def hasVScrollbar(reset: js.Any): Boolean = js.native
  /**
    *
    * @param inRowIndex
    * @param cells               OptionalThe structure of the cells within this grid.
    * @param inRowNode
    */
  def onAfterRow(inRowIndex: js.Any, cells: js.Array[js.Array[js.Object] | js.Object], inRowNode: js.Any): Unit = js.native
  /**
    *
    * @param inRowIndex
    * @param cells
    */
  def onBeforeRow(inRowIndex: js.Any, cells: js.Any): Unit = js.native
  /**
    *
    */
  def render(): Unit = js.native
  /**
    *
    */
  def renderHeader(): Unit = js.native
  /**
    *
    * @param inRowIndex
    */
  def renderRow(inRowIndex: js.Any): js.Any = js.native
  /**
    *
    */
  def resize(): Unit = js.native
  /**
    *
    * @param inRowIndex
    */
  def rowRemoved(inRowIndex: js.Any): Unit = js.native
  /**
    *
    * @param inIndex
    * @param inWidth
    */
  def setColWidth(inIndex: js.Any, inWidth: js.Any): Unit = js.native
  /**
    *
    * @param width
    */
  def setColumnsWidth(width: js.Any): Unit = js.native
  /**
    *
    * @param inTop
    */
  def setScrollTop(inTop: js.Any): js.Any = js.native
  /**
    *
    * @param w
    * @param h
    */
  def setSize(w: js.Any, h: js.Any): Unit = js.native
  /**
    *
    * @param inStructure
    */
  def setStructure(inStructure: js.Any): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_classTag(property: classTag, value: String): Unit = js.native
  @JSName("set")
  def set_defaultWidth(property: defaultWidth, value: String): Unit = js.native
  @JSName("set")
  def set_firstScroll(property: firstScroll, value: Double): Unit = js.native
  @JSName("set")
  def set_lastTop(property: lastTop, value: Double): Unit = js.native
  @JSName("set")
  def set_marginBottom(property: marginBottom, value: Double): Unit = js.native
  @JSName("set")
  def set_rowPad(property: rowPad, value: Double): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_viewWidth(property: viewWidth, value: String): Unit = js.native
  /**
    *
    * @param inRowIndex
    * @param inRowNode
    */
  def styleRow(inRowIndex: js.Any, inRowNode: js.Any): Unit = js.native
  /**
    *
    * @param inRowIndex
    * @param inRowNode
    */
  def styleRowNode(inRowIndex: js.Any, inRowNode: js.Any): Unit = js.native
  /**
    *
    */
  def testFlexCells(): js.Any = js.native
  /**
    *
    */
  def update(): Unit = js.native
  /**
    *
    * @param inRowIndex
    */
  def updateRow(inRowIndex: js.Any): js.Any = js.native
  /**
    *
    * @param inRowIndex
    */
  def updateRowStyles(inRowIndex: js.Any): Unit = js.native
  /**
    *
    */
  def updateStructure(): Unit = js.native
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
  def watch_classTag(
    property: classTag,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_defaultWidth(
    property: defaultWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_firstScroll(
    property: firstScroll,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_lastTop(
    property: lastTop,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_marginBottom(
    property: marginBottom,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rowPad(
    property: rowPad,
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
  @JSName("watch")
  def watch_viewWidth(
    property: viewWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

