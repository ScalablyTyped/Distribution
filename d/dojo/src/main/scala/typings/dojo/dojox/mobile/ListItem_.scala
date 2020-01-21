package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.ChildWidgetProperties
import typings.dojo.dojoStrings.anchorLabel
import typings.dojo.dojoStrings.arrowClass
import typings.dojo.dojoStrings.busy
import typings.dojo.dojoStrings.checkClass
import typings.dojo.dojoStrings.checked
import typings.dojo.dojoStrings.deleteIcon
import typings.dojo.dojoStrings.header
import typings.dojo.dojoStrings.noArrow
import typings.dojo.dojoStrings.progStyle
import typings.dojo.dojoStrings.rightIcon
import typings.dojo.dojoStrings.rightIcon2
import typings.dojo.dojoStrings.rightIcon2Title
import typings.dojo.dojoStrings.rightIconTitle
import typings.dojo.dojoStrings.rightText
import typings.dojo.dojoStrings.tag
import typings.dojo.dojoStrings.uncheckClass
import typings.dojo.dojoStrings.variableHeight
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ListItem.html
  *
  * An item of either RoundRectList or EdgeToEdgeList.
  * ListItem represents an item of either RoundRectList or
  * EdgeToEdgeList. There are three ways to move to a different view:
  * moveTo, href, and url. You can choose only one of them.
  *
  * A child DOM node (or widget) can have the layout attribute,
  * whose value is "left", "right", or "center". Such nodes will be
  * aligned as specified.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.ListItem")
@js.native
class ListItem_ () extends ItemBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * These properties can be specified for the children of a dojox/mobile/ListItem.
    *
    */
  var ChildWidgetProperties: js.Object = js.native
  /**
    * If true, the label text becomes a clickable anchor text. When
    * the user clicks on the text, the onAnchorLabelClicked handler is
    * called. You can override or connect to the handler and implement
    * any action. The handler has no default action.
    *
    */
  var anchorLabel: Boolean = js.native
  /**
    * An icon to display as an arrow. The value can be either a path
    * for an image file or a class name of a DOM button.
    *
    */
  var arrowClass: String = js.native
  /**
    * If true, a progress indicator spins.
    *
    */
  var busy: Boolean = js.native
  /**
    * An icon to display as a check mark. The value can be either a
    * path for an image file or a class name of a DOM button.
    *
    */
  var checkClass: String = js.native
  /**
    * If true, a check mark is displayed at the right of the item.
    *
    */
  var checked: Boolean = js.native
  /**
    * A delete icon to display at the left of the item. The value can
    * be either a path for an image file or a class name of a DOM
    * button.
    *
    */
  var deleteIcon: String = js.native
  /**
    * If true, this item is rendered as a category header.
    *
    */
  var header: Boolean = js.native
  /**
    * If true, the right hand side arrow is not displayed.
    *
    */
  var noArrow: Boolean = js.native
  /**
    * A css class name to add to the progress indicator.
    *
    */
  var progStyle: String = js.native
  /**
    * An icon to display at the right hand side of the item. The value
    * can be either a path for an image file or a class name of a DOM
    * button.
    *
    */
  var rightIcon: String = js.native
  /**
    * An icon to display at the left of the rightIcon. The value can
    * be either a path for an image file or a class name of a DOM
    * button.
    *
    */
  var rightIcon2: String = js.native
  /**
    * An alt text for the right icon2.
    *
    */
  var rightIcon2Title: String = js.native
  /**
    * An alt text for the right icon.
    *
    */
  var rightIconTitle: String = js.native
  /**
    * A right-aligned text to display on the item.
    *
    */
  var rightText: String = js.native
  /**
    * A name of html tag to create as domNode.
    *
    */
  var tag: String = js.native
  /**
    * An icon to display as an uncheck mark. The value can be either a
    * path for an image file or a class name of a DOM button.
    *
    */
  var uncheckClass: String = js.native
  /**
    * If true, the height of the item varies according to its content.
    *
    */
  var variableHeight: Boolean = js.native
  @JSName("get")
  def get_ChildWidgetProperties(property: ChildWidgetProperties): js.Object = js.native
  @JSName("get")
  def get_anchorLabel(property: anchorLabel): Boolean = js.native
  @JSName("get")
  def get_arrowClass(property: arrowClass): String = js.native
  @JSName("get")
  def get_busy(property: busy): Boolean = js.native
  @JSName("get")
  def get_checkClass(property: checkClass): String = js.native
  @JSName("get")
  def get_checked(property: checked): Boolean = js.native
  @JSName("get")
  def get_deleteIcon(property: deleteIcon): String = js.native
  @JSName("get")
  def get_header(property: header): Boolean = js.native
  @JSName("get")
  def get_noArrow(property: noArrow): Boolean = js.native
  @JSName("get")
  def get_progStyle(property: progStyle): String = js.native
  @JSName("get")
  def get_rightIcon(property: rightIcon): String = js.native
  @JSName("get")
  def get_rightIcon2(property: rightIcon2): String = js.native
  @JSName("get")
  def get_rightIcon2Title(property: rightIcon2Title): String = js.native
  @JSName("get")
  def get_rightIconTitle(property: rightIconTitle): String = js.native
  @JSName("get")
  def get_rightText(property: rightText): String = js.native
  @JSName("get")
  def get_tag(property: tag): String = js.native
  @JSName("get")
  def get_uncheckClass(property: uncheckClass): String = js.native
  @JSName("get")
  def get_variableHeight(property: variableHeight): Boolean = js.native
  /**
    *
    */
  def layoutChildren(): Unit = js.native
  /**
    * Lays out the current item with variable height.
    *
    */
  def layoutVariableHeight(): Unit = js.native
  /**
    * Stub function to connect to from your application.
    *
    * @param e
    */
  def onAnchorLabelClicked(e: js.Any): Unit = js.native
  /**
    * User-defined function to handle clicks.
    *
    * @param e
    */
  def onClick(e: Event_): Unit = js.native
  /**
    *
    */
  def resize(): Unit = js.native
  /**
    * Sets the arrow icon if necessary.
    *
    */
  def setArrow(): Unit = js.native
  @JSName("set")
  def set_ChildWidgetProperties(property: ChildWidgetProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_anchorLabel(property: anchorLabel, value: Boolean): Unit = js.native
  @JSName("set")
  def set_arrowClass(property: arrowClass, value: String): Unit = js.native
  @JSName("set")
  def set_busy(property: busy, value: Boolean): Unit = js.native
  @JSName("set")
  def set_checkClass(property: checkClass, value: String): Unit = js.native
  @JSName("set")
  def set_checked(property: checked, value: Boolean): Unit = js.native
  @JSName("set")
  def set_deleteIcon(property: deleteIcon, value: String): Unit = js.native
  @JSName("set")
  def set_header(property: header, value: Boolean): Unit = js.native
  @JSName("set")
  def set_noArrow(property: noArrow, value: Boolean): Unit = js.native
  @JSName("set")
  def set_progStyle(property: progStyle, value: String): Unit = js.native
  @JSName("set")
  def set_rightIcon(property: rightIcon, value: String): Unit = js.native
  @JSName("set")
  def set_rightIcon2(property: rightIcon2, value: String): Unit = js.native
  @JSName("set")
  def set_rightIcon2Title(property: rightIcon2Title, value: String): Unit = js.native
  @JSName("set")
  def set_rightIconTitle(property: rightIconTitle, value: String): Unit = js.native
  @JSName("set")
  def set_rightText(property: rightText, value: String): Unit = js.native
  @JSName("set")
  def set_tag(property: tag, value: String): Unit = js.native
  @JSName("set")
  def set_uncheckClass(property: uncheckClass, value: String): Unit = js.native
  @JSName("set")
  def set_variableHeight(property: variableHeight, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_ChildWidgetProperties(
    property: ChildWidgetProperties,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_anchorLabel(
    property: anchorLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_arrowClass(
    property: arrowClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_busy(
    property: busy,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_checkClass(
    property: checkClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_checked(
    property: checked,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_deleteIcon(
    property: deleteIcon,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_header(
    property: header,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_noArrow(
    property: noArrow,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_progStyle(
    property: progStyle,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_rightIcon(
    property: rightIcon,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_rightIcon2(
    property: rightIcon2,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_rightIcon2Title(
    property: rightIcon2Title,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_rightIconTitle(
    property: rightIconTitle,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_rightText(
    property: rightText,
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
  @JSName("watch")
  def watch_uncheckClass(
    property: uncheckClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_variableHeight(
    property: variableHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

