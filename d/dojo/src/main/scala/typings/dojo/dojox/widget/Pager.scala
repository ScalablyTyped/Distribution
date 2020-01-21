package typings.dojo.dojox.widget

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.duration
import typings.dojo.dojoStrings.iconNext
import typings.dojo.dojoStrings.iconPage
import typings.dojo.dojoStrings.iconPageActive
import typings.dojo.dojoStrings.iconPrevious
import typings.dojo.dojoStrings.itemSpace
import typings.dojo.dojoStrings.itemsPage
import typings.dojo.dojoStrings.orientation
import typings.dojo.dojoStrings.pagerPos
import typings.dojo.dojoStrings.resizeChildren
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.statusPos
import typings.dojo.dojoStrings.store
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Pager.html
  *
  * A Pager, displaying a list of sized nodes
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.widget.Pager")
@js.native
class Pager () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * Time in milliseconds to transition the pages
    *
    */
  var duration: Double = js.native
  /**
    * The url of the next page icon
    *
    */
  var iconNext: js.Object = js.native
  /**
    *
    */
  var iconPage: js.Object = js.native
  /**
    *
    */
  var iconPageActive: js.Object = js.native
  /**
    * The url of the previous page icon
    *
    */
  var iconPrevious: js.Object = js.native
  /**
    * Spacing between items? TODOC
    *
    */
  var itemSpace: Double = js.native
  /**
    * The numbers of items to display in each "Page"
    *
    */
  var itemsPage: Double = js.native
  /**
    * Either "horizontal or "vertical" to define the direction the pages will slide
    *
    */
  var orientation: String = js.native
  /**
    * TODOC
    *
    */
  var pagerPos: String = js.native
  /**
    * TODOC
    *
    */
  var resizeChildren: Boolean = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * A string describing where to put the Pager "current page" indicator. Options are
    * "leading" or "trailing". In the case of horiztonal orientation, "leading" indicates
    * positioned above the PageItems. In the case of vertical, "leading" indicates "before".
    *
    */
  var statusPos: String = js.native
  /**
    * A dojo.data Data store
    *
    */
  var store: js.Object = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Pager: String = js.native
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
    * this method instantiates pagerItems to be used by the pager, it is overridable to allow
    * customizing these items
    *
    * @param item
    * @param cnt
    */
  def generatePagerItem(item: js.Any, cnt: Double): js.Any = js.native
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
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_duration(property: duration): Double = js.native
  @JSName("get")
  def get_iconNext(property: iconNext): js.Object = js.native
  @JSName("get")
  def get_iconPage(property: iconPage): js.Object = js.native
  @JSName("get")
  def get_iconPageActive(property: iconPageActive): js.Object = js.native
  @JSName("get")
  def get_iconPrevious(property: iconPrevious): js.Object = js.native
  @JSName("get")
  def get_itemSpace(property: itemSpace): Double = js.native
  @JSName("get")
  def get_itemsPage(property: itemsPage): Double = js.native
  @JSName("get")
  def get_orientation(property: orientation): String = js.native
  @JSName("get")
  def get_pagerPos(property: pagerPos): String = js.native
  @JSName("get")
  def get_resizeChildren(property: resizeChildren): Boolean = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_statusPos(property: statusPos): String = js.native
  @JSName("get")
  def get_store(property: store): js.Object = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  /**
    *
    */
  @JSName("isValid")
  def isValid_MPager(): Unit = js.native
  /**
    * The full dotted named of a Class or Widget constructor to use for the internal Pager Items.
    *
    */
  def itemClass(): Unit = js.native
  /**
    * Stub Function. Fired after the slide is complete. Override or connect.
    *
    */
  def onScrollEnd(): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_duration(property: duration, value: Double): Unit = js.native
  @JSName("set")
  def set_iconNext(property: iconNext, value: js.Object): Unit = js.native
  @JSName("set")
  def set_iconPage(property: iconPage, value: js.Object): Unit = js.native
  @JSName("set")
  def set_iconPageActive(property: iconPageActive, value: js.Object): Unit = js.native
  @JSName("set")
  def set_iconPrevious(property: iconPrevious, value: js.Object): Unit = js.native
  @JSName("set")
  def set_itemSpace(property: itemSpace, value: Double): Unit = js.native
  @JSName("set")
  def set_itemsPage(property: itemsPage, value: Double): Unit = js.native
  @JSName("set")
  def set_orientation(property: orientation, value: String): Unit = js.native
  @JSName("set")
  def set_pagerPos(property: pagerPos, value: String): Unit = js.native
  @JSName("set")
  def set_resizeChildren(property: resizeChildren, value: Boolean): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_statusPos(property: statusPos, value: String): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("watch")
  def watch_attachScope(
    property: attachScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_duration(
    property: duration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconNext(
    property: iconNext,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconPage(
    property: iconPage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconPageActive(
    property: iconPageActive,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconPrevious(
    property: iconPrevious,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_itemSpace(
    property: itemSpace,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_itemsPage(
    property: itemsPage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_orientation(
    property: orientation,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_pagerPos(
    property: pagerPos,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_resizeChildren(
    property: resizeChildren,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(
    property: searchContainerNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_statusPos(
    property: statusPos,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_store(
    property: store,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_templatePath(
    property: templatePath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
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

