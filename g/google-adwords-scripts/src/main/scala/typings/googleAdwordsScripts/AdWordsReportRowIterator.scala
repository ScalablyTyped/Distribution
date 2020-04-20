package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsReportRowIterator extends js.Object {
  def hasNext(): Boolean
  def next(): AdWordsReportRow
}

object AdWordsReportRowIterator {
  @scala.inline
  def apply(hasNext: () => Boolean, next: () => AdWordsReportRow): AdWordsReportRowIterator = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[AdWordsReportRowIterator]
  }
}

