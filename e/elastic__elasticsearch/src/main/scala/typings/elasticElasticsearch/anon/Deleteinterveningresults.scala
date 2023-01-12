package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deleteinterveningresults extends StObject {
  
  var delete_intervening_results: js.UndefOr[Boolean] = js.undefined
}
object Deleteinterveningresults {
  
  inline def apply(): Deleteinterveningresults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deleteinterveningresults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deleteinterveningresults] (val x: Self) extends AnyVal {
    
    inline def setDelete_intervening_results(value: Boolean): Self = StObject.set(x, "delete_intervening_results", value.asInstanceOf[js.Any])
    
    inline def setDelete_intervening_resultsUndefined: Self = StObject.set(x, "delete_intervening_results", js.undefined)
  }
}
