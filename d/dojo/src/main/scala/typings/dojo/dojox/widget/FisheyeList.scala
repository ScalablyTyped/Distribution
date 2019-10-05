package typings.dojo.dojox.widget

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.Fn_Void
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.EDGE
import typings.dojo.dojoStrings.attachEdge
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.conservativeTrigger
import typings.dojo.dojoStrings.effectUnits
import typings.dojo.dojoStrings.imgNode
import typings.dojo.dojoStrings.isFixed
import typings.dojo.dojoStrings.itemHeight
import typings.dojo.dojoStrings.itemMaxHeight
import typings.dojo.dojoStrings.itemMaxWidth
import typings.dojo.dojoStrings.itemPadding
import typings.dojo.dojoStrings.itemWidth
import typings.dojo.dojoStrings.labelEdge
import typings.dojo.dojoStrings.orientation
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.snarfChildDomOutput
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.HTMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/FisheyeList.html
  *
  * Menu similar to the fish eye menu on the Mac OS
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._Container because Inheritance from two classes. Inlined addChild, addChild, getIndexOfChild, hasChildren, removeChild, removeChild
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.widget.FisheyeList")
@js.native
class FisheyeList () extends _WidgetBase {
  /**
    *
    */
  var EDGE: js.Object = js.native
  /**
    * Controls the border that the menu items don't expand past;
    * for example, if set to "top", then the menu items will drop downwards as they expand.
    * Values: "center", "left", "right", "top", "bottom".
    *
    */
  var attachEdge: String = js.native
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * if true, don't start enlarging menu items until mouse is over an image;
    * if false, start enlarging menu items as the mouse moves near them.
    *
    */
  var conservativeTrigger: Boolean = js.native
  /**
    * controls how much reaction the menu makes, relative to the distance of the mouse from the menu
    *
    */
  var effectUnits: Double = js.native
  /**
    *
    */
  var imgNode: js.Object = js.native
  /**
    * toggle to enable additional listener (window scroll) if FisheyeList is in a fixed postion
    *
    */
  var isFixed: Boolean = js.native
  /**
    *
    */
  @JSName("isValid")
  var isValid_Original: Fn_Void = js.native
  /**
    * height of menu item (in pixels) in it's dormant state (when the mouse is far away)
    *
    */
  var itemHeight: Double = js.native
  /**
    * height of menu item (in pixels) in it's fully enlarged state (when the mouse is directly over it)
    *
    */
  var itemMaxHeight: Double = js.native
  /**
    * width of menu item (in pixels) in it's fully enlarged state (when the mouse is directly over it)
    *
    */
  var itemMaxWidth: Double = js.native
  /**
    * padding (in pixels) between each menu item
    *
    */
  var itemPadding: Double = js.native
  /**
    * width of menu item (in pixels) in it's dormant state (when the mouse is far away)
    *
    */
  var itemWidth: Double = js.native
  /**
    * Controls were the labels show up in relation to the menu item icons.
    * Values: "center", "left", "right", "top", "bottom".
    *
    */
  var labelEdge: String = js.native
  /**
    * orientation of the menu, either "horizontal" or "vertical"
    *
    */
  var orientation: String = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    *
    */
  var snarfChildDomOutput: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_FisheyeList: String = js.native
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
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: _WidgetBase): Unit = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def addChild(widget: _WidgetBase, insertIndex: Double): Unit = js.native
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
    * Gets the index of the child in this container or -1 if not found
    *
    * @param child
    */
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  def getIndexOfChild(child: _WidgetBase): js.Any = js.native
  @JSName("get")
  def get_EDGE(property: EDGE): js.Object = js.native
  @JSName("get")
  def get_attachEdge(property: attachEdge): String = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_conservativeTrigger(property: conservativeTrigger): Boolean = js.native
  @JSName("get")
  def get_effectUnits(property: effectUnits): Double = js.native
  @JSName("get")
  def get_imgNode(property: imgNode): js.Object = js.native
  @JSName("get")
  def get_isFixed(property: isFixed): Boolean = js.native
  @JSName("get")
  def get_itemHeight(property: itemHeight): Double = js.native
  @JSName("get")
  def get_itemMaxHeight(property: itemMaxHeight): Double = js.native
  @JSName("get")
  def get_itemMaxWidth(property: itemMaxWidth): Double = js.native
  @JSName("get")
  def get_itemPadding(property: itemPadding): Double = js.native
  @JSName("get")
  def get_itemWidth(property: itemWidth): Double = js.native
  @JSName("get")
  def get_labelEdge(property: labelEdge): String = js.native
  @JSName("get")
  def get_orientation(property: orientation): String = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_snarfChildDomOutput(property: snarfChildDomOutput): Boolean = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
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
    *
    */
  @JSName("isValid")
  def isValid_MFisheyeList(): Unit = js.native
  /**
    *
    */
  def onResized(): Unit = js.native
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
  def removeChild(widget: _WidgetBase): Unit = js.native
  @JSName("set")
  def set_EDGE(property: EDGE, value: js.Object): Unit = js.native
  @JSName("set")
  def set_attachEdge(property: attachEdge, value: String): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_conservativeTrigger(property: conservativeTrigger, value: Boolean): Unit = js.native
  @JSName("set")
  def set_effectUnits(property: effectUnits, value: Double): Unit = js.native
  @JSName("set")
  def set_imgNode(property: imgNode, value: js.Object): Unit = js.native
  @JSName("set")
  def set_isFixed(property: isFixed, value: Boolean): Unit = js.native
  @JSName("set")
  def set_itemHeight(property: itemHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_itemMaxHeight(property: itemMaxHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_itemMaxWidth(property: itemMaxWidth, value: Double): Unit = js.native
  @JSName("set")
  def set_itemPadding(property: itemPadding, value: Double): Unit = js.native
  @JSName("set")
  def set_itemWidth(property: itemWidth, value: Double): Unit = js.native
  @JSName("set")
  def set_labelEdge(property: labelEdge, value: String): Unit = js.native
  @JSName("set")
  def set_orientation(property: orientation, value: String): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_snarfChildDomOutput(property: snarfChildDomOutput, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("watch")
  def watch_EDGE(property: EDGE, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_attachEdge(property: attachEdge, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_conservativeTrigger(property: conservativeTrigger, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_effectUnits(property: effectUnits, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_imgNode(property: imgNode, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_isFixed(property: isFixed, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_itemHeight(property: itemHeight, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_itemMaxHeight(property: itemMaxHeight, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_itemMaxWidth(property: itemMaxWidth, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_itemPadding(property: itemPadding, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_itemWidth(property: itemWidth, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labelEdge(property: labelEdge, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_orientation(property: orientation, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_snarfChildDomOutput(property: snarfChildDomOutput, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

