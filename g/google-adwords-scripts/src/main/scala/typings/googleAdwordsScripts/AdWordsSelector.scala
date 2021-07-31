package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdWordsSelector[E] extends StObject {
  
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
