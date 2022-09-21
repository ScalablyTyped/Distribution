package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches ad customizer sources. Does not support filtering or sorting.
  * Typical usage:
  *
  *      var adCustomizerSourceSelector = AdsApp.adCustomizerSources();
  *
  *      var adCustomizerSourceIterator = adCustomizerSourceSelector.withLimit(5).get();
  *      while (adCustomizerSourceIterator.hasNext()) {
  *        var adCustomizerSource = adCustomizerSourceIterator.next();
  *      }
  */
trait AdCustomizerSourceSelector
  extends StObject
     with Selector[AdCustomizerSourceIterator]
     with SelectorWithLimit
object AdCustomizerSourceSelector {
  
  inline def apply(get: () => AdCustomizerSourceIterator, withLimit: Double => AdCustomizerSourceSelector): AdCustomizerSourceSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[AdCustomizerSourceSelector]
  }
}
