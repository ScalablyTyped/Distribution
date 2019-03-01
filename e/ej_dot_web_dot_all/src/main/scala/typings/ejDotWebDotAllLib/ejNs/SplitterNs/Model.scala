package typings
package ejDotWebDotAllLib.ejNs.SplitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Turns on keyboard interaction with the Splitter panes. You must set this property to true to access the keyboard shortcuts of ejSplitter.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify animation speed for the Splitter pane movement, while collapsing and expanding.
    * @Default {300}
    */
  var animationSpeed: js.UndefOr[scala.Double] = js.undefined
  /** Fires before expanding / collapsing the split pane of splitter control.
    */
  var beforeExpandCollapse: js.UndefOr[js.Function1[/* e */ BeforeExpandCollapseEventArgs, scala.Unit]] = js.undefined
  /** Triggered when we click on the template icon. (Note: This will work only when expanderTemplate is defined.)
    */
  var clickOnExpander: js.UndefOr[js.Function1[/* e */ ClickOnExpanderEventArgs, scala.Unit]] = js.undefined
  /** Fires when splitter control pane has been created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Specify the CSS class to splitter control to achieve custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when splitter control pane has been destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Specifies the animation behavior of the splitter.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the splitter control to be displayed in right to left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when expand / collapse operation in splitter control pane has been performed successfully.
    */
  var expandCollapse: js.UndefOr[js.Function1[/* e */ ExpandCollapseEventArgs, scala.Unit]] = js.undefined
  /** Specifies HTML element string to replace the existing expand/collapse icons.
    * @Default {null}
    */
  var expanderTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specify height for splitter control.
    * @Default {null}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the HTML Attributes of the Splitter.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specify window resizing behavior for splitter control.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify the orientation for splitter control. See orientation
    * @Default {ej.orientation.Horizontal or â€œhorizontalâ€}
    */
  var orientation: js.UndefOr[ejDotWebDotAllLib.ejNs.Orientation | java.lang.String] = js.undefined
  /** Specify properties for each pane like paneSize, minSize, maxSize, collapsible, expandable, resizable.
    * @Default {[]}
    */
  var properties: js.UndefOr[js.Array[_]] = js.undefined
  /** Fires when resize in splitter control pane.
    */
  var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, scala.Unit]] = js.undefined
  /** Specify width for splitter control.
    * @Default {null}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    animationSpeed: scala.Int | scala.Double = null,
    beforeExpandCollapse: js.Function1[/* e */ BeforeExpandCollapseEventArgs, scala.Unit] = null,
    clickOnExpander: js.Function1[/* e */ ClickOnExpanderEventArgs, scala.Unit] = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    expandCollapse: js.Function1[/* e */ ExpandCollapseEventArgs, scala.Unit] = null,
    expanderTemplate: java.lang.String = null,
    height: java.lang.String = null,
    htmlAttributes: js.Any = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: ejDotWebDotAllLib.ejNs.Orientation | java.lang.String = null,
    properties: js.Array[_] = null,
    resize: js.Function1[/* e */ ResizeEventArgs, scala.Unit] = null,
    width: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (beforeExpandCollapse != null) __obj.updateDynamic("beforeExpandCollapse")(beforeExpandCollapse)
    if (clickOnExpander != null) __obj.updateDynamic("clickOnExpander")(clickOnExpander)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (expandCollapse != null) __obj.updateDynamic("expandCollapse")(expandCollapse)
    if (expanderTemplate != null) __obj.updateDynamic("expanderTemplate")(expanderTemplate)
    if (height != null) __obj.updateDynamic("height")(height)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Model]
  }
}

