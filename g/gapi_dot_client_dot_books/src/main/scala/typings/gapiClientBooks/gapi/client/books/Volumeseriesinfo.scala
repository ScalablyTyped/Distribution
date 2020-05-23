package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.Issue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volumeseriesinfo extends js.Object {
  /** The display number string. This should be used only for display purposes and the actual sequence should be inferred from the below orderNumber. */
  var bookDisplayNumber: js.UndefOr[String] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** Short book title in the context of the series. */
  var shortSeriesBookTitle: js.UndefOr[String] = js.undefined
  var volumeSeries: js.UndefOr[js.Array[Issue]] = js.undefined
}

object Volumeseriesinfo {
  @scala.inline
  def apply(
    bookDisplayNumber: String = null,
    kind: String = null,
    shortSeriesBookTitle: String = null,
    volumeSeries: js.Array[Issue] = null
  ): Volumeseriesinfo = {
    val __obj = js.Dynamic.literal()
    if (bookDisplayNumber != null) __obj.updateDynamic("bookDisplayNumber")(bookDisplayNumber.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (shortSeriesBookTitle != null) __obj.updateDynamic("shortSeriesBookTitle")(shortSeriesBookTitle.asInstanceOf[js.Any])
    if (volumeSeries != null) __obj.updateDynamic("volumeSeries")(volumeSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volumeseriesinfo]
  }
}

