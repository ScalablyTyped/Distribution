package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SummaryRowsSummaryColumn extends js.Object {
  /** Specifies the custom summary calculate function or text.
               */
  var customSummaryValue: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies summary column used to perform the summary calculation.
               */
  var dataMember: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the required column to display the summary.
               */
  var displayColumn: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the format to be applied on the summary column value.
               */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text to be displayed before the summary column value.
               */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text to be displayed after the summary column value.
               */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the summary type to perform calculations in a corresponding summary column. See summaryType.
               */
  var summaryType: js.UndefOr[SummaryType | java.lang.String] = js.undefined
}

