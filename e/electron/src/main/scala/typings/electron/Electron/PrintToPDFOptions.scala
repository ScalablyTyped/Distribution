package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintToPDFOptions extends js.Object {
  /**
    * true for landscape, false for portrait.
    */
  var landscape: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the type of margins to use. Uses 0 for default margin, 1 for no
    * margin, and 2 for minimum margin.
    */
  var marginsType: js.UndefOr[Double] = js.undefined
  /**
    * Specify page size of the generated PDF. Can be A3, A4, A5, Legal, Letter,
    * Tabloid or an Object containing height and width in microns.
    */
  var pageSize: js.UndefOr[String | Size] = js.undefined
  /**
    * Whether to print CSS backgrounds.
    */
  var printBackground: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to print selection only.
    */
  var printSelectionOnly: js.UndefOr[Boolean] = js.undefined
}

object PrintToPDFOptions {
  @scala.inline
  def apply(
    landscape: js.UndefOr[Boolean] = js.undefined,
    marginsType: Int | Double = null,
    pageSize: String | Size = null,
    printBackground: js.UndefOr[Boolean] = js.undefined,
    printSelectionOnly: js.UndefOr[Boolean] = js.undefined
  ): PrintToPDFOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(landscape)) __obj.updateDynamic("landscape")(landscape.asInstanceOf[js.Any])
    if (marginsType != null) __obj.updateDynamic("marginsType")(marginsType.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(printBackground)) __obj.updateDynamic("printBackground")(printBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(printSelectionOnly)) __obj.updateDynamic("printSelectionOnly")(printSelectionOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintToPDFOptions]
  }
}

