package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsReportRowIterator extends StObject {
  
  def hasNext(): Boolean
  
  def next(): AdWordsReportRow
}
object AdWordsReportRowIterator {
  
  @scala.inline
  def apply(hasNext: () => Boolean, next: () => AdWordsReportRow): AdWordsReportRowIterator = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[AdWordsReportRowIterator]
  }
  
  @scala.inline
  implicit class AdWordsReportRowIteratorMutableBuilder[Self <: AdWordsReportRowIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => AdWordsReportRow): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
