package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`match`
import typings.fhir.fhirStrings.include
import typings.fhir.fhirStrings.outcome
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleEntrySearch
  extends StObject
     with BackboneElement {
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * Why this entry is in the result set - whether it's included as a match or because of an _include requirement.
    */
  var mode: js.UndefOr[`match` | include | outcome] = js.undefined
  
  /**
    * When searching, the server's search ranking score for the entry.
    */
  var score: js.UndefOr[Double] = js.undefined
}
object BundleEntrySearch {
  
  inline def apply(): BundleEntrySearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleEntrySearch]
  }
  
  extension [Self <: BundleEntrySearch](x: Self) {
    
    inline def setMode(value: `match` | include | outcome): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
  }
}
