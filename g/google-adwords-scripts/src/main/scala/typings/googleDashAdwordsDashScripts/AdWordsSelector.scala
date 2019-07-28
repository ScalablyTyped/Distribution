package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsSelector[E] extends js.Object {
  def forDateRange(dateFrom: String, dateTo: String): AdWordsSelector[E] = js.native
  def forDateRange(dateFrom: String, dateTo: AdWordsDate): AdWordsSelector[E] = js.native
  def forDateRange(dateFrom: AdWordsDate, dateTo: String): AdWordsSelector[E] = js.native
  def forDateRange(dateFrom: AdWordsDate, dateTo: AdWordsDate): AdWordsSelector[E] = js.native
  def forDateRange(dateRange: String): AdWordsSelector[E] = js.native
  def get(): AdWordsIterator[E] = js.native
  def orderBy(orderBy: String): AdWordsSelector[E] = js.native
  def withCondition(condition: String): AdWordsSelector[E] = js.native
  def withIds(ids: js.Array[js.Array[Double] | Double]): AdWordsSelector[E] = js.native
  def withLimit(limit: Double): AdWordsSelector[E] = js.native
}

