package typings.dojo.dojox.layout

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.activeResize
import typings.dojo.dojoStrings.activeResizeClass
import typings.dojo.dojoStrings.animateDuration
import typings.dojo.dojoStrings.animateMethod
import typings.dojo.dojoStrings.animateSizing
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.constrainMax
import typings.dojo.dojoStrings.endTopic
import typings.dojo.dojoStrings.fixedAspect
import typings.dojo.dojoStrings.intermediateChanges
import typings.dojo.dojoStrings.maxHeight
import typings.dojo.dojoStrings.maxWidth
import typings.dojo.dojoStrings.minHeight
import typings.dojo.dojoStrings.minWidth
import typings.dojo.dojoStrings.resizeAxis
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.startTopic
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.targetContainer
import typings.dojo.dojoStrings.targetId
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/ResizeHandle.html
  *
  * A draggable handle used to resize an attached node.
  * The handle on the bottom-right corner of FloatingPane or other widgets that allows
  * the widget to be resized.
  * Typically not used directly.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.layout.ResizeHandle")
@js.native
class ResizeHandle () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * if true, node will size realtime with mouse movement,
    * if false, node will create virtual node, and only resize target on mouseUp
    *
    */
  var activeResize: Boolean = js.native
  /**
    * css class applied to virtual resize node.
    *
    */
  var activeResizeClass: String = js.native
  /**
    * time in MS to run sizing animation. if animateMethod="chain", total animation
    * playtime is 2*animateDuration
    *
    */
  var animateDuration: Double = js.native
  /**
    * one of "chain" or "combine" ... visual effect only. combine will "scale"
    * node to size, "chain" will alter width, then height
    *
    */
  var animateMethod: String = js.native
  /**
    * only applicable if activeResize = false. onMouseup, animate the node to the
    * new size
    *
    */
  var animateSizing: Boolean = js.native
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * Toggle if this widget cares about the maxHeight and maxWidth
    * parameters.
    *
    */
  var constrainMax: Boolean = js.native
  /**
    * The name of the topic this resizehandle publishes when resize is complete
    *
    */
  var endTopic: String = js.native
  /**
    * Toggle to enable this widget to maintain the aspect
    * ratio of the attached node.
    *
    */
  var fixedAspect: Boolean = js.native
  /**
    * Toggle to enable/disable this widget from firing onResize
    * events at every step of a resize. If activeResize is true,
    * and this is false, onResize only fires after the drop
    * operation. Animated resizing is not affected by this setting.
    *
    */
  var intermediateChanges: Boolean = js.native
  /**
    * Largest height size in px the resize node can become.
    *
    */
  var maxHeight: Double = js.native
  /**
    * Largest width size in px the resize node can become.
    *
    */
  var maxWidth: Double = js.native
  /**
    * smallest height in px resized node can be
    *
    */
  var minHeight: Double = js.native
  /**
    * smallest width in px resize node can be
    *
    */
  var minWidth: Double = js.native
  /**
    * one of: x|y|xy limit resizing to a single axis, default to xy ...
    *
    */
  var resizeAxis: String = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * The name of the topic this resizehandle publishes when resize is starting
    *
    */
  var startTopic: String = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_ResizeHandle: String = js.native
  /**
    * over-ride targetId and attch this handle directly to a reference of a DomNode
    *
    */
  var targetContainer: HTMLElement = js.native
  /**
    * id of the Widget OR DomNode that I will size
    *
    */
  var targetId: String = js.native
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
  def get_activeResize(property: activeResize): Boolean = js.native
  @JSName("get")
  def get_activeResizeClass(property: activeResizeClass): String = js.native
  @JSName("get")
  def get_animateDuration(property: animateDuration): Double = js.native
  @JSName("get")
  def get_animateMethod(property: animateMethod): String = js.native
  @JSName("get")
  def get_animateSizing(property: animateSizing): Boolean = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_constrainMax(property: constrainMax): Boolean = js.native
  @JSName("get")
  def get_endTopic(property: endTopic): String = js.native
  @JSName("get")
  def get_fixedAspect(property: fixedAspect): Boolean = js.native
  @JSName("get")
  def get_intermediateChanges(property: intermediateChanges): Boolean = js.native
  @JSName("get")
  def get_maxHeight(property: maxHeight): Double = js.native
  @JSName("get")
  def get_maxWidth(property: maxWidth): Double = js.native
  @JSName("get")
  def get_minHeight(property: minHeight): Double = js.native
  @JSName("get")
  def get_minWidth(property: minWidth): Double = js.native
  @JSName("get")
  def get_resizeAxis(property: resizeAxis): String = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_startTopic(property: startTopic): String = js.native
  @JSName("get")
  def get_targetContainer(property: targetContainer): HTMLElement = js.native
  @JSName("get")
  def get_targetId(property: targetId): String = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  /**
    * Stub fired when sizing is done. Fired once
    * after resize, or often when intermediateChanges is
    * set to true.
    *
    * @param e
    */
  def onResize(e: js.Any): Unit = js.native
  @JSName("set")
  def set_activeResize(property: activeResize, value: Boolean): Unit = js.native
  @JSName("set")
  def set_activeResizeClass(property: activeResizeClass, value: String): Unit = js.native
  @JSName("set")
  def set_animateDuration(property: animateDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_animateMethod(property: animateMethod, value: String): Unit = js.native
  @JSName("set")
  def set_animateSizing(property: animateSizing, value: Boolean): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_constrainMax(property: constrainMax, value: Boolean): Unit = js.native
  @JSName("set")
  def set_endTopic(property: endTopic, value: String): Unit = js.native
  @JSName("set")
  def set_fixedAspect(property: fixedAspect, value: Boolean): Unit = js.native
  @JSName("set")
  def set_intermediateChanges(property: intermediateChanges, value: Boolean): Unit = js.native
  @JSName("set")
  def set_maxHeight(property: maxHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_maxWidth(property: maxWidth, value: Double): Unit = js.native
  @JSName("set")
  def set_minHeight(property: minHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_minWidth(property: minWidth, value: Double): Unit = js.native
  @JSName("set")
  def set_resizeAxis(property: resizeAxis, value: String): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_startTopic(property: startTopic, value: String): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_targetContainer(property: targetContainer, value: HTMLElement): Unit = js.native
  @JSName("set")
  def set_targetId(property: targetId, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("watch")
  def watch_activeResize(
    property: activeResize,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_activeResizeClass(
    property: activeResizeClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_animateDuration(
    property: animateDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_animateMethod(
    property: animateMethod,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_animateSizing(
    property: animateSizing,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
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
  def watch_constrainMax(
    property: constrainMax,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_endTopic(
    property: endTopic,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_fixedAspect(
    property: fixedAspect,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_intermediateChanges(
    property: intermediateChanges,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_maxHeight(
    property: maxHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_maxWidth(
    property: maxWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minHeight(
    property: minHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minWidth(
    property: minWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_resizeAxis(
    property: resizeAxis,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
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
  def watch_startTopic(
    property: startTopic,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_targetContainer(
    property: targetContainer,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[HTMLElement], 
      /* newValue */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_targetId(
    property: targetId,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
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

