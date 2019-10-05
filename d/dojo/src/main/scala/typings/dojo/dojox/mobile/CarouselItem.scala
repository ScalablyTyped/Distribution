package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.alt
import typings.dojo.dojoStrings.footerText
import typings.dojo.dojoStrings.headerText
import typings.dojo.dojoStrings.src
import typings.dojo.dojoStrings.style
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/CarouselItem.html
  *
  * An item of dojox/mobile/Carousel.
  * CarouselItem represents an item of dojox/mobile/Carousel. In
  * typical use cases, users do not use this widget alone. Instead,
  * it is used in conjunction with the Carousel widget.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling */ @JSGlobal("dojox.mobile.CarouselItem")
@js.native
class CarouselItem () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * An alt text for the carousel item image.
    *
    */
  var alt: String = js.native
  /**
    * A text that is displayed below the carousel item image.
    *
    */
  var footerText: String = js.native
  /**
    * A text that is displayed above the carousel item image.
    *
    */
  var headerText: String = js.native
  /**
    * A path for an image to be displayed as a carousel item.
    *
    */
  var src: String = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_CarouselItem: String = js.native
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    *
    */
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    * 
    */
  def getIndexInParent(): js.Any = js.native
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    *
    */
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    * 
    */
  def getNextSibling(): js.Any = js.native
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    *
    */
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    * 
    */
  def getPreviousSibling(): js.Any = js.native
  @JSName("get")
  def get_alt(property: alt): String = js.native
  @JSName("get")
  def get_footerText(property: footerText): String = js.native
  @JSName("get")
  def get_headerText(property: headerText): String = js.native
  @JSName("get")
  def get_src(property: src): String = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    *
    * @param size
    */
  def resize(size: js.Any): Unit = js.native
  /**
    * Highlights the item.
    *
    */
  def select(): Unit = js.native
  @JSName("set")
  def set_alt(property: alt, value: String): Unit = js.native
  @JSName("set")
  def set_footerText(property: footerText, value: String): Unit = js.native
  @JSName("set")
  def set_headerText(property: headerText, value: String): Unit = js.native
  @JSName("set")
  def set_src(property: src, value: String): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("watch")
  def watch_alt(property: alt, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_footerText(property: footerText, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_headerText(property: headerText, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_src(property: src, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

