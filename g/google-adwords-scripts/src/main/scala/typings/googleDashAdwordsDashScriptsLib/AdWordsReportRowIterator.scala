package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsReportRowIterator extends js.Object {
  def hasNext(): scala.Boolean
  def next(): AdWordsReportRow
}

object AdWordsReportRowIterator {
  @scala.inline
  def apply(hasNext: js.Function0[scala.Boolean], next: js.Function0[AdWordsReportRow]): AdWordsReportRowIterator = {
    val __obj = js.Dynamic.literal(hasNext = hasNext, next = next)
  
    __obj.asInstanceOf[AdWordsReportRowIterator]
  }
}

