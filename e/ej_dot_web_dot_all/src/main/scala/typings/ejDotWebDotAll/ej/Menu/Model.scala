package typings.ejDotWebDotAll.ej.Menu

import typings.ejDotWebDotAll.ej.AnimationType
import typings.ejDotWebDotAll.ej.Direction
import typings.ejDotWebDotAll.ej.MenuType
import typings.ejDotWebDotAll.ej.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** To enable or disable the Animation while hover or click an menu items.See AnimationType
    * @Default {ej.AnimationType.Default}
    */
  var animationType: js.UndefOr[AnimationType | String] = js.undefined
  /** Fires before context menu gets open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
  /** Fires when mouse click on menu items.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Fire when context menu on close.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
  /** Specifies the container element selectors for submenuâ€™s collision. The submenu gets displayed based on spacing available with respect to container element.
    * @Default {null}
    */
  var container: js.UndefOr[String] = js.undefined
  /** Specifies the target id of context menu. On right clicking the specified contextTarget element, context menu gets shown.
    * @Default {null}
    */
  var contextMenuTarget: js.UndefOr[String] = js.undefined
  /** Fires to create menu items.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Specify the CSS class to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Fires to destroy menu items.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** To enable or disable the Animation effect while hover or click an menu items.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Specifies the root menu items to be aligned center in horizontal menu.
    * @Default {false}
    */
  var enableCenterAlign: js.UndefOr[Boolean] = js.undefined
  /** Specifies the menu items to be displayed in right to left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** When this property sets to false, the menu items is displayed without any separators.
    * @Default {true}
    */
  var enableSeparator: js.UndefOr[Boolean] = js.undefined
  /** Enable / Disable the Menu control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the target which needs to be excluded. i.e., The context menu will not be displayed in those specified targets.
    * @Default {null}
    */
  var excludeTarget: js.UndefOr[String] = js.undefined
  /** Fields used to bind the data source and it includes following field members to make data bind easier.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Specifies the height of the root menu.
    * @Default {auto}
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** Specifies the list of HTML attributes to be added to menu control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Enables/disables responsive support for the Menu control during the window resizing time.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Fires when key down on menu items.
    */
  var keydown: js.UndefOr[js.Function1[/* e */ KeydownEventArgs, Unit]] = js.undefined
  /** Specifies the type of the menu. Essential JavaScript Menu consists of two type of menu, they are Normal Menu and Context Menu mode.See MenuType
    * @Default {ej.MenuType.NormalMenu}
    */
  var menuType: js.UndefOr[String | MenuType] = js.undefined
  /** Fires when mouse out from menu items.
    */
  var mouseout: js.UndefOr[js.Function1[/* e */ MouseoutEventArgs, Unit]] = js.undefined
  /** Fires when mouse over the Menu items.
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.undefined
  /** Fires when context menu on open.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** Specifies the sub menu items to be show or open only on click.
    * @Default {false}
    */
  var openOnClick: js.UndefOr[Boolean] = js.undefined
  /** Specifies the orientation of normal menu. Normal menu can rendered in horizontal or vertical direction by using this API. See Orientation
    * @Default {ej.Orientation.Horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.undefined
  /** Fires when overflow popup menu closes.
    */
  var overflowClose: js.UndefOr[js.Function1[/* e */ OverflowCloseEventArgs, Unit]] = js.undefined
  /** Specifies the popup menu height.
    * @Default {auto}
    */
  var overflowHeight: js.UndefOr[String | Double] = js.undefined
  /** Fires when overflow popup menu opens.
    */
  var overflowOpen: js.UndefOr[js.Function1[/* e */ OverflowOpenEventArgs, Unit]] = js.undefined
  /** Specifies the popup menu width.
    * @Default {auto}
    */
  var overflowWidth: js.UndefOr[String | Double] = js.undefined
  /** Specifies the main menu items arrows only to be shown if it contains child items.
    * @Default {true}
    */
  var showRootLevelArrows: js.UndefOr[Boolean] = js.undefined
  /** Specifies the sub menu items arrows only to be shown if it contains child items.
    * @Default {true}
    */
  var showSubLevelArrows: js.UndefOr[Boolean] = js.undefined
  /** Specifies position of pull down submenu that will appear on mouse over.See Direction
    * @Default {ej.Direction.Right}
    */
  var subMenuDirection: js.UndefOr[String | Direction] = js.undefined
  /** Specifies the title to responsive menu.
    * @Default {Menu}
    */
  var titleText: js.UndefOr[String] = js.undefined
  /** Specifies the width of the main menu.
    * @Default {auto}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    animationType: AnimationType | String = null,
    beforeOpen: /* e */ BeforeOpenEventArgs => Unit = null,
    click: /* e */ ClickEventArgs => Unit = null,
    close: /* e */ CloseEventArgs => Unit = null,
    container: String = null,
    contextMenuTarget: String = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enableCenterAlign: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableSeparator: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    excludeTarget: String = null,
    fields: Fields = null,
    height: String | Double = null,
    htmlAttributes: js.Any = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    keydown: /* e */ KeydownEventArgs => Unit = null,
    menuType: String | MenuType = null,
    mouseout: /* e */ MouseoutEventArgs => Unit = null,
    mouseover: /* e */ MouseoverEventArgs => Unit = null,
    open: /* e */ OpenEventArgs => Unit = null,
    openOnClick: js.UndefOr[Boolean] = js.undefined,
    orientation: Orientation | String = null,
    overflowClose: /* e */ OverflowCloseEventArgs => Unit = null,
    overflowHeight: String | Double = null,
    overflowOpen: /* e */ OverflowOpenEventArgs => Unit = null,
    overflowWidth: String | Double = null,
    showRootLevelArrows: js.UndefOr[Boolean] = js.undefined,
    showSubLevelArrows: js.UndefOr[Boolean] = js.undefined,
    subMenuDirection: String | Direction = null,
    titleText: String = null,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1(beforeOpen))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (contextMenuTarget != null) __obj.updateDynamic("contextMenuTarget")(contextMenuTarget.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCenterAlign)) __obj.updateDynamic("enableCenterAlign")(enableCenterAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSeparator)) __obj.updateDynamic("enableSeparator")(enableSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (excludeTarget != null) __obj.updateDynamic("excludeTarget")(excludeTarget.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (keydown != null) __obj.updateDynamic("keydown")(js.Any.fromFunction1(keydown))
    if (menuType != null) __obj.updateDynamic("menuType")(menuType.asInstanceOf[js.Any])
    if (mouseout != null) __obj.updateDynamic("mouseout")(js.Any.fromFunction1(mouseout))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction1(mouseover))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (!js.isUndefined(openOnClick)) __obj.updateDynamic("openOnClick")(openOnClick.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overflowClose != null) __obj.updateDynamic("overflowClose")(js.Any.fromFunction1(overflowClose))
    if (overflowHeight != null) __obj.updateDynamic("overflowHeight")(overflowHeight.asInstanceOf[js.Any])
    if (overflowOpen != null) __obj.updateDynamic("overflowOpen")(js.Any.fromFunction1(overflowOpen))
    if (overflowWidth != null) __obj.updateDynamic("overflowWidth")(overflowWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(showRootLevelArrows)) __obj.updateDynamic("showRootLevelArrows")(showRootLevelArrows.asInstanceOf[js.Any])
    if (!js.isUndefined(showSubLevelArrows)) __obj.updateDynamic("showSubLevelArrows")(showSubLevelArrows.asInstanceOf[js.Any])
    if (subMenuDirection != null) __obj.updateDynamic("subMenuDirection")(subMenuDirection.asInstanceOf[js.Any])
    if (titleText != null) __obj.updateDynamic("titleText")(titleText.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

