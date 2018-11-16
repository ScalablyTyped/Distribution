package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PrintToPDFOptions extends js.Object {
  /**
       * true for landscape, false for portrait.
       */
  var landscape: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Specifies the type of margins to use. Uses 0 for default margin, 1 for no
       * margin, and 2 for minimum margin.
       */
  var marginsType: js.UndefOr[scala.Double] = js.undefined
  /**
       * Specify page size of the generated PDF. Can be A3, A4, A5, Legal, Letter,
       * Tabloid or an Object containing height and width in microns.
       */
  var pageSize: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether to print CSS backgrounds.
       */
  var printBackground: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether to print selection only.
       */
  var printSelectionOnly: js.UndefOr[scala.Boolean] = js.undefined
}

