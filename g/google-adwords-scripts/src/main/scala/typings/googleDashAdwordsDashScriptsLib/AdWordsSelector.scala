package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsSelector[E] extends js.Object {
  def forDateRange(dateFrom: AdWordsDate, dateTo: AdWordsDate): AdWordsSelector[E] = js.native
  def forDateRange(dateFrom: AdWordsDate, dateTo: java.lang.String): AdWordsSelector[E] = js.native
  def forDateRange(dateFrom: java.lang.String, dateTo: AdWordsDate): AdWordsSelector[E] = js.native
  def forDateRange(dateFrom: java.lang.String, dateTo: java.lang.String): AdWordsSelector[E] = js.native
  def forDateRange(dateRange: java.lang.String): AdWordsSelector[E] = js.native
  def get(): AdWordsIterator[E] = js.native
  def orderBy(orderBy: java.lang.String): AdWordsSelector[E] = js.native
  def withCondition(condition: java.lang.String): AdWordsSelector[E] = js.native
  def withIds(ids: js.Array[scala.Double | js.Array[scala.Double]]): AdWordsSelector[E] = js.native
  def withLimit(limit: scala.Double): AdWordsSelector[E] = js.native
}

