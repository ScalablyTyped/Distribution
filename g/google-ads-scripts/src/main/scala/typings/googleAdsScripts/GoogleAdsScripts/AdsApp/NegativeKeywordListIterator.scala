package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An iterator of negative keyword lists.
  *
  * Typical usage:
  *
  *      while (negativeKeywordListIterator.hasNext()) {
  *        var negativeKeywordList = negativeKeywordListIterator.next();
  *      }
  */
/** 
NOTE: Rewritten from type alias:
{{{
type NegativeKeywordListIterator = google-ads-scripts.GoogleAdsScripts.Base.Iterator<google-ads-scripts.GoogleAdsScripts.AdsApp.NegativeKeywordListIterator>
}}}
to avoid circular code involving: 
- google-ads-scripts.GoogleAdsScripts.AdsApp.NegativeKeywordListIterator
*/
trait NegativeKeywordListIterator
  extends StObject
     with Iterator[NegativeKeywordListIterator]
object NegativeKeywordListIterator {
  
  inline def apply(hasNext: () => Boolean, next: () => NegativeKeywordListIterator, totalNumEntities: () => Double): NegativeKeywordListIterator = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next), totalNumEntities = js.Any.fromFunction0(totalNumEntities))
    __obj.asInstanceOf[NegativeKeywordListIterator]
  }
}
