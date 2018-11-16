package typings
package ejDotWebDotAllLib.ejNs.TagCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** Event triggers when the TagCloud items are clicked
               */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Event triggers when the TagCloud are created
               */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Specify the CSS class to button to achieve custom theme.
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** The dataSource contains the list of data to display in a cloud format. Each data contains a link URL, frequency to categorize the font size and a display text.
               * @Default {null}
               */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Event triggers when the TagCloud are destroyed
               */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Sets the TagCloud and tag items direction as right to left alignment.
               * @Default {false}
               */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the mapping fields for the data items of the TagCloud.
               * @Default {null}
               */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Defines the format for the TagCloud to display the tag items.See Format
               * @Default {ej.Format.Cloud}
               */
  var format: js.UndefOr[java.lang.String | ejDotWebDotAllLib.ejNs.Format] = js.undefined
  /** Specifies the list of HTML attributes to be added to TagCloud control.
               * @Default {{}}
               */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Sets the maximum font size value for the tag items. The font size for the tag items will be generated in between the minimum and maximum font size values.
               * @Default {40px}
               */
  var maxFontSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the minimum font size value for the tag items. The font size for the tag items will be generated in between the minimum and maximum font size values.
               * @Default {10px}
               */
  var minFontSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Event triggers when the cursor leaves out from a tag item
               */
  var mouseout: js.UndefOr[js.Function1[/* e */ MouseoutEventArgs, scala.Unit]] = js.undefined
  /** Event triggers when the cursor hovers on a tag item
               */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, scala.Unit]] = js.undefined
  /** Define the query to retrieve the data from online server. The query is used only when the online dataSource is used.
               * @Default {null}
               */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Shows or hides the TagCloud title. When this set to false, it hides the TagCloud header.
               * @Default {true}
               */
  var showTitle: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the title image for the TagCloud. To show the title image, the showTitle property should be enabled.
               * @Default {null}
               */
  var titleImage: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the title text for the TagCloud. To show the title text, the showTitle property should be enabled.
               * @Default {Title}
               */
  var titleText: js.UndefOr[java.lang.String] = js.undefined
}

