package typings
package ejDotWebDotAllLib.ejNs.PrintNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** Append the custom HTML after the selected content.
               * @Default {null}
               */
  var append: js.UndefOr[java.lang.String] = js.undefined
  /** Event triggers before the document page or an element in it gets printed.
               */
  var beforeStart: js.UndefOr[js.Function1[/* e */ BeforeStartEventArgs, scala.Unit]] = js.undefined
  /** Prepend a docType to the document frame.
               * @Default {&lt;!doctype html&gt;}
               */
  var docType: js.UndefOr[java.lang.String] = js.undefined
  /** A selector that specifies a particular element to be excluded from printing.
               * @Default {null}
               */
  var excludeSelector: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies whether the URL of an external stylesheet can be included to customize and print that page.
               * @Default {null}
               */
  var externalStyles: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies whether the global styles can be applied to the element to be printed.
               * @Default {true}
               */
  var globalStyles: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the height of the print window.
               * @Default {454}
               */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Prepends the custom HTML before the selected content.
               * @Default {null}
               */
  var prepend: js.UndefOr[java.lang.String] = js.undefined
  /** Allows printing the content in a new window.
               * @Default {false}
               */
  var printInNewWindow: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the period of time to wait before printing the content.
               * @Default {1000}
               */
  var timeOutPeriod: js.UndefOr[scala.Double] = js.undefined
  /** Sets the title of the print document.
               * @Default {null}
               */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the width of the print window.
               * @Default {1024}
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

