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

object Model {
  @scala.inline
  def apply(
    append: java.lang.String = null,
    beforeStart: js.Function1[/* e */ BeforeStartEventArgs, scala.Unit] = null,
    docType: java.lang.String = null,
    excludeSelector: java.lang.String = null,
    externalStyles: java.lang.String = null,
    globalStyles: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    prepend: java.lang.String = null,
    printInNewWindow: js.UndefOr[scala.Boolean] = js.undefined,
    timeOutPeriod: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(append)
    if (beforeStart != null) __obj.updateDynamic("beforeStart")(beforeStart)
    if (docType != null) __obj.updateDynamic("docType")(docType)
    if (excludeSelector != null) __obj.updateDynamic("excludeSelector")(excludeSelector)
    if (externalStyles != null) __obj.updateDynamic("externalStyles")(externalStyles)
    if (!js.isUndefined(globalStyles)) __obj.updateDynamic("globalStyles")(globalStyles)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (prepend != null) __obj.updateDynamic("prepend")(prepend)
    if (!js.isUndefined(printInNewWindow)) __obj.updateDynamic("printInNewWindow")(printInNewWindow)
    if (timeOutPeriod != null) __obj.updateDynamic("timeOutPeriod")(timeOutPeriod.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

