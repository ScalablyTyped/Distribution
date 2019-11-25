package typings.ejDotWebDotAll.ej.Splitter

import typings.ejDotWebDotAll.ej.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Turns on keyboard interaction with the Splitter panes. You must set this property to true to access the keyboard shortcuts of ejSplitter.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /** Specify animation speed for the Splitter pane movement, while collapsing and expanding.
    * @Default {300}
    */
  var animationSpeed: js.UndefOr[Double] = js.undefined
  /** Fires before expanding / collapsing the split pane of splitter control.
    */
  var beforeExpandCollapse: js.UndefOr[js.Function1[/* e */ BeforeExpandCollapseEventArgs, Unit]] = js.undefined
  /** Triggered when we click on the template icon. (Note: This will work only when expanderTemplate is defined.)
    */
  var clickOnExpander: js.UndefOr[js.Function1[/* e */ ClickOnExpanderEventArgs, Unit]] = js.undefined
  /** Fires when splitter control pane has been created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Specify the CSS class to splitter control to achieve custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Fires when splitter control pane has been destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Specifies the animation behavior of the splitter.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Specifies the splitter control to be displayed in right to left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Fires when expand / collapse operation in splitter control pane has been performed successfully.
    */
  var expandCollapse: js.UndefOr[js.Function1[/* e */ ExpandCollapseEventArgs, Unit]] = js.undefined
  /** Specifies HTML element string to replace the existing expand/collapse icons.
    * @Default {null}
    */
  var expanderTemplate: js.UndefOr[String] = js.undefined
  /** Specify height for splitter control.
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Specifies the HTML Attributes of the Splitter.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specify window resizing behavior for splitter control.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Specify the orientation for splitter control. See orientation
    * @Default {ej.orientation.Horizontal or â€œhorizontalâ€}
    */
  var orientation: js.UndefOr[Orientation | String] = js.undefined
  /** Specify properties for each pane like paneSize, minSize, maxSize, collapsible, expandable, resizable.
    * @Default {[]}
    */
  var properties: js.UndefOr[js.Array[_]] = js.undefined
  /** Fires when resize in splitter control pane.
    */
  var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, Unit]] = js.undefined
  /** Specify width for splitter control.
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    animationSpeed: Int | Double = null,
    beforeExpandCollapse: /* e */ BeforeExpandCollapseEventArgs => Unit = null,
    clickOnExpander: /* e */ ClickOnExpanderEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    expandCollapse: /* e */ ExpandCollapseEventArgs => Unit = null,
    expanderTemplate: String = null,
    height: String = null,
    htmlAttributes: js.Any = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    orientation: Orientation | String = null,
    properties: js.Array[_] = null,
    resize: /* e */ ResizeEventArgs => Unit = null,
    width: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation.asInstanceOf[js.Any])
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (beforeExpandCollapse != null) __obj.updateDynamic("beforeExpandCollapse")(js.Any.fromFunction1(beforeExpandCollapse))
    if (clickOnExpander != null) __obj.updateDynamic("clickOnExpander")(js.Any.fromFunction1(clickOnExpander))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (expandCollapse != null) __obj.updateDynamic("expandCollapse")(js.Any.fromFunction1(expandCollapse))
    if (expanderTemplate != null) __obj.updateDynamic("expanderTemplate")(expanderTemplate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

