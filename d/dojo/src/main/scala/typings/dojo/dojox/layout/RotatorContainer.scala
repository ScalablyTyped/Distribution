package typings.dojo.dojox.layout

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit.layout.StackContainer
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.autoStart
import typings.dojo.dojoStrings.contextRequire
import typings.dojo.dojoStrings.cycles
import typings.dojo.dojoStrings.pagerClass
import typings.dojo.dojoStrings.pagerId
import typings.dojo.dojoStrings.pauseOnManualChange
import typings.dojo.dojoStrings.reverse
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.showTabs
import typings.dojo.dojoStrings.suspendOnHover
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.transition
import typings.dojo.dojoStrings.transitionDelay
import typings.dojo.dojoStrings.transitionDuration
import typings.dojo.dojoStrings.widgetsInTemplate
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/RotatorContainer.html
  *
  * Extends a StackContainer to automatically transition between children
  * and display navigation in the form of tabs or a pager.
  * The RotatorContainer cycles through the children with a transition.
  *
  * published topics:
  * [widgetId]-update - Notifies pager(s) that a child has changed.
  * Parameters:
  *
  * /boolean/ playing - true if playing, false if paused
  * /int/ current     - current selected child
  * /int/ total       - total number of children
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._Templated because Inheritance from two classes. Inlined attachScope, contextRequire, searchContainerNode, templatePath, templateString, widgetsInTemplate, buildRendering, destroyRendering, startup, getCachedTemplate */ @JSGlobal("dojox.layout.RotatorContainer")
@js.native
class RotatorContainer () extends StackContainer {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * Starts the timer to transition children upon creation.
    *
    */
  var autoStart: Boolean = js.native
  /**
    * Used to provide a context require to the dojo/parser in order to be
    * able to use relative MIDs (e.g. ./Widget) in the widget's template.
    *
    */
  var contextRequire: js.Function = js.native
  /**
    * Number of cycles before pausing.
    *
    */
  var cycles: Double = js.native
  /**
    * The declared Class of the Pager used for this Widget
    *
    */
  var pagerClass: String = js.native
  /**
    * ID the pager widget.
    *
    */
  var pagerId: String = js.native
  /**
    * Pause the rotator when the tab is changed or the pager's next/previous
    * buttons are clicked.
    *
    */
  var pauseOnManualChange: Boolean = js.native
  /**
    * Causes the rotator to rotate in reverse order.
    *
    */
  var reverse: Boolean = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * Sets the display of the tabs.  The tabs are actually a StackController.
    * The child's title is used for the tab's label.
    *
    */
  var showTabs: Boolean = js.native
  /**
    * Pause the rotator when the mouse hovers over it.
    *
    */
  var suspendOnHover: Boolean = js.native
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
    * The type of transition to perform when switching children.
    * A null transition will transition instantly.
    *
    */
  var transition: String = js.native
  /**
    * The delay in milliseconds before transitioning to the next child.
    *
    */
  var transitionDelay: Double = js.native
  /**
    * The duration of the transition in milliseconds.
    *
    */
  var transitionDuration: Double = js.native
  /**
    * Should we parse the template to find widgets that might be
    * declared in markup inside it?  False by default.
    *
    */
  var widgetsInTemplate: Boolean = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  def getCachedTemplate(): js.Any = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_autoStart(property: autoStart): Boolean = js.native
  @JSName("get")
  def get_contextRequire(property: contextRequire): js.Function = js.native
  @JSName("get")
  def get_cycles(property: cycles): Double = js.native
  @JSName("get")
  def get_pagerClass(property: pagerClass): String = js.native
  @JSName("get")
  def get_pagerId(property: pagerId): String = js.native
  @JSName("get")
  def get_pauseOnManualChange(property: pauseOnManualChange): Boolean = js.native
  @JSName("get")
  def get_reverse(property: reverse): Boolean = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_showTabs(property: showTabs): Boolean = js.native
  @JSName("get")
  def get_suspendOnHover(property: suspendOnHover): Boolean = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_transition(property: transition): String = js.native
  @JSName("get")
  def get_transitionDelay(property: transitionDelay): Double = js.native
  @JSName("get")
  def get_transitionDuration(property: transitionDuration): Double = js.native
  @JSName("get")
  def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_autoStart(property: autoStart, value: Boolean): Unit = js.native
  @JSName("set")
  def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
  @JSName("set")
  def set_cycles(property: cycles, value: Double): Unit = js.native
  @JSName("set")
  def set_pagerClass(property: pagerClass, value: String): Unit = js.native
  @JSName("set")
  def set_pagerId(property: pagerId, value: String): Unit = js.native
  @JSName("set")
  def set_pauseOnManualChange(property: pauseOnManualChange, value: Boolean): Unit = js.native
  @JSName("set")
  def set_reverse(property: reverse, value: Boolean): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_showTabs(property: showTabs, value: Boolean): Unit = js.native
  @JSName("set")
  def set_suspendOnHover(property: suspendOnHover, value: Boolean): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_transition(property: transition, value: String): Unit = js.native
  @JSName("set")
  def set_transitionDelay(property: transitionDelay, value: Double): Unit = js.native
  @JSName("set")
  def set_transitionDuration(property: transitionDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
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
  def watch_autoStart(
    property: autoStart,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_contextRequire(
    property: contextRequire,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cycles(
    property: cycles,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_pagerClass(
    property: pagerClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_pagerId(
    property: pagerId,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_pauseOnManualChange(
    property: pauseOnManualChange,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_reverse(
    property: reverse,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
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
  def watch_showTabs(
    property: showTabs,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_suspendOnHover(
    property: suspendOnHover,
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
  def watch_transition(
    property: transition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_transitionDelay(
    property: transitionDelay,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_transitionDuration(
    property: transitionDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_widgetsInTemplate(
    property: widgetsInTemplate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

