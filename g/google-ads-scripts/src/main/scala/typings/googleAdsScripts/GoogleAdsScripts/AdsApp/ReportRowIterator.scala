package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an iterator of report rows.
  *
  * Typical usage:
  *
  *      var rows = report.rows();
  *      while (rows.hasNext()) {
  *        var row = rows.next();
  *      }
  */
trait ReportRowIterator extends StObject {
  
  /** Returns true if the report has more rows. */
  def hasNext(): Boolean
  
  /** Returns the next row in the report. */
  def next(): ReportRow
}
object ReportRowIterator {
  
  inline def apply(hasNext: () => Boolean, next: () => ReportRow): ReportRowIterator = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[ReportRowIterator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportRowIterator] (val x: Self) extends AnyVal {
    
    inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
    
    inline def setNext(value: () => ReportRow): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
