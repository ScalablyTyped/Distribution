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
trait SearchRowIterator extends StObject {
  
  /** Returns true if the search has more rows. */
  def hasNext(): Boolean
  
  /**
    * Returns the next row in the search.
    *
    * Search rows are returned as plain Javascript objects. Individual requested fields can be accessed by accessing the nested field.
    *
    *
    *      var rows = AdsApp.search(
    *          'SELECT search_term_view.search_term, metrics.ctr ' +
    *          'FROM   search_term_view ' +
    *          'WHERE  segments.date BETWEEN "2013-01-01" AND "2013-03-01"');
    *
    *      while (rows.hasNext()) {
    *        var row = rows.next();
    *        var searchTerm = row['search_term_view'];
    *        var query = searchTerm['search_term'];
    *        var ctr = row['metrics']['ctr'];
    *      }
    */
  def next(): Any
}
object SearchRowIterator {
  
  inline def apply(hasNext: () => Boolean, next: () => Any): SearchRowIterator = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[SearchRowIterator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchRowIterator] (val x: Self) extends AnyVal {
    
    inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
    
    inline def setNext(value: () => Any): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
