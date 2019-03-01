package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volumeseriesinfo extends js.Object {
  /** The display number string. This should be used only for display purposes and the actual sequence should be inferred from the below orderNumber. */
  var bookDisplayNumber: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Short book title in the context of the series. */
  var shortSeriesBookTitle: js.UndefOr[java.lang.String] = js.undefined
  var volumeSeries: js.UndefOr[js.Array[gapiDotClientDotBooksLib.Anon_Issue]] = js.undefined
}

object Volumeseriesinfo {
  @scala.inline
  def apply(
    bookDisplayNumber: java.lang.String = null,
    kind: java.lang.String = null,
    shortSeriesBookTitle: java.lang.String = null,
    volumeSeries: js.Array[gapiDotClientDotBooksLib.Anon_Issue] = null
  ): Volumeseriesinfo = {
    val __obj = js.Dynamic.literal()
    if (bookDisplayNumber != null) __obj.updateDynamic("bookDisplayNumber")(bookDisplayNumber)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (shortSeriesBookTitle != null) __obj.updateDynamic("shortSeriesBookTitle")(shortSeriesBookTitle)
    if (volumeSeries != null) __obj.updateDynamic("volumeSeries")(volumeSeries)
    __obj.asInstanceOf[Volumeseriesinfo]
  }
}

