package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.badge
import typings.dojo.dojoStrings.icon1
import typings.dojo.dojoStrings.icon2
import typings.dojo.dojoStrings.iconPos1
import typings.dojo.dojoStrings.iconPos2
import typings.dojo.dojoStrings.tag
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/TabBarButton.html
  *
  * A button widget that is placed in the TabBar widget.
  * TabBarButton is a button that is placed in the TabBar widget. It
  * is a subclass of dojox/mobile/_ItemBase just like ListItem or
  * IconItem. So, unlike Button, it has similar capability as
  * ListItem or IconItem, such as icon support, transition, etc.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.TabBarButton")
@js.native
class TabBarButton () extends ItemBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * A string to show on a badge. (ex. "12")
    *
    */
  var badge: String = js.native
  /**
    * A path for the unselected (typically dark) icon. If icon is not
    * specified, the iconBase parameter of the parent widget is used.
    *
    */
  var icon1: String = js.native
  /**
    * A path for the selected (typically highlight) icon. If icon is
    * not specified, the iconBase parameter of the parent widget or
    * icon1 is used.
    *
    */
  var icon2: String = js.native
  /**
    * The position of an aggregated unselected (typically dark)
    * icon. IconPos1 is a comma-separated list of values like
    * top,left,width,height (ex. "0,0,29,29"). If iconPos1 is not
    * specified, the iconPos parameter of the parent widget is used.
    *
    */
  var iconPos1: String = js.native
  /**
    * The position of an aggregated selected (typically highlight)
    * icon. IconPos2 is a comma-separated list of values like
    * top,left,width,height (ex. "0,0,29,29"). If iconPos2 is not
    * specified, the iconPos parameter of the parent widget or
    * iconPos1 is used.
    *
    */
  var iconPos2: String = js.native
  /**
    * A name of html tag to create as domNode.
    *
    */
  var tag: String = js.native
  @JSName("get")
  def get_badge(property: badge): String = js.native
  @JSName("get")
  def get_icon1(property: icon1): String = js.native
  @JSName("get")
  def get_icon2(property: icon2): String = js.native
  @JSName("get")
  def get_iconPos1(property: iconPos1): String = js.native
  @JSName("get")
  def get_iconPos2(property: iconPos2): String = js.native
  @JSName("get")
  def get_tag(property: tag): String = js.native
  /**
    * User defined function to handle clicks
    *
    * @param e
    */
  def onClick(e: Event_): Unit = js.native
  /**
    * Called when the parent is a dojox/mobile/TabBar whose closable property is true, and the user clicked the close button.
    *
    * @param e
    */
  def onClose(e: js.Any): js.Any = js.native
  /**
    * User defined function to handle clicks
    * when the parent is a dojox/mobile/TabBar whose closable property is true.
    *
    * @param e
    */
  def onCloseButtonClick(e: Event_): Unit = js.native
  @JSName("set")
  def set_badge(property: badge, value: String): Unit = js.native
  @JSName("set")
  def set_icon1(property: icon1, value: String): Unit = js.native
  @JSName("set")
  def set_icon2(property: icon2, value: String): Unit = js.native
  @JSName("set")
  def set_iconPos1(property: iconPos1, value: String): Unit = js.native
  @JSName("set")
  def set_iconPos2(property: iconPos2, value: String): Unit = js.native
  @JSName("set")
  def set_tag(property: tag, value: String): Unit = js.native
  @JSName("watch")
  def watch_badge(
    property: badge,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_icon1(
    property: icon1,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_icon2(
    property: icon2,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconPos1(
    property: iconPos1,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconPos2(
    property: iconPos2,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_tag(
    property: tag,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

