package typings.dojo.dojox.calendar

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.edited
import typings.dojo.dojoStrings.hovered
import typings.dojo.dojoStrings.item
import typings.dojo.dojoStrings.moveEnabled
import typings.dojo.dojoStrings.owner
import typings.dojo.dojoStrings.resizeEnabled
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.selected
import typings.dojo.dojoStrings.storeState
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.visibilityLimits
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/VerticalRenderer.html
  *
  * The default item vertical renderer.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojo.Stateful because Already inherited
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dojox.calendar._RendererMixin because Inheritance from two classes. Inlined edited, set_edited, get_edited, watch_edited, set_focused, get_focused, watch_focused, hovered, set_hovered, get_hovered, watch_hovered, item, set_item, get_item, watch_item, moveEnabled, set_moveEnabled, get_moveEnabled, watch_moveEnabled, owner, set_owner, get_owner, watch_owner, resizeEnabled, set_resizeEnabled, get_resizeEnabled, watch_resizeEnabled, selected, set_selected, get_selected, watch_selected, storeState, set_storeState, get_storeState, watch_storeState, visibilityLimits, set_visibilityLimits, get_visibilityLimits, watch_visibilityLimits, get, getDisplayValue, postscript, set, updateRendering, watch
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.calendar.VerticalRenderer")
@js.native
class VerticalRenderer () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * Indicates that the item displayed by this renderer is in editing mode.
    *
    */
  var edited: Boolean = js.native
  /**
    * Indicates that the item displayed by this renderer is hovered.
    *
    */
  var hovered: Boolean = js.native
  /**
    * The layout item displayed by this renderer.
    *
    */
  var item: js.Object = js.native
  /**
    * Whether the event displayed by this renderer can be moved.
    *
    */
  var moveEnabled: Boolean = js.native
  /**
    * The view that contains this renderer.
    *
    */
  var owner: js.Object = js.native
  /**
    * Whether the event displayed by this renderer can be resized.
    *
    */
  var resizeEnabled: Boolean = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * Indicates that the item displayed by this renderer is selected.
    *
    */
  var selected: Boolean = js.native
  /**
    * Indicates that the item displayed by this renderer is not in the store, being saved to the store or in the store.
    *
    */
  var storeState: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_VerticalRenderer: String = js.native
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
    *
    */
  var visibilityLimits: js.Object = js.native
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
    * @param part
    */
  def getDisplayValue(part: js.Any): js.Any = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_edited(property: edited): Boolean = js.native
  @JSName("get")
  def get_hovered(property: hovered): Boolean = js.native
  @JSName("get")
  def get_item(property: item): js.Object = js.native
  @JSName("get")
  def get_moveEnabled(property: moveEnabled): Boolean = js.native
  @JSName("get")
  def get_owner(property: owner): js.Object = js.native
  @JSName("get")
  def get_resizeEnabled(property: resizeEnabled): Boolean = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_selected(property: selected): Boolean = js.native
  @JSName("get")
  def get_storeState(property: storeState): Boolean = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_visibilityLimits(property: visibilityLimits): js.Object = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_edited(property: edited, value: Boolean): Unit = js.native
  @JSName("set")
  def set_hovered(property: hovered, value: Boolean): Unit = js.native
  @JSName("set")
  def set_item(property: item, value: js.Object): Unit = js.native
  @JSName("set")
  def set_moveEnabled(property: moveEnabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_owner(property: owner, value: js.Object): Unit = js.native
  @JSName("set")
  def set_resizeEnabled(property: resizeEnabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selected(property: selected, value: Boolean): Unit = js.native
  @JSName("set")
  def set_storeState(property: storeState, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_visibilityLimits(property: visibilityLimits, value: js.Object): Unit = js.native
  /**
    * Updates the visual appearance of the renderer according the new values of the properties and the new size of the component.
    *
    * @param w               OptionalThe width in pixels of the renderer.
    * @param h               OptionalThe height in pixels of the renderer.
    */
  def updateRendering(w: Double, h: Double): Unit = js.native
  @JSName("watch")
  def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_edited(property: edited, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hovered(property: hovered, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_item(property: item, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_moveEnabled(property: moveEnabled, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_owner(property: owner, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_resizeEnabled(property: resizeEnabled, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selected(property: selected, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_storeState(property: storeState, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_visibilityLimits(property: visibilityLimits, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
}

