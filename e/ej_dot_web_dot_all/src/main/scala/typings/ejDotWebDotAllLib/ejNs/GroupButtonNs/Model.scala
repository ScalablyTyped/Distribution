package typings
package ejDotWebDotAllLib.ejNs.GroupButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered before any button element in the GroupButton get selected.
    */
  var beforeSelect: js.UndefOr[js.Function1[/* e */ BeforeSelectEventArgs, scala.Unit]] = js.undefined
  /** Fires after GroupButton control is created.If the user want to perform any operation after the button control creation then the user can make use of this create event.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the specified class to GroupButton wrapper element, which allows for custom skinning option in ejGroupButton control.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** To set the local JSON data, define a JSON array and initialize the GroupButton with dataSource property. Specify the column names in the fields property.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Fires when the GroupButton is destroyed successfully.If the user want to perform any operation after the destroy button control then the user can make use of this destroy event.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Displays the ejGroupButton in Right to Left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Used to enable or disable the ejGroupButton control.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to display the values of the data.
    * @Default {null}
    */
  var fields: js.UndefOr[js.Any] = js.undefined
  /** Sets the GroupButton behavior to works as Checkbox mode/ radio button mode based on the specified option.
    * @Default {ej.GroupButtonMode.RadioButton}
    */
  var groupButtonMode: js.UndefOr[ejDotWebDotAllLib.ejNs.GroupButtonMode | java.lang.String] = js.undefined
  /** Used to sets the height of the ejGroupButton control.
    * @Default {28}
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Defines the characteristics of the ejGroupButton control and extend the capability of an HTML element by adding specified attributes to element tag and by performing the related
    * actions
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Triggered once the key is pressed, when the control is in focused state.
    */
  var keyPress: js.UndefOr[js.Function1[/* e */ KeyPressEventArgs, scala.Unit]] = js.undefined
  /** Specify the orientation of the GroupButton. See below to get available orientations
    * @Default {ej.Orientation.Horizontal}
    */
  var orientation: js.UndefOr[ejDotWebDotAllLib.ejNs.Orientation | java.lang.String] = js.undefined
  /** Query the dataSource from the table for Groupbutton
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Triggered when the button element get selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, scala.Unit]] = js.undefined
  /** Sets the list of button elements to be selected. To enable this option groupButtonMode should be in â€œcheckboxâ€ mode.
    * @Default {[]}
    */
  var selectedItemIndex: js.UndefOr[js.Array[scala.Double | java.lang.String]] = js.undefined
  /** Sets the rounder corner to the GroupButton, if sets as true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the size of the button. See available size
    * @Default {ej.ButtonSize.Normal}
    */
  var size: js.UndefOr[ejDotWebDotAllLib.ejNs.ButtonSize | java.lang.String] = js.undefined
  /** Defines the width of the ejGroupButton control.
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    beforeSelect: /* e */ BeforeSelectEventArgs => scala.Unit = null,
    create: /* e */ CreateEventArgs => scala.Unit = null,
    cssClass: java.lang.String = null,
    dataSource: js.Any = null,
    destroy: /* e */ DestroyEventArgs => scala.Unit = null,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    fields: js.Any = null,
    groupButtonMode: ejDotWebDotAllLib.ejNs.GroupButtonMode | java.lang.String = null,
    height: java.lang.String | scala.Double = null,
    htmlAttributes: js.Any = null,
    keyPress: /* e */ KeyPressEventArgs => scala.Unit = null,
    orientation: ejDotWebDotAllLib.ejNs.Orientation | java.lang.String = null,
    query: js.Any = null,
    select: /* e */ SelectEventArgs => scala.Unit = null,
    selectedItemIndex: js.Array[scala.Double | java.lang.String] = null,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    size: ejDotWebDotAllLib.ejNs.ButtonSize | java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (beforeSelect != null) __obj.updateDynamic("beforeSelect")(js.Any.fromFunction1(beforeSelect))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (groupButtonMode != null) __obj.updateDynamic("groupButtonMode")(groupButtonMode.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (keyPress != null) __obj.updateDynamic("keyPress")(js.Any.fromFunction1(keyPress))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectedItemIndex != null) __obj.updateDynamic("selectedItemIndex")(selectedItemIndex)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

